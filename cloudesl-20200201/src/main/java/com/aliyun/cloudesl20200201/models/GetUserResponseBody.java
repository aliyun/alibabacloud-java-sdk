// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("User")
    public GetUserResponseBodyUser user;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetUserResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetUserResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserResponseBodyUserDingTalkInfos extends TeaModel {
        @NameInMap("DingTalkCompanyId")
        public String dingTalkCompanyId;

        @NameInMap("DingTalkUserId")
        public String dingTalkUserId;

        public static GetUserResponseBodyUserDingTalkInfos build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserDingTalkInfos self = new GetUserResponseBodyUserDingTalkInfos();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserDingTalkInfos setDingTalkCompanyId(String dingTalkCompanyId) {
            this.dingTalkCompanyId = dingTalkCompanyId;
            return this;
        }
        public String getDingTalkCompanyId() {
            return this.dingTalkCompanyId;
        }

        public GetUserResponseBodyUserDingTalkInfos setDingTalkUserId(String dingTalkUserId) {
            this.dingTalkUserId = dingTalkUserId;
            return this;
        }
        public String getDingTalkUserId() {
            return this.dingTalkUserId;
        }

    }

    public static class GetUserResponseBodyUser extends TeaModel {
        @NameInMap("Bid")
        public String bid;

        @NameInMap("DingTalkInfos")
        public java.util.List<GetUserResponseBodyUserDingTalkInfos> dingTalkInfos;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Stores")
        public String stores;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserType")
        public String userType;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public GetUserResponseBodyUser setDingTalkInfos(java.util.List<GetUserResponseBodyUserDingTalkInfos> dingTalkInfos) {
            this.dingTalkInfos = dingTalkInfos;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserDingTalkInfos> getDingTalkInfos() {
            return this.dingTalkInfos;
        }

        public GetUserResponseBodyUser setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetUserResponseBodyUser setStores(String stores) {
            this.stores = stores;
            return this;
        }
        public String getStores() {
            return this.stores;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetUserResponseBodyUser setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
