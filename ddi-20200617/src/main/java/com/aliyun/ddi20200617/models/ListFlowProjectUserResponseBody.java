// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowProjectUserResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Users")
    public ListFlowProjectUserResponseBodyUsers users;

    public static ListFlowProjectUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectUserResponseBody self = new ListFlowProjectUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectUserResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowProjectUserResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowProjectUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowProjectUserResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListFlowProjectUserResponseBody setUsers(ListFlowProjectUserResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListFlowProjectUserResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListFlowProjectUserResponseBodyUsersUser extends TeaModel {
        @NameInMap("AccountUserId")
        public String accountUserId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("UserName")
        public String userName;

        public static ListFlowProjectUserResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectUserResponseBodyUsersUser self = new ListFlowProjectUserResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectUserResponseBodyUsersUser setAccountUserId(String accountUserId) {
            this.accountUserId = accountUserId;
            return this;
        }
        public String getAccountUserId() {
            return this.accountUserId;
        }

        public ListFlowProjectUserResponseBodyUsersUser setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowProjectUserResponseBodyUsersUser setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowProjectUserResponseBodyUsersUser setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListFlowProjectUserResponseBodyUsersUser setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowProjectUserResponseBodyUsersUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListFlowProjectUserResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListFlowProjectUserResponseBodyUsersUser> user;

        public static ListFlowProjectUserResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectUserResponseBodyUsers self = new ListFlowProjectUserResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectUserResponseBodyUsers setUser(java.util.List<ListFlowProjectUserResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListFlowProjectUserResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
