// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetServiceEndpointResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The service endpoint details.</p>
     */
    @NameInMap("data")
    public GetServiceEndpointResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

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

    public static GetServiceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEndpointResponseBody self = new GetServiceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceEndpointResponseBody setData(GetServiceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceEndpointResponseBodyData getData() {
        return this.data;
    }

    public GetServiceEndpointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetServiceEndpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceEndpointResponseBodyDataAccessUrls extends TeaModel {
        /**
         * <p>The access address type. Valid values: INTERNET and VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <p>The access address status. Valid values: CREATING, READY, and DEGRADED.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the access address status. A specific reason is returned when the status is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The access address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://endpoint.example.com">https://endpoint.example.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetServiceEndpointResponseBodyDataAccessUrls build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataAccessUrls self = new GetServiceEndpointResponseBodyDataAccessUrls();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceEndpointResponseBodyDataAuthentication extends TeaModel {
        /**
         * <p>The authentication method. NONE indicates that no authentication is required. API_KEY indicates that authentication is performed by passing an API key in the x-api-key request header.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static GetServiceEndpointResponseBodyDataAuthentication build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataAuthentication self = new GetServiceEndpointResponseBodyDataAuthentication();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceEndpointResponseBodyDataElasticityPolicy extends TeaModel {
        /**
         * <p>是否开启弹性。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>最大实例数，不小于 1。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>最小实例数，不小于 0 且不大于 maxSandboxCount。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static GetServiceEndpointResponseBodyDataElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataElasticityPolicy self = new GetServiceEndpointResponseBodyDataElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class GetServiceEndpointResponseBodyDataTarget extends TeaModel {
        /**
         * <p>The target agent ID. This parameter is returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The target agent version number. This parameter is returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>The collaboration component type. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>ELEMENT_WEB</p>
         */
        @NameInMap("collaborationComponent")
        public String collaborationComponent;

        /**
         * <p>The workspace resource binding ID associated with the target collaboration component. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
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

        public static GetServiceEndpointResponseBodyDataTarget build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataTarget self = new GetServiceEndpointResponseBodyDataTarget();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataTarget setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetServiceEndpointResponseBodyDataTarget setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public GetServiceEndpointResponseBodyDataTarget setCollaborationComponent(String collaborationComponent) {
            this.collaborationComponent = collaborationComponent;
            return this;
        }
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        public GetServiceEndpointResponseBodyDataTarget setResourceBindingId(String resourceBindingId) {
            this.resourceBindingId = resourceBindingId;
            return this;
        }
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        public GetServiceEndpointResponseBodyDataTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetServiceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The list of access addresses for the service endpoint.</p>
         */
        @NameInMap("accessUrls")
        public java.util.List<GetServiceEndpointResponseBodyDataAccessUrls> accessUrls;

        /**
         * <p>The authentication configuration of the service endpoint.</p>
         */
        @NameInMap("authentication")
        public GetServiceEndpointResponseBodyDataAuthentication authentication;

        /**
         * <p>The creation time in UTC format compliant with RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>publicAccessEnabled 与工作空间公网入向上限叠加后的结果：二者均允许时为 true。仅表示策略目标，不代表公网入口已发布完成，实际状态以 accessUrls 与 status 为准。</p>
         */
        @NameInMap("effectivePublicAccessEnabled")
        public Boolean effectivePublicAccessEnabled;

        /**
         * <p>仅在服务端点设置过弹性覆盖值时返回，可设置的为 Router 类型服务端点与 GATEWAY_API_WITH_VPC_INGRESS 类型的 DEFAULT 服务端点；未设置覆盖值时不返回该对象，表示继承智能体源配置，不得当作空对象或默认策略。返回时三个字段必全。</p>
         */
        @NameInMap("elasticityPolicy")
        public GetServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy;

        /**
         * <p>The service endpoint type. DEFAULT indicates a default endpoint created and maintained by the platform. NAMED indicates a named endpoint explicitly created by a user.</p>
         * 
         * <strong>example:</strong>
         * <p>NAMED</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>The service endpoint name. It must be unique within the workspace and is 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-endpoint</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>用户在服务端点上设置的公网入向期望；未设置过的历史服务端点按 true 返回。仅表示配置期望，实际公网地址是否可用以 accessUrls 与 status 为准。</p>
         */
        @NameInMap("publicAccessEnabled")
        public Boolean publicAccessEnabled;

        /**
         * <p>The region ID of the service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The service endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>se-123456</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        /**
         * <p>The service endpoint status. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, and DELETING.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the service endpoint status. A specific reason is returned when the status is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The target route configuration of the service endpoint.</p>
         */
        @NameInMap("target")
        public GetServiceEndpointResponseBodyDataTarget target;

        /**
         * <p>The last modification time in UTC format compliant with RFC 3339.</p>
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

        public static GetServiceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyData self = new GetServiceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyData setAccessUrls(java.util.List<GetServiceEndpointResponseBodyDataAccessUrls> accessUrls) {
            this.accessUrls = accessUrls;
            return this;
        }
        public java.util.List<GetServiceEndpointResponseBodyDataAccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        public GetServiceEndpointResponseBodyData setAuthentication(GetServiceEndpointResponseBodyDataAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public GetServiceEndpointResponseBodyDataAuthentication getAuthentication() {
            return this.authentication;
        }

        public GetServiceEndpointResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetServiceEndpointResponseBodyData setEffectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
            this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
            return this;
        }
        public Boolean getEffectivePublicAccessEnabled() {
            return this.effectivePublicAccessEnabled;
        }

        public GetServiceEndpointResponseBodyData setElasticityPolicy(GetServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public GetServiceEndpointResponseBodyDataElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public GetServiceEndpointResponseBodyData setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public GetServiceEndpointResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceEndpointResponseBodyData setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public GetServiceEndpointResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetServiceEndpointResponseBodyData setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public GetServiceEndpointResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceEndpointResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetServiceEndpointResponseBodyData setTarget(GetServiceEndpointResponseBodyDataTarget target) {
            this.target = target;
            return this;
        }
        public GetServiceEndpointResponseBodyDataTarget getTarget() {
            return this.target;
        }

        public GetServiceEndpointResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetServiceEndpointResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
