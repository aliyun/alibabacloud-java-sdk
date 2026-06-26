// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderResponseBody extends TeaModel {
    @NameInMap("IdentityProvider")
    public CreateIdentityProviderResponseBodyIdentityProvider identityProvider;

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

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiscoveryURL")
        public String discoveryURL;

        @NameInMap("IdentityProviderArn")
        public String identityProviderArn;

        @NameInMap("IdentityProviderName")
        public String identityProviderName;

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
