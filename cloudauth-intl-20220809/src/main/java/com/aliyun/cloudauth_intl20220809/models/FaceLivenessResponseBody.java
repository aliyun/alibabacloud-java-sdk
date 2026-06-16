// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned with the result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>42EA58CA-5DF4-55D5-82C4-5E7A40DA62BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
         * <p>The predicted reference age based on the face. The prediction may fail and return no value.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("FaceAge")
        public Integer faceAge;

        /**
         * <p>The liveness detection result. Valid values: Y (attack detected) and N (normal).</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <p>The predicted gender based on the face photo. The prediction may fail and return no value. Valid values:</p>
         * <ul>
         * <li>M: male.</li>
         * <li>F: female.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("FaceGender")
        public String faceGender;

        /**
         * <p>The face quality score (0 to 100). This value is returned only when the face quality score switch is enabled in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>87.19</p>
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
         * <p>The occlusion detection result. Valid values: Y (occluded) and N (not occluded). This value is returned only when the occlusion detection switch is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("OcclusionResult")
        public String occlusionResult;

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

        public static FaceLivenessResponseBodyResultExtFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            FaceLivenessResponseBodyResultExtFaceInfo self = new FaceLivenessResponseBodyResultExtFaceInfo();
            return TeaModel.build(map, self);
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setFaceAge(Integer faceAge) {
            this.faceAge = faceAge;
            return this;
        }
        public Integer getFaceAge() {
            return this.faceAge;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setFaceAttack(String faceAttack) {
            this.faceAttack = faceAttack;
            return this;
        }
        public String getFaceAttack() {
            return this.faceAttack;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setFaceGender(String faceGender) {
            this.faceGender = faceGender;
            return this;
        }
        public String getFaceGender() {
            return this.faceGender;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setFaceQualityScore(Double faceQualityScore) {
            this.faceQualityScore = faceQualityScore;
            return this;
        }
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setIlluminationScore(Double illuminationScore) {
            this.illuminationScore = illuminationScore;
            return this;
        }
        public Double getIlluminationScore() {
            return this.illuminationScore;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setKaOcclusionScore(Double kaOcclusionScore) {
            this.kaOcclusionScore = kaOcclusionScore;
            return this;
        }
        public Double getKaOcclusionScore() {
            return this.kaOcclusionScore;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setOcclusionResult(String occlusionResult) {
            this.occlusionResult = occlusionResult;
            return this;
        }
        public String getOcclusionResult() {
            return this.occlusionResult;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setOcclusionScore(Double occlusionScore) {
            this.occlusionScore = occlusionScore;
            return this;
        }
        public Double getOcclusionScore() {
            return this.occlusionScore;
        }

        public FaceLivenessResponseBodyResultExtFaceInfo setSharpnessScore(Double sharpnessScore) {
            this.sharpnessScore = sharpnessScore;
            return this;
        }
        public Double getSharpnessScore() {
            return this.sharpnessScore;
        }

    }

    public static class FaceLivenessResponseBodyResult extends TeaModel {
        /**
         * <p>The face result information.</p>
         */
        @NameInMap("ExtFaceInfo")
        public FaceLivenessResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <p>Indicates whether the authentication passed. Valid values:</p>
         * <ul>
         * <li>Y: passed.</li>
         * <li>N: not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The sub-result code.</p>
         * 
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The unique ID of the authentication request.</p>
         * 
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
