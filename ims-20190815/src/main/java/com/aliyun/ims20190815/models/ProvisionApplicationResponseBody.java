// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionApplicationResponseBody extends TeaModel {
    /**
     * <p>The installation information of the application.</p>
     */
    @NameInMap("ApplicationProvisionInfo")
    public ProvisionApplicationResponseBodyApplicationProvisionInfo applicationProvisionInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8AE06ED-9593-5BF9-8D4A-68D5DDCC90AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ProvisionApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProvisionApplicationResponseBody self = new ProvisionApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ProvisionApplicationResponseBody setApplicationProvisionInfo(ProvisionApplicationResponseBodyApplicationProvisionInfo applicationProvisionInfo) {
        this.applicationProvisionInfo = applicationProvisionInfo;
        return this;
    }
    public ProvisionApplicationResponseBodyApplicationProvisionInfo getApplicationProvisionInfo() {
        return this.applicationProvisionInfo;
    }

    public ProvisionApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        /**
         * <p>The description of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>Obtains the OpenID of the user. This is the default scope and cannot be deleted.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("Name")
        public String name;

        public static ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope self = new ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes self = new ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope extends TeaModel {
        /**
         * <p>The information about the permissions that are granted to the application.</p>
         */
        @NameInMap("PredefinedScopes")
        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes predefinedScopes;

        public static ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope self = new ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope();
            return TeaModel.build(map, self);
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope setPredefinedScopes(ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class ProvisionApplicationResponseBodyApplicationProvisionInfo extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>177242285274****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>452392483381546****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>GiteePrd</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The name of the application principal. The value is in the <code>&lt;app_name&gt;@app.&lt;account_id&gt;.onaliyun.com</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:GiteePrd@app.177242285274">GiteePrd@app.177242285274</a>****.onaliyun.com</p>
         */
        @NameInMap("AppPrincipalName")
        public String appPrincipalName;

        /**
         * <p>The time when the application was installed. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1603693518000</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The information about the permissions that are granted to the application.</p>
         */
        @NameInMap("DelegatedScope")
        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope delegatedScope;

        /**
         * <p>The display name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>GiteeAliyun</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the Alibaba Cloud account for which the application was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>177242285274****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The update time. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1603693518000</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ProvisionApplicationResponseBodyApplicationProvisionInfo build(java.util.Map<String, ?> map) throws Exception {
            ProvisionApplicationResponseBodyApplicationProvisionInfo self = new ProvisionApplicationResponseBodyApplicationProvisionInfo();
            return TeaModel.build(map, self);
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setAppPrincipalName(String appPrincipalName) {
            this.appPrincipalName = appPrincipalName;
            return this;
        }
        public String getAppPrincipalName() {
            return this.appPrincipalName;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setDelegatedScope(ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ProvisionApplicationResponseBodyApplicationProvisionInfo setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
