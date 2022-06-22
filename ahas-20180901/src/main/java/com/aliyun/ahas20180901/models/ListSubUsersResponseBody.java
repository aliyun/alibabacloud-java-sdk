// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSubUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSubUsersResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSubUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubUsersResponseBody self = new ListSubUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubUsersResponseBody setData(java.util.List<ListSubUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubUsersResponseBodyData> getData() {
        return this.data;
    }

    public ListSubUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubUsersResponseBodyData extends TeaModel {
        @NameInMap("comments")
        public String comments;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("email")
        public String email;

        @NameInMap("mobilePhone")
        public String mobilePhone;

        @NameInMap("userId")
        public String userId;

        @NameInMap("userName")
        public String userName;

        public static ListSubUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubUsersResponseBodyData self = new ListSubUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubUsersResponseBodyData setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListSubUsersResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSubUsersResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListSubUsersResponseBodyData setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ListSubUsersResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListSubUsersResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
