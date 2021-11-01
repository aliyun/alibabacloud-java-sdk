// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("AccessTokenValidity")
    public Integer accessTokenValidity;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("IsMultiTenant")
    public Boolean isMultiTenant;

    @NameInMap("PredefinedScopes")
    public String predefinedScopes;

    @NameInMap("RedirectUris")
    public String redirectUris;

    @NameInMap("RefreshTokenValidity")
    public Integer refreshTokenValidity;

    @NameInMap("SecretRequired")
    public Boolean secretRequired;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
        return this;
    }
    public Integer getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    public CreateApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateApplicationRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateApplicationRequest setIsMultiTenant(Boolean isMultiTenant) {
        this.isMultiTenant = isMultiTenant;
        return this;
    }
    public Boolean getIsMultiTenant() {
        return this.isMultiTenant;
    }

    public CreateApplicationRequest setPredefinedScopes(String predefinedScopes) {
        this.predefinedScopes = predefinedScopes;
        return this;
    }
    public String getPredefinedScopes() {
        return this.predefinedScopes;
    }

    public CreateApplicationRequest setRedirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }
    public String getRedirectUris() {
        return this.redirectUris;
    }

    public CreateApplicationRequest setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }
    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    public CreateApplicationRequest setSecretRequired(Boolean secretRequired) {
        this.secretRequired = secretRequired;
        return this;
    }
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

}
