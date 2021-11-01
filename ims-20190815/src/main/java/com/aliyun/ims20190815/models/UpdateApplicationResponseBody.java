// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public UpdateApplicationResponseBodyApplication application;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

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
        public UpdateApplicationResponseBodyApplicationDelegatedScope delegatedScope;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("IsMultiTenant")
        public Boolean isMultiTenant;

        @NameInMap("RedirectUris")
        public UpdateApplicationResponseBodyApplicationRedirectUris redirectUris;

        @NameInMap("RefreshTokenValidity")
        public Integer refreshTokenValidity;

        @NameInMap("SecretRequired")
        public Boolean secretRequired;

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
