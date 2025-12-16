// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitAuthVerifyResponseBody extends TeaModel {
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
     * <strong>example:</strong>
     * <p>B506328A-D84B-4750-82C7-6A207C585CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public InitAuthVerifyResponseBodyResult result;

    public static InitAuthVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitAuthVerifyResponseBody self = new InitAuthVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public InitAuthVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitAuthVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitAuthVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitAuthVerifyResponseBody setResult(InitAuthVerifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public InitAuthVerifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class InitAuthVerifyResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>shif9d1a185b8dde7cd07bf0943a448b</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        public static InitAuthVerifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            InitAuthVerifyResponseBodyResult self = new InitAuthVerifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public InitAuthVerifyResponseBodyResult setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
