// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>472457090344041****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The validity period of the access token.</p>
     * <p>Valid values: 900 to 10800. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("NewAccessTokenValidity")
    public Integer newAccessTokenValidity;

    /**
     * <p>The application assignment type. Valid values:</p>
     * <ul>
     * <li>AllowAll: Full assignment. All RAM users and roles under the account are allowed to use the application.</li>
     * <li>OnDemand: On-demand assignment. Only specified RAM users and roles under the account are allowed to use the application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AlloAll</p>
     */
    @NameInMap("NewAssignmentType")
    public String newAssignmentType;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>NewApp</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>Specifies whether the application can be installed by other accounts. Valid values:</p>
     * <ul>
     * <li><p>true: Allowed.</p>
     * </li>
     * <li><p>false: Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewIsMultiTenant")
    public Boolean newIsMultiTenant;

    /**
     * <p>Specifies whether user authorization is required. Valid values:</p>
     * <ul>
     * <li>true: In addition to the authorization required during application installation, the user must also authorize the application <strong>each time</strong> they use it for OAuth logon.</li>
     * <li>false: Authorization is required only during application installation. No additional authorization is required when the user uses the application for OAuth logon later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewNeedPrincipalConsent")
    public Boolean newNeedPrincipalConsent;

    /**
     * <p>The application permission scopes.</p>
     * <p>For the valid values and descriptions of application permission scopes, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the application permission scopes supported by different application types.</p>
     * <p>Separate multiple scopes with semicolons (;).</p>
     * <p>The new scopes overwrite the original scopes. For example, if the original scope is /acs/ccc and the new scope is /acs/alidns, the effective scope is /acs/alidns. To add /acs/alidns to the original scopes, set the new scopes to /acs/ccc;/acs/alidns.</p>
     * 
     * <strong>example:</strong>
     * <p>openid</p>
     */
    @NameInMap("NewPredefinedScopes")
    public String newPredefinedScopes;

    /**
     * <p>The callback URLs. Separate multiple URLs with semicolons (;).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("NewRedirectUris")
    public String newRedirectUris;

    /**
     * <p>The validity period of the refresh token.</p>
     * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>7776000</p>
     */
    @NameInMap("NewRefreshTokenValidity")
    public Integer newRefreshTokenValidity;

    /**
     * <p>The required application permission scopes.</p>
     * <p>You can set one or more scopes in RequiredScopes as required. After a scope is set as required, it is selected by default and cannot be deselected when a user authorizes the application.</p>
     * <p>If you also specify NewPredefinedScopes, the scope list of the application is reset by using NewPredefinedScopes first, and then this parameter is used to specify whether the scopes are required.</p>
     * <p>Separate multiple scopes with semicolons (;).</p>
     * <p>The new required scopes overwrite the original required scopes.</p>
     * <blockquote>
     * <p>If a scope specified in RequiredScopes is not included in PredefinedScopes, the required setting for this scope does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>profile;aliuid</p>
     */
    @NameInMap("NewRequiredScopes")
    public String newRequiredScopes;

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
     * <li>For NativeApp applications, you can set this value to true or false. If you do not specify this parameter, the default value is false. Because such applications usually run in untrusted environments and cannot effectively protect application secrets, do not set this value to true unless necessary. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Log on to Alibaba Cloud from a native application</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewSecretRequired")
    public Boolean newSecretRequired;

    public static UpdateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRequest self = new UpdateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationRequest setNewAccessTokenValidity(Integer newAccessTokenValidity) {
        this.newAccessTokenValidity = newAccessTokenValidity;
        return this;
    }
    public Integer getNewAccessTokenValidity() {
        return this.newAccessTokenValidity;
    }

    public UpdateApplicationRequest setNewAssignmentType(String newAssignmentType) {
        this.newAssignmentType = newAssignmentType;
        return this;
    }
    public String getNewAssignmentType() {
        return this.newAssignmentType;
    }

    public UpdateApplicationRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateApplicationRequest setNewIsMultiTenant(Boolean newIsMultiTenant) {
        this.newIsMultiTenant = newIsMultiTenant;
        return this;
    }
    public Boolean getNewIsMultiTenant() {
        return this.newIsMultiTenant;
    }

    public UpdateApplicationRequest setNewNeedPrincipalConsent(Boolean newNeedPrincipalConsent) {
        this.newNeedPrincipalConsent = newNeedPrincipalConsent;
        return this;
    }
    public Boolean getNewNeedPrincipalConsent() {
        return this.newNeedPrincipalConsent;
    }

    public UpdateApplicationRequest setNewPredefinedScopes(String newPredefinedScopes) {
        this.newPredefinedScopes = newPredefinedScopes;
        return this;
    }
    public String getNewPredefinedScopes() {
        return this.newPredefinedScopes;
    }

    public UpdateApplicationRequest setNewRedirectUris(String newRedirectUris) {
        this.newRedirectUris = newRedirectUris;
        return this;
    }
    public String getNewRedirectUris() {
        return this.newRedirectUris;
    }

    public UpdateApplicationRequest setNewRefreshTokenValidity(Integer newRefreshTokenValidity) {
        this.newRefreshTokenValidity = newRefreshTokenValidity;
        return this;
    }
    public Integer getNewRefreshTokenValidity() {
        return this.newRefreshTokenValidity;
    }

    public UpdateApplicationRequest setNewRequiredScopes(String newRequiredScopes) {
        this.newRequiredScopes = newRequiredScopes;
        return this;
    }
    public String getNewRequiredScopes() {
        return this.newRequiredScopes;
    }

    public UpdateApplicationRequest setNewSecretRequired(Boolean newSecretRequired) {
        this.newSecretRequired = newSecretRequired;
        return this;
    }
    public Boolean getNewSecretRequired() {
        return this.newSecretRequired;
    }

}
