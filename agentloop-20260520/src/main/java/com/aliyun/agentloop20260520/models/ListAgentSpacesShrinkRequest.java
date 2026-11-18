// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListAgentSpacesShrinkRequest extends TeaModel {
    /**
     * <p>The name of the AgentSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The maximum number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>pEL20OGYeZQez8NdW7ve</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Filters only active AgentSpaces in the current region. Multiple conditions are combined with AND, and keys must be unique. Omitting the value matches the existence of the key, and an empty character string is an exact match for an empty value. An empty array is equivalent to not using label filtering and retains the original cross-region resources.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;test&quot;}]</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    public static ListAgentSpacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpacesShrinkRequest self = new ListAgentSpacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSpacesShrinkRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public ListAgentSpacesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentSpacesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentSpacesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAgentSpacesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
