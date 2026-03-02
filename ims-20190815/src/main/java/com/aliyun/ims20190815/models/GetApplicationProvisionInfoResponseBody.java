// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetApplicationProvisionInfoResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisionInfo")
    public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo applicationProvisionInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationProvisionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisionInfoResponseBody self = new GetApplicationProvisionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisionInfoResponseBody setApplicationProvisionInfo(GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo applicationProvisionInfo) {
        this.applicationProvisionInfo = applicationProvisionInfo;
        return this;
    }
    public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo getApplicationProvisionInfo() {
        return this.applicationProvisionInfo;
    }

    public GetApplicationProvisionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope self = new GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes self = new GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes predefinedScopes;

        public static GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope self = new GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope setPredefinedScopes(GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DelegatedScope")
        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope delegatedScope;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo self = new GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo setDelegatedScope(GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
