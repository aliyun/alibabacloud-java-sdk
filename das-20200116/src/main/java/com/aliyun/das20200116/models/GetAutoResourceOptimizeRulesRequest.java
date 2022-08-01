// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeRulesRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static GetAutoResourceOptimizeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoResourceOptimizeRulesRequest self = new GetAutoResourceOptimizeRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoResourceOptimizeRulesRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetAutoResourceOptimizeRulesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
