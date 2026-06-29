// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceMyAppPermissionsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paging query result.</p>
     */
    @NameInMap("PageResult")
    public ListDataServiceMyAppPermissionsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceMyAppPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceMyAppPermissionsResponseBody self = new ListDataServiceMyAppPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceMyAppPermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServiceMyAppPermissionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceMyAppPermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServiceMyAppPermissionsResponseBody setPageResult(ListDataServiceMyAppPermissionsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataServiceMyAppPermissionsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataServiceMyAppPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceMyAppPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList extends TeaModel {
        /**
         * <p>The configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The configuration item value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList self = new ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList extends TeaModel {
        /**
         * <p>AppId</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The role of the current logon user relative to this record. Valid values:</p>
         * <ul>
         * <li>SuperAdmin: the current user is a super administrator.</li>
         * <li>ProjMan: the current user is a project administrator for this record.</li>
         * <li>NormalUser: the current user is a regular user for this record, meaning the user is neither a super administrator nor a project administrator.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NormalUser</p>
         */
        @NameInMap("CurrentUserRole")
        public String currentUserRole;

        /**
         * <p>The ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerUserName")
        public String ownerUserName;

        /**
         * <p>The user to whom the permission belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("PrivilegeBelongTo")
        public String privilegeBelongTo;

        /**
         * <p>The source of the authorization. Valid values:</p>
         * <ul>
         * <li>0: owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PrivilegeFrom")
        public Integer privilegeFrom;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112101</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The description, used for troubleshooting.</p>
         */
        @NameInMap("RemarkForDebugList")
        public java.util.List<ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList> remarkForDebugList;

        /**
         * <p>The role. Valid values:</p>
         * <ul>
         * <li>0: owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Role")
        public Integer role;

        public static ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList self = new ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setCurrentUserRole(String currentUserRole) {
            this.currentUserRole = currentUserRole;
            return this;
        }
        public String getCurrentUserRole() {
            return this.currentUserRole;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setOwnerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            return this;
        }
        public String getOwnerUserName() {
            return this.ownerUserName;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setPrivilegeBelongTo(String privilegeBelongTo) {
            this.privilegeBelongTo = privilegeBelongTo;
            return this;
        }
        public String getPrivilegeBelongTo() {
            return this.privilegeBelongTo;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setPrivilegeFrom(Integer privilegeFrom) {
            this.privilegeFrom = privilegeFrom;
            return this;
        }
        public Integer getPrivilegeFrom() {
            return this.privilegeFrom;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setRemarkForDebugList(java.util.List<ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList> remarkForDebugList) {
            this.remarkForDebugList = remarkForDebugList;
            return this;
        }
        public java.util.List<ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionListRemarkForDebugList> getRemarkForDebugList() {
            return this.remarkForDebugList;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

    public static class ListDataServiceMyAppPermissionsResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paginated permission list.</p>
         */
        @NameInMap("PermissionList")
        public java.util.List<ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList> permissionList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceMyAppPermissionsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceMyAppPermissionsResponseBodyPageResult self = new ListDataServiceMyAppPermissionsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResult setPermissionList(java.util.List<ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList> permissionList) {
            this.permissionList = permissionList;
            return this;
        }
        public java.util.List<ListDataServiceMyAppPermissionsResponseBodyPageResultPermissionList> getPermissionList() {
            return this.permissionList;
        }

        public ListDataServiceMyAppPermissionsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
