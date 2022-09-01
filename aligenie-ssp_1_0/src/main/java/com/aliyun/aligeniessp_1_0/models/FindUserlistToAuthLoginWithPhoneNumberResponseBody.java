// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class FindUserlistToAuthLoginWithPhoneNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("DataObj")
    public FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj dataObj;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static FindUserlistToAuthLoginWithPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindUserlistToAuthLoginWithPhoneNumberResponseBody self = new FindUserlistToAuthLoginWithPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponseBody setDataObj(FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj dataObj) {
        this.dataObj = dataObj;
        return this;
    }
    public FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj getDataObj() {
        return this.dataObj;
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponseBody setResult(FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult getResult() {
        return this.result;
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj extends TeaModel {
        @NameInMap("SessionId")
        public String sessionId;

        public static FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj build(java.util.Map<String, ?> map) throws Exception {
            FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj self = new FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj();
            return TeaModel.build(map, self);
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("EncryptedUserIdentifier")
        public String encryptedUserIdentifier;

        @NameInMap("FindingType")
        public String findingType;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("UserType")
        public String userType;

        public static FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin build(java.util.Map<String, ?> map) throws Exception {
            FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin self = new FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin();
            return TeaModel.build(map, self);
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin setEncryptedUserIdentifier(String encryptedUserIdentifier) {
            this.encryptedUserIdentifier = encryptedUserIdentifier;
            return this;
        }
        public String getEncryptedUserIdentifier() {
            return this.encryptedUserIdentifier;
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin setFindingType(String findingType) {
            this.findingType = findingType;
            return this;
        }
        public String getFindingType() {
            return this.findingType;
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult extends TeaModel {
        @NameInMap("UserListToAuthLogin")
        public java.util.List<FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin> userListToAuthLogin;

        public static FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult self = new FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult setUserListToAuthLogin(java.util.List<FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin> userListToAuthLogin) {
            this.userListToAuthLogin = userListToAuthLogin;
            return this;
        }
        public java.util.List<FindUserlistToAuthLoginWithPhoneNumberResponseBodyResultUserListToAuthLogin> getUserListToAuthLogin() {
            return this.userListToAuthLogin;
        }

    }

}
