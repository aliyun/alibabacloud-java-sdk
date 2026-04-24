// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCompareV2ResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4EB356FE-BB6A-5DCC-B4C5-E8051787EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public FaceCompareV2ResponseBodyResult result;

    public static FaceCompareV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareV2ResponseBody self = new FaceCompareV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceCompareV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceCompareV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceCompareV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceCompareV2ResponseBody setResult(FaceCompareV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceCompareV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceCompareV2ResponseBodyResultExtFaceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>39.04</p>
         */
        @NameInMap("FaceQualityScore")
        public Double faceQualityScore;

        /**
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("IlluminationScore")
        public Double illuminationScore;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("KaOcclusionScore")
        public Double kaOcclusionScore;

        /**
         * <strong>example:</strong>
         * <p>50.26</p>
         */
        @NameInMap("OcclusionScore")
        public Double occlusionScore;

        /**
         * <strong>example:</strong>
         * <p>86.47</p>
         */
        @NameInMap("SharpnessScore")
        public Double sharpnessScore;

        public static FaceCompareV2ResponseBodyResultExtFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            FaceCompareV2ResponseBodyResultExtFaceInfo self = new FaceCompareV2ResponseBodyResultExtFaceInfo();
            return TeaModel.build(map, self);
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setFaceQualityScore(Double faceQualityScore) {
            this.faceQualityScore = faceQualityScore;
            return this;
        }
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setIlluminationScore(Double illuminationScore) {
            this.illuminationScore = illuminationScore;
            return this;
        }
        public Double getIlluminationScore() {
            return this.illuminationScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setKaOcclusionScore(Double kaOcclusionScore) {
            this.kaOcclusionScore = kaOcclusionScore;
            return this;
        }
        public Double getKaOcclusionScore() {
            return this.kaOcclusionScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setOcclusionScore(Double occlusionScore) {
            this.occlusionScore = occlusionScore;
            return this;
        }
        public Double getOcclusionScore() {
            return this.occlusionScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setSharpnessScore(Double sharpnessScore) {
            this.sharpnessScore = sharpnessScore;
            return this;
        }
        public Double getSharpnessScore() {
            return this.sharpnessScore;
        }

    }

    public static class FaceCompareV2ResponseBodyResult extends TeaModel {
        @NameInMap("ExtFaceInfo")
        public FaceCompareV2ResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("FaceComparisonScore")
        public Double faceComparisonScore;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceCompareV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceCompareV2ResponseBodyResult self = new FaceCompareV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceCompareV2ResponseBodyResult setExtFaceInfo(FaceCompareV2ResponseBodyResultExtFaceInfo extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public FaceCompareV2ResponseBodyResultExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public FaceCompareV2ResponseBodyResult setFaceComparisonScore(Double faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }
        public Double getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        public FaceCompareV2ResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public FaceCompareV2ResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
