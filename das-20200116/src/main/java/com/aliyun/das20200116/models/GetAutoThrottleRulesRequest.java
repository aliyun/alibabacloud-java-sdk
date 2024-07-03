// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoThrottleRulesRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The database instance IDs.</p>
     * <ul>
     * <li><p>Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\\&quot;Instance ID1\\&quot;,\\&quot;Instance ID2\\&quot;]</code>.</p>
     * </li>
     * <li><p>By default, if you leave this parameter empty, all database instances for which the automatic SQL throttling feature has been enabled within the current Alibaba Cloud account are returned. The following types of database instances are returned:</p>
     * <ul>
     * <li>Database instances for which the automatic SQL throttling feature is currently enabled.</li>
     * <li>Database instances for which the automatic SQL throttling feature was once enabled but is currently disabled. Released database instances are not included.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;rm-2ze8g2am97624****\&quot;,\&quot;rm-2vc54m2a6pd6p****\&quot;,\&quot;rm-2ze9xrhze0709****\&quot;]</p>
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
