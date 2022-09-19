// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListUnauthorizedUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Users")
    public java.util.List<ListUnauthorizedUsersResponseBodyUsers> users;

    public static ListUnauthorizedUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnauthorizedUsersResponseBody self = new ListUnauthorizedUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnauthorizedUsersResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListUnauthorizedUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUnauthorizedUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUnauthorizedUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUnauthorizedUsersResponseBody setUsers(java.util.List<ListUnauthorizedUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUnauthorizedUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUnauthorizedUsersResponseBodyUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserRole")
        public String userRole;

        public static ListUnauthorizedUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUnauthorizedUsersResponseBodyUsers self = new ListUnauthorizedUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUnauthorizedUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUnauthorizedUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListUnauthorizedUsersResponseBodyUsers setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }
        public String getUserRole() {
            return this.userRole;
        }

    }

}
