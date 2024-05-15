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
     * <p>*   Specify the parameter value as a JSON array, such as `[\\"Database account 1\\",\\"Database account 2\\"]`. Separate database instance IDs with commas (,).</p>
     * <br>
     * <p>*   By default, if you leave this parameter empty, all database instances for which the automatic fragment recycling feature has been enabled within the current Alibaba Cloud account are returned. The following types of database instances are returned:</p>
     * <br>
     * <p>    *   Database instances for which the automatic fragment recycling feature is currently enabled.</p>
     * <p>    *   Database instances for which the automatic fragment recycling feature was once enabled but is currently disabled, including those for which DAS Enterprise Edition has been disabled but excluding those that have been released.</p>
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
