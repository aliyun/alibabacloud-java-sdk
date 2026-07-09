// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListAgentSpacesRequest extends TeaModel {
    /**
     * <p>The AgentSpace name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The maximum number of results to return.</p>
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

    @NameInMap("regionId")
    public String regionId;

    public static ListAgentSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpacesRequest self = new ListAgentSpacesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSpacesRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public ListAgentSpacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentSpacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentSpacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
