// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListProjectMembersResponseBodyData data;

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
        @NameInMap("ProjectRoleCode")
        public String projectRoleCode;

        @NameInMap("ProjectRoleId")
        public Integer projectRoleId;

        @NameInMap("ProjectRoleName")
        public String projectRoleName;

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
        @NameInMap("Nick")
        public String nick;

        @NameInMap("ProjectMemberId")
        public String projectMemberId;

        @NameInMap("ProjectMemberName")
        public String projectMemberName;

        @NameInMap("ProjectMemberType")
        public String projectMemberType;

        @NameInMap("ProjectRoleList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberListProjectRoleList> projectRoleList;

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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ProjectMemberList")
        public java.util.List<ListProjectMembersResponseBodyDataProjectMemberList> projectMemberList;

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
