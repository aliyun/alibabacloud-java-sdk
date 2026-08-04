// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class FindUserlistToAuthLoginWithPhoneNumberResponseBody extends TeaModel {
    /**
     * <p>Response code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>When the code is 5140003, it indicates that the invocation failed because no account list eligible for authorization login was found for the given phone number. The frontend can prompt the user to confirm generating a Jingle account via the phone number or suggest registering a Taobao account using the phone number first. In subsequent flows, the frontend must return the sessionId from DataObj to the server.</p>
     */
    @NameInMap("DataObj")
    public FindUserlistToAuthLoginWithPhoneNumberResponseBodyDataObj dataObj;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Response Result</p>
     */
    @NameInMap("Result")
    public FindUserlistToAuthLoginWithPhoneNumberResponseBodyResult result;

    /**
     * <p>Flag indicating whether the invocation succeeded</p>
     */
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
        /**
         * <p>Session ID</p>
         * 
         * <strong>example:</strong>
         * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
         */
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
        /**
         * <p>Profile picture</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <p>Encrypted User Identifier</p>
         * 
         * <strong>example:</strong>
         * <p>KsVgypxAipf+xNECMZV2ONMcheqiIoEGFvgx+T8s1oV6/euTK9+ImYvLVPsSqFDh</p>
         */
        @NameInMap("EncryptedUserIdentifier")
        public String encryptedUserIdentifier;

        /**
         * <p>User Search Type  </p>
         * <p>For Taobao users, the value is fixed as:<br>PHONE_NUMBER_BINDING_WITH_TAOBAO: The phoneNumber is queried as the phone number bound to a Taobao account.  </p>
         * <p>For Tmall Genie users, the value can be:<br>PHONE_NUMBER_BINDING_WITH_ALIGENIE: The phoneNumber is queried as the phone number bound to a Tmall Genie device;<br>PHONE_NUMBER_BINDING_WITH_TAOBAO: The phoneNumber is queried as the phone number bound to a Taobao account.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE_NUMBER_BINDING_WITH_ALIGENIE：phoneNumber</p>
         */
        @NameInMap("FindingType")
        public String findingType;

        /**
         * <p>Nickname</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>User Type<br>TAOBAO: Taobao user<br>ALIGENIE: Tmall Genie user</p>
         * 
         * <strong>example:</strong>
         * <p>ALIGENIE</p>
         */
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
        /**
         * <p>List of accounts eligible for authorization login</p>
         */
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
