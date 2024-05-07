// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The validity period of the access token.</p>
     * <br>
     * <p>Valid values: 900 to 10800. Unit: seconds.</p>
     */
    @NameInMap("NewAccessTokenValidity")
    public Integer newAccessTokenValidity;

    /**
     * <p>The display name.</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>Specifies whether the application can be installed by using other Alibaba Cloud accounts. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("NewIsMultiTenant")
    public Boolean newIsMultiTenant;

    /**
     * <p>The permission that is granted on the application.</p>
     * <br>
     * <p>For more information about the application permission scope, see [OAuth scopes](~~93693~~). You can also call the [ListPredefinedScopes](~~187206~~) operation to query the permissions that are supported by different types of applications.</p>
     * <br>
     * <p>If you enter multiple permissions, separate them with semicolons (;).</p>
     * <br>
     * <p>The new value of this parameter overwrites the original value, and the permission specified by the new value takes effect. For example, if the original value is `/acs/ccc`, and the new value is `/acs/alidns`, `/acs/alidns` takes effect. If you want to retain the original permission and the `/acs/alidns` permission, set the value to `/acs/ccc;/acs/alidns`.</p>
     */
    @NameInMap("NewPredefinedScopes")
    public String newPredefinedScopes;

    /**
     * <p>The callback URL.</p>
     * <br>
     * <p>If you enter multiple callback URLs, separate them with semicolons (;).</p>
     */
    @NameInMap("NewRedirectUris")
    public String newRedirectUris;

    /**
     * <p>The validity period of the refresh token.</p>
     * <br>
     * <p>Valid values: 7200 to 31536000. Unit: seconds.</p>
     */
    @NameInMap("NewRefreshTokenValidity")
    public Integer newRefreshTokenValidity;

    /**
     * <p>The required permission.</p>
     * <br>
     * <p>You can specify one or more permissions for the `RequiredScopes` parameter. After you specify this parameter, the required permissions are automatically selected and cannot be revoked when a user grants permissions on the application.</p>
     * <br>
     * <p>If you also specify the `NewPredefinedScopes` parameter, the `NewPredefinedScopes` parameter specifies the permissions that can be granted on the application, and this parameter specifies the required permissions.</p>
     * <br>
     * <p>If you enter multiple permissions, separate them with semicolons (;).</p>
     * <br>
     * <p>The new value of this parameter overwrites the original value, and the required permission specified by the new value takes effect.</p>
     * <br>
     * <p>>  If the permission that you specify for the `RequiredScopes` parameter is not included in value of the `PredefinedScopes` parameter, the permission does not take effect.</p>
     */
    @NameInMap("NewRequiredScopes")
    public String newRequiredScopes;

    /**
     * <p>Specifies whether a secret is required. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   For applications of the WebApp and ServerApp types, this parameter is automatically set to true and cannot be changed.</p>
     * <p>*   For applications of the NativeApp type, this parameter can be set to true or false. If you do not set this parameter, false is used. Applications of the NativeApp type run in untrusted environments and the secrets of these applications are not protected. Therefore, we recommend that you do not set this parameter to true unless otherwise specified. For more information, see [Use an application of the NativeApp type to log on to Alibaba Cloud](~~93697~~).</p>
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
