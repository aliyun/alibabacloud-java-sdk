// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public ContrastFaceVerifyResponseBodyResultObject resultObject;

    public static ContrastFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContrastFaceVerifyResponseBody self = new ContrastFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ContrastFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ContrastFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContrastFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContrastFaceVerifyResponseBody setResultObject(ContrastFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ContrastFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class ContrastFaceVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("IdentityInfo")
        public String identityInfo;

        /**
         * <strong>example:</strong>
         * <p>{&quot;faceAttack&quot;: &quot;F&quot;,&quot;facialPictureFront&quot;: {&quot;qualityScore&quot;: 88.3615493774414,&quot;verifyScore&quot;: 50.28594166529785}}</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static ContrastFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ContrastFaceVerifyResponseBodyResultObject self = new ContrastFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ContrastFaceVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public ContrastFaceVerifyResponseBodyResultObject setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public ContrastFaceVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public ContrastFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public ContrastFaceVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
