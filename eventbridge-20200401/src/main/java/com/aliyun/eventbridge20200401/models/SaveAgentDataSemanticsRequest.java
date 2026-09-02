// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SaveAgentDataSemanticsRequest extends TeaModel {
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
    public java.util.List<AgentDataSemanticsExample> examples;

    /**
     * <p>The data association knowledge. If this parameter is specified, the current content is saved. If this parameter is not specified, the existing content is cleared. A maximum of 100 entries are supported, and the maximum size of each knowledge category is 16 KB.</p>
     */
    @NameInMap("Joins")
    public java.util.List<AgentDataSemanticsJoin> joins;

    /**
     * <p>The SQL expression knowledge. If this parameter is specified, the current content is saved. If this parameter is not specified, the existing content is cleared. A maximum of 100 entries are supported, and the maximum size of each knowledge category is 16 KB.</p>
     */
    @NameInMap("Metrics")
    public java.util.List<AgentDataSemanticsMetric> metrics;

    /**
     * <p>The text knowledge in Markdown format. If this parameter is specified, the current content is saved. If this parameter is not specified, the existing content is cleared. The maximum size of each knowledge category is 16 KB.</p>
     */
    @NameInMap("Text")
    public AgentDataSemanticsText text;

    public static SaveAgentDataSemanticsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAgentDataSemanticsRequest self = new SaveAgentDataSemanticsRequest();
        return TeaModel.build(map, self);
    }

    public SaveAgentDataSemanticsRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public SaveAgentDataSemanticsRequest setExamples(java.util.List<AgentDataSemanticsExample> examples) {
        this.examples = examples;
        return this;
    }
    public java.util.List<AgentDataSemanticsExample> getExamples() {
        return this.examples;
    }

    public SaveAgentDataSemanticsRequest setJoins(java.util.List<AgentDataSemanticsJoin> joins) {
        this.joins = joins;
        return this;
    }
    public java.util.List<AgentDataSemanticsJoin> getJoins() {
        return this.joins;
    }

    public SaveAgentDataSemanticsRequest setMetrics(java.util.List<AgentDataSemanticsMetric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<AgentDataSemanticsMetric> getMetrics() {
        return this.metrics;
    }

    public SaveAgentDataSemanticsRequest setText(AgentDataSemanticsText text) {
        this.text = text;
        return this;
    }
    public AgentDataSemanticsText getText() {
        return this.text;
    }

}
