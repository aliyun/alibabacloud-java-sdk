// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Applications")
    @Validation(required = true)
    public ListApplicationsResponseApplications applications;

    public static ListApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponse self = new ListApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponse setApplications(ListApplicationsResponseApplications applications) {
        this.applications = applications;
        return this;
    }
    public ListApplicationsResponseApplications getApplications() {
        return this.applications;
    }

    public static class ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope self = new ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        @Validation(required = true)
        public java.util.List<ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes self = new ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class ListApplicationsResponseApplicationsApplicationDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        @Validation(required = true)
        public ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static ListApplicationsResponseApplicationsApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplicationDelegatedScope self = new ListApplicationsResponseApplicationsApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplicationDelegatedScope setPredefinedScopes(ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public ListApplicationsResponseApplicationsApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class ListApplicationsResponseApplicationsApplicationRedirectUris extends TeaModel {
        // RedirectUri
        @NameInMap("RedirectUri")
        @Validation(required = true)
        public java.util.List<String> redirectUri;

        public static ListApplicationsResponseApplicationsApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplicationRedirectUris self = new ListApplicationsResponseApplicationsApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class ListApplicationsResponseApplicationsApplication extends TeaModel {
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
        public ListApplicationsResponseApplicationsApplicationDelegatedScope delegatedScope;

        @NameInMap("RedirectUris")
        @Validation(required = true)
        public ListApplicationsResponseApplicationsApplicationRedirectUris redirectUris;

        public static ListApplicationsResponseApplicationsApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplicationsApplication self = new ListApplicationsResponseApplicationsApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplicationsApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListApplicationsResponseApplicationsApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListApplicationsResponseApplicationsApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseApplicationsApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public ListApplicationsResponseApplicationsApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListApplicationsResponseApplicationsApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public ListApplicationsResponseApplicationsApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public ListApplicationsResponseApplicationsApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public ListApplicationsResponseApplicationsApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListApplicationsResponseApplicationsApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListApplicationsResponseApplicationsApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsResponseApplicationsApplication setDelegatedScope(ListApplicationsResponseApplicationsApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public ListApplicationsResponseApplicationsApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public ListApplicationsResponseApplicationsApplication setRedirectUris(ListApplicationsResponseApplicationsApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public ListApplicationsResponseApplicationsApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

    }

    public static class ListApplicationsResponseApplications extends TeaModel {
        @NameInMap("Application")
        @Validation(required = true)
        public java.util.List<ListApplicationsResponseApplicationsApplication> application;

        public static ListApplicationsResponseApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseApplications self = new ListApplicationsResponseApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseApplications setApplication(java.util.List<ListApplicationsResponseApplicationsApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationsResponseApplicationsApplication> getApplication() {
            return this.application;
        }

    }

}
