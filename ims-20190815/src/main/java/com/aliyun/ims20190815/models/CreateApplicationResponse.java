// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Application")
    @Validation(required = true)
    public CreateApplicationResponseApplication application;

    public static CreateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponse self = new CreateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationResponse setApplication(CreateApplicationResponseApplication application) {
        this.application = application;
        return this;
    }
    public CreateApplicationResponseApplication getApplication() {
        return this.application;
    }

    public static class CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope self = new CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateApplicationResponseApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        @Validation(required = true)
        public java.util.List<CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static CreateApplicationResponseApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseApplicationDelegatedScopePredefinedScopes self = new CreateApplicationResponseApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<CreateApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class CreateApplicationResponseApplicationDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        @Validation(required = true)
        public CreateApplicationResponseApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static CreateApplicationResponseApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseApplicationDelegatedScope self = new CreateApplicationResponseApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseApplicationDelegatedScope setPredefinedScopes(CreateApplicationResponseApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public CreateApplicationResponseApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class CreateApplicationResponseApplicationRedirectUris extends TeaModel {
        // RedirectUri
        @NameInMap("RedirectUri")
        @Validation(required = true)
        public java.util.List<String> redirectUri;

        public static CreateApplicationResponseApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseApplicationRedirectUris self = new CreateApplicationResponseApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class CreateApplicationResponseApplication extends TeaModel {
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
        public CreateApplicationResponseApplicationDelegatedScope delegatedScope;

        @NameInMap("RedirectUris")
        @Validation(required = true)
        public CreateApplicationResponseApplicationRedirectUris redirectUris;

        public static CreateApplicationResponseApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseApplication self = new CreateApplicationResponseApplication();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public CreateApplicationResponseApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateApplicationResponseApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateApplicationResponseApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public CreateApplicationResponseApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateApplicationResponseApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public CreateApplicationResponseApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public CreateApplicationResponseApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public CreateApplicationResponseApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public CreateApplicationResponseApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateApplicationResponseApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateApplicationResponseApplication setDelegatedScope(CreateApplicationResponseApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public CreateApplicationResponseApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public CreateApplicationResponseApplication setRedirectUris(CreateApplicationResponseApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public CreateApplicationResponseApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

    }

}
