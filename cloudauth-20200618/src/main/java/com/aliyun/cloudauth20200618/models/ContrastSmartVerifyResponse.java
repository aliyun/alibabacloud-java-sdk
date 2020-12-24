// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ContrastSmartVerifyResponse extends TeaModel {
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
    public ContrastSmartVerifyResponseResultObject resultObject;

    public static ContrastSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ContrastSmartVerifyResponse self = new ContrastSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public ContrastSmartVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContrastSmartVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContrastSmartVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ContrastSmartVerifyResponse setResultObject(ContrastSmartVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ContrastSmartVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class ContrastSmartVerifyResponseResultObject extends TeaModel {
        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        @NameInMap("SubCode")
        @Validation(required = true)
        public String subCode;

        @NameInMap("VerifyInfo")
        @Validation(required = true)
        public String verifyInfo;

        @NameInMap("RiskInfo")
        @Validation(required = true)
        public String riskInfo;

        public static ContrastSmartVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            ContrastSmartVerifyResponseResultObject self = new ContrastSmartVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public ContrastSmartVerifyResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public ContrastSmartVerifyResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public ContrastSmartVerifyResponseResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public ContrastSmartVerifyResponseResultObject setVerifyInfo(String verifyInfo) {
            this.verifyInfo = verifyInfo;
            return this;
        }
        public String getVerifyInfo() {
            return this.verifyInfo;
        }

        public ContrastSmartVerifyResponseResultObject setRiskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public String getRiskInfo() {
            return this.riskInfo;
        }

    }

}
