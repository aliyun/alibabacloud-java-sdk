// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetIdentityProviderResponseBody extends TeaModel {
    @NameInMap("IdentityProvider")
    public GetIdentityProviderResponseBodyIdentityProvider identityProvider;

    /**
     * <strong>example:</strong>
     * <p>117E1427-1D4C-59CF-A0A8-D7DCDFE88863</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderResponseBody self = new GetIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderResponseBody setIdentityProvider(GetIdentityProviderResponseBodyIdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }
    public GetIdentityProviderResponseBodyIdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    public GetIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdentityProviderResponseBodyIdentityProvider extends TeaModel {
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
         * <p>example agent</p>
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
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetIdentityProviderResponseBodyIdentityProvider build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProvider self = new GetIdentityProviderResponseBodyIdentityProvider();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProvider setAllowedAudience(java.util.List<String> allowedAudience) {
            this.allowedAudience = allowedAudience;
            return this;
        }
        public java.util.List<String> getAllowedAudience() {
            return this.allowedAudience;
        }

        public GetIdentityProviderResponseBodyIdentityProvider setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetIdentityProviderResponseBodyIdentityProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIdentityProviderResponseBodyIdentityProvider setDiscoveryURL(String discoveryURL) {
            this.discoveryURL = discoveryURL;
            return this;
        }
        public String getDiscoveryURL() {
            return this.discoveryURL;
        }

        public GetIdentityProviderResponseBodyIdentityProvider setIdentityProviderArn(String identityProviderArn) {
            this.identityProviderArn = identityProviderArn;
            return this;
        }
        public String getIdentityProviderArn() {
            return this.identityProviderArn;
        }

        public GetIdentityProviderResponseBodyIdentityProvider setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public GetIdentityProviderResponseBodyIdentityProvider setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
