// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoThrottleRulesRequest extends TeaModel {
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
     * <p>*   By default, if you do not specify the database instance IDs, all database instances for which the automatic SQL throttling feature is enabled within the current Alibaba Cloud account are returned. The following types of database instances are returned:</p>
     * <br>
     * <p>    *   Database instances for which the automatic SQL throttling feature is currently enabled.</p>
     * <p>    *   Database instances for which the automatic SQL throttling feature was once enabled but is currently disabled. Released database instances are not included.</p>
     */
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
