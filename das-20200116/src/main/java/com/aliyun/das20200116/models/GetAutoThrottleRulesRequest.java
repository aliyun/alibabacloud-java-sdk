// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoThrottleRulesRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static GetAutoThrottleRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoThrottleRulesRequest self = new GetAutoThrottleRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoThrottleRulesRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetAutoThrottleRulesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
