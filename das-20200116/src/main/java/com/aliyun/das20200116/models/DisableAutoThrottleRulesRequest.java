// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoThrottleRulesRequest extends TeaModel {
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
     * <blockquote>
     * <p> Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\\&quot;Instance ID1\\&quot;,\\&quot;Instance ID2\\&quot;]</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;rm-2ze8g2am97624****\&quot;,\&quot;rm-2ze9xrhze0709****\&quot;]</p>
     */
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
