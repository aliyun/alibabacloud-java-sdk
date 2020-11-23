// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Application")
    @Validation(required = true)
    public GetApplicationResponseApplication application;

    public static GetApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponse self = new GetApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationResponse setApplication(GetApplicationResponseApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseApplication getApplication() {
        return this.application;
    }

    public static class GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope self = new GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetApplicationResponseApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        @Validation(required = true)
        public java.util.List<GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static GetApplicationResponseApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseApplicationDelegatedScopePredefinedScopes self = new GetApplicationResponseApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<GetApplicationResponseApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class GetApplicationResponseApplicationDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        @Validation(required = true)
        public GetApplicationResponseApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static GetApplicationResponseApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseApplicationDelegatedScope self = new GetApplicationResponseApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseApplicationDelegatedScope setPredefinedScopes(GetApplicationResponseApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public GetApplicationResponseApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class GetApplicationResponseApplicationRedirectUris extends TeaModel {
        // RedirectUri
        @NameInMap("RedirectUri")
        @Validation(required = true)
        public java.util.List<String> redirectUri;

        public static GetApplicationResponseApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseApplicationRedirectUris self = new GetApplicationResponseApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class GetApplicationResponseApplication extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("AppType")
        @Validation(required = true)
        public String appType;

        @NameInMap("SecretRequired")
        @Validation(required = true)
        public Boolean secretRequired;

        @NameInMap("AccessTokenValidity")
        @Validation(required = true)
        public Integer accessTokenValidity;

        @NameInMap("RefreshTokenValidity")
        @Validation(required = true)
        public Integer refreshTokenValidity;

        @NameInMap("IsMultiTenant")
        @Validation(required = true)
        public Boolean isMultiTenant;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DelegatedScope")
        @Validation(required = true)
        public GetApplicationResponseApplicationDelegatedScope delegatedScope;

        @NameInMap("RedirectUris")
        @Validation(required = true)
        public GetApplicationResponseApplicationRedirectUris redirectUris;

        public static GetApplicationResponseApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseApplication self = new GetApplicationResponseApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationResponseApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetApplicationResponseApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetApplicationResponseApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public GetApplicationResponseApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public GetApplicationResponseApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public GetApplicationResponseApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public GetApplicationResponseApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetApplicationResponseApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetApplicationResponseApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetApplicationResponseApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetApplicationResponseApplication setDelegatedScope(GetApplicationResponseApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public GetApplicationResponseApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public GetApplicationResponseApplication setRedirectUris(GetApplicationResponseApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public GetApplicationResponseApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

    }

}
