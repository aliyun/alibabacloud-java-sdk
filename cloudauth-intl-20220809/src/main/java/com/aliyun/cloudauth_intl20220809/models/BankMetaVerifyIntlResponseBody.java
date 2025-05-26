// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class BankMetaVerifyIntlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public BankMetaVerifyIntlResponseBodyResultObject resultObject;

    public static BankMetaVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyIntlResponseBody self = new BankMetaVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BankMetaVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BankMetaVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BankMetaVerifyIntlResponseBody setResultObject(BankMetaVerifyIntlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public BankMetaVerifyIntlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class BankMetaVerifyIntlResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static BankMetaVerifyIntlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            BankMetaVerifyIntlResponseBodyResultObject self = new BankMetaVerifyIntlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public BankMetaVerifyIntlResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public BankMetaVerifyIntlResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
