// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SaveAgentDataSemanticsShrinkRequest extends TeaModel {
    /**
     * <p>The name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bakehouse_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The SQL example knowledge. If this parameter is specified, the current content is saved. If this parameter is not specified, the existing content is cleared. A maximum of 50 entries are supported, and the maximum size of each knowledge category is 16 KB.</p>
     */
    @NameInMap("Examples")
    public String examplesShrink;

    /**
     * <p>The data association knowledge. If this parameter is specified, the current content is saved. If this parameter is not specified, the existing content is cleared. A maximum of 100 entries are supported, and the maximum size of each knowledge category is 16 KB.</p>
     */
    @NameInMap("Joins")
    public String joinsShrink;

    /**
     * <p>The SQL expression knowledge. If this parameter is specified, the current content is saved. If this parameter is not specified, the existing content is cleared. A maximum of 100 entries are supported, and the maximum size of each knowledge category is 16 KB.</p>
     */
    @NameInMap("Metrics")
    public String metricsShrink;

    /**
     * <p>The text knowledge in Markdown format. If this parameter is specified, the current content is saved. If this parameter is not specified, the existing content is cleared. The maximum size of each knowledge category is 16 KB.</p>
     */
    @NameInMap("Text")
    public String textShrink;

    public static SaveAgentDataSemanticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAgentDataSemanticsShrinkRequest self = new SaveAgentDataSemanticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveAgentDataSemanticsShrinkRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public SaveAgentDataSemanticsShrinkRequest setExamplesShrink(String examplesShrink) {
        this.examplesShrink = examplesShrink;
        return this;
    }
    public String getExamplesShrink() {
        return this.examplesShrink;
    }

    public SaveAgentDataSemanticsShrinkRequest setJoinsShrink(String joinsShrink) {
        this.joinsShrink = joinsShrink;
        return this;
    }
    public String getJoinsShrink() {
        return this.joinsShrink;
    }

    public SaveAgentDataSemanticsShrinkRequest setMetricsShrink(String metricsShrink) {
        this.metricsShrink = metricsShrink;
        return this;
    }
    public String getMetricsShrink() {
        return this.metricsShrink;
    }

    public SaveAgentDataSemanticsShrinkRequest setTextShrink(String textShrink) {
        this.textShrink = textShrink;
        return this;
    }
    public String getTextShrink() {
        return this.textShrink;
    }

}
