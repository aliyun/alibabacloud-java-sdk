// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationServersResponseBody extends TeaModel {
    /**
     * <p>The list of authorization servers.</p>
     */
    @NameInMap("AuthorizationServers")
    public java.util.List<ListAuthorizationServersResponseBodyAuthorizationServers> authorizationServers;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of authorization servers.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthorizationServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationServersResponseBody self = new ListAuthorizationServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationServersResponseBody setAuthorizationServers(java.util.List<ListAuthorizationServersResponseBodyAuthorizationServers> authorizationServers) {
        this.authorizationServers = authorizationServers;
        return this;
    }
    public java.util.List<ListAuthorizationServersResponseBodyAuthorizationServers> getAuthorizationServers() {
        return this.authorizationServers;
    }

    public ListAuthorizationServersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationServersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationServersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationServersResponseBodyAuthorizationServers extends TeaModel {
        /**
         * <p>The unique identifier of the authorization server.</p>
         * 
         * <strong>example:</strong>
         * <p>iauths_system</p>
         */
        @NameInMap("AuthorizationServerId")
        public String authorizationServerId;

        /**
         * <p>The name of the authorization server.</p>
         * 
         * <strong>example:</strong>
         * <p>my_authorization_server</p>
         */
        @NameInMap("AuthorizationServerName")
        public String authorizationServerName;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creation type.</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("CreationType")
        public String creationType;

        /**
         * <p>The description of the authorization server.</p>
         * 
         * <strong>example:</strong>
         * <p>description of authorization server</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The currently active issuer address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/token">https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/token</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The domain name used by the issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.aliyunidaas.com</p>
         */
        @NameInMap("IssuerDomain")
        public String issuerDomain;

        /**
         * <p>The issuer mode.</p>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("IssuerMode")
        public String issuerMode;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListAuthorizationServersResponseBodyAuthorizationServers build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationServersResponseBodyAuthorizationServers self = new ListAuthorizationServersResponseBodyAuthorizationServers();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setAuthorizationServerId(String authorizationServerId) {
            this.authorizationServerId = authorizationServerId;
            return this;
        }
        public String getAuthorizationServerId() {
            return this.authorizationServerId;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setAuthorizationServerName(String authorizationServerName) {
            this.authorizationServerName = authorizationServerName;
            return this;
        }
        public String getAuthorizationServerName() {
            return this.authorizationServerName;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setIssuerDomain(String issuerDomain) {
            this.issuerDomain = issuerDomain;
            return this;
        }
        public String getIssuerDomain() {
            return this.issuerDomain;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setIssuerMode(String issuerMode) {
            this.issuerMode = issuerMode;
            return this;
        }
        public String getIssuerMode() {
            return this.issuerMode;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAuthorizationServersResponseBodyAuthorizationServers setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
