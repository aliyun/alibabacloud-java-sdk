// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeRulesRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The database instance IDs.</p>
     * <br>
     * <p>*   Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: `[\"Instance ID1\",\"Instance ID2\"]`.</p>
     * <br>
     * <p>*   By default, if you leave this parameter empty, all database instances for which the automatic fragment recycling feature has been enabled within the current Alibaba Cloud account are returned. The following types of database instances are returned:</p>
     * <br>
     * <p>    *   Database instances for which the automatic fragment recycling feature is currently enabled.</p>
     * <p>    *   Database instances for which the automatic fragment recycling feature was once enabled but is currently disabled, including those for which DAS Professional Edition has been disabled but excluding those that have been released.</p>
     */
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
