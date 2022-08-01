// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoThrottleRulesRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DisableAutoThrottleRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoThrottleRulesRequest self = new DisableAutoThrottleRulesRequest();
        return TeaModel.build(map, self);
    }

    public DisableAutoThrottleRulesRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DisableAutoThrottleRulesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
