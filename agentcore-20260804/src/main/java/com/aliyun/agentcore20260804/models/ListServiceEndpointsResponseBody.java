// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of service endpoints.</p>
     */
    @NameInMap("items")
    public java.util.List<ListServiceEndpointsResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page returned in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. Returns an error description if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor for the next page. Empty if there is no next page.</p>
     * 
     * <strong>example:</strong>
     * <p>djE6YWdlbnRjb3JlLnNlcnZpY2UtZW5kcG9pbnQubGlzdDoyMA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of service endpoints that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListServiceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEndpointsResponseBody self = new ListServiceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceEndpointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServiceEndpointsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListServiceEndpointsResponseBody setItems(java.util.List<ListServiceEndpointsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListServiceEndpointsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListServiceEndpointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceEndpointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceEndpointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListServiceEndpointsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceEndpointsResponseBodyItemsAccessUrls extends TeaModel {
        /**
         * <p>The access URL type. Valid values: INTERNET and VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <p>The status of the access URL. Valid values: CREATING, READY, and DEGRADED.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the access URL status. Returns the specific reason when the status is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://endpoint.example.com">https://endpoint.example.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ListServiceEndpointsResponseBodyItemsAccessUrls build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsAccessUrls self = new ListServiceEndpointsResponseBodyItemsAccessUrls();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsAuthentication extends TeaModel {
        /**
         * <p>The authentication method. NONE indicates that no authentication is required, and API_KEY indicates that authentication is performed by passing an API key through the x-api-key request header.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static ListServiceEndpointsResponseBodyItemsAuthentication build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsAuthentication self = new ListServiceEndpointsResponseBodyItemsAuthentication();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsElasticityPolicy extends TeaModel {
        /**
         * <p>Indicates whether elasticity is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of instances, which must be no less than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of instances, which must be no less than 0 and no greater than maxSandboxCount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static ListServiceEndpointsResponseBodyItemsElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsElasticityPolicy self = new ListServiceEndpointsResponseBodyItemsElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsTarget extends TeaModel {
        /**
         * <p>The ID of the target agent. Returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The version number of the target agent. Returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>The type of the collaboration component. Returned when the target type is TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>ELEMENT_WEB</p>
         */
        @NameInMap("collaborationComponent")
        public String collaborationComponent;

        /**
         * <p>The workspace resource binding ID associated with the target collaboration component. Returned when the target type is TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>wrb-123456</p>
         */
        @NameInMap("resourceBindingId")
        public String resourceBindingId;

        /**
         * <p>The target type. Valid values: AGENT_VERSION and TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT_VERSION</p>
         */
        @NameInMap("targetType")
        public String targetType;

        public static ListServiceEndpointsResponseBodyItemsTarget build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsTarget self = new ListServiceEndpointsResponseBodyItemsTarget();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsTarget setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setCollaborationComponent(String collaborationComponent) {
            this.collaborationComponent = collaborationComponent;
            return this;
        }
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setResourceBindingId(String resourceBindingId) {
            this.resourceBindingId = resourceBindingId;
            return this;
        }
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListServiceEndpointsResponseBodyItems extends TeaModel {
        /**
         * <p>The list of access URLs for the service endpoint.</p>
         */
        @NameInMap("accessUrls")
        public java.util.List<ListServiceEndpointsResponseBodyItemsAccessUrls> accessUrls;

        /**
         * <p>The authentication configuration of the service endpoint.</p>
         */
        @NameInMap("authentication")
        public ListServiceEndpointsResponseBodyItemsAuthentication authentication;

        /**
         * <p>The creation time in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The result of combining publicAccessEnabled with the workspace public access inbound upper limit. It is true only when both allow it. This only indicates the policy target and does not mean that the public access entry has been published. The actual status is subject to accessUrls and status.</p>
         */
        @NameInMap("effectivePublicAccessEnabled")
        public Boolean effectivePublicAccessEnabled;

        /**
         * <p>Returned only when elastic override values are set for the service endpoint. Can be set for Router-type service endpoints and DEFAULT service endpoints of the GATEWAY_API_WITH_VPC_INGRESS type. If no override values are set, this object is not returned, indicating that the source configuration of the agent is inherited. It must not be treated as an empty object or a default policy. When returned, all three fields are always included.</p>
         */
        @NameInMap("elasticityPolicy")
        public ListServiceEndpointsResponseBodyItemsElasticityPolicy elasticityPolicy;

        /**
         * <p>The type of the service endpoint. DEFAULT indicates a default endpoint created and maintained by the platform, and NAMED indicates a named endpoint explicitly created by a user.</p>
         * 
         * <strong>example:</strong>
         * <p>NAMED</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>The name of the service endpoint. It must be unique within the workspace and 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-endpoint</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The expected public access inbound setting configured by the user on the service endpoint. For legacy service endpoints where this has not been set, true is returned. This only indicates the configuration expectation. The actual availability of the public access URL is subject to accessUrls and status.</p>
         */
        @NameInMap("publicAccessEnabled")
        public Boolean publicAccessEnabled;

        /**
         * <p>The ID of the region where the service endpoint resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The ID of the service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>se-123456</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        /**
         * <p>The status of the service endpoint. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, and DELETING.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the service endpoint status. Returns the specific reason when the status is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The target routing configuration of the service endpoint.</p>
         */
        @NameInMap("target")
        public ListServiceEndpointsResponseBodyItemsTarget target;

        /**
         * <p>The time of the last modification in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListServiceEndpointsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItems self = new ListServiceEndpointsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItems setAccessUrls(java.util.List<ListServiceEndpointsResponseBodyItemsAccessUrls> accessUrls) {
            this.accessUrls = accessUrls;
            return this;
        }
        public java.util.List<ListServiceEndpointsResponseBodyItemsAccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        public ListServiceEndpointsResponseBodyItems setAuthentication(ListServiceEndpointsResponseBodyItemsAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsAuthentication getAuthentication() {
            return this.authentication;
        }

        public ListServiceEndpointsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListServiceEndpointsResponseBodyItems setEffectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
            this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
            return this;
        }
        public Boolean getEffectivePublicAccessEnabled() {
            return this.effectivePublicAccessEnabled;
        }

        public ListServiceEndpointsResponseBodyItems setElasticityPolicy(ListServiceEndpointsResponseBodyItemsElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public ListServiceEndpointsResponseBodyItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListServiceEndpointsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceEndpointsResponseBodyItems setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public ListServiceEndpointsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListServiceEndpointsResponseBodyItems setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public ListServiceEndpointsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceEndpointsResponseBodyItems setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListServiceEndpointsResponseBodyItems setTarget(ListServiceEndpointsResponseBodyItemsTarget target) {
            this.target = target;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsTarget getTarget() {
            return this.target;
        }

        public ListServiceEndpointsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListServiceEndpointsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
