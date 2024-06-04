// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    /**
     * <p>The results that are returned.</p>
     */
    @NameInMap("Data")
    public ListProjectMembersResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponseBody self = new ListProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponseBody setData(ListProjectMembersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectMembersResponseBodyData getData() {
        return this.data;
    }

    public ListProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList extends TeaModel {
        /**
         * <p>The code of the role.</p>
         * <br>
         * <p>DataWorks provides built-in roles and allows you to create custom roles based on your business requirements. For more information about roles, see [Overview of users, roles, and permissions](https://help.aliyun.com/document_detail/295463.html).</p>
         */
        @NameInMap("ProjectRoleCode")
        public String projectRoleCode;

        /**
         * <p>The role ID.</p>
         */
        @NameInMap("ProjectRoleId")
        public Integer projectRoleId;

        /**
         * <p>The name of the role.</p>
         * <br>
         * <p>DataWorks provides built-in roles and allows you to create custom roles based on your business requirements. For more information about roles, see [Overview of users, roles, and permissions](https://help.aliyun.com/document_detail/295463.html).</p>
         */
        @NameInMap("ProjectRoleName")
        public String projectRoleName;

        /**
         * <p>The type of the role. Valid values:</p>
         * <br>
         * <p>*   0: SYSTEM, which indicates that the role is a built-in role.</p>
         * <p>*   2: USER_CUSTOM, which indicates that the role is a custom role.</p>
         */
        @NameInMap("ProjectRoleType")
        public String projectRoleType;

        public static ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList self = new ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleCode(String projectRoleCode) {
            this.projectRoleCode = projectRoleCode;
            return this;
        }
        public String getProjectRoleCode() {
            return this.projectRoleCode;
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleId(Integer projectRoleId) {
            this.projectRoleId = projectRoleId;
            return this;
        }
        public Integer getProjectRoleId() {
            return this.projectRoleId;
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleName(String projectRoleName) {
            this.projectRoleName = projectRoleName;
            return this;
        }
        public String getProjectRoleName() {
            return this.projectRoleName;
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleType(String projectRoleType) {
            this.projectRoleType = projectRoleType;
            return this;
        }
        public String getProjectRoleType() {
            return this.projectRoleType;
        }

    }

    public static class ListProjectMembersResponseBodyDataProjectMemberList extends TeaModel {
        /**
         * <p>The nickname of the member.</p>
         */
        @NameInMap("Nick")
        public String nick;

        /**
         * <p>The member ID.</p>
         */
        @NameInMap("ProjectMemberId")
        public String projectMemberId;

        /**
         * <p>The name of the member.</p>
         */
        @NameInMap("ProjectMemberName")
        public String projectMemberName;

        /**
         * <p>The type of the member. Valid values:</p>
         * <br>
         * <p>*   1: USER_ALIYUN, which indicates that the member is an Alibaba Cloud account.</p>
         * <p>*   5: USER_UBACCOUNT, which indicates that the member is a RAM user.</p>
         * <p>*   6: USER_STS_ROLE, which indicates that the member is a RAM role.</p>
         */
        @NameInMap("ProjectMemberType")
        public String projectMemberType;

        /**
         * <p>The roles that are assigned to the member.</p>
         */
        @NameInMap("ProjectRoleList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList> projectRoleList;

        /**
         * <p>The status of the member. Valid values:</p>
         * <br>
         * <p>*   0: NORMAL, which indicates that the member is in a normal state.</p>
         * <p>*   1: FORBIDDEN, which indicates that the member is disabled.</p>
         * <p>*   2: DELETED, which indicates that the member is deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListProjectMembersResponseBodyDataProjectMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyDataProjectMemberList self = new ListProjectMembersResponseBodyDataProjectMemberList();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setProjectMemberId(String projectMemberId) {
            this.projectMemberId = projectMemberId;
            return this;
        }
        public String getProjectMemberId() {
            return this.projectMemberId;
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setProjectMemberName(String projectMemberName) {
            this.projectMemberName = projectMemberName;
            return this;
        }
        public String getProjectMemberName() {
            return this.projectMemberName;
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setProjectMemberType(String projectMemberType) {
            this.projectMemberType = projectMemberType;
            return this;
        }
        public String getProjectMemberType() {
            return this.projectMemberType;
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setProjectRoleList(java.util.List<ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList> projectRoleList) {
            this.projectRoleList = projectRoleList;
            return this;
        }
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList> getProjectRoleList() {
            return this.projectRoleList;
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListProjectMembersResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The information of members in the DataWorks workspace.</p>
         */
        @NameInMap("ProjectMemberList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> projectMemberList;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectMembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyData self = new ListProjectMembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectMembersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectMembersResponseBodyData setProjectMemberList(java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> projectMemberList) {
            this.projectMemberList = projectMemberList;
            return this;
        }
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> getProjectMemberList() {
            return this.projectMemberList;
        }

        public ListProjectMembersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
