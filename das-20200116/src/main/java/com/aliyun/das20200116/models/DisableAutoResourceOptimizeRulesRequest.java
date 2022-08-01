// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoResourceOptimizeRulesRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DisableAutoResourceOptimizeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoResourceOptimizeRulesRequest self = new DisableAutoResourceOptimizeRulesRequest();
        return TeaModel.build(map, self);
    }

    public DisableAutoResourceOptimizeRulesRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DisableAutoResourceOptimizeRulesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
