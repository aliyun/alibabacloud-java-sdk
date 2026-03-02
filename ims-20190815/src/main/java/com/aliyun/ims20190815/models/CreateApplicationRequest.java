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
     * <p>The name can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The type of the application. Valid values:</p>
     * <ul>
     * <li><p>WebApp: a web application that is based on browser interaction.</p>
     * </li>
     * <li><p>NativeApp: a native application that runs on an operating system, such as a desktop or mobile operating system.</p>
     * </li>
     * <li><p>ServerApp: an application that directly accesses Alibaba Cloud services without user logon. Currently, only applications that use the System for Cross-domain Identity Management (SCIM) protocol for user synchronization are supported.</p>
     * </li>
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
     * <p>Specifies whether the application can be installed by other Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li><p>true: For NativeApp and ServerApp applications, the default value is \<code>true\\</code> if you leave this parameter empty.</p>
     * </li>
     * <li><p>false: For WebApp applications, the default value is \<code>false\\</code> if you leave this parameter empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsMultiTenant")
    public Boolean isMultiTenant;

    /**
     * <p>The scopes of the application.</p>
     * <p>For information about the valid values and descriptions of scopes, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the scopes that are supported by different application types.</p>
     * <p>To enter multiple scopes, separate them with semicolons (;).</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid;profile</p>
     */
    @NameInMap("PredefinedScopes")
    public String predefinedScopes;

    /**
     * <p>The OAuth protocol version of the application. Valid values:</p>
     * <ul>
     * <li><p><code>2.0</code>: OAuth 2.0.</p>
     * </li>
     * <li><p><code>2.1</code>: OAuth 2.1.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ProtocolVersion")
    public String protocolVersion;

    /**
     * <p>The webhook address.</p>
     * <p>To enter multiple webhook addresses, separate them with semicolons (;).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("RedirectUris")
    public String redirectUris;

    /**
     * <p>The validity period of the refresh token.</p>
     * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>For NativeApp and ServerApp applications, the default value is 2,592,000 seconds (30 days) if you leave this parameter empty.</p>
     * </li>
     * <li><p>For WebApp applications, the default value is 7,776,000 seconds (90 days) if you leave this parameter empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2592000</p>
     */
    @NameInMap("RefreshTokenValidity")
    public Integer refreshTokenValidity;

    /**
     * <p>The required scopes.</p>
     * <p>You can specify one or more scopes in <code>RequiredScopes</code> as required. When a user grants permissions to the application, the required scopes are selected by default and cannot be deselected.</p>
     * <p>To enter multiple scopes, separate them with semicolons (;).</p>
     * <blockquote>
     * <p>If a scope that you specify in <code>RequiredScopes</code> is not within the range of <code>PredefinedScopes</code>, the required setting for that scope does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliuid</p>
     */
    @NameInMap("RequiredScopes")
    public String requiredScopes;

    /**
     * <p>Specifies whether an application key is required. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For WebApp and ServerApp applications, this parameter is forcibly set to \<code>true\\</code> and cannot be changed.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For NativeApp applications, you can set this parameter to \<code>true\\</code> or \<code>false\\</code>. If you do not set this parameter, the default value is \<code>false\\</code>. Because these applications often run in untrusted environments where application keys cannot be effectively protected, do not set this parameter to \<code>true\\</code> unless necessary. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Log on to Alibaba Cloud from a native application</a>.</li>
     * </ul>
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

    public CreateApplicationRequest setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }
    public String getProtocolVersion() {
        return this.protocolVersion;
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
