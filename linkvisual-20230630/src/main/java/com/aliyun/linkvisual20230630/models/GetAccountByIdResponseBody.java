// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetAccountByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAccountByIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAccountByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountByIdResponseBody self = new GetAccountByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountByIdResponseBody setData(GetAccountByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccountByIdResponseBodyData getData() {
        return this.data;
    }

    public GetAccountByIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAccountByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountByIdResponseBodyData extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("IdentityId")
        public String identityId;

        @NameInMap("LastLoginTime")
        public Long lastLoginTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Phone")
        public String phone;

        public static GetAccountByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountByIdResponseBodyData self = new GetAccountByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccountByIdResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetAccountByIdResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAccountByIdResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetAccountByIdResponseBodyData setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

        public GetAccountByIdResponseBodyData setLastLoginTime(Long lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public Long getLastLoginTime() {
            return this.lastLoginTime;
        }

        public GetAccountByIdResponseBodyData setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetAccountByIdResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetAccountByIdResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
