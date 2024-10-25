// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListProjectMembersResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>9FBBBB1F-DD5E-5D8E-8F50-37F77460F056</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponseBody self = new ListProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponseBody setPagingInfo(ListProjectMembersResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListProjectMembersResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectMembersResponseBodyPagingInfoProjectMembersRoles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectMembersResponseBodyPagingInfoProjectMembersRoles build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyPagingInfoProjectMembersRoles self = new ListProjectMembersResponseBodyPagingInfoProjectMembersRoles();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyPagingInfoProjectMembersRoles setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectMembersResponseBodyPagingInfoProjectMembersRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectMembersResponseBodyPagingInfoProjectMembersRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectMembersResponseBodyPagingInfoProjectMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>62136</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Roles")
        public java.util.List<ListProjectMembersResponseBodyPagingInfoProjectMembersRoles> roles;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>123422344899</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListProjectMembersResponseBodyPagingInfoProjectMembers build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyPagingInfoProjectMembers self = new ListProjectMembersResponseBodyPagingInfoProjectMembers();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyPagingInfoProjectMembers setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListProjectMembersResponseBodyPagingInfoProjectMembers setRoles(java.util.List<ListProjectMembersResponseBodyPagingInfoProjectMembersRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<ListProjectMembersResponseBodyPagingInfoProjectMembersRoles> getRoles() {
            return this.roles;
        }

        public ListProjectMembersResponseBodyPagingInfoProjectMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectMembersResponseBodyPagingInfoProjectMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListProjectMembersResponseBodyPagingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ProjectMembers")
        public java.util.List<ListProjectMembersResponseBodyPagingInfoProjectMembers> projectMembers;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectMembersResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyPagingInfo self = new ListProjectMembersResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectMembersResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectMembersResponseBodyPagingInfo setProjectMembers(java.util.List<ListProjectMembersResponseBodyPagingInfoProjectMembers> projectMembers) {
            this.projectMembers = projectMembers;
            return this;
        }
        public java.util.List<ListProjectMembersResponseBodyPagingInfoProjectMembers> getProjectMembers() {
            return this.projectMembers;
        }

        public ListProjectMembersResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
