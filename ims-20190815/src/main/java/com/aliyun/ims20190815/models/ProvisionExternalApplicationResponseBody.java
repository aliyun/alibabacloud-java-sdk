// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionExternalApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the external application.</p>
     */
    @NameInMap("ExternalApplication")
    public ProvisionExternalApplicationResponseBodyExternalApplication externalApplication;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55535873-9A6B-5C87-853F-C7CD258826F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ProvisionExternalApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProvisionExternalApplicationResponseBody self = new ProvisionExternalApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ProvisionExternalApplicationResponseBody setExternalApplication(ProvisionExternalApplicationResponseBodyExternalApplication externalApplication) {
        this.externalApplication = externalApplication;
        return this;
    }
    public ProvisionExternalApplicationResponseBodyExternalApplication getExternalApplication() {
        return this.externalApplication;
    }

    public ProvisionExternalApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        /**
         * <p>The description of the permission scope.</p>
         * 
         * <strong>example:</strong>
         * <p>Obtains the OpenID of the user. This is the default scope and cannot be deleted.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission scope.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("Name")
        public String name;

        public static ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope self = new ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes self = new ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope extends TeaModel {
        /**
         * <p>The information about the scopes of permissions that are granted to the application.</p>
         */
        @NameInMap("PredefinedScopes")
        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope self = new ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope setPredefinedScopes(ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class ProvisionExternalApplicationResponseBodyExternalApplication extends TeaModel {
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
         * <p>The information about the scopes of permissions that are granted to the application.</p>
         */
        @NameInMap("DelegatedScope")
        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope delegatedScope;

        /**
         * <p>The display name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>GiteeAliyun</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>403550611646604****</p>
         */
        @NameInMap("ForeignAppId")
        public String foreignAppId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the external application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>157242285274****</p>
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

        public static ProvisionExternalApplicationResponseBodyExternalApplication build(java.util.Map<String, ?> map) throws Exception {
            ProvisionExternalApplicationResponseBodyExternalApplication self = new ProvisionExternalApplicationResponseBodyExternalApplication();
            return TeaModel.build(map, self);
        }

        public ProvisionExternalApplicationResponseBodyExternalApplication setAppPrincipalName(String appPrincipalName) {
            this.appPrincipalName = appPrincipalName;
            return this;
        }
        public String getAppPrincipalName() {
            return this.appPrincipalName;
        }

        public ProvisionExternalApplicationResponseBodyExternalApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ProvisionExternalApplicationResponseBodyExternalApplication setDelegatedScope(ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public ProvisionExternalApplicationResponseBodyExternalApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public ProvisionExternalApplicationResponseBodyExternalApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ProvisionExternalApplicationResponseBodyExternalApplication setForeignAppId(String foreignAppId) {
            this.foreignAppId = foreignAppId;
            return this;
        }
        public String getForeignAppId() {
            return this.foreignAppId;
        }

        public ProvisionExternalApplicationResponseBodyExternalApplication setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ProvisionExternalApplicationResponseBodyExternalApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
