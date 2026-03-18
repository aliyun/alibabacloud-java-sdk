// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListAuthenticationTokensResponseBody extends TeaModel {
    /**
     * <p>资源实体列表。</p>
     */
    @NameInMap("entities")
    public java.util.List<ListAuthenticationTokensResponseBodyEntities> entities;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListAuthenticationTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticationTokensResponseBody self = new ListAuthenticationTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthenticationTokensResponseBody setEntities(java.util.List<ListAuthenticationTokensResponseBodyEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<ListAuthenticationTokensResponseBodyEntities> getEntities() {
        return this.entities;
    }

    public ListAuthenticationTokensResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAuthenticationTokensResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthenticationTokensResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthenticationTokensResponseBodyEntities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
         */
        @NameInMap("authenticationTokenId")
        public String authenticationTokenId;

        /**
         * <strong>example:</strong>
         * <p>jwt</p>
         */
        @NameInMap("authenticationTokenType")
        public String authenticationTokenType;

        /**
         * <strong>example:</strong>
         * <p>test_jwt_subject</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("consumerType")
        public String consumerType;

        /**
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>application</p>
         */
        @NameInMap("creatorType")
        public String creatorType;

        /**
         * <strong>example:</strong>
         * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
         */
        @NameInMap("credentialProviderId")
        public String credentialProviderId;

        /**
         * <strong>example:</strong>
         * <p>1772693568000</p>
         */
        @NameInMap("expirationTime")
        public Long expirationTime;

        /**
         * <p>EIAM实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("revoked")
        public Boolean revoked;

        /**
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static ListAuthenticationTokensResponseBodyEntities build(java.util.Map<String, ?> map) throws Exception {
            ListAuthenticationTokensResponseBodyEntities self = new ListAuthenticationTokensResponseBodyEntities();
            return TeaModel.build(map, self);
        }

        public ListAuthenticationTokensResponseBodyEntities setAuthenticationTokenId(String authenticationTokenId) {
            this.authenticationTokenId = authenticationTokenId;
            return this;
        }
        public String getAuthenticationTokenId() {
            return this.authenticationTokenId;
        }

        public ListAuthenticationTokensResponseBodyEntities setAuthenticationTokenType(String authenticationTokenType) {
            this.authenticationTokenType = authenticationTokenType;
            return this;
        }
        public String getAuthenticationTokenType() {
            return this.authenticationTokenType;
        }

        public ListAuthenticationTokensResponseBodyEntities setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListAuthenticationTokensResponseBodyEntities setConsumerType(String consumerType) {
            this.consumerType = consumerType;
            return this;
        }
        public String getConsumerType() {
            return this.consumerType;
        }

        public ListAuthenticationTokensResponseBodyEntities setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAuthenticationTokensResponseBodyEntities setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListAuthenticationTokensResponseBodyEntities setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public ListAuthenticationTokensResponseBodyEntities setCredentialProviderId(String credentialProviderId) {
            this.credentialProviderId = credentialProviderId;
            return this;
        }
        public String getCredentialProviderId() {
            return this.credentialProviderId;
        }

        public ListAuthenticationTokensResponseBodyEntities setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ListAuthenticationTokensResponseBodyEntities setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAuthenticationTokensResponseBodyEntities setRevoked(Boolean revoked) {
            this.revoked = revoked;
            return this;
        }
        public Boolean getRevoked() {
            return this.revoked;
        }

        public ListAuthenticationTokensResponseBodyEntities setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
