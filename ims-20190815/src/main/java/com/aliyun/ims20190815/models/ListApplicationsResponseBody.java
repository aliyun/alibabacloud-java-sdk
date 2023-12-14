// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Applications")
    public ListApplicationsResponseBodyApplications applications;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(ListApplicationsResponseBodyApplications applications) {
        this.applications = applications;
        return this;
    }
    public ListApplicationsResponseBodyApplications getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        /**
         * <p>The description of the permission.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

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

        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScopePredefinedScopesPredefinedScope setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
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
        /**
         * <p>An array consisting of the information about the permissions that are granted on the application.</p>
         */
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

    public static class ListApplicationsResponseBodyApplicationsApplication extends TeaModel {
        /**
         * <p>The validity period of the access token. Unit: seconds.</p>
         */
        @NameInMap("AccessTokenValidity")
        public Integer accessTokenValidity;

        /**
         * <p>The ID of the Alibaba Cloud account to which the application belongs.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   WebApp: a web application.</p>
         * <p>*   NativeApp: a native application that runs on an operating system, such as a desktop or mobile operating system.</p>
         * <p>*   ServerApp: an application that can access Alibaba Cloud services without the need for user logon. Only applications that synchronize user information based on the System for Cross-domain Identity Management (SCIM) protocol are supported.</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The information about the permissions that are granted on the application.</p>
         */
        @NameInMap("DelegatedScope")
        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScope delegatedScope;

        /**
         * <p>The display name of the application.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Indicates whether the application can be installed by using other Alibaba Cloud accounts.</p>
         */
        @NameInMap("IsMultiTenant")
        public Boolean isMultiTenant;

        /**
         * <p>The callback URL.</p>
         */
        @NameInMap("RedirectUris")
        public ListApplicationsResponseBodyApplicationsApplicationRedirectUris redirectUris;

        /**
         * <p>The validity period of the refresh token. Unit: seconds.</p>
         */
        @NameInMap("RefreshTokenValidity")
        public Integer refreshTokenValidity;

        /**
         * <p>Indicates whether a secret is required.</p>
         */
        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListApplicationsResponseBodyApplicationsApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplication self = new ListApplicationsResponseBodyApplicationsApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListApplicationsResponseBodyApplicationsApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListApplicationsResponseBodyApplicationsApplication setDelegatedScope(ListApplicationsResponseBodyApplicationsApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public ListApplicationsResponseBodyApplicationsApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListApplicationsResponseBodyApplicationsApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public ListApplicationsResponseBodyApplicationsApplication setRedirectUris(ListApplicationsResponseBodyApplicationsApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

        public ListApplicationsResponseBodyApplicationsApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public ListApplicationsResponseBodyApplicationsApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public ListApplicationsResponseBodyApplicationsApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
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
