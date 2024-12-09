// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.captcha20230305.models;

import com.aliyun.tea.*;

public class VerifyIntelligentCaptchaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>95784F***D39FDC5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public VerifyIntelligentCaptchaResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VerifyIntelligentCaptchaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyIntelligentCaptchaResponseBody self = new VerifyIntelligentCaptchaResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyIntelligentCaptchaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyIntelligentCaptchaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyIntelligentCaptchaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyIntelligentCaptchaResponseBody setResult(VerifyIntelligentCaptchaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public VerifyIntelligentCaptchaResponseBodyResult getResult() {
        return this.result;
    }

    public VerifyIntelligentCaptchaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyIntelligentCaptchaResponseBodyResult extends TeaModel {
        @NameInMap("VerifyCode")
        public String verifyCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VerifyResult")
        public Boolean verifyResult;

        public static VerifyIntelligentCaptchaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyIntelligentCaptchaResponseBodyResult self = new VerifyIntelligentCaptchaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public VerifyIntelligentCaptchaResponseBodyResult setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }
        public String getVerifyCode() {
            return this.verifyCode;
        }

        public VerifyIntelligentCaptchaResponseBodyResult setVerifyResult(Boolean verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

    }

}
