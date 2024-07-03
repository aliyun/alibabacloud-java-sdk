// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeRulesRequest extends TeaModel {
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
     * <li><p>Specify the parameter value as a JSON array, such as <code>[\\&quot;Database account 1\\&quot;,\\&quot;Database account 2\\&quot;]</code>. Separate database instance IDs with commas (,).</p>
     * </li>
     * <li><p>By default, if you leave this parameter empty, all database instances for which the automatic fragment recycling feature has been enabled within the current Alibaba Cloud account are returned. The following types of database instances are returned:</p>
     * <ul>
     * <li>Database instances for which the automatic fragment recycling feature is currently enabled.</li>
     * <li>Database instances for which the automatic fragment recycling feature was once enabled but is currently disabled, including those for which DAS Enterprise Edition has been disabled but excluding those that have been released.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;rm-2ze8g2am97624****\&quot;,\&quot;rm-2vc54m2a6pd6p****\&quot;,\&quot;rm-2ze9xrhze0709****\&quot;,\&quot;rm-2ze8g2am97627****\&quot;]</p>
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
