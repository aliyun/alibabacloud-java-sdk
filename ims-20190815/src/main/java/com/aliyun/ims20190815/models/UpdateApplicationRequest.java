// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
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
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>NewApp</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>Specifies whether the application can be installed by using other Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewIsMultiTenant")
    public Boolean newIsMultiTenant;

    /**
     * <p>The permission that is granted on the application.</p>
     * <p>For more information about the application permission scope, see <a href="https://help.aliyun.com/document_detail/93693.html">OAuth scopes</a>. You can also call the <a href="https://help.aliyun.com/document_detail/187206.html">ListPredefinedScopes</a> operation to query the permissions that are supported by different types of applications.</p>
     * <p>If you enter multiple permissions, separate them with semicolons (;).</p>
     * <p>The new value of this parameter overwrites the original value, and the permission specified by the new value takes effect. For example, if the original value is <code>/acs/ccc</code>, and the new value is <code>/acs/alidns</code>, <code>/acs/alidns</code> takes effect. If you want to retain the original permission and the <code>/acs/alidns</code> permission, set the value to <code>/acs/ccc;/acs/alidns</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>openid</p>
     */
    @NameInMap("NewPredefinedScopes")
    public String newPredefinedScopes;

    /**
     * <p>The callback URL.</p>
     * <p>If you enter multiple callback URLs, separate them with semicolons (;).</p>
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
     * <p>The required permission.</p>
     * <p>You can specify one or more permissions for the <code>RequiredScopes</code> parameter. After you specify this parameter, the required permissions are automatically selected and cannot be revoked when a user grants permissions on the application.</p>
     * <p>If you also specify the <code>NewPredefinedScopes</code> parameter, the <code>NewPredefinedScopes</code> parameter specifies the permissions that can be granted on the application, and this parameter specifies the required permissions.</p>
     * <p>If you enter multiple permissions, separate them with semicolons (;).</p>
     * <p>The new value of this parameter overwrites the original value, and the required permission specified by the new value takes effect.</p>
     * <blockquote>
     * <p> If the permission that you specify for the <code>RequiredScopes</code> parameter is not included in value of the <code>PredefinedScopes</code> parameter, the permission does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>profile;aliuid</p>
     */
    @NameInMap("NewRequiredScopes")
    public String newRequiredScopes;

    /**
     * <p>Specifies whether a secret is required. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.</li>
     * <li>For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see <a href="https://help.aliyun.com/document_detail/93697.html">Use an application of the NativeApp type to log on to Alibaba Cloud</a>.</li>
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
