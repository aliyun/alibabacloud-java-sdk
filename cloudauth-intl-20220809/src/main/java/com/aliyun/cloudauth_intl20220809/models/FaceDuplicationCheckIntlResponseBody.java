// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceDuplicationCheckIntlResponseBody extends TeaModel {
    /**
     * <p>Return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
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

    public static class FaceDuplicationCheckIntlResponseBodyResult extends TeaModel {
        /**
         * <p>Returns the face library face ID and UserID when a duplicate face is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         * {\&quot;faceGroupCode\&quot;:\&quot;sg7<strong><strong>uzt\&quot;,\&quot;faceId\&quot;:\&quot;f5a921</strong></strong>***9e792ec84c8f0ca592a\&quot;}
         * ]</p>
         */
        @NameInMap("DuplicateFace")
        public String duplicateFace;

        /**
         * <p>The estimated age of the face, which may not be returned if the prediction fails.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FaceAge")
        public String faceAge;

        /**
         * <p>Indicates whether the captured face involves a liveness attack, Y for an attack, N for no attack.
         * Returned when silent liveness detection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <p>The probability of a liveness attack detected by silent liveness detection. The value range is 0 to 100.
         * Returned when silent liveness detection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("FaceAttackScore")
        public String faceAttackScore;

        /**
         * <p>When the verification mode is 1 or 2, returns the 1:1 verification comparison score
         * Comparison score range 0～100.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("FaceComparisonScore")
        public String faceComparisonScore;

        /**
         * <p>The predicted gender of the face in the image, which may not be returned if the prediction fails.</p>
         * <ul>
         * <li>M: Male</li>
         * <li>F: Female</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("FaceGender")
        public String faceGender;

        /**
         * <p>Final authentication result, values:</p>
         * <ul>
         * <li>Y: Passed</li>
         * <li>N: Not passed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FacePassed")
        public String facePassed;

        /**
         * <p>Returns the corresponding FACEID only when the customer sets auto-registration and the face registration is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>9e792ec84c8f0ca592a</p>
         */
        @NameInMap("FaceRegistrationId")
        public String faceRegistrationId;

        /**
         * <p>Face registration result </p>
         * <ul>
         * <li>0- Failed </li>
         * <li>1- Succeeded</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FaceRegistrationResult")
        public Integer faceRegistrationResult;

        /**
         * <p>Description of the authentication result. For more information, see ResultObject.SubCode error code description.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>Unique identifier of the authentication request.</p>
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
