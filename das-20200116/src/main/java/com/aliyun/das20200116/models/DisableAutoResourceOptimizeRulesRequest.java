// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoResourceOptimizeRulesRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The database instance ID.</p>
     * <br>
     * <p>>  Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: `[\"Instance ID1\", \"Instance ID2\"]`.</p>
     */
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
