// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class VerifyBankElementResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public VerifyBankElementResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static VerifyBankElementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyBankElementResponseBody self = new VerifyBankElementResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyBankElementResponseBody setResultObject(VerifyBankElementResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VerifyBankElementResponseBodyResultObject getResultObject() {
        return this.resultObject;
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

    public VerifyBankElementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class VerifyBankElementResponseBodyResultObject extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("Passed")
        public String passed;

        public static VerifyBankElementResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VerifyBankElementResponseBodyResultObject self = new VerifyBankElementResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VerifyBankElementResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public VerifyBankElementResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public VerifyBankElementResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public VerifyBankElementResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
