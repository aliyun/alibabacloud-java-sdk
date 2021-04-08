// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ContrastSmartVerifyResponseBody extends TeaModel {
    @NameInMap("ResultObject")
    public ContrastSmartVerifyResponseBodyResultObject resultObject;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static ContrastSmartVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContrastSmartVerifyResponseBody self = new ContrastSmartVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ContrastSmartVerifyResponseBody setResultObject(ContrastSmartVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ContrastSmartVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public ContrastSmartVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContrastSmartVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContrastSmartVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ContrastSmartVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("VerifyInfo")
        public String verifyInfo;

        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("RiskInfo")
        public String riskInfo;

        @NameInMap("Passed")
        public String passed;

        public static ContrastSmartVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ContrastSmartVerifyResponseBodyResultObject self = new ContrastSmartVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ContrastSmartVerifyResponseBodyResultObject setVerifyInfo(String verifyInfo) {
            this.verifyInfo = verifyInfo;
            return this;
        }
        public String getVerifyInfo() {
            return this.verifyInfo;
        }

        public ContrastSmartVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public ContrastSmartVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public ContrastSmartVerifyResponseBodyResultObject setRiskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public String getRiskInfo() {
            return this.riskInfo;
        }

        public ContrastSmartVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
