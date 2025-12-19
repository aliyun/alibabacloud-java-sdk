// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersResponseBody extends TeaModel {
    @NameInMap("IdentityProviders")
    public java.util.List<ListIdentityProvidersResponseBodyIdentityProviders> identityProviders;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lsy4U8Dgz6TCndCo6o5TB8</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>D325DF9D-7CA8-5C47-BA0C-9A74873F2BE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIdentityProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersResponseBody self = new ListIdentityProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersResponseBody setIdentityProviders(java.util.List<ListIdentityProvidersResponseBodyIdentityProviders> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }
    public java.util.List<ListIdentityProvidersResponseBodyIdentityProviders> getIdentityProviders() {
        return this.identityProviders;
    }

    public ListIdentityProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIdentityProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIdentityProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentityProvidersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIdentityProvidersResponseBodyIdentityProviders extends TeaModel {
        @NameInMap("AllowedAudience")
        public java.util.List<String> allowedAudience;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>ods_api_public_ios_wanxin_boxgame_user_behavior_integration_di</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oauth.aliyun.com/.well-known/openid-configuration">https://oauth.aliyun.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("DiscoveryURL")
        public String discoveryURL;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:identityprovider/identity-provider-okta</p>
         */
        @NameInMap("IdentityProviderArn")
        public String identityProviderArn;

        /**
         * <strong>example:</strong>
         * <p>identity-provider-okta</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <strong>example:</strong>
         * <p>2025-06-09T02:04:23</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListIdentityProvidersResponseBodyIdentityProviders build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyIdentityProviders self = new ListIdentityProvidersResponseBodyIdentityProviders();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setAllowedAudience(java.util.List<String> allowedAudience) {
            this.allowedAudience = allowedAudience;
            return this;
        }
        public java.util.List<String> getAllowedAudience() {
            return this.allowedAudience;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setDiscoveryURL(String discoveryURL) {
            this.discoveryURL = discoveryURL;
            return this;
        }
        public String getDiscoveryURL() {
            return this.discoveryURL;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setIdentityProviderArn(String identityProviderArn) {
            this.identityProviderArn = identityProviderArn;
            return this;
        }
        public String getIdentityProviderArn() {
            return this.identityProviderArn;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
