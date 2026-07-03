// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceDuplicationCheckIntlResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public FaceDuplicationCheckIntlResponseBodyResult result;

    public static FaceDuplicationCheckIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceDuplicationCheckIntlResponseBody self = new FaceDuplicationCheckIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceDuplicationCheckIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceDuplicationCheckIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceDuplicationCheckIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceDuplicationCheckIntlResponseBody setResult(FaceDuplicationCheckIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceDuplicationCheckIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo extends TeaModel {
        @NameInMap("FaceAttributeInfo")
        public String faceAttributeInfo;

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

        public static FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo self = new FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo();
            return TeaModel.build(map, self);
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setFaceAttributeInfo(String faceAttributeInfo) {
            this.faceAttributeInfo = faceAttributeInfo;
            return this;
        }
        public String getFaceAttributeInfo() {
            return this.faceAttributeInfo;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setFaceQualityScore(Double faceQualityScore) {
            this.faceQualityScore = faceQualityScore;
            return this;
        }
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setIlluminationScore(Double illuminationScore) {
            this.illuminationScore = illuminationScore;
            return this;
        }
        public Double getIlluminationScore() {
            return this.illuminationScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setKaOcclusionScore(Double kaOcclusionScore) {
            this.kaOcclusionScore = kaOcclusionScore;
            return this;
        }
        public Double getKaOcclusionScore() {
            return this.kaOcclusionScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setOcclusionScore(Double occlusionScore) {
            this.occlusionScore = occlusionScore;
            return this;
        }
        public Double getOcclusionScore() {
            return this.occlusionScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setSharpnessScore(Double sharpnessScore) {
            this.sharpnessScore = sharpnessScore;
            return this;
        }
        public Double getSharpnessScore() {
            return this.sharpnessScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setTargetFaceQualityScore(Double targetFaceQualityScore) {
            this.targetFaceQualityScore = targetFaceQualityScore;
            return this;
        }
        public Double getTargetFaceQualityScore() {
            return this.targetFaceQualityScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setTargetIlluminationScore(Double targetIlluminationScore) {
            this.targetIlluminationScore = targetIlluminationScore;
            return this;
        }
        public Double getTargetIlluminationScore() {
            return this.targetIlluminationScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setTargetKaOcclusionScore(Double targetKaOcclusionScore) {
            this.targetKaOcclusionScore = targetKaOcclusionScore;
            return this;
        }
        public Double getTargetKaOcclusionScore() {
            return this.targetKaOcclusionScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setTargetOcclusionScore(Double targetOcclusionScore) {
            this.targetOcclusionScore = targetOcclusionScore;
            return this;
        }
        public Double getTargetOcclusionScore() {
            return this.targetOcclusionScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo setTargetSharpnessScore(Double targetSharpnessScore) {
            this.targetSharpnessScore = targetSharpnessScore;
            return this;
        }
        public Double getTargetSharpnessScore() {
            return this.targetSharpnessScore;
        }

    }

    public static class FaceDuplicationCheckIntlResponseBodyResult extends TeaModel {
        /**
         * <p>The face ID and UserID retrieved from the face library when a duplicate face is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;faceGroupCode&quot;: &quot;sg7<strong><strong>uzt&quot;,
         *         &quot;faceId&quot;: &quot;f5a921</strong></strong><em><strong>9e792ec84c8f0ca592a&quot;,
         *         &quot;merchantUserId&quot;: &quot;fa</strong></em>*01&quot;
         *     }
         * ]</p>
         */
        @NameInMap("DuplicateFace")
        public String duplicateFace;

        /**
         * <p>The related result information.</p>
         */
        @NameInMap("ExtFaceInfo")
        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <p>The estimated age of the face. The prediction may fail and no value is returned in some cases.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FaceAge")
        public String faceAge;

        /**
         * <p>Indicates whether the captured face involves a liveness attack. Valid values: Y (attack detected) and N (no attack detected). This field is returned when passive liveness detection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <p>The probability of a passive liveness detection attack. The value ranges from 0 to 100. This field is returned when passive liveness detection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("FaceAttackScore")
        public String faceAttackScore;

        /**
         * <p>The 1:1 face comparison score returned when the verification mode is 1 or 2. The value ranges from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("FaceComparisonScore")
        public String faceComparisonScore;

        /**
         * <p>The predicted gender of the face image. The prediction may fail and no value is returned in some cases. Valid values:</p>
         * <ul>
         * <li>M: Male.</li>
         * <li>F: Female.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("FaceGender")
        public String faceGender;

        /**
         * <p>The final verification result. Valid values:</p>
         * <ul>
         * <li>Y: Passed.</li>
         * <li>N: Not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FacePassed")
        public String facePassed;

        /**
         * <p>The FACEID returned only when the customer has enabled automatic registration and the face is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>9e792ec84c8f0ca592a</p>
         */
        @NameInMap("FaceRegistrationId")
        public String faceRegistrationId;

        /**
         * <p>The face registration result. Valid values: </p>
         * <ul>
         * <li>0: Failed. </li>
         * <li>1: Succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FaceRegistrationResult")
        public Integer faceRegistrationResult;

        /**
         * <p>The verification result description. For more information, refer to the ResultObject.SubCode error code description.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The unique identifier of the verification request.</p>
         * 
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceDuplicationCheckIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceDuplicationCheckIntlResponseBodyResult self = new FaceDuplicationCheckIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceDuplicationCheckIntlResponseBodyResult setDuplicateFace(String duplicateFace) {
            this.duplicateFace = duplicateFace;
            return this;
        }
        public String getDuplicateFace() {
            return this.duplicateFace;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setExtFaceInfo(FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public FaceDuplicationCheckIntlResponseBodyResultExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFaceAge(String faceAge) {
            this.faceAge = faceAge;
            return this;
        }
        public String getFaceAge() {
            return this.faceAge;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFaceAttack(String faceAttack) {
            this.faceAttack = faceAttack;
            return this;
        }
        public String getFaceAttack() {
            return this.faceAttack;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFaceAttackScore(String faceAttackScore) {
            this.faceAttackScore = faceAttackScore;
            return this;
        }
        public String getFaceAttackScore() {
            return this.faceAttackScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFaceComparisonScore(String faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }
        public String getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFaceGender(String faceGender) {
            this.faceGender = faceGender;
            return this;
        }
        public String getFaceGender() {
            return this.faceGender;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFacePassed(String facePassed) {
            this.facePassed = facePassed;
            return this;
        }
        public String getFacePassed() {
            return this.facePassed;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFaceRegistrationId(String faceRegistrationId) {
            this.faceRegistrationId = faceRegistrationId;
            return this;
        }
        public String getFaceRegistrationId() {
            return this.faceRegistrationId;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setFaceRegistrationResult(Integer faceRegistrationResult) {
            this.faceRegistrationResult = faceRegistrationResult;
            return this;
        }
        public Integer getFaceRegistrationResult() {
            return this.faceRegistrationResult;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public FaceDuplicationCheckIntlResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
