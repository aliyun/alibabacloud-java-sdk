// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public VerifyDeviceResponseBodyResultObject resultObject;

    public static VerifyDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceResponseBody self = new VerifyDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyDeviceResponseBody setResultObject(VerifyDeviceResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VerifyDeviceResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VerifyDeviceResponseBodyResultObject extends TeaModel {
        @NameInMap("ExtParams")
        public String extParams;

        @NameInMap("HasNext")
        public String hasNext;

        @NameInMap("ProductRetCode")
        public String productRetCode;

        @NameInMap("RetCodeSub")
        public String retCodeSub;

        @NameInMap("RetMessageSub")
        public String retMessageSub;

        @NameInMap("ValidationRetCode")
        public String validationRetCode;

        public static VerifyDeviceResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VerifyDeviceResponseBodyResultObject self = new VerifyDeviceResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VerifyDeviceResponseBodyResultObject setExtParams(String extParams) {
            this.extParams = extParams;
            return this;
        }
        public String getExtParams() {
            return this.extParams;
        }

        public VerifyDeviceResponseBodyResultObject setHasNext(String hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public String getHasNext() {
            return this.hasNext;
        }

        public VerifyDeviceResponseBodyResultObject setProductRetCode(String productRetCode) {
            this.productRetCode = productRetCode;
            return this;
        }
        public String getProductRetCode() {
            return this.productRetCode;
        }

        public VerifyDeviceResponseBodyResultObject setRetCodeSub(String retCodeSub) {
            this.retCodeSub = retCodeSub;
            return this;
        }
        public String getRetCodeSub() {
            return this.retCodeSub;
        }

        public VerifyDeviceResponseBodyResultObject setRetMessageSub(String retMessageSub) {
            this.retMessageSub = retMessageSub;
            return this;
        }
        public String getRetMessageSub() {
            return this.retMessageSub;
        }

        public VerifyDeviceResponseBodyResultObject setValidationRetCode(String validationRetCode) {
            this.validationRetCode = validationRetCode;
            return this;
        }
        public String getValidationRetCode() {
            return this.validationRetCode;
        }

    }

}
