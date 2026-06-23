// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetAuthTokenToMsenceResponseBody extends TeaModel {
    @NameInMap("MpaasSystemOauthTokenResponse")
    public GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse mpaasSystemOauthTokenResponse;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static GetAuthTokenToMsenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenToMsenceResponseBody self = new GetAuthTokenToMsenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenToMsenceResponseBody setMpaasSystemOauthTokenResponse(GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse mpaasSystemOauthTokenResponse) {
        this.mpaasSystemOauthTokenResponse = mpaasSystemOauthTokenResponse;
        return this;
    }
    public GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse getMpaasSystemOauthTokenResponse() {
        return this.mpaasSystemOauthTokenResponse;
    }

    public GetAuthTokenToMsenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthTokenToMsenceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAuthTokenToMsenceResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAuthTokenToMsenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse extends TeaModel {
        @NameInMap("AuthToken")
        public String authToken;

        @NameInMap("ExpiresIn")
        public String expiresIn;

        @NameInMap("OpenId")
        public String openId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("UserId")
        public String userId;

        public static GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse self = new GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse();
            return TeaModel.build(map, self);
        }

        public GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse setExpiresIn(String expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public String getExpiresIn() {
            return this.expiresIn;
        }

        public GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse setOpenId(String openId) {
            this.openId = openId;
            return this;
        }
        public String getOpenId() {
            return this.openId;
        }

        public GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetAuthTokenToMsenceResponseBodyMpaasSystemOauthTokenResponse setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
