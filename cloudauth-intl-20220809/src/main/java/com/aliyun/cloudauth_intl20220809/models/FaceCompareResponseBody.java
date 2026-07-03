// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCompareResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * <p>200: Success.
     * Other: Error code. For error code details, see Error Codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response message.</p>
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
     * <p>Response result.</p>
     */
    @NameInMap("Result")
    public FaceCompareResponseBodyResult result;

    public static FaceCompareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareResponseBody self = new FaceCompareResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceCompareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceCompareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceCompareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceCompareResponseBody setResult(FaceCompareResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceCompareResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceCompareResponseBodyResultExtFaceInfo extends TeaModel {
        /**
         * <p>Overall quality score</p>
         * 
         * <strong>example:</strong>
         * <p>39.04</p>
         */
        @NameInMap("FaceQualityScore")
        public Double faceQualityScore;

        /**
         * <p>Illumination score</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("IlluminationScore")
        public Double illuminationScore;

        /**
         * <p>Key area occlusion score</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("KaOcclusionScore")
        public Double kaOcclusionScore;

        /**
         * <p>Occlusion score</p>
         * 
         * <strong>example:</strong>
         * <p>50.26</p>
         */
        @NameInMap("OcclusionScore")
        public Double occlusionScore;

        /**
         * <p>Sharpness score</p>
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

        public static FaceCompareResponseBodyResultExtFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            FaceCompareResponseBodyResultExtFaceInfo self = new FaceCompareResponseBodyResultExtFaceInfo();
            return TeaModel.build(map, self);
        }

        public FaceCompareResponseBodyResultExtFaceInfo setFaceQualityScore(Double faceQualityScore) {
            this.faceQualityScore = faceQualityScore;
            return this;
        }
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setIlluminationScore(Double illuminationScore) {
            this.illuminationScore = illuminationScore;
            return this;
        }
        public Double getIlluminationScore() {
            return this.illuminationScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setKaOcclusionScore(Double kaOcclusionScore) {
            this.kaOcclusionScore = kaOcclusionScore;
            return this;
        }
        public Double getKaOcclusionScore() {
            return this.kaOcclusionScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setOcclusionScore(Double occlusionScore) {
            this.occlusionScore = occlusionScore;
            return this;
        }
        public Double getOcclusionScore() {
            return this.occlusionScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setSharpnessScore(Double sharpnessScore) {
            this.sharpnessScore = sharpnessScore;
            return this;
        }
        public Double getSharpnessScore() {
            return this.sharpnessScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setTargetFaceQualityScore(Double targetFaceQualityScore) {
            this.targetFaceQualityScore = targetFaceQualityScore;
            return this;
        }
        public Double getTargetFaceQualityScore() {
            return this.targetFaceQualityScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setTargetIlluminationScore(Double targetIlluminationScore) {
            this.targetIlluminationScore = targetIlluminationScore;
            return this;
        }
        public Double getTargetIlluminationScore() {
            return this.targetIlluminationScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setTargetKaOcclusionScore(Double targetKaOcclusionScore) {
            this.targetKaOcclusionScore = targetKaOcclusionScore;
            return this;
        }
        public Double getTargetKaOcclusionScore() {
            return this.targetKaOcclusionScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setTargetOcclusionScore(Double targetOcclusionScore) {
            this.targetOcclusionScore = targetOcclusionScore;
            return this;
        }
        public Double getTargetOcclusionScore() {
            return this.targetOcclusionScore;
        }

        public FaceCompareResponseBodyResultExtFaceInfo setTargetSharpnessScore(Double targetSharpnessScore) {
            this.targetSharpnessScore = targetSharpnessScore;
            return this;
        }
        public Double getTargetSharpnessScore() {
            return this.targetSharpnessScore;
        }

    }

    public static class FaceCompareResponseBodyResult extends TeaModel {
        /**
         * <p>Related result information</p>
         */
        @NameInMap("ExtFaceInfo")
        public FaceCompareResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <p>The comparison score between the submitted face photo and the reference face image during the authentication process. Value range: <strong>0</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("FaceComparisonScore")
        public Double faceComparisonScore;

        /**
         * <p>Whether the authentication passed.</p>
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
         * <p>The unique identifier of the authentication request.</p>
         * 
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceCompareResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceCompareResponseBodyResult self = new FaceCompareResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceCompareResponseBodyResult setExtFaceInfo(FaceCompareResponseBodyResultExtFaceInfo extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public FaceCompareResponseBodyResultExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public FaceCompareResponseBodyResult setFaceComparisonScore(Double faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }
        public Double getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        public FaceCompareResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public FaceCompareResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
