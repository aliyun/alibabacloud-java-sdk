// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyIntlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
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
     * <p>7B97D932-7FF5-517D-BF39-7CA1BEE3CDD9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Id2MetaPeriodVerifyIntlResponseBodyResult result;

    public static Id2MetaPeriodVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaPeriodVerifyIntlResponseBody self = new Id2MetaPeriodVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public Id2MetaPeriodVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Id2MetaPeriodVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Id2MetaPeriodVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Id2MetaPeriodVerifyIntlResponseBody setResult(Id2MetaPeriodVerifyIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public Id2MetaPeriodVerifyIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class Id2MetaPeriodVerifyIntlResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static Id2MetaPeriodVerifyIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            Id2MetaPeriodVerifyIntlResponseBodyResult self = new Id2MetaPeriodVerifyIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public Id2MetaPeriodVerifyIntlResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public Id2MetaPeriodVerifyIntlResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
