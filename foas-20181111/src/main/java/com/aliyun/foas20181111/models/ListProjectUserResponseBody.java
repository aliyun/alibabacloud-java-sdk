// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectUsers")
    public java.util.List<ListProjectUserResponseBodyProjectUsers> projectUsers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListProjectUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectUserResponseBody self = new ListProjectUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectUserResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListProjectUserResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectUserResponseBody setProjectUsers(java.util.List<ListProjectUserResponseBodyProjectUsers> projectUsers) {
        this.projectUsers = projectUsers;
        return this;
    }
    public java.util.List<ListProjectUserResponseBodyProjectUsers> getProjectUsers() {
        return this.projectUsers;
    }

    public ListProjectUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListProjectUserResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListProjectUserResponseBodyProjectUsers extends TeaModel {
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Role")
        public String role;

        @NameInMap("User")
        public String user;

        public static ListProjectUserResponseBodyProjectUsers build(java.util.Map<String, ?> map) throws Exception {
            ListProjectUserResponseBodyProjectUsers self = new ListProjectUserResponseBodyProjectUsers();
            return TeaModel.build(map, self);
        }

        public ListProjectUserResponseBodyProjectUsers setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListProjectUserResponseBodyProjectUsers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListProjectUserResponseBodyProjectUsers setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
