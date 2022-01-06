// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Users")
    public java.util.List<GetUsersResponseBodyUsers> users;

    public static GetUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUsersResponseBody self = new GetUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUsersResponseBody setUsers(java.util.List<GetUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<GetUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class GetUsersResponseBodyUsers extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static GetUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            GetUsersResponseBodyUsers self = new GetUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public GetUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUsersResponseBodyUsers setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public GetUsersResponseBodyUsers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
