// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ElementSmartVerifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public ElementSmartVerifyResponseResultObject resultObject;

    public static ElementSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ElementSmartVerifyResponse self = new ElementSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public ElementSmartVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ElementSmartVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ElementSmartVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ElementSmartVerifyResponse setResultObject(ElementSmartVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ElementSmartVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class ElementSmartVerifyResponseResultObject extends TeaModel {
        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        @NameInMap("SubCode")
        @Validation(required = true)
        public String subCode;

        @NameInMap("MaterialInfo")
        @Validation(required = true)
        public String materialInfo;

        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        public static ElementSmartVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            ElementSmartVerifyResponseResultObject self = new ElementSmartVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public ElementSmartVerifyResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public ElementSmartVerifyResponseResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public ElementSmartVerifyResponseResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public ElementSmartVerifyResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
