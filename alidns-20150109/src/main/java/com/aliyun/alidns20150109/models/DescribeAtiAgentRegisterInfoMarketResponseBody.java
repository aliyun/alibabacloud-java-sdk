// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAgentRegisterInfoMarketResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>支付服务</p>
     */
    @NameInMap("AgentDescription")
    public String agentDescription;

    /**
     * <strong>example:</strong>
     * <p>测试Agent</p>
     */
    @NameInMap("AgentDisplayName")
    public String agentDisplayName;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("AgentHost")
    public String agentHost;

    /**
     * <strong>example:</strong>
     * <p>gsc01629925@5e0964fd-951c-4e45-b518-d09d4d2db8ca</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>2074753647748672512</p>
     */
    @NameInMap("AgentRegisterInfoId")
    public String agentRegisterInfoId;

    /**
     * <strong>example:</strong>
     * <p>3.9.3</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    @NameInMap("Categories")
    public DescribeAtiAgentRegisterInfoMarketResponseBodyCategories categories;

    @NameInMap("Endpoints")
    public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints endpoints;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0629502C-6224-5DC9-A8ED-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>忽略</p>
     */
    @NameInMap("TrustCardContent")
    public String trustCardContent;

    /**
     * <strong>example:</strong>
     * <p>基础认证</p>
     */
    @NameInMap("TrustLevel")
    public String trustLevel;

    public static DescribeAtiAgentRegisterInfoMarketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiAgentRegisterInfoMarketResponseBody self = new DescribeAtiAgentRegisterInfoMarketResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setAccessDeniedDetail(DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setAgentDescription(String agentDescription) {
        this.agentDescription = agentDescription;
        return this;
    }
    public String getAgentDescription() {
        return this.agentDescription;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setAgentDisplayName(String agentDisplayName) {
        this.agentDisplayName = agentDisplayName;
        return this;
    }
    public String getAgentDisplayName() {
        return this.agentDisplayName;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setAgentHost(String agentHost) {
        this.agentHost = agentHost;
        return this;
    }
    public String getAgentHost() {
        return this.agentHost;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setAgentRegisterInfoId(String agentRegisterInfoId) {
        this.agentRegisterInfoId = agentRegisterInfoId;
        return this;
    }
    public String getAgentRegisterInfoId() {
        return this.agentRegisterInfoId;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setCategories(DescribeAtiAgentRegisterInfoMarketResponseBodyCategories categories) {
        this.categories = categories;
        return this;
    }
    public DescribeAtiAgentRegisterInfoMarketResponseBodyCategories getCategories() {
        return this.categories;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setEndpoints(DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints getEndpoints() {
        return this.endpoints;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setTrustCardContent(String trustCardContent) {
        this.trustCardContent = trustCardContent;
        return this;
    }
    public String getTrustCardContent() {
        return this.trustCardContent;
    }

    public DescribeAtiAgentRegisterInfoMarketResponseBody setTrustLevel(String trustLevel) {
        this.trustLevel = trustLevel;
        return this;
    }
    public String getTrustLevel() {
        return this.trustLevel;
    }

    public static class DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AddRspDomainServerHoldStatusForGatewayOte</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>1046973331XXXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <p>AQFohtp4aIbaeEXXXXQxNjFDLUIzMzgtNTXXXX05NkFCLUI2RkY5XXXXzAzQQ==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail self = new DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeAtiAgentRegisterInfoMarketResponseBodyCategories extends TeaModel {
        @NameInMap("category")
        public java.util.List<String> category;

        public static DescribeAtiAgentRegisterInfoMarketResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAgentRegisterInfoMarketResponseBodyCategories self = new DescribeAtiAgentRegisterInfoMarketResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyCategories setCategory(java.util.List<String> category) {
            this.category = category;
            return this;
        }
        public java.util.List<String> getCategory() {
            return this.category;
        }

    }

    public static class DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports extends TeaModel {
        @NameInMap("Transport")
        public java.util.List<String> transport;

        public static DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports self = new DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports setTransport(java.util.List<String> transport) {
            this.transport = transport;
            return this;
        }
        public java.util.List<String> getTransport() {
            return this.transport;
        }

    }

    public static class DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint extends TeaModel {
        @NameInMap("AgentUrl")
        public String agentUrl;

        @NameInMap("MetadataUrl")
        public String metadataUrl;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Transports")
        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports transports;

        public static DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint self = new DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint setAgentUrl(String agentUrl) {
            this.agentUrl = agentUrl;
            return this;
        }
        public String getAgentUrl() {
            return this.agentUrl;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint setMetadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            return this;
        }
        public String getMetadataUrl() {
            return this.metadataUrl;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint setTransports(DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports transports) {
            this.transports = transports;
            return this;
        }
        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpointTransports getTransports() {
            return this.transports;
        }

    }

    public static class DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints extends TeaModel {
        @NameInMap("Endpoint")
        public java.util.List<DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint> endpoint;

        public static DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints self = new DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBodyEndpoints setEndpoint(java.util.List<DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public java.util.List<DescribeAtiAgentRegisterInfoMarketResponseBodyEndpointsEndpoint> getEndpoint() {
            return this.endpoint;
        }

    }

}
