// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("BizCode")
        public String bizCode;

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
