// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.captcha20230305.models;

import com.aliyun.tea.*;

public class VerifyCaptchaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public VerifyCaptchaResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static VerifyCaptchaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCaptchaResponseBody self = new VerifyCaptchaResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCaptchaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyCaptchaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyCaptchaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyCaptchaResponseBody setResult(VerifyCaptchaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public VerifyCaptchaResponseBodyResult getResult() {
        return this.result;
    }

    public VerifyCaptchaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyCaptchaResponseBodyResult extends TeaModel {
        @NameInMap("VerifyResult")
        public Boolean verifyResult;

        public static VerifyCaptchaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyCaptchaResponseBodyResult self = new VerifyCaptchaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public VerifyCaptchaResponseBodyResult setVerifyResult(Boolean verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

    }

}
