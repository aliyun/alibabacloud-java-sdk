// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The configuration information about the application.</p>
     */
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setApplication(GetApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
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

        public static GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope self = new GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes self = new GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class GetApplicationResponseBodyApplicationDelegatedScope extends TeaModel {
        /**
         * <p>The information about the permissions that are granted on the application.</p>
         */
        @NameInMap("PredefinedScopes")
        public GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static GetApplicationResponseBodyApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationDelegatedScope self = new GetApplicationResponseBodyApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationDelegatedScope setPredefinedScopes(GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public GetApplicationResponseBodyApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class GetApplicationResponseBodyApplicationRedirectUris extends TeaModel {
        @NameInMap("RedirectUri")
        public java.util.List<String> redirectUri;

        public static GetApplicationResponseBodyApplicationRedirectUris build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationRedirectUris self = new GetApplicationResponseBodyApplicationRedirectUris();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationRedirectUris setRedirectUri(java.util.List<String> redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
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
        public GetApplicationResponseBodyApplicationDelegatedScope delegatedScope;

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
        public GetApplicationResponseBodyApplicationRedirectUris redirectUris;

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

        public static GetApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplication self = new GetApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplication setAccessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        public GetApplicationResponseBodyApplication setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetApplicationResponseBodyApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationResponseBodyApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetApplicationResponseBodyApplication setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetApplicationResponseBodyApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetApplicationResponseBodyApplication setDelegatedScope(GetApplicationResponseBodyApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public GetApplicationResponseBodyApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public GetApplicationResponseBodyApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetApplicationResponseBodyApplication setIsMultiTenant(Boolean isMultiTenant) {
            this.isMultiTenant = isMultiTenant;
            return this;
        }
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        public GetApplicationResponseBodyApplication setRedirectUris(GetApplicationResponseBodyApplicationRedirectUris redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public GetApplicationResponseBodyApplicationRedirectUris getRedirectUris() {
            return this.redirectUris;
        }

        public GetApplicationResponseBodyApplication setRefreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        public GetApplicationResponseBodyApplication setSecretRequired(Boolean secretRequired) {
            this.secretRequired = secretRequired;
            return this;
        }
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        public GetApplicationResponseBodyApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
