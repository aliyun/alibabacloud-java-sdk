// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class VerifyBankElementResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public VerifyBankElementResponseBodyResultObject resultObject;

    public static VerifyBankElementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyBankElementResponseBody self = new VerifyBankElementResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyBankElementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyBankElementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyBankElementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyBankElementResponseBody setResultObject(VerifyBankElementResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VerifyBankElementResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VerifyBankElementResponseBodyResultObject extends TeaModel {
        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("SubCode")
        public String subCode;

        public static VerifyBankElementResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VerifyBankElementResponseBodyResultObject self = new VerifyBankElementResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VerifyBankElementResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public VerifyBankElementResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public VerifyBankElementResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public VerifyBankElementResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
