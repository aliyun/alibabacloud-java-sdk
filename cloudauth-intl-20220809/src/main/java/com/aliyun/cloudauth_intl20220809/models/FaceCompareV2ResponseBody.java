// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCompareV2ResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <p>200: success. Other values: error codes. For more information, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
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

    /**
     * <p>The returned result.</p>
     */
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
         * <p>The overall quality score.</p>
         * 
         * <strong>example:</strong>
         * <p>39.04</p>
         */
        @NameInMap("FaceQualityScore")
        public Double faceQualityScore;

        /**
         * <p>The illumination score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("IlluminationScore")
        public Double illuminationScore;

        /**
         * <p>The key area occlusion score.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("KaOcclusionScore")
        public Double kaOcclusionScore;

        /**
         * <p>The occlusion score.</p>
         * 
         * <strong>example:</strong>
         * <p>50.26</p>
         */
        @NameInMap("OcclusionScore")
        public Double occlusionScore;

        /**
         * <p>The sharpness score.</p>
         * 
         * <strong>example:</strong>
         * <p>86.47</p>
         */
        @NameInMap("SharpnessScore")
        public Double sharpnessScore;

        @NameInMap("TargetFaceQualityScore")
        public Double targetFaceQualityScore;

        @NameInMap("TargetIlluminationScore")
        public Double targetIlluminationScore;

        @NameInMap("TargetKaOcclusionScore")
        public Double targetKaOcclusionScore;

        @NameInMap("TargetOcclusionScore")
        public Double targetOcclusionScore;

        @NameInMap("TargetSharpnessScore")
        public Double targetSharpnessScore;

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

        public FaceCompareV2ResponseBodyResultExtFaceInfo setTargetFaceQualityScore(Double targetFaceQualityScore) {
            this.targetFaceQualityScore = targetFaceQualityScore;
            return this;
        }
        public Double getTargetFaceQualityScore() {
            return this.targetFaceQualityScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setTargetIlluminationScore(Double targetIlluminationScore) {
            this.targetIlluminationScore = targetIlluminationScore;
            return this;
        }
        public Double getTargetIlluminationScore() {
            return this.targetIlluminationScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setTargetKaOcclusionScore(Double targetKaOcclusionScore) {
            this.targetKaOcclusionScore = targetKaOcclusionScore;
            return this;
        }
        public Double getTargetKaOcclusionScore() {
            return this.targetKaOcclusionScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setTargetOcclusionScore(Double targetOcclusionScore) {
            this.targetOcclusionScore = targetOcclusionScore;
            return this;
        }
        public Double getTargetOcclusionScore() {
            return this.targetOcclusionScore;
        }

        public FaceCompareV2ResponseBodyResultExtFaceInfo setTargetSharpnessScore(Double targetSharpnessScore) {
            this.targetSharpnessScore = targetSharpnessScore;
            return this;
        }
        public Double getTargetSharpnessScore() {
            return this.targetSharpnessScore;
        }

    }

    public static class FaceCompareV2ResponseBodyResult extends TeaModel {
        /**
         * <p>The additional result information.</p>
         */
        @NameInMap("ExtFaceInfo")
        public FaceCompareV2ResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <p>The comparison score between the submitted face image and the reference face image during the verification process. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("FaceComparisonScore")
        public Double faceComparisonScore;

        /**
         * <p>Indicates whether the verification is passed. Valid values:</p>
         * <ul>
         * <li>Y: Passed.</li>
         * <li>N: Not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The unique ID of the verification request.</p>
         * 
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
