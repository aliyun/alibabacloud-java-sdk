// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceMyApiPermissionsResponseBody extends TeaModel {
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
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListDataServiceMyApiPermissionsResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceMyApiPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceMyApiPermissionsResponseBody self = new ListDataServiceMyApiPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceMyApiPermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServiceMyApiPermissionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceMyApiPermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServiceMyApiPermissionsResponseBody setPageResult(ListDataServiceMyApiPermissionsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataServiceMyApiPermissionsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataServiceMyApiPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceMyApiPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1322</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>teset</p>
         */
        @NameInMap("ApiName")
        public String apiName;

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
         * <p>The owner of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("PrivilegeBelongTo")
        public String privilegeBelongTo;

        /**
         * <p>The authorization source. Valid values:</p>
         * <ul>
         * <li>0: Owner.</li>
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
         * <p>102122</p>
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
         * <p>The role. Valid values:</p>
         * <ul>
         * <li>0: Owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Role")
        public Integer role;

        public static ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList self = new ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setOwnerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            return this;
        }
        public String getOwnerUserName() {
            return this.ownerUserName;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setPrivilegeBelongTo(String privilegeBelongTo) {
            this.privilegeBelongTo = privilegeBelongTo;
            return this;
        }
        public String getPrivilegeBelongTo() {
            return this.privilegeBelongTo;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setPrivilegeFrom(Integer privilegeFrom) {
            this.privilegeFrom = privilegeFrom;
            return this;
        }
        public Integer getPrivilegeFrom() {
            return this.privilegeFrom;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

    public static class ListDataServiceMyApiPermissionsResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paged permission list.</p>
         */
        @NameInMap("PermissionList")
        public java.util.List<ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList> permissionList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceMyApiPermissionsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceMyApiPermissionsResponseBodyPageResult self = new ListDataServiceMyApiPermissionsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResult setPermissionList(java.util.List<ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList> permissionList) {
            this.permissionList = permissionList;
            return this;
        }
        public java.util.List<ListDataServiceMyApiPermissionsResponseBodyPageResultPermissionList> getPermissionList() {
            return this.permissionList;
        }

        public ListDataServiceMyApiPermissionsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
