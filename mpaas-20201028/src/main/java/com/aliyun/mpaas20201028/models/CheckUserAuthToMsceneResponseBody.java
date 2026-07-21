// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CheckUserAuthToMsceneResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("MpaasUserAuthCheckResponse")
    public CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse mpaasUserAuthCheckResponse;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static CheckUserAuthToMsceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserAuthToMsceneResponseBody self = new CheckUserAuthToMsceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserAuthToMsceneResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckUserAuthToMsceneResponseBody setMpaasUserAuthCheckResponse(CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse mpaasUserAuthCheckResponse) {
        this.mpaasUserAuthCheckResponse = mpaasUserAuthCheckResponse;
        return this;
    }
    public CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse getMpaasUserAuthCheckResponse() {
        return this.mpaasUserAuthCheckResponse;
    }

    public CheckUserAuthToMsceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUserAuthToMsceneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckUserAuthToMsceneResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckUserAuthToMsceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse extends TeaModel {
        @NameInMap("Matched")
        public Boolean matched;

        public static CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
            CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse self = new CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse();
            return TeaModel.build(map, self);
        }

        public CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse setMatched(Boolean matched) {
            this.matched = matched;
            return this;
        }
        public Boolean getMatched() {
            return this.matched;
        }

    }

}
