// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CheckUserAuthToMsceneResponseBody extends TeaModel {
    @NameInMap("MpaasUserAuthCheckResponse")
    public CheckUserAuthToMsceneResponseBodyMpaasUserAuthCheckResponse mpaasUserAuthCheckResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckUserAuthToMsceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserAuthToMsceneResponseBody self = new CheckUserAuthToMsceneResponseBody();
        return TeaModel.build(map, self);
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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
