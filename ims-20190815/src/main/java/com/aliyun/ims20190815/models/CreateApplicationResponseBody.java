// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public CreateApplicationResponseBodyApplication application;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponseBody self = new CreateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponseBody setApplication(CreateApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public CreateApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public CreateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope self = new CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes self = new CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class CreateApplicationResponseBodyApplicationDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        public CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static CreateApplicationResponseBodyApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplicationDelegatedScope self = new CreateApplicationResponseBodyApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplicationDelegatedScope setPredefinedScopes(CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class CreateApplicationResponseBodyApplicationRedirectUris extends TeaModel {
        @NameInMap("RedirectUri")
        public java.util.List<String> redirectUri;

        public static CreateApplicationResponseBodyApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplicationRedirectUris self = new CreateApplicationResponseBodyApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class CreateApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("AccessTokenValidity")
        public Integer accessTokenValidity;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DelegatedScope")
        public CreateApplicationResponseBodyApplicationDelegatedScope delegatedScope;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("IsMultiTenant")
        public Boolean isMultiTenant;

        @NameInMap("RedirectUris")
        public CreateApplicationResponseBodyApplicationRedirectUris redirectUris;

        @NameInMap("RefreshTokenValidity")
        public Integer refreshTokenValidity;

        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static CreateApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplication self = new CreateApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public CreateApplicationResponseBodyApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateApplicationResponseBodyApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateApplicationResponseBodyApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateApplicationResponseBodyApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public CreateApplicationResponseBodyApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateApplicationResponseBodyApplication setDelegatedScope(CreateApplicationResponseBodyApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public CreateApplicationResponseBodyApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public CreateApplicationResponseBodyApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateApplicationResponseBodyApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public CreateApplicationResponseBodyApplication setRedirectUris(CreateApplicationResponseBodyApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public CreateApplicationResponseBodyApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

        public CreateApplicationResponseBodyApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public CreateApplicationResponseBodyApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public CreateApplicationResponseBodyApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
