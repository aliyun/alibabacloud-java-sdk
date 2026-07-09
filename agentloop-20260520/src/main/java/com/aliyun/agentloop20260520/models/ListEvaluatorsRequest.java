// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluatorsRequest extends TeaModel {
    /**
     * <p>The AgentSpace name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-agentspace</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The fuzzy match condition for the evaluator name.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_task_completion</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEyM30=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The evaluator source filter.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The evaluator type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT</p>
     */
    @NameInMap("type")
    public String type;

    public static ListEvaluatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluatorsRequest self = new ListEvaluatorsRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluatorsRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public ListEvaluatorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluatorsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEvaluatorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluatorsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListEvaluatorsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
