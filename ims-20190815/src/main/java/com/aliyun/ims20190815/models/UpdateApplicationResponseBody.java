// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Application")
    public UpdateApplicationResponseBodyApplication application;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6616F09B-2768-4C11-8866-A8EE4C4A583E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationResponseBody self = new UpdateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationResponseBody setApplication(UpdateApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public UpdateApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public UpdateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        /**
         * <p>The description of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>Obtain the OpenID of the user. This is the default permission that you cannot remove.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the permission is automatically selected by default when you install the application. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p><code>openid</code> is required by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Required")
        public Boolean required;

        public static UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope self = new UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes self = new UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class UpdateApplicationResponseBodyApplicationDelegatedScope extends TeaModel {
        /**
         * <p>The information about the permissions that are granted on the application.</p>
         */
        @NameInMap("PredefinedScopes")
        public UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static UpdateApplicationResponseBodyApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseBodyApplicationDelegatedScope self = new UpdateApplicationResponseBodyApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseBodyApplicationDelegatedScope setPredefinedScopes(UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public UpdateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class UpdateApplicationResponseBodyApplicationRedirectUris extends TeaModel {
        @NameInMap("RedirectUri")
        public java.util.List<String> redirectUri;

        public static UpdateApplicationResponseBodyApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseBodyApplicationRedirectUris self = new UpdateApplicationResponseBodyApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseBodyApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class UpdateApplicationResponseBodyApplication extends TeaModel {
        /**
         * <p>The validity period of the access token. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("AccessTokenValidity")
        public Integer accessTokenValidity;

        /**
         * <p>The ID of the Alibaba Cloud account to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>177242285274****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>472457090344041****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>WebApp</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-23T08:06:57Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The information about the permissions that are granted on the application.</p>
         */
        @NameInMap("DelegatedScope")
        public UpdateApplicationResponseBodyApplicationDelegatedScope delegatedScope;

        /**
         * <p>The display name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>NewApp</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Indicates whether the application can be installed by using other Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMultiTenant")
        public Boolean isMultiTenant;

        /**
         * <p>The callback URLs.</p>
         */
        @NameInMap("RedirectUris")
        public UpdateApplicationResponseBodyApplicationRedirectUris redirectUris;

        /**
         * <p>The validity period of the refresh token. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>7776000</p>
         */
        @NameInMap("RefreshTokenValidity")
        public Integer refreshTokenValidity;

        /**
         * <p>Indicates whether a secret is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-23T08:06:57Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdateApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseBodyApplication self = new UpdateApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseBodyApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public UpdateApplicationResponseBodyApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateApplicationResponseBodyApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateApplicationResponseBodyApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateApplicationResponseBodyApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public UpdateApplicationResponseBodyApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateApplicationResponseBodyApplication setDelegatedScope(UpdateApplicationResponseBodyApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public UpdateApplicationResponseBodyApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public UpdateApplicationResponseBodyApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateApplicationResponseBodyApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public UpdateApplicationResponseBodyApplication setRedirectUris(UpdateApplicationResponseBodyApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public UpdateApplicationResponseBodyApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

        public UpdateApplicationResponseBodyApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public UpdateApplicationResponseBodyApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public UpdateApplicationResponseBodyApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
