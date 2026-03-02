// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationProvisionInfosResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisionInfos")
    public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos applicationProvisionInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E403EBFD-C997-489D-BFC7-37C05E66D67C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationProvisionInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationProvisionInfosResponseBody self = new ListApplicationProvisionInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationProvisionInfosResponseBody setApplicationProvisionInfos(ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos applicationProvisionInfos) {
        this.applicationProvisionInfos = applicationProvisionInfos;
        return this;
    }
    public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos getApplicationProvisionInfos() {
        return this.applicationProvisionInfos;
    }

    public ListApplicationProvisionInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope self = new ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> predefinedScope;

        public static ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes self = new ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes setPredefinedScope(java.util.List<ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

    public static class ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes predefinedScopes;

        public static ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope self = new ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope();
            return TeaModel.build(map, self);
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope setPredefinedScopes(ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }
        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScopePredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

    }

    public static class ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DelegatedScope")
        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope delegatedScope;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo self = new ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo();
            return TeaModel.build(map, self);
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo setDelegatedScope(ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope delegatedScope) {
            this.delegatedScope = delegatedScope;
            return this;
        }
        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfoDelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos extends TeaModel {
        @NameInMap("ApplicationProvisionInfo")
        public java.util.List<ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo> applicationProvisionInfo;

        public static ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos self = new ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos();
            return TeaModel.build(map, self);
        }

        public ListApplicationProvisionInfosResponseBodyApplicationProvisionInfos setApplicationProvisionInfo(java.util.List<ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo> applicationProvisionInfo) {
            this.applicationProvisionInfo = applicationProvisionInfo;
            return this;
        }
        public java.util.List<ListApplicationProvisionInfosResponseBodyApplicationProvisionInfosApplicationProvisionInfo> getApplicationProvisionInfo() {
            return this.applicationProvisionInfo;
        }

    }

}
