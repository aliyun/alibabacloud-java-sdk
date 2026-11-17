// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceVerifyIntlResponseBody extends TeaModel {
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
     * <p>The response result.</p>
     */
    @NameInMap("Result")
    public FaceVerifyIntlResponseBodyResult result;

    public static FaceVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceVerifyIntlResponseBody self = new FaceVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceVerifyIntlResponseBody setResult(FaceVerifyIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceVerifyIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceVerifyIntlResponseBodyResultExtFaceInfo extends TeaModel {
        /**
         * <p>The attribute detection result of the main face, returned as a string. The result includes information such as gender, glasses, hat, mask, tattoo, smoking, other people, environment, expression, and age.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gender&quot;:1,&quot;glasses&quot;:0,&quot;hat&quot;:1,&quot;mask&quot;:1,&quot;tattoo&quot;:0,&quot;smoking&quot;:0,&quot;others&quot;:1,&quot;env&quot;:&quot;office&quot;,&quot;expression&quot;:1,&quot;age&quot;:16}</p>
         */
        @NameInMap("FaceAttributeInfo")
        public String faceAttributeInfo;

        /**
         * <p>The quality score of the live face. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>39.04</p>
         */
        @NameInMap("FaceQualityScore")
        public Double faceQualityScore;

        /**
         * <p>The algorithm score for illumination, which is a sub-dimension of quality judgment. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>97.43</p>
         */
        @NameInMap("IlluminationScore")
        public Double illuminationScore;

        /**
         * <p>The algorithm score for key area occlusion, which is a sub-dimension of quality judgment. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KaOcclusionScore")
        public Double kaOcclusionScore;

        /**
         * <p>The algorithm score for occlusion, which is a sub-dimension of quality judgment. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>50.26</p>
         */
        @NameInMap("OcclusionScore")
        public Double occlusionScore;

        /**
         * <p>The image sharpness score, which is a sub-dimension of quality judgment. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>86.47</p>
         */
        @NameInMap("SharpnessScore")
        public Double sharpnessScore;

        /**
         * <p>The comprehensive quality score of the reference face image. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>39.04</p>
         */
        @NameInMap("TargetFaceQualityScore")
        public Double targetFaceQualityScore;

        /**
         * <p>The illumination score of the reference face image. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("TargetIlluminationScore")
        public Double targetIlluminationScore;

        /**
         * <p>The key area occlusion score of the reference face image. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TargetKaOcclusionScore")
        public Double targetKaOcclusionScore;

        /**
         * <p>The occlusion score of the reference face image. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>50.26</p>
         */
        @NameInMap("TargetOcclusionScore")
        public Double targetOcclusionScore;

        /**
         * <p>The sharpness score of the reference face image. Valid values: 0 to 100. A higher value indicates better quality.</p>
         * 
         * <strong>example:</strong>
         * <p>86.47</p>
         */
        @NameInMap("TargetSharpnessScore")
        public Double targetSharpnessScore;

        public static FaceVerifyIntlResponseBodyResultExtFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            FaceVerifyIntlResponseBodyResultExtFaceInfo self = new FaceVerifyIntlResponseBodyResultExtFaceInfo();
            return TeaModel.build(map, self);
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setFaceAttributeInfo(String faceAttributeInfo) {
            this.faceAttributeInfo = faceAttributeInfo;
            return this;
        }
        public String getFaceAttributeInfo() {
            return this.faceAttributeInfo;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setFaceQualityScore(Double faceQualityScore) {
            this.faceQualityScore = faceQualityScore;
            return this;
        }
        public Double getFaceQualityScore() {
            return this.faceQualityScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setIlluminationScore(Double illuminationScore) {
            this.illuminationScore = illuminationScore;
            return this;
        }
        public Double getIlluminationScore() {
            return this.illuminationScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setKaOcclusionScore(Double kaOcclusionScore) {
            this.kaOcclusionScore = kaOcclusionScore;
            return this;
        }
        public Double getKaOcclusionScore() {
            return this.kaOcclusionScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setOcclusionScore(Double occlusionScore) {
            this.occlusionScore = occlusionScore;
            return this;
        }
        public Double getOcclusionScore() {
            return this.occlusionScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setSharpnessScore(Double sharpnessScore) {
            this.sharpnessScore = sharpnessScore;
            return this;
        }
        public Double getSharpnessScore() {
            return this.sharpnessScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setTargetFaceQualityScore(Double targetFaceQualityScore) {
            this.targetFaceQualityScore = targetFaceQualityScore;
            return this;
        }
        public Double getTargetFaceQualityScore() {
            return this.targetFaceQualityScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setTargetIlluminationScore(Double targetIlluminationScore) {
            this.targetIlluminationScore = targetIlluminationScore;
            return this;
        }
        public Double getTargetIlluminationScore() {
            return this.targetIlluminationScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setTargetKaOcclusionScore(Double targetKaOcclusionScore) {
            this.targetKaOcclusionScore = targetKaOcclusionScore;
            return this;
        }
        public Double getTargetKaOcclusionScore() {
            return this.targetKaOcclusionScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setTargetOcclusionScore(Double targetOcclusionScore) {
            this.targetOcclusionScore = targetOcclusionScore;
            return this;
        }
        public Double getTargetOcclusionScore() {
            return this.targetOcclusionScore;
        }

        public FaceVerifyIntlResponseBodyResultExtFaceInfo setTargetSharpnessScore(Double targetSharpnessScore) {
            this.targetSharpnessScore = targetSharpnessScore;
            return this;
        }
        public Double getTargetSharpnessScore() {
            return this.targetSharpnessScore;
        }

    }

    public static class FaceVerifyIntlResponseBodyResult extends TeaModel {
        /**
         * <p>The face ID, user ID, and comparison score of the duplicate face in the face library when a duplicate face is retrieved.</p>
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
         * <p>The additional face result information.</p>
         */
        @NameInMap("ExtFaceInfo")
        public FaceVerifyIntlResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <p>The predicted reference age of the face. This parameter may not be returned if the prediction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FaceAge")
        public Long faceAge;

        /**
         * <p>Indicates whether the collected face involves a liveness attack. Valid values:</p>
         * <ul>
         * <li>Y: attack detected.</li>
         * <li>N: no attack detected.
         * This parameter is returned only when passive liveness detection is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <p>The probability of a liveness attack detected by passive liveness detection. Valid values: 0 to 100.
         * This parameter is returned only when passive liveness detection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("FaceAttackScore")
        public Double faceAttackScore;

        /**
         * <p>The comparison score between the submitted face photo and the reference face image during authentication. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>95.0</p>
         */
        @NameInMap("FaceComparisonScore")
        public Double faceComparisonScore;

        /**
         * <p>The predicted gender of the face image. This parameter may not be returned if the prediction fails. Valid values:</p>
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
         * <p>The final authentication result. Valid values:</p>
         * <ul>
         * <li>Y: passed.</li>
         * <li>N: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FacePassed")
        public String facePassed;

        /**
         * <p>The FACEID returned when face registration succeeds. This parameter is returned only when automatic registration is enabled by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>9e792ec84c8f0ca592a</p>
         */
        @NameInMap("FaceRegistrationId")
        public String faceRegistrationId;

        /**
         * <p>The face registration result. Valid values: </p>
         * <ul>
         * <li>0: failed. </li>
         * <li>1: succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FaceRegistrationResult")
        public Long faceRegistrationResult;

        /**
         * <p>The sub-result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The unique identifier of the authentication request.</p>
         * 
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceVerifyIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceVerifyIntlResponseBodyResult self = new FaceVerifyIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceVerifyIntlResponseBodyResult setDuplicateFace(String duplicateFace) {
            this.duplicateFace = duplicateFace;
            return this;
        }
        public String getDuplicateFace() {
            return this.duplicateFace;
        }

        public FaceVerifyIntlResponseBodyResult setExtFaceInfo(FaceVerifyIntlResponseBodyResultExtFaceInfo extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public FaceVerifyIntlResponseBodyResultExtFaceInfo getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public FaceVerifyIntlResponseBodyResult setFaceAge(Long faceAge) {
            this.faceAge = faceAge;
            return this;
        }
        public Long getFaceAge() {
            return this.faceAge;
        }

        public FaceVerifyIntlResponseBodyResult setFaceAttack(String faceAttack) {
            this.faceAttack = faceAttack;
            return this;
        }
        public String getFaceAttack() {
            return this.faceAttack;
        }

        public FaceVerifyIntlResponseBodyResult setFaceAttackScore(Double faceAttackScore) {
            this.faceAttackScore = faceAttackScore;
            return this;
        }
        public Double getFaceAttackScore() {
            return this.faceAttackScore;
        }

        public FaceVerifyIntlResponseBodyResult setFaceComparisonScore(Double faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }
        public Double getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        public FaceVerifyIntlResponseBodyResult setFaceGender(String faceGender) {
            this.faceGender = faceGender;
            return this;
        }
        public String getFaceGender() {
            return this.faceGender;
        }

        public FaceVerifyIntlResponseBodyResult setFacePassed(String facePassed) {
            this.facePassed = facePassed;
            return this;
        }
        public String getFacePassed() {
            return this.facePassed;
        }

        public FaceVerifyIntlResponseBodyResult setFaceRegistrationId(String faceRegistrationId) {
            this.faceRegistrationId = faceRegistrationId;
            return this;
        }
        public String getFaceRegistrationId() {
            return this.faceRegistrationId;
        }

        public FaceVerifyIntlResponseBodyResult setFaceRegistrationResult(Long faceRegistrationResult) {
            this.faceRegistrationResult = faceRegistrationResult;
            return this;
        }
        public Long getFaceRegistrationResult() {
            return this.faceRegistrationResult;
        }

        public FaceVerifyIntlResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public FaceVerifyIntlResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
