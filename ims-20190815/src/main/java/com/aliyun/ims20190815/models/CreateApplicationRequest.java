// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The validity period of the access token.</p>
     * <br>
     * <p>Valid values: 900 to 10800. Unit: seconds.</p>
     * <br>
     * <p>Default value: 3600.</p>
     */
    @NameInMap("AccessTokenValidity")
    public Integer accessTokenValidity;

    /**
     * <p>The name of the application.</p>
     * <br>
     * <p>The name can be up to 64 characters in length. The name can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The type of the application. Valid values:</p>
     * <br>
     * <p>*   WebApp: a web application that interacts with a browser.</p>
     * <p>*   NativeApp: a native application that runs on an operating system, such as a desktop operating system or a mobile operating system.</p>
     * <p>*   ServerApp: an application that accesses Alibaba Cloud services without the need of manual user logon. User provisioning is automated based on the System for Cross-Domain Identity Management (SCIM) protocol.</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The display name of the application.</p>
     * <br>
     * <p>The name can be up to 24 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Indicates whether the application can be installed by using other Alibaba Cloud accounts. Valid values:</p>
     * <br>
     * <p>*   true: If you do not set this parameter for applications of the NativeApp and ServerApp types, true is used.</p>
     * <p>*   false: If you do not set this parameter for applications of the WebApp type, false is used.</p>
     */
    @NameInMap("IsMultiTenant")
    public Boolean isMultiTenant;

    /**
     * <p>The scope of application permissions.</p>
     * <br>
     * <p>For more information about the application permission scope, see [Open authorization scope](~~93693~~). You can also call the [ListPredefinedScopes](~~187206~~) operation to obtain the permission scopes supported by different types of applications.</p>
     * <br>
     * <p>If you enter multiple permission scopes, separate them with semicolons (;).</p>
     */
    @NameInMap("PredefinedScopes")
    public String predefinedScopes;

    /**
     * <p>The callback URL.</p>
     * <br>
     * <p>If you enter multiple callback URLs, separate them with semicolons (;).</p>
     */
    @NameInMap("RedirectUris")
    public String redirectUris;

    /**
     * <p>The validity period of the refreshed token.</p>
     * <br>
     * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   For applications of the WebApp and ServerApp types, if this parameter is left empty, the value 2592000 is used. The value 2592000 indicates that the validity period of the refreshed token is 30 days.</p>
     * <p>*   For applications of the NativeApp type, if this parameter is left empty, the value 7776000 is used. The value 7776000 indicates that the validity period of the refreshed token is 90 days.</p>
     */
    @NameInMap("RefreshTokenValidity")
    public Integer refreshTokenValidity;

    /**
     * <p>Indicates whether a secret is required. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.</p>
     * <p>*   For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see [Use an application of the NativeApp type to log on to Alibaba Cloud](~~93697~~).</p>
     */
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
