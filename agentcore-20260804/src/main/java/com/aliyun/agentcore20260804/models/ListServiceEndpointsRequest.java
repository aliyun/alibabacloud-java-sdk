// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsRequest extends TeaModel {
    /**
     * <p>Filters by target agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-123456</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>Filters by target agent version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("agentVersion")
    public String agentVersion;

    /**
     * <p>Filters by collaboration component type. Valid values: MATRIX_CLIENT, MATRIX_FEDERATION, ELEMENT_WEB.</p>
     * 
     * <strong>example:</strong>
     * <p>ELEMENT_WEB</p>
     */
    @NameInMap("collaborationComponent")
    public String collaborationComponent;

    /**
     * <p>The maximum number of records per page. Valid values: 1 to 100. If this parameter is not specified, 20 records are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. Do not specify this parameter for the first request. For subsequent requests, specify the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>djE6YWdlbnRjb3JlLnNlcnZpY2UtZW5kcG9pbnQubGlzdDoyMA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Filters by the workspace resource binding ID of the target collaboration component.</p>
     * 
     * <strong>example:</strong>
     * <p>wrb-123456</p>
     */
    @NameInMap("resourceBindingId")
    public String resourceBindingId;

    /**
     * <p>Filters by service endpoint status. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, DELETING.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Filters by target type. Valid values: AGENT_VERSION, TEAM_COLLABORATION.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT_VERSION</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static ListServiceEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEndpointsRequest self = new ListServiceEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceEndpointsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListServiceEndpointsRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public ListServiceEndpointsRequest setCollaborationComponent(String collaborationComponent) {
        this.collaborationComponent = collaborationComponent;
        return this;
    }
    public String getCollaborationComponent() {
        return this.collaborationComponent;
    }

    public ListServiceEndpointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceEndpointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceEndpointsRequest setResourceBindingId(String resourceBindingId) {
        this.resourceBindingId = resourceBindingId;
        return this;
    }
    public String getResourceBindingId() {
        return this.resourceBindingId;
    }

    public ListServiceEndpointsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListServiceEndpointsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
