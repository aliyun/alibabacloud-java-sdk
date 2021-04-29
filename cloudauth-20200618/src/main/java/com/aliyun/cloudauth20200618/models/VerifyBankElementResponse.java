// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class VerifyBankElementResponse extends TeaModel {
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
    public VerifyBankElementResponseResultObject resultObject;

    public static VerifyBankElementResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyBankElementResponse self = new VerifyBankElementResponse();
        return TeaModel.build(map, self);
    }

    public VerifyBankElementResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyBankElementResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyBankElementResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyBankElementResponse setResultObject(VerifyBankElementResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VerifyBankElementResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VerifyBankElementResponseResultObject extends TeaModel {
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

        public static VerifyBankElementResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            VerifyBankElementResponseResultObject self = new VerifyBankElementResponseResultObject();
            return TeaModel.build(map, self);
        }

        public VerifyBankElementResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public VerifyBankElementResponseResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public VerifyBankElementResponseResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public VerifyBankElementResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

    }

}
