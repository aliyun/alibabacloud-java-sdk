// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetExternalApplicationResponseBody extends TeaModel {
    @NameInMap("ExternalApplication")
    public GetExternalApplicationResponseBodyExternalApplication externalApplication;

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
        @NameInMap("Description")
        public String description;

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
        @NameInMap("AppPrincipalName")
        public String appPrincipalName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DelegatedScope")
        public GetExternalApplicationResponseBodyExternalApplicationDelegatedScope delegatedScope;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("ForeignAppId")
        public String foreignAppId;

        @NameInMap("TenantId")
        public String tenantId;

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
