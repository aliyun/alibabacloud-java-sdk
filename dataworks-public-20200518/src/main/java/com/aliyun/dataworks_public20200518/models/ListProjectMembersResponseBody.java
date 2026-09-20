// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public ListProjectMembersResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
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
         * <p>The role code. DataWorks provides preset roles. You can also create custom roles based on your business requirements. For more information about roles, see <a href="https://help.aliyun.com/document_detail/295463.html">Overview of users, roles, and permissions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        @NameInMap("ProjectRoleCode")
        public String projectRoleCode;

        /**
         * <p>The role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProjectRoleId")
        public Integer projectRoleId;

        /**
         * <p>The name of the role. DataWorks provides preset roles. You can also create custom roles based on your business requirements. For more information about roles, see <a href="https://help.aliyun.com/document_detail/295463.html">Overview of users, roles, and permissions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Visitor</p>
         */
        @NameInMap("ProjectRoleName")
        public String projectRoleName;

        /**
         * <p>The type of the role. Valid values:</p>
         * <ul>
         * <li><p>SYSTEM (0): system role.</p>
         * </li>
         * <li><p>USER_CUSTOM (2): custom role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The nickname of the workspace member.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Nick")
        public String nick;

        /**
         * <p>The user ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>121</p>
         */
        @NameInMap("ProjectMemberId")
        public String projectMemberId;

        /**
         * <p>The name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("ProjectMemberName")
        public String projectMemberName;

        /**
         * <p>The type of the member. Valid values:</p>
         * <ul>
         * <li>1: Alibaba Cloud account (USER_ALIYUN).</li>
         * <li>5: RAM user (USER_UBACCOUNT).</li>
         * <li>6: RAM role (USER_STS_ROLE).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProjectMemberType")
        public String projectMemberType;

        /**
         * <p>The list of roles assigned to the member.</p>
         */
        @NameInMap("ProjectRoleList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList> projectRoleList;

        /**
         * <p>The query status. Valid values:</p>
         * <ul>
         * <li>0: Normal (NORMAL).</li>
         * <li>1: Disabled (FORBIDDEN).</li>
         * <li>2: Deleted (DELETED).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of workspace members.</p>
         */
        @NameInMap("ProjectMemberList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> projectMemberList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
