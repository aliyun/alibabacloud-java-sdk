// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderResponseBody extends TeaModel {
    @NameInMap("IdentityProvider")
    public CreateIdentityProviderResponseBodyIdentityProvider identityProvider;

    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderResponseBody self = new CreateIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderResponseBody setIdentityProvider(CreateIdentityProviderResponseBodyIdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }
    public CreateIdentityProviderResponseBodyIdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    public CreateIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIdentityProviderResponseBodyIdentityProvider extends TeaModel {
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
         * <p>example identity provider</p>
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

        public static CreateIdentityProviderResponseBodyIdentityProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderResponseBodyIdentityProvider self = new CreateIdentityProviderResponseBodyIdentityProvider();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderResponseBodyIdentityProvider setAllowedAudience(java.util.List<String> allowedAudience) {
            this.allowedAudience = allowedAudience;
            return this;
        }
        public java.util.List<String> getAllowedAudience() {
            return this.allowedAudience;
        }

        public CreateIdentityProviderResponseBodyIdentityProvider setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateIdentityProviderResponseBodyIdentityProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateIdentityProviderResponseBodyIdentityProvider setDiscoveryURL(String discoveryURL) {
            this.discoveryURL = discoveryURL;
            return this;
        }
        public String getDiscoveryURL() {
            return this.discoveryURL;
        }

        public CreateIdentityProviderResponseBodyIdentityProvider setIdentityProviderArn(String identityProviderArn) {
            this.identityProviderArn = identityProviderArn;
            return this;
        }
        public String getIdentityProviderArn() {
            return this.identityProviderArn;
        }

        public CreateIdentityProviderResponseBodyIdentityProvider setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public CreateIdentityProviderResponseBodyIdentityProvider setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
