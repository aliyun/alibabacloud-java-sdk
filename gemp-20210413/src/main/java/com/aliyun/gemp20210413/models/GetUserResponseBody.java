// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 用户
    @NameInMap("data")
    public GetUserResponseBodyData data;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setData(GetUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserResponseBodyData getData() {
        return this.data;
    }

    public static class GetUserResponseBodyData extends TeaModel {
        // 用户ID
        @NameInMap("userId")
        public Long userId;

        // ramId
        @NameInMap("ramId")
        public String ramId;

        // 是否当前用户
        @NameInMap("isEditableUser")
        public Boolean isEditableUser;

        // CUSTOMER:主账号，SUB:子账号
        @NameInMap("accountType")
        public String accountType;

        // email
        @NameInMap("email")
        public String email;

        // 用户昵称
        @NameInMap("username")
        public String username;

        // 用户手机号
        @NameInMap("phone")
        public String phone;

        public static GetUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyData self = new GetUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyData setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public GetUserResponseBodyData setIsEditableUser(Boolean isEditableUser) {
            this.isEditableUser = isEditableUser;
            return this;
        }
        public Boolean getIsEditableUser() {
            return this.isEditableUser;
        }

        public GetUserResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetUserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetUserResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
