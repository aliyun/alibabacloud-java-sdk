// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The validity period of the access token.</p>
     * <p>Valid values: 900 to 10800. Unit: seconds.</p>
     * <p>Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AccessTokenValidity")
    public Integer accessTokenValidity;

    /**
     * <p>The application name.</p>
     * <p>The name can be up to 64 characters in length. The name can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The type of the application. Valid values:</p>
     * <ul>
     * <li>WebApp: a web application that interacts with a browser.</li>
     * <li>NativeApp: a native application that runs on an operating system, such as a desktop operating system or a mobile operating system.</li>
     * <li>ServerApp: an application that accesses Alibaba Cloud services without the need of manual user logon. User provisioning is automated based on the System for Cross-Domain Identity Management (SCIM) protocol.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WebApp</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The display name of the application.</p>
     * <p>The name can be up to 24 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Indicates whether the application can be installed by using other Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li>true: If you do not set this parameter for applications of the NativeApp and ServerApp types, true is used.</li>
     * <li>false: If you do not set this parameter for applications of the WebApp type, false is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsMultiTenant")
    public Boolean isMultiTenant;

    /**
     * <p>The scope of application permissions.</p>
     * <p>For more information about the application permission scope, see <a href="https://help.aliyun.com/document_detail/93693.html">Open authorization scope</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to query the permissions that are supported by different types of applications.</p>
     * <p>If you enter multiple permission scopes, separate them with semicolons (;).</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid</p>
     */
    @NameInMap("PredefinedScopes")
    public String predefinedScopes;

    /**
     * <p>The callback URL.</p>
     * <p>If you enter multiple callback URLs, separate them with semicolons (;).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("RedirectUris")
    public String redirectUris;

    /**
     * <p>The validity period of the refreshed token.</p>
     * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>For applications of the WebApp and ServerApp types, if this parameter is left empty, the value 2592000 is used. The value 2592000 indicates that the validity period of the refreshed token is 30 days.</li>
     * <li>For applications of the NativeApp type, if this parameter is left empty, the value 7776000 is used. The value 7776000 indicates that the validity period of the refreshed token is 90 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2592000</p>
     */
    @NameInMap("RefreshTokenValidity")
    public Integer refreshTokenValidity;

    /**
     * <p>The required permission.</p>
     * <p>You can specify one or more permissions for the <code>RequiredScopes</code> parameter. After you specify this parameter, the required permissions are automatically selected and cannot be revoked when a user grants permissions on the application.</p>
     * <p>If you enter multiple permission scopes, separate them with semicolons (;).</p>
     * <blockquote>
     * <p> If the permission that you specify for the <code>RequiredScopes</code> parameter is not included in the value of the <code>PredefinedScopes</code> parameter, the permission does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliuid;profile</p>
     */
    @NameInMap("RequiredScopes")
    public String requiredScopes;

    /**
     * <p>Indicates whether a secret is required. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.</li>
     * <li>For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Use an application of the NativeApp type to log on to Alibaba Cloud</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public CreateApplicationRequest setRequiredScopes(String requiredScopes) {
        this.requiredScopes = requiredScopes;
        return this;
    }
    public String getRequiredScopes() {
        return this.requiredScopes;
    }

    public CreateApplicationRequest setSecretRequired(Boolean secretRequired) {
        this.secretRequired = secretRequired;
        return this;
    }
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

}
