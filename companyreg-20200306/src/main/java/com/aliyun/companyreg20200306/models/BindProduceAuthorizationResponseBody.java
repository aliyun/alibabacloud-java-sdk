// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class BindProduceAuthorizationResponseBody extends TeaModel {
    @NameInMap("Data")
    public BindProduceAuthorizationResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    public static BindProduceAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindProduceAuthorizationResponseBody self = new BindProduceAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public BindProduceAuthorizationResponseBody setData(BindProduceAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindProduceAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public BindProduceAuthorizationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BindProduceAuthorizationResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BindProduceAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BindProduceAuthorizationResponseBodyDataAuthorizedUserList extends TeaModel {
        @NameInMap("AccountValidType")
        public Integer accountValidType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static BindProduceAuthorizationResponseBodyDataAuthorizedUserList build(java.util.Map<String, ?> map) throws Exception {
            BindProduceAuthorizationResponseBodyDataAuthorizedUserList self = new BindProduceAuthorizationResponseBodyDataAuthorizedUserList();
            return TeaModel.build(map, self);
        }

        public BindProduceAuthorizationResponseBodyDataAuthorizedUserList setAccountValidType(Integer accountValidType) {
            this.accountValidType = accountValidType;
            return this;
        }
        public Integer getAccountValidType() {
            return this.accountValidType;
        }

        public BindProduceAuthorizationResponseBodyDataAuthorizedUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public BindProduceAuthorizationResponseBodyDataAuthorizedUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class BindProduceAuthorizationResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedUserList")
        public java.util.List<BindProduceAuthorizationResponseBodyDataAuthorizedUserList> authorizedUserList;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static BindProduceAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindProduceAuthorizationResponseBodyData self = new BindProduceAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindProduceAuthorizationResponseBodyData setAuthorizedUserList(java.util.List<BindProduceAuthorizationResponseBodyDataAuthorizedUserList> authorizedUserList) {
            this.authorizedUserList = authorizedUserList;
            return this;
        }
        public java.util.List<BindProduceAuthorizationResponseBodyDataAuthorizedUserList> getAuthorizedUserList() {
            return this.authorizedUserList;
        }

        public BindProduceAuthorizationResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BindProduceAuthorizationResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
