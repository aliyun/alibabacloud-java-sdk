// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public ContrastFaceVerifyResponseResultObject resultObject;

    public static ContrastFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ContrastFaceVerifyResponse self = new ContrastFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public ContrastFaceVerifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ContrastFaceVerifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContrastFaceVerifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContrastFaceVerifyResponse setResultObject(ContrastFaceVerifyResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ContrastFaceVerifyResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class ContrastFaceVerifyResponseResultObject extends TeaModel {
        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        @NameInMap("SubCode")
        @Validation(required = true)
        public String subCode;

        @NameInMap("MaterialInfo")
        @Validation(required = true)
        public String materialInfo;

        @NameInMap("IdentityInfo")
        @Validation(required = true)
        public String identityInfo;

        @NameInMap("Passed")
        @Validation(required = true)
        public String passed;

        public static ContrastFaceVerifyResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            ContrastFaceVerifyResponseResultObject self = new ContrastFaceVerifyResponseResultObject();
            return TeaModel.build(map, self);
        }

        public ContrastFaceVerifyResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public ContrastFaceVerifyResponseResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public ContrastFaceVerifyResponseResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public ContrastFaceVerifyResponseResultObject setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public ContrastFaceVerifyResponseResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
