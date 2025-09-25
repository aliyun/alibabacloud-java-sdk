// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Request result</p>
     */
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
        /**
         * <p>Unique identifier for the real-person verification request.</p>
         * 
         * <strong>example:</strong>
         * <p>91707dc296d469ad38e4c5efa6a0****</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Information about the authenticated entity, which is usually empty in general authentication scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("IdentityInfo")
        public String identityInfo;

        /**
         * <p>Attachment information of the authenticated entity, mainly image materials, in JSON format, as follows.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;faceAttack&quot;: &quot;F&quot;,&quot;facialPictureFront&quot;: {&quot;qualityScore&quot;: 88.3615493774414,&quot;verifyScore&quot;: 50.28594166529785}}</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <p>Whether it passed, T for pass, F for fail.</p>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Description of the authentication result. For details, see the SubCode explanation below.</p>
         * 
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
