// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetApplicationProvisionInfoResponseBody extends TeaModel {
    /**
     * <p>The installation information about the application.</p>
     */
    @NameInMap("ApplicationProvisionInfo")
    public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfo applicationProvisionInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>936E1D9C-157D-45BD-8A3B-81C0716EB078</p>
     */
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
        /**
         * <p>The information about the scopes of permissions that are granted to the application.</p>
         */
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
        public GetApplicationProvisionInfoResponseBodyApplicationProvisionInfoDelegatedScope delegatedScope;

        /**
         * <p>The display name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>GiteeAliyun</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The update time. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1603693518000</p>
         */
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
