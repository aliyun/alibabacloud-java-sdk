// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiAgentRegisterInfosResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("AgentRegisterInfos")
    public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos agentRegisterInfos;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page set for the paged query. This is the paging size. Maximum value: <strong>100</strong>. Default value: <strong>20</strong>. Settings determine how many rows are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListAtiAgentRegisterInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAtiAgentRegisterInfosResponseBody self = new ListAtiAgentRegisterInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAtiAgentRegisterInfosResponseBody setAccessDeniedDetail(ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAtiAgentRegisterInfosResponseBody setAgentRegisterInfos(ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos agentRegisterInfos) {
        this.agentRegisterInfos = agentRegisterInfos;
        return this;
    }
    public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos getAgentRegisterInfos() {
        return this.agentRegisterInfos;
    }

    public ListAtiAgentRegisterInfosResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAtiAgentRegisterInfosResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAtiAgentRegisterInfosResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAtiAgentRegisterInfosResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAtiAgentRegisterInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAtiAgentRegisterInfosResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListAtiAgentRegisterInfosResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateUser</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>1046973331XXXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encrypted diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQFohtp4aIbaeEXXXXQxNjFDLUIzMzgtNTXXXX05NkFCLUI2RkY5XXXXzAzQQ==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The cause of the authentication failure. Valid values:</p>
         * <ul>
         * <li>ExplicitDeny: Explicit denial.</li>
         * <li>ImplicitDeny: Implicit denial.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail self = new ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ListAtiAgentRegisterInfosResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        public static ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint self = new ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint();
            return TeaModel.build(map, self);
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints extends TeaModel {
        @NameInMap("Endpoint")
        public java.util.List<ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint> endpoint;

        public static ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints self = new ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints();
            return TeaModel.build(map, self);
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints setEndpoint(java.util.List<ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public java.util.List<ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpointsEndpoint> getEndpoint() {
            return this.endpoint;
        }

    }

    public static class ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo extends TeaModel {
        @NameInMap("AgentDisplayName")
        public String agentDisplayName;

        @NameInMap("AgentHost")
        public String agentHost;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentRegisterInfoId")
        public String agentRegisterInfoId;

        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("AtiName")
        public String atiName;

        @NameInMap("CreateTimestamp")
        public String createTimestamp;

        @NameInMap("Endpoints")
        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints endpoints;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTimestamp")
        public String updateTimestamp;

        public static ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo self = new ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo();
            return TeaModel.build(map, self);
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setAgentDisplayName(String agentDisplayName) {
            this.agentDisplayName = agentDisplayName;
            return this;
        }
        public String getAgentDisplayName() {
            return this.agentDisplayName;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setAgentHost(String agentHost) {
            this.agentHost = agentHost;
            return this;
        }
        public String getAgentHost() {
            return this.agentHost;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setAgentRegisterInfoId(String agentRegisterInfoId) {
            this.agentRegisterInfoId = agentRegisterInfoId;
            return this;
        }
        public String getAgentRegisterInfoId() {
            return this.agentRegisterInfoId;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setAtiName(String atiName) {
            this.atiName = atiName;
            return this;
        }
        public String getAtiName() {
            return this.atiName;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setCreateTimestamp(String createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public String getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setEndpoints(ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfoEndpoints getEndpoints() {
            return this.endpoints;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo setUpdateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos extends TeaModel {
        @NameInMap("AgentRegisterInfo")
        public java.util.List<ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo> agentRegisterInfo;

        public static ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos self = new ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos();
            return TeaModel.build(map, self);
        }

        public ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfos setAgentRegisterInfo(java.util.List<ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo> agentRegisterInfo) {
            this.agentRegisterInfo = agentRegisterInfo;
            return this;
        }
        public java.util.List<ListAtiAgentRegisterInfosResponseBodyAgentRegisterInfosAgentRegisterInfo> getAgentRegisterInfo() {
            return this.agentRegisterInfo;
        }

    }

}
