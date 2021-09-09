// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyDeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public VerifyDeviceResponseResultObject resultObject;

    public static VerifyDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceResponse self = new VerifyDeviceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyDeviceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyDeviceResponse setResultObject(VerifyDeviceResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VerifyDeviceResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VerifyDeviceResponseResultObject extends TeaModel {
        @NameInMap("ValidationRetCode")
        @Validation(required = true)
        public String validationRetCode;

        @NameInMap("ProductRetCode")
        @Validation(required = true)
        public String productRetCode;

        @NameInMap("RetCodeSub")
        @Validation(required = true)
        public String retCodeSub;

        @NameInMap("RetMessageSub")
        @Validation(required = true)
        public String retMessageSub;

        @NameInMap("HasNext")
        @Validation(required = true)
        public String hasNext;

        @NameInMap("ExtParams")
        @Validation(required = true)
        public String extParams;

        public static VerifyDeviceResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            VerifyDeviceResponseResultObject self = new VerifyDeviceResponseResultObject();
            return TeaModel.build(map, self);
        }

        public VerifyDeviceResponseResultObject setValidationRetCode(String validationRetCode) {
            this.validationRetCode = validationRetCode;
            return this;
        }
        public String getValidationRetCode() {
            return this.validationRetCode;
        }

        public VerifyDeviceResponseResultObject setProductRetCode(String productRetCode) {
            this.productRetCode = productRetCode;
            return this;
        }
        public String getProductRetCode() {
            return this.productRetCode;
        }

        public VerifyDeviceResponseResultObject setRetCodeSub(String retCodeSub) {
            this.retCodeSub = retCodeSub;
            return this;
        }
        public String getRetCodeSub() {
            return this.retCodeSub;
        }

        public VerifyDeviceResponseResultObject setRetMessageSub(String retMessageSub) {
            this.retMessageSub = retMessageSub;
            return this;
        }
        public String getRetMessageSub() {
            return this.retMessageSub;
        }

        public VerifyDeviceResponseResultObject setHasNext(String hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public String getHasNext() {
            return this.hasNext;
        }

        public VerifyDeviceResponseResultObject setExtParams(String extParams) {
            this.extParams = extParams;
            return this;
        }
        public String getExtParams() {
            return this.extParams;
        }

    }

}
