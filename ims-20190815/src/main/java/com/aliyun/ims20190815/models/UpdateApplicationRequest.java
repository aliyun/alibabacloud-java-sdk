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
     * <p>The new display name.</p>
     * 
     * <strong>example:</strong>
     * <p>NewApp</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>Indicates whether the application can be installed by other Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li><p>true: The application can be installed.</p>
     * </li>
     * <li><p>false: The application cannot be installed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewIsMultiTenant")
    public Boolean newIsMultiTenant;

    /**
     * <p>The permission scopes of the application.</p>
     * <p>For more information about the valid values and descriptions of permission scopes, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to obtain the permission scopes that are supported by different types of applications.</p>
     * <p>If you enter multiple permission scopes, separate them with semicolons (;).</p>
     * <p>The new permission scopes overwrite the original ones. For example, if the original permission scope is <code>/acs/ccc</code> and you set the new permission scope to <code>/acs/alidns</code>, the permission scope that takes effect is <code>/acs/alidns</code>. If you want to add <code>/acs/alidns</code> to the original scope, set the new permission scope to <code>/acs/ccc;/acs/alidns</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>openid</p>
     */
    @NameInMap("NewPredefinedScopes")
    public String newPredefinedScopes;

    /**
     * <p>The webhook address.</p>
     * <p>If you enter multiple webhook addresses, separate them with semicolons (;).</p>
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
     * <p>The required permission scopes of the application.</p>
     * <p>You can set one or more scopes specified in <code>RequiredScopes</code> as required. After a scope is set as required, it is selected by default and cannot be deselected when a user grants permissions to the application.</p>
     * <p>If you also specify <code>NewPredefinedScopes</code>, the list of application scopes is reset by <code>NewPredefinedScopes</code> first. Then, this parameter is used to configure whether the scopes are required.</p>
     * <p>If you enter multiple permission scopes, separate them with semicolons (;).</p>
     * <p>The new required scopes overwrite the original ones.</p>
     * <blockquote>
     * <p>If a scope that you specify for <code>RequiredScopes</code> is not within the range of <code>PredefinedScopes</code>, the required setting for that scope does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>profile;aliuid</p>
     */
    @NameInMap("NewRequiredScopes")
    public String newRequiredScopes;

    /**
     * <p>Indicates whether an application key is required. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For applications of the WebApp and ServerApp types, this parameter is forcibly set to true and cannot be modified.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For applications of the NativeApp type, you can set this parameter to true or false. The default value is false. These applications often run in untrusted environments and cannot effectively protect application keys. Do not set this parameter to true unless necessary. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Log on to Alibaba Cloud using a native application</a>.</li>
     * </ul>
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
