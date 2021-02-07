// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Applications")
    public ListApplicationsResponseBodyApplications applications;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setApplications(ListApplicationsResponseBodyApplications applications) {
        this.applications = applications;
        return this;
    }
    public ListApplicationsResponseBodyApplications getApplications() {
        return this.applications;
    }

    public static class ListApplicationsResponseBodyApplicationsApplicationRedirectUris extends TeaModel {
        @NameInMap("RedirectUri")
        public java.util.List<String> redirectUri;

        public static ListApplicationsResponseBodyApplicationsApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationRedirectUris self = new ListApplicationsResponseBodyApplicationsApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope self = new ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes self = new ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplicationDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static ListApplicationsResponseBodyApplicationsApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationDelegatedScope self = new ListApplicationsResponseBodyApplicationsApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScope setPredefinedScopes(ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplication extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("AccessTokenValidity")
        public Integer accessTokenValidity;

        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RedirectUris")
        public ListApplicationsResponseBodyApplicationsApplicationRedirectUris redirectUris;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("DelegatedScope")
        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScope delegatedScope;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("RefreshTokenValidity")
        public Integer refreshTokenValidity;

        @NameInMap("IsMultiTenant")
        public Boolean isMultiTenant;

        @NameInMap("AppType")
        public String appType;

        public static ListApplicationsResponseBodyApplicationsApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplication self = new ListApplicationsResponseBodyApplicationsApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public ListApplicationsResponseBodyApplicationsApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListApplicationsResponseBodyApplicationsApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsResponseBodyApplicationsApplication setRedirectUris(ListApplicationsResponseBodyApplicationsApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

        public ListApplicationsResponseBodyApplicationsApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListApplicationsResponseBodyApplicationsApplication setDelegatedScope(ListApplicationsResponseBodyApplicationsApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseBodyApplicationsApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public ListApplicationsResponseBodyApplicationsApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("Application")
        public java.util.List<ListApplicationsResponseBodyApplicationsApplication> application;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setApplication(java.util.List<ListApplicationsResponseBodyApplicationsApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyApplicationsApplication> getApplication() {
            return this.application;
        }

    }

}
