// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    /**
     * <p>The application information.</p>
     */
    @NameInMap("Application")
    public CreateApplicationResponseBodyApplication application;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6616F09B-2768-4C11-8866-A8EE4C4A583E</p>
     */
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

        @NameInMap("Required")
        public Boolean required;

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

        public CreateApplicationResponseBodyApplicationDelegatedScopePredefinedScopesPredefinedScope setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
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
        /**
         * <p>The validity period of the access token. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("AccessTokenValidity")
        public Integer accessTokenValidity;

        /**
         * <p>The Alibaba Cloud account ID to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>177242285274****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The application ID.</p>
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
         * <p>The application assignment type. Valid values:</p>
         * <ul>
         * <li>AllowAll: assigns the application to all RAM users and roles in the account, allowing them to use the application.</li>
         * <li>OnDemand: assigns the application only to specified RAM users and roles in the account, allowing only them to use the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllowAll</p>
         */
        @NameInMap("AssignmentType")
        public String assignmentType;

        /**
         * <p>The creation time.</p>
         * <p>Format: RFC 3339 (UTC). Example: 2020-10-23T08:06:57Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-23T08:06:57Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The application scope information.</p>
         */
        @NameInMap("DelegatedScope")
        public CreateApplicationResponseBodyApplicationDelegatedScope delegatedScope;

        /**
         * <p>The display name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Indicates whether the application can be installed by other accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMultiTenant")
        public Boolean isMultiTenant;

        /**
         * <p>Specifies whether user authorization is required. Valid values:</p>
         * <ul>
         * <li>true: User authorization is required.</li>
         * <li>false: User authorization is not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedPrincipalConsent")
        public Boolean needPrincipalConsent;

        /**
         * <p>The OAuth protocol version of the application. Valid values:</p>
         * <ul>
         * <li>2.0: OAuth 2.0 protocol.</li>
         * <li>2.1: OAuth 2.1 protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("ProtocolVersion")
        public String protocolVersion;

        @NameInMap("RedirectUris")
        public CreateApplicationResponseBodyApplicationRedirectUris redirectUris;

        /**
         * <p>The validity period of the refresh token. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>7776000</p>
         */
        @NameInMap("RefreshTokenValidity")
        public Integer refreshTokenValidity;

        /**
         * <p>Indicates whether an application secret is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecretRequired")
        public Boolean secretRequired;

        /**
         * <p>The update time.</p>
         * <p>Format: RFC 3339 (UTC). Example: 2020-10-23T08:06:57Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-23T08:06:57Z</p>
         */
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

        public CreateApplicationResponseBodyApplication setAssignmentType(String assignmentType) {
            this.assignmentType = assignmentType;
            return this;
        }
        public String getAssignmentType() {
            return this.assignmentType;
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

        public CreateApplicationResponseBodyApplication setNeedPrincipalConsent(Boolean needPrincipalConsent) {
            this.needPrincipalConsent = needPrincipalConsent;
            return this;
        }
        public Boolean getNeedPrincipalConsent() {
            return this.needPrincipalConsent;
        }

        public CreateApplicationResponseBodyApplication setProtocolVersion(String protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }
        public String getProtocolVersion() {
            return this.protocolVersion;
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
