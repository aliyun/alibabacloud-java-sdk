// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListProjectMembersResponseBodyData data;

    public static ListProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponseBody self = new ListProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectMembersResponseBody setData(ListProjectMembersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectMembersResponseBodyData getData() {
        return this.data;
    }

    public static class ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList extends TeaModel {
        @NameInMap("ProjectRoleId")
        public Integer projectRoleId;

        @NameInMap("ProjectRoleType")
        public String projectRoleType;

        @NameInMap("ProjectRoleName")
        public String projectRoleName;

        @NameInMap("ProjectRoleCode")
        public String projectRoleCode;

        public static ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList self = new ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleId(Integer projectRoleId) {
            this.projectRoleId = projectRoleId;
            return this;
        }
        public Integer getProjectRoleId() {
            return this.projectRoleId;
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleType(String projectRoleType) {
            this.projectRoleType = projectRoleType;
            return this;
        }
        public String getProjectRoleType() {
            return this.projectRoleType;
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleName(String projectRoleName) {
            this.projectRoleName = projectRoleName;
            return this;
        }
        public String getProjectRoleName() {
            return this.projectRoleName;
        }

        public ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList setProjectRoleCode(String projectRoleCode) {
            this.projectRoleCode = projectRoleCode;
            return this;
        }
        public String getProjectRoleCode() {
            return this.projectRoleCode;
        }

    }

    public static class ListProjectMembersResponseBodyDataProjectMemberList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ProjectMemberId")
        public String projectMemberId;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("ProjectMemberName")
        public String projectMemberName;

        @NameInMap("ProjectMemberType")
        public String projectMemberType;

        @NameInMap("ProjectRoleList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList> projectRoleList;

        public static ListProjectMembersResponseBodyDataProjectMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyDataProjectMemberList self = new ListProjectMembersResponseBodyDataProjectMemberList();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setProjectMemberId(String projectMemberId) {
            this.projectMemberId = projectMemberId;
            return this;
        }
        public String getProjectMemberId() {
            return this.projectMemberId;
        }

        public ListProjectMembersResponseBodyDataProjectMemberList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
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

    }

    public static class ListProjectMembersResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ProjectMemberList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> projectMemberList;

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

        public ListProjectMembersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListProjectMembersResponseBodyData setProjectMemberList(java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> projectMemberList) {
            this.projectMemberList = projectMemberList;
            return this;
        }
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> getProjectMemberList() {
            return this.projectMemberList;
        }

    }

}
