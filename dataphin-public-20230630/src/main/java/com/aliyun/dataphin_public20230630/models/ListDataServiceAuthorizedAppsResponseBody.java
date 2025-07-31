// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedAppsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListDataServiceAuthorizedAppsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceAuthorizedAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedAppsResponseBody self = new ListDataServiceAuthorizedAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAuthorizedAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServiceAuthorizedAppsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceAuthorizedAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServiceAuthorizedAppsResponseBody setPageResult(ListDataServiceAuthorizedAppsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataServiceAuthorizedAppsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataServiceAuthorizedAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceAuthorizedAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList self = new ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1022</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>30012101</p>
         */
        @NameInMap("ApplyUserId")
        public String applyUserId;

        @NameInMap("ApplyUserName")
        public String applyUserName;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsProjectManager")
        public Boolean isProjectManager;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerUserName")
        public String ownerUserName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PrivilegeAccount")
        public Integer privilegeAccount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrivilegeType")
        public Integer privilegeType;

        /**
         * <strong>example:</strong>
         * <p>102122</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RealHasOwnerPrivilege")
        public Boolean realHasOwnerPrivilege;

        @NameInMap("RealHasPrivilege")
        public Boolean realHasPrivilege;

        @NameInMap("RemarkForDebugList")
        public java.util.List<ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList> remarkForDebugList;

        @NameInMap("Revocable")
        public Boolean revocable;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("RevocableDetail")
        public Integer revocableDetail;

        public static ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList self = new ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            return this;
        }
        public String getApplyUserId() {
            return this.applyUserId;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setApplyUserName(String applyUserName) {
            this.applyUserName = applyUserName;
            return this;
        }
        public String getApplyUserName() {
            return this.applyUserName;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setIsProjectManager(Boolean isProjectManager) {
            this.isProjectManager = isProjectManager;
            return this;
        }
        public Boolean getIsProjectManager() {
            return this.isProjectManager;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setOwnerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            return this;
        }
        public String getOwnerUserName() {
            return this.ownerUserName;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setPrivilegeAccount(Integer privilegeAccount) {
            this.privilegeAccount = privilegeAccount;
            return this;
        }
        public Integer getPrivilegeAccount() {
            return this.privilegeAccount;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setPrivilegeType(Integer privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }
        public Integer getPrivilegeType() {
            return this.privilegeType;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setRealHasOwnerPrivilege(Boolean realHasOwnerPrivilege) {
            this.realHasOwnerPrivilege = realHasOwnerPrivilege;
            return this;
        }
        public Boolean getRealHasOwnerPrivilege() {
            return this.realHasOwnerPrivilege;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setRealHasPrivilege(Boolean realHasPrivilege) {
            this.realHasPrivilege = realHasPrivilege;
            return this;
        }
        public Boolean getRealHasPrivilege() {
            return this.realHasPrivilege;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setRemarkForDebugList(java.util.List<ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList> remarkForDebugList) {
            this.remarkForDebugList = remarkForDebugList;
            return this;
        }
        public java.util.List<ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppListRemarkForDebugList> getRemarkForDebugList() {
            return this.remarkForDebugList;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setRevocable(Boolean revocable) {
            this.revocable = revocable;
            return this;
        }
        public Boolean getRevocable() {
            return this.revocable;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList setRevocableDetail(Integer revocableDetail) {
            this.revocableDetail = revocableDetail;
            return this;
        }
        public Integer getRevocableDetail() {
            return this.revocableDetail;
        }

    }

    public static class ListDataServiceAuthorizedAppsResponseBodyPageResult extends TeaModel {
        @NameInMap("AuthorizedAppList")
        public java.util.List<ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList> authorizedAppList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceAuthorizedAppsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedAppsResponseBodyPageResult self = new ListDataServiceAuthorizedAppsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResult setAuthorizedAppList(java.util.List<ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList> authorizedAppList) {
            this.authorizedAppList = authorizedAppList;
            return this;
        }
        public java.util.List<ListDataServiceAuthorizedAppsResponseBodyPageResultAuthorizedAppList> getAuthorizedAppList() {
            return this.authorizedAppList;
        }

        public ListDataServiceAuthorizedAppsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
