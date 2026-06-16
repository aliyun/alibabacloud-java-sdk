// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class KeepaliveIntlResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public KeepaliveIntlResponseBodyResult result;

    public static KeepaliveIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KeepaliveIntlResponseBody self = new KeepaliveIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public KeepaliveIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public KeepaliveIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public KeepaliveIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KeepaliveIntlResponseBody setResult(KeepaliveIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public KeepaliveIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class KeepaliveIntlResponseBodyResult extends TeaModel {
        /**
         * <p>The returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Result")
        public String result;

        public static KeepaliveIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            KeepaliveIntlResponseBodyResult self = new KeepaliveIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public KeepaliveIntlResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
