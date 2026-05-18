// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessV2ResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public FaceLivenessV2ResponseBodyResult result;

    public static FaceLivenessV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessV2ResponseBody self = new FaceLivenessV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceLivenessV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceLivenessV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceLivenessV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceLivenessV2ResponseBody setResult(FaceLivenessV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceLivenessV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceLivenessV2ResponseBodyResultExtFaceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("FaceAge")
        public Long faceAge;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("FaceGender")
        public String faceGender;

        /**
         * <strong>example:</strong>
         * <p>79.04</p>
         */
        @NameInMap("FaceQualityScore")
        public Double faceQualityScore;

        /**
         * <strong>example:</strong>
         * <p>97.43</p>
         */
        @NameInMap("IlluminationScore")
        public Double illuminationScore;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KaOcclusionScore")
        public Double kaOcclusionScore;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("OcclusionResult")
        public String occlusionResult;

        /**
         * <strong>example:</strong>
         * <p>50.26</p>
         */
        @NameInMap("OcclusionScore")
        public Double occlusionScore;

        /**
         * <strong>example:</strong>
         * <p>60.78</p>
         */
        @NameInMap("SharpnessScore")
        public Double sharpnessScore;

        public static FaceLivenessV2ResponseBodyResultExtFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            FaceLivenessV2ResponseBodyResultExtFaceInfo self = new FaceLivenessV2ResponseBodyResultExtFaceInfo();
            return TeaModel.build(map, self);
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setFaceAge(Long faceAge) {
            this.faceAge = faceAge;
            return this;
        }
        public Long getFaceAge() {
            return this.faceAge;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setFaceAttack(String faceAttack) {
            this.faceAttack = faceAttack;
            return this;
        }
        public String getFaceAttack() {
            return this.faceAttack;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setFaceGender(String faceGender) {
            this.faceGender = faceGender;
            return this;
        }
        public String getFaceGender() {
            return this.faceGender;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setFaceQualityScore(Double faceQualityScore) {
            this.faceQualityScore = faceQualityScore;
            return this;
        }
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setIlluminationScore(Double illuminationScore) {
            this.illuminationScore = illuminationScore;
            return this;
        }
        public Double getIlluminationScore() {
            return this.illuminationScore;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setKaOcclusionScore(Double kaOcclusionScore) {
            this.kaOcclusionScore = kaOcclusionScore;
            return this;
        }
        public Double getKaOcclusionScore() {
            return this.kaOcclusionScore;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setOcclusionResult(String occlusionResult) {
            this.occlusionResult = occlusionResult;
            return this;
        }
        public String getOcclusionResult() {
            return this.occlusionResult;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setOcclusionScore(Double occlusionScore) {
            this.occlusionScore = occlusionScore;
            return this;
        }
        public Double getOcclusionScore() {
            return this.occlusionScore;
        }

        public FaceLivenessV2ResponseBodyResultExtFaceInfo setSharpnessScore(Double sharpnessScore) {
            this.sharpnessScore = sharpnessScore;
            return this;
        }
        public Double getSharpnessScore() {
            return this.sharpnessScore;
        }

    }

    public static class FaceLivenessV2ResponseBodyResult extends TeaModel {
        @NameInMap("ExtFaceInfo")
        public FaceLivenessV2ResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <strong>example:</strong>
         * <p>hksb7ba1b28130d24e015d694361****</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceLivenessV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceLivenessV2ResponseBodyResult self = new FaceLivenessV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceLivenessV2ResponseBodyResult setExtFaceInfo(FaceLivenessV2ResponseBodyResultExtFaceInfo extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public FaceLivenessV2ResponseBodyResultExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public FaceLivenessV2ResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public FaceLivenessV2ResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public FaceLivenessV2ResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
