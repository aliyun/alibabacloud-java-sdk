// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetIdentityProviderResponseBody extends TeaModel {
    @NameInMap("IdentityProvider")
    public GetIdentityProviderResponseBodyIdentityProvider identityProvider;

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
