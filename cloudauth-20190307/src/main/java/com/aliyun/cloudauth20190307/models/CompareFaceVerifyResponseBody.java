// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success. Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The face comparison result.</p>
     */
    @NameInMap("ResultObject")
    public CompareFaceVerifyResponseBodyResultObject resultObject;

    public static CompareFaceVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceVerifyResponseBody self = new CompareFaceVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareFaceVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompareFaceVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompareFaceVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareFaceVerifyResponseBody setResultObject(CompareFaceVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CompareFaceVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CompareFaceVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>The unique identifier of the ID Verification request.</p>
         * 
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Indicates whether the verification passed. A value of T indicates passed. A value of F indicates not passed.</p>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The face comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>99.60875</p>
         */
        @NameInMap("VerifyScore")
        public Float verifyScore;

        public static CompareFaceVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CompareFaceVerifyResponseBodyResultObject self = new CompareFaceVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CompareFaceVerifyResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public CompareFaceVerifyResponseBodyResultObject setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public CompareFaceVerifyResponseBodyResultObject setVerifyScore(Float verifyScore) {
            this.verifyScore = verifyScore;
            return this;
        }
        public Float getVerifyScore() {
            return this.verifyScore;
        }

    }

}
