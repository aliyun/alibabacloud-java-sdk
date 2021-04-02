// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListProjectMembersResponseData data;

    public static ListProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponse self = new ListProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectMembersResponse setData(ListProjectMembersResponseData data) {
        this.data = data;
        return this;
    }
    public ListProjectMembersResponseData getData() {
        return this.data;
    }

    public static class ListProjectMembersResponseDataProjectMemberListProjectRoleList extends TeaModel {
        @NameInMap("ProjectRoleCode")
        @Validation(required = true)
        public String projectRoleCode;

        @NameInMap("ProjectRoleId")
        @Validation(required = true)
        public Integer projectRoleId;

        @NameInMap("ProjectRoleName")
        @Validation(required = true)
        public String projectRoleName;

        @NameInMap("ProjectRoleType")
        @Validation(required = true)
        public String projectRoleType;

        public static ListProjectMembersResponseDataProjectMemberListProjectRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseDataProjectMemberListProjectRoleList self = new ListProjectMembersResponseDataProjectMemberListProjectRoleList();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseDataProjectMemberListProjectRoleList setProjectRoleCode(String projectRoleCode) {
            this.projectRoleCode = projectRoleCode;
            return this;
        }
        public String getProjectRoleCode() {
            return this.projectRoleCode;
        }

        public ListProjectMembersResponseDataProjectMemberListProjectRoleList setProjectRoleId(Integer projectRoleId) {
            this.projectRoleId = projectRoleId;
            return this;
        }
        public Integer getProjectRoleId() {
            return this.projectRoleId;
        }

        public ListProjectMembersResponseDataProjectMemberListProjectRoleList setProjectRoleName(String projectRoleName) {
            this.projectRoleName = projectRoleName;
            return this;
        }
        public String getProjectRoleName() {
            return this.projectRoleName;
        }

        public ListProjectMembersResponseDataProjectMemberListProjectRoleList setProjectRoleType(String projectRoleType) {
            this.projectRoleType = projectRoleType;
            return this;
        }
        public String getProjectRoleType() {
            return this.projectRoleType;
        }

    }

    public static class ListProjectMembersResponseDataProjectMemberList extends TeaModel {
        @NameInMap("Nick")
        @Validation(required = true)
        public String nick;

        @NameInMap("ProjectMemberId")
        @Validation(required = true)
        public String projectMemberId;

        @NameInMap("ProjectMemberName")
        @Validation(required = true)
        public String projectMemberName;

        @NameInMap("ProjectMemberType")
        @Validation(required = true)
        public String projectMemberType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProjectRoleList")
        @Validation(required = true)
        public java.util.List<ListProjectMembersResponseDataProjectMemberListProjectRoleList> projectRoleList;

        public static ListProjectMembersResponseDataProjectMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseDataProjectMemberList self = new ListProjectMembersResponseDataProjectMemberList();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseDataProjectMemberList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListProjectMembersResponseDataProjectMemberList setProjectMemberId(String projectMemberId) {
            this.projectMemberId = projectMemberId;
            return this;
        }
        public String getProjectMemberId() {
            return this.projectMemberId;
        }

        public ListProjectMembersResponseDataProjectMemberList setProjectMemberName(String projectMemberName) {
            this.projectMemberName = projectMemberName;
            return this;
        }
        public String getProjectMemberName() {
            return this.projectMemberName;
        }

        public ListProjectMembersResponseDataProjectMemberList setProjectMemberType(String projectMemberType) {
            this.projectMemberType = projectMemberType;
            return this;
        }
        public String getProjectMemberType() {
            return this.projectMemberType;
        }

        public ListProjectMembersResponseDataProjectMemberList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectMembersResponseDataProjectMemberList setProjectRoleList(java.util.List<ListProjectMembersResponseDataProjectMemberListProjectRoleList> projectRoleList) {
            this.projectRoleList = projectRoleList;
            return this;
        }
        public java.util.List<ListProjectMembersResponseDataProjectMemberListProjectRoleList> getProjectRoleList() {
            return this.projectRoleList;
        }

    }

    public static class ListProjectMembersResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("ProjectMemberList")
        @Validation(required = true)
        public java.util.List<ListProjectMembersResponseDataProjectMemberList> projectMemberList;

        public static ListProjectMembersResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseData self = new ListProjectMembersResponseData();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectMembersResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectMembersResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListProjectMembersResponseData setProjectMemberList(java.util.List<ListProjectMembersResponseDataProjectMemberList> projectMemberList) {
            this.projectMemberList = projectMemberList;
            return this;
        }
        public java.util.List<ListProjectMembersResponseDataProjectMemberList> getProjectMemberList() {
            return this.projectMemberList;
        }

    }

}
