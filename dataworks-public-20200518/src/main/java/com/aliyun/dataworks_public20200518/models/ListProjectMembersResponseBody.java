// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
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
         * <p>The code of the role. DataWorks provides built-in roles and allows you to create custom roles based on your business requirements. For more information about roles, see <a href="https://help.aliyun.com/document_detail/295463.html">Overview of users, roles, and permissions</a>.</p>
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
         * <p>The name of the role. DataWorks provides built-in roles and allows you to create custom roles based on your business requirements. For more information about roles, see <a href="https://help.aliyun.com/document_detail/295463.html">Overview of users, roles, and permissions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectRoleName")
        public String projectRoleName;

        /**
         * <p>The type of the role. Valid values:</p>
         * <ul>
         * <li>0: SYSTEM, which indicates that the role is a built-in role.</li>
         * <li>2: USER_CUSTOM, which indicates that the role is a custom role.</li>
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
         * <p>The nickname of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Nick")
        public String nick;

        /**
         * <p>The member ID.</p>
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
         * <p>zhangsan</p>
         */
        @NameInMap("ProjectMemberName")
        public String projectMemberName;

        /**
         * <p>The type of the member. Valid values:</p>
         * <ul>
         * <li>1: USER_ALIYUN, which indicates that the member is an Alibaba Cloud account.</li>
         * <li>5: USER_UBACCOUNT, which indicates that the member is a RAM user.</li>
         * <li>6: USER_STS_ROLE, which indicates that the member is a RAM role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <ul>
         * <li>0: NORMAL, which indicates that the member is in a normal state.</li>
         * <li>1: FORBIDDEN, which indicates that the member is disabled.</li>
         * <li>2: DELETED, which indicates that the member is deleted.</li>
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
         * <p>The page number.</p>
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
         * <p>The information about members in the DataWorks workspace.</p>
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
