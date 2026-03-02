// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisionInfo")
    public ProvisionApplicationResponseBodyApplicationProvisionInfo applicationProvisionInfo;

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
        @NameInMap("Description")
        public String description;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppPrincipalName")
        public String appPrincipalName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DelegatedScope")
        public ProvisionApplicationResponseBodyApplicationProvisionInfoDelegatedScope delegatedScope;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("TenantId")
        public String tenantId;

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
