// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetExternalApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the external application.</p>
     */
    @NameInMap("ExternalApplication")
    public GetExternalApplicationResponseBodyExternalApplication externalApplication;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C4D1BD-2558-5BD1-8C36-A5D7FB174A55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetExternalApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExternalApplicationResponseBody self = new GetExternalApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExternalApplicationResponseBody setExternalApplication(GetExternalApplicationResponseBodyExternalApplication externalApplication) {
        this.externalApplication = externalApplication;
        return this;
    }
    public GetExternalApplicationResponseBodyExternalApplication getExternalApplication() {
        return this.externalApplication;
    }

    public GetExternalApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
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

        public static GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope self = new GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes self = new GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class GetExternalApplicationResponseBodyExternalApplicationDelegatedScope extends TeaModel {
        /**
         * <p>The information about the permissions that are granted on the application.</p>
         */
        @NameInMap("PredefinedScopes")
        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes predefinedScopes;

        public static GetExternalApplicationResponseBodyExternalApplicationDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            GetExternalApplicationResponseBodyExternalApplicationDelegatedScope self = new GetExternalApplicationResponseBodyExternalApplicationDelegatedScope();
            return TeaModel.build(map, self);
        }

        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScope setPredefinedScopes(GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class GetExternalApplicationResponseBodyExternalApplication extends TeaModel {
        /**
         * <p>The name of the application principal. The value is in the <code>&lt;app_name&gt;@app.&lt;account_id&gt;.onaliyun.com</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:GiteePrd@app.153082740420">GiteePrd@app.153082740420</a>****.onaliyun.com</p>
         */
        @NameInMap("AppPrincipalName")
        public String appPrincipalName;

        /**
         * <p>The time when the application was installed. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1737534146000</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The information about the permissions that are granted on the application.</p>
         */
        @NameInMap("DelegatedScope")
        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScope delegatedScope;

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
         * <p>407426893752729****</p>
         */
        @NameInMap("ForeignAppId")
        public String foreignAppId;

        /**
         * <p>The ID of the Alibaba Cloud account for which the application is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>173082740420****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The update time of the application. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1737534146000</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetExternalApplicationResponseBodyExternalApplication build(java.util.Map<String, ?> map) throws Exception {
            GetExternalApplicationResponseBodyExternalApplication self = new GetExternalApplicationResponseBodyExternalApplication();
            return TeaModel.build(map, self);
        }

        public GetExternalApplicationResponseBodyExternalApplication setAppPrincipalName(String appPrincipalName) {
            this.appPrincipalName = appPrincipalName;
            return this;
        }
        public String getAppPrincipalName() {
            return this.appPrincipalName;
        }

        public GetExternalApplicationResponseBodyExternalApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetExternalApplicationResponseBodyExternalApplication setDelegatedScope(GetExternalApplicationResponseBodyExternalApplicationDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public GetExternalApplicationResponseBodyExternalApplication setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetExternalApplicationResponseBodyExternalApplication setForeignAppId(String foreignAppId) {
            this.foreignAppId = foreignAppId;
            return this;
        }
        public String getForeignAppId() {
            return this.foreignAppId;
        }

        public GetExternalApplicationResponseBodyExternalApplication setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetExternalApplicationResponseBodyExternalApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
