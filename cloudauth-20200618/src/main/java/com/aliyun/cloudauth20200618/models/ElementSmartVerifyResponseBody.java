// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ElementSmartVerifyResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public ElementSmartVerifyResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static ElementSmartVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ElementSmartVerifyResponseBody self = new ElementSmartVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ElementSmartVerifyResponseBody setResultObject(ElementSmartVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ElementSmartVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public ElementSmartVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ElementSmartVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ElementSmartVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ElementSmartVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("Passed")
        public String passed;

        public static ElementSmartVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ElementSmartVerifyResponseBodyResultObject self = new ElementSmartVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ElementSmartVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public ElementSmartVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public ElementSmartVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public ElementSmartVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
