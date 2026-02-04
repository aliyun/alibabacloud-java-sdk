// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ExecIdentityProviderMetadataUrlResolutionResponseBody extends TeaModel {
    @NameInMap("IdentityProviderMetadata")
    public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata identityProviderMetadata;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecIdentityProviderMetadataUrlResolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecIdentityProviderMetadataUrlResolutionResponseBody self = new ExecIdentityProviderMetadataUrlResolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecIdentityProviderMetadataUrlResolutionResponseBody setIdentityProviderMetadata(ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata identityProviderMetadata) {
        this.identityProviderMetadata = identityProviderMetadata;
        return this;
    }
    public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata getIdentityProviderMetadata() {
        return this.identityProviderMetadata;
    }

    public ExecIdentityProviderMetadataUrlResolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration extends TeaModel {
        /**
         * <p>oAuth2 授权端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://demo.com/oauth2/default/v1/authorize">https://demo.com/oauth2/default/v1/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>OIDC issuer信息。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://demo.com/fe974231-3454-4b70-9326-70fb71e41bce/v2.0/">https://demo.com/fe974231-3454-4b70-9326-70fb71e41bce/v2.0/</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>OIDC jwks地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://demo.com/oauth2/v1/keys">https://demo.com/oauth2/v1/keys</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>oAuth2 Token端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://demo.com/api/bff/v1.2/developer/oidc/token">https://demo.com/api/bff/v1.2/developer/oidc/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>OIDC 用户信息端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://demo.com/api/bff/v1.2/developer/oidc/userinfo">https://demo.com/api/bff/v1.2/developer/oidc/userinfo</a></p>
         */
        @NameInMap("UserinfoEndpoint")
        public String userinfoEndpoint;

        public static ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration self = new ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration();
            return TeaModel.build(map, self);
        }

        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata extends TeaModel {
        /**
         * <p>OIDC IdP的Meta信息。</p>
         */
        @NameInMap("OidcOpenIdConfiguration")
        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration oidcOpenIdConfiguration;

        public static ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata build(java.util.Map<String, ?> map) throws Exception {
            ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata self = new ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata();
            return TeaModel.build(map, self);
        }

        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadata setOidcOpenIdConfiguration(ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration oidcOpenIdConfiguration) {
            this.oidcOpenIdConfiguration = oidcOpenIdConfiguration;
            return this;
        }
        public ExecIdentityProviderMetadataUrlResolutionResponseBodyIdentityProviderMetadataOidcOpenIdConfiguration getOidcOpenIdConfiguration() {
            return this.oidcOpenIdConfiguration;
        }

    }

}
