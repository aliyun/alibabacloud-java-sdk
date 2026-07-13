// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchAtiAgentRegisterInfoMarketResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Agents")
    public SearchAtiAgentRegisterInfoMarketResponseBodyAgents agents;

    /**
     * <p>The number of entries per batch query.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number. Minimum value: <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for the paged query. Settings: maximum value: <strong>100</strong>. Default value: <strong>20</strong>. This parameter controls paging behavior.</p>
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
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static SearchAtiAgentRegisterInfoMarketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAtiAgentRegisterInfoMarketResponseBody self = new SearchAtiAgentRegisterInfoMarketResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setAccessDeniedDetail(SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setAgents(SearchAtiAgentRegisterInfoMarketResponseBodyAgents agents) {
        this.agents = agents;
        return this;
    }
    public SearchAtiAgentRegisterInfoMarketResponseBodyAgents getAgents() {
        return this.agents;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchAtiAgentRegisterInfoMarketResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>10469733312XXX</p>
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
         * <p>The reason for the authentication failure. Valid values:</p>
         * <ul>
         * <li>ExplicitDeny: explicit deny.</li>
         * <li>ImplicitDeny: implicit deny.</li>
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

        public static SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail self = new SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols extends TeaModel {
        @NameInMap("Protocol")
        public java.util.List<String> protocol;

        public static SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols build(java.util.Map<String, ?> map) throws Exception {
            SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols self = new SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols();
            return TeaModel.build(map, self);
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

    }

    public static class SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent extends TeaModel {
        @NameInMap("AgentDescription")
        public String agentDescription;

        @NameInMap("AgentDisplayName")
        public String agentDisplayName;

        @NameInMap("AgentHost")
        public String agentHost;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Protocols")
        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols protocols;

        @NameInMap("Status")
        public String status;

        @NameInMap("TrustCardUrl")
        public String trustCardUrl;

        @NameInMap("TrustLevel")
        public String trustLevel;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent build(java.util.Map<String, ?> map) throws Exception {
            SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent self = new SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent();
            return TeaModel.build(map, self);
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setAgentDescription(String agentDescription) {
            this.agentDescription = agentDescription;
            return this;
        }
        public String getAgentDescription() {
            return this.agentDescription;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setAgentDisplayName(String agentDisplayName) {
            this.agentDisplayName = agentDisplayName;
            return this;
        }
        public String getAgentDisplayName() {
            return this.agentDisplayName;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setAgentHost(String agentHost) {
            this.agentHost = agentHost;
            return this;
        }
        public String getAgentHost() {
            return this.agentHost;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setProtocols(SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols protocols) {
            this.protocols = protocols;
            return this;
        }
        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgentProtocols getProtocols() {
            return this.protocols;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setTrustCardUrl(String trustCardUrl) {
            this.trustCardUrl = trustCardUrl;
            return this;
        }
        public String getTrustCardUrl() {
            return this.trustCardUrl;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setTrustLevel(String trustLevel) {
            this.trustLevel = trustLevel;
            return this;
        }
        public String getTrustLevel() {
            return this.trustLevel;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class SearchAtiAgentRegisterInfoMarketResponseBodyAgents extends TeaModel {
        @NameInMap("Agent")
        public java.util.List<SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent> agent;

        public static SearchAtiAgentRegisterInfoMarketResponseBodyAgents build(java.util.Map<String, ?> map) throws Exception {
            SearchAtiAgentRegisterInfoMarketResponseBodyAgents self = new SearchAtiAgentRegisterInfoMarketResponseBodyAgents();
            return TeaModel.build(map, self);
        }

        public SearchAtiAgentRegisterInfoMarketResponseBodyAgents setAgent(java.util.List<SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent> agent) {
            this.agent = agent;
            return this;
        }
        public java.util.List<SearchAtiAgentRegisterInfoMarketResponseBodyAgentsAgent> getAgent() {
            return this.agent;
        }

    }

}
