// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Users")
    public java.util.List<ListAuthorizedUsersResponseBodyUsers> users;

    public static ListAuthorizedUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersResponseBody self = new ListAuthorizedUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListAuthorizedUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizedUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAuthorizedUsersResponseBody setUsers(java.util.List<ListAuthorizedUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListAuthorizedUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListAuthorizedUsersResponseBodyUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserRole")
        public String userRole;

        public static ListAuthorizedUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedUsersResponseBodyUsers self = new ListAuthorizedUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAuthorizedUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListAuthorizedUsersResponseBodyUsers setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }
        public String getUserRole() {
            return this.userRole;
        }

    }

}
