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
     * <p>The maximum length is 64 characters. Only letters, digits, periods (.), underscores (_), and hyphens (-) are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application type. Valid values:</p>
     * <ul>
     * <li>WebApp: web applications that interact with users through browsers. </li>
     * <li>NativeApp: native applications that run in operating systems, primarily on desktop or shift operating systems. </li>
     * <li>ServerApp: applications that directly access Alibaba Cloud services without requiring user logons. Currently, only user synchronization applications based on the System for Cross-domain Identity Management protocol are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WebApp</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The application assignment type. Valid values:</p>
     * <ul>
     * <li>AllowAll: assigns the application to all RAM users and roles in the account, allowing them to use the application.</li>
     * <li>OnDemand: assigns the application only to specified RAM users and roles in the account, allowing only them to use the application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AllowAll</p>
     */
    @NameInMap("AssignmentType")
    public String assignmentType;

    /**
     * <p>The display name of the application.</p>
     * <p>Maximum length: 24 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Specifies whether the application can be installed by other accounts. Valid values:</p>
     * <ul>
     * <li>true: For NativeApp and ServerApp applications, if this value is empty, the default value is true.</li>
     * <li>false: For WebApp applications, if this value is empty, the default value is false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsMultiTenant")
    public Boolean isMultiTenant;

    /**
     * <p>Specifies whether user authorization is required. Valid values:</p>
     * <ul>
     * <li>true: In addition to the authorization required during application installation, users must also authorize the application <strong>each time</strong> they use it for OAuth logon.</li>
     * <li>false: Authorization is required only during application installation. Users do not need additional authorization when they use the application for OAuth logon later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedPrincipalConsent")
    public Boolean needPrincipalConsent;

    /**
     * <p>The scopes of the application.</p>
     * <p>For the valid values and descriptions of application scopes, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the scopes supported by different application types.</p>
     * <p>Separate multiple scopes with semicolons (;).</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid;profile</p>
     */
    @NameInMap("PredefinedScopes")
    public String predefinedScopes;

    /**
     * <p>The OAuth protocol version of the application. Valid values:</p>
     * <ul>
     * <li>2.0: OAuth 2.0 protocol.</li>
     * <li>2.1: OAuth 2.1 protocol.</li>
     * </ul>
     * <p>Default value: 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ProtocolVersion")
    public String protocolVersion;

    /**
     * <p>The redirect URIs.</p>
     * <p>Separate multiple URIs with semicolons (;).</p>
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
     * <li>For NativeApp and ServerApp applications, if this value is empty, the default value is 2592000 seconds (30 days).</li>
     * <li>For WebApp applications, if this value is empty, the default value is 7776000 seconds (90 days).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2592000</p>
     */
    @NameInMap("RefreshTokenValidity")
    public Integer refreshTokenValidity;

    /**
     * <p>The required scopes of the application.</p>
     * <p>You can set one or more scopes in RequiredScopes as required. After a scope is set as required, it is selected by default and cannot be deselected when a user authorizes the application.</p>
     * <p>Separate multiple scopes with semicolons (;).</p>
     * <blockquote>
     * <p>If a scope that you specify in RequiredScopes is not included in PredefinedScopes, the required scope does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliuid</p>
     */
    @NameInMap("RequiredScopes")
    public String requiredScopes;

    /**
     * <p>Specifies whether an application secret is required. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>For WebApp and ServerApp applications, this value is forcibly set to true and cannot be modified.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>For NativeApp applications, you can set this value to true or false. If you do not specify this value, the default value is false. Because such applications often run in untrusted environments and cannot effectively protect application secrets, do not set this value to true unless necessary. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Log on to Alibaba Cloud from a native application</a>.</li>
     * </ul>
     * </li>
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

    public CreateApplicationRequest setAssignmentType(String assignmentType) {
        this.assignmentType = assignmentType;
        return this;
    }
    public String getAssignmentType() {
        return this.assignmentType;
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

    public CreateApplicationRequest setNeedPrincipalConsent(Boolean needPrincipalConsent) {
        this.needPrincipalConsent = needPrincipalConsent;
        return this;
    }
    public Boolean getNeedPrincipalConsent() {
        return this.needPrincipalConsent;
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
