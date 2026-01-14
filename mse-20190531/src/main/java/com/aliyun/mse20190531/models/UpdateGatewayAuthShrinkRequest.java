// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>\&quot;\&quot;</p>
     */
    @NameInMap("AuthResourceConfig")
    public String authResourceConfig;

    @NameInMap("AuthResourceList")
    public String authResourceListShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthResourceMode")
    public Integer authResourceMode;

    /**
     * <strong>example:</strong>
     * <p>app_mnvxaavggw7hcdcnr6usi6***</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>CS6EYfx3k9yTRR9EtQ2MXWP97P6UAUwFg4teoWJ19Z****</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("CookieDomain")
    public String cookieDomain;

    @NameInMap("DeleteResourceIdList")
    public String deleteResourceIdListShrink;

    @NameInMap("ExternalAuthZJSON")
    public String externalAuthZJSONShrink;

    /**
     * <strong>example:</strong>
     * <p>gw-9cdcf8e4f58144059e73ff4c5ef9****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <strong>example:</strong>
     * <p>719</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsWhite")
    public Boolean isWhite;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <strong>example:</strong>
     * <p>{&quot;keys&quot;:[{&quot;e&quot;:&quot;AQAB&quot;,&quot;kid&quot;:&quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,&quot;kty&quot;:&quot;RSA&quot;,&quot;n&quot;:&quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;}]}</p>
     */
    @NameInMap("Jwks")
    public String jwks;

    /**
     * <strong>example:</strong>
     * <p><a href="https://daxxxxcn.aliyunidaas.com/">https://daxxxxcn.aliyunidaas.com/</a></p>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p><a href="https://test-.com/oauth2/callback">https://test-.com/oauth2/callback</a></p>
     */
    @NameInMap("RedirectUrl")
    public String redirectUrl;

    @NameInMap("ScopesList")
    public String scopesListShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <strong>example:</strong>
     * <p>example-app</p>
     */
    @NameInMap("Sub")
    public String sub;

    /**
     * <strong>example:</strong>
     * <p>Authorization</p>
     */
    @NameInMap("TokenName")
    public String tokenName;

    /**
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
    @NameInMap("TokenNamePrefix")
    public String tokenNamePrefix;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TokenPass")
    public Boolean tokenPass;

    /**
     * <strong>example:</strong>
     * <p>HEADER</p>
     */
    @NameInMap("TokenPosition")
    public String tokenPosition;

    /**
     * <strong>example:</strong>
     * <p>ExternalAuthZ</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateGatewayAuthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthShrinkRequest self = new UpdateGatewayAuthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthShrinkRequest setAuthResourceConfig(String authResourceConfig) {
        this.authResourceConfig = authResourceConfig;
        return this;
    }
    public String getAuthResourceConfig() {
        return this.authResourceConfig;
    }

    public UpdateGatewayAuthShrinkRequest setAuthResourceListShrink(String authResourceListShrink) {
        this.authResourceListShrink = authResourceListShrink;
        return this;
    }
    public String getAuthResourceListShrink() {
        return this.authResourceListShrink;
    }

    public UpdateGatewayAuthShrinkRequest setAuthResourceMode(Integer authResourceMode) {
        this.authResourceMode = authResourceMode;
        return this;
    }
    public Integer getAuthResourceMode() {
        return this.authResourceMode;
    }

    public UpdateGatewayAuthShrinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UpdateGatewayAuthShrinkRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public UpdateGatewayAuthShrinkRequest setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
        return this;
    }
    public String getCookieDomain() {
        return this.cookieDomain;
    }

    public UpdateGatewayAuthShrinkRequest setDeleteResourceIdListShrink(String deleteResourceIdListShrink) {
        this.deleteResourceIdListShrink = deleteResourceIdListShrink;
        return this;
    }
    public String getDeleteResourceIdListShrink() {
        return this.deleteResourceIdListShrink;
    }

    public UpdateGatewayAuthShrinkRequest setExternalAuthZJSONShrink(String externalAuthZJSONShrink) {
        this.externalAuthZJSONShrink = externalAuthZJSONShrink;
        return this;
    }
    public String getExternalAuthZJSONShrink() {
        return this.externalAuthZJSONShrink;
    }

    public UpdateGatewayAuthShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayAuthShrinkRequest setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
        return this;
    }
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    public UpdateGatewayAuthShrinkRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public UpdateGatewayAuthShrinkRequest setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public UpdateGatewayAuthShrinkRequest setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public UpdateGatewayAuthShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayAuthShrinkRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public UpdateGatewayAuthShrinkRequest setScopesListShrink(String scopesListShrink) {
        this.scopesListShrink = scopesListShrink;
        return this;
    }
    public String getScopesListShrink() {
        return this.scopesListShrink;
    }

    public UpdateGatewayAuthShrinkRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public UpdateGatewayAuthShrinkRequest setSub(String sub) {
        this.sub = sub;
        return this;
    }
    public String getSub() {
        return this.sub;
    }

    public UpdateGatewayAuthShrinkRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public UpdateGatewayAuthShrinkRequest setTokenNamePrefix(String tokenNamePrefix) {
        this.tokenNamePrefix = tokenNamePrefix;
        return this;
    }
    public String getTokenNamePrefix() {
        return this.tokenNamePrefix;
    }

    public UpdateGatewayAuthShrinkRequest setTokenPass(Boolean tokenPass) {
        this.tokenPass = tokenPass;
        return this;
    }
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    public UpdateGatewayAuthShrinkRequest setTokenPosition(String tokenPosition) {
        this.tokenPosition = tokenPosition;
        return this;
    }
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    public UpdateGatewayAuthShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
