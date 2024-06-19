// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyResponseBody extends TeaModel {
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
     * <p>473469C7-A***B-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public BankMetaVerifyResponseBodyResultObject resultObject;

    public static BankMetaVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyResponseBody self = new BankMetaVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BankMetaVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BankMetaVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BankMetaVerifyResponseBody setResultObject(BankMetaVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public BankMetaVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class BankMetaVerifyResponseBodyResultObject extends TeaModel {
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

        public static BankMetaVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            BankMetaVerifyResponseBodyResultObject self = new BankMetaVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public BankMetaVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public BankMetaVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
