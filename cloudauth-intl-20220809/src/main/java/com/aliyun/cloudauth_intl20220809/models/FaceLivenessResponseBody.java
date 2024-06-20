// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>42EA58CA-5DF4-55D5-82C4-5E7A40DA62BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public FaceLivenessResponseBodyResult result;

    public static FaceLivenessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessResponseBody self = new FaceLivenessResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceLivenessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceLivenessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceLivenessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceLivenessResponseBody setResult(FaceLivenessResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceLivenessResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceLivenessResponseBodyResultExtFaceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <strong>example:</strong>
         * <p>87.19</p>
         */
        @NameInMap("FaceQualityScore")
        public Double faceQualityScore;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("OcclusionResult")
        public String occlusionResult;

        public static FaceLivenessResponseBodyResultExtFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            FaceLivenessResponseBodyResultExtFaceInfo self = new FaceLivenessResponseBodyResultExtFaceInfo();
            return TeaModel.build(map, self);
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setFaceAttack(String faceAttack) {
            this.faceAttack = faceAttack;
            return this;
        }
        public String getFaceAttack() {
            return this.faceAttack;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setFaceQualityScore(Double faceQualityScore) {
            this.faceQualityScore = faceQualityScore;
            return this;
        }
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setOcclusionResult(String occlusionResult) {
            this.occlusionResult = occlusionResult;
            return this;
        }
        public String getOcclusionResult() {
            return this.occlusionResult;
        }

    }

    public static class FaceLivenessResponseBodyResult extends TeaModel {
        @NameInMap("ExtFaceInfo")
        public FaceLivenessResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceLivenessResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceLivenessResponseBodyResult self = new FaceLivenessResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceLivenessResponseBodyResult setExtFaceInfo(FaceLivenessResponseBodyResultExtFaceInfo extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public FaceLivenessResponseBodyResultExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public FaceLivenessResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public FaceLivenessResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public FaceLivenessResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
