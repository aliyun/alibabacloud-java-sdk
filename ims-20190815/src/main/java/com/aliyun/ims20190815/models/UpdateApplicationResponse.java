// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Application")
    @Validation(required = true)
    public UpdateApplicationResponseApplication application;

    public static UpdateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationResponse self = new UpdateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApplicationResponse setApplication(UpdateApplicationResponseApplication application) {
        this.application = application;
        return this;
    }
    public UpdateApplicationResponseApplication getApplication() {
        return this.application;
    }

    public static class UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope self = new UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        @Validation(required = true)
        public java.util.List<UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes self = new UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<UpdateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class UpdateApplicationResponseApplicationDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        @Validation(required = true)
        public UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static UpdateApplicationResponseApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseApplicationDelegatedScope self = new UpdateApplicationResponseApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseApplicationDelegatedScope setPredefinedScopes(UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public UpdateApplicationResponseApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class UpdateApplicationResponseApplicationRedirectUris extends TeaModel {
        // RedirectUri
        @NameInMap("RedirectUri")
        @Validation(required = true)
        public java.util.List<String> redirectUri;

        public static UpdateApplicationResponseApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseApplicationRedirectUris self = new UpdateApplicationResponseApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class UpdateApplicationResponseApplication extends TeaModel {
        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("SecretRequired")
        @Validation(required = true)
        public Boolean secretRequired;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("IsMultiTenant")
        @Validation(required = true)
        public Boolean isMultiTenant;

        @NameInMap("AccessTokenValidity")
        @Validation(required = true)
        public Integer accessTokenValidity;

        @NameInMap("RefreshTokenValidity")
        @Validation(required = true)
        public Integer refreshTokenValidity;

        @NameInMap("AppType")
        @Validation(required = true)
        public String appType;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("DelegatedScope")
        @Validation(required = true)
        public UpdateApplicationResponseApplicationDelegatedScope delegatedScope;

        @NameInMap("RedirectUris")
        @Validation(required = true)
        public UpdateApplicationResponseApplicationRedirectUris redirectUris;

        public static UpdateApplicationResponseApplication build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseApplication self = new UpdateApplicationResponseApplication();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateApplicationResponseApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateApplicationResponseApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateApplicationResponseApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public UpdateApplicationResponseApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateApplicationResponseApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public UpdateApplicationResponseApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public UpdateApplicationResponseApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public UpdateApplicationResponseApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public UpdateApplicationResponseApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateApplicationResponseApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateApplicationResponseApplication setDelegatedScope(UpdateApplicationResponseApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public UpdateApplicationResponseApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public UpdateApplicationResponseApplication setRedirectUris(UpdateApplicationResponseApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public UpdateApplicationResponseApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

    }

}
