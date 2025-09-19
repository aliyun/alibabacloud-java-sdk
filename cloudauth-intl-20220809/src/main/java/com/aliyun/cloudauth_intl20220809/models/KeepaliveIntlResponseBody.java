// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class KeepaliveIntlResponseBody extends TeaModel {
    /**
     * <p>The <a href="https://www.alibabacloud.com/help/en/ekyc/latest/client-connection-hold?spm=a3c0i.23458820.2359477120.1.48207d3ftEYld2#74d291dfaaxci">return code.</a></p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A detailed description of the Code.</p>
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
     * <p>Return result</p>
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
         * <p>The result of the call.</p>
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
