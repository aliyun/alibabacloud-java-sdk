// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessResponseBody extends TeaModel {
    /**
     * <p><a href="https://www.alibabacloud.com/help/en/ekyc/latest/cadqvlft48igbpdc?spm=a2c63.p38356.0.i54#3d0ed52f967g6">The response code.</a></p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A detailed description of the response code.</p>
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
     * <p>42EA58CA-5DF4-55D5-82C4-5E7A40DA62BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object</p>
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
         * <p>The predicted age of the person in the image. The prediction may fail, resulting in an empty value.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("FaceAge")
        public Integer faceAge;

        /**
         * <p>Indicates whether a presentation attack was detected on the captured face. Y means an attack was detected. N means no attack was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <p>The predicted gender of the person in the image. The prediction may fail, resulting in an empty value.</p>
         * <ul>
         * <li><p><strong>M</strong>: Male</p>
         * </li>
         * <li><p><strong>F</strong>: Female</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("FaceGender")
        public String faceGender;

        /**
         * <p>Optional. The quality score of the live face. The value ranges from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>87.19</p>
         */
        @NameInMap("FaceQualityScore")
        public Double faceQualityScore;

        /**
         * <p>Optional. Indicates whether the face is occluded. Y means the face is occluded. N means the face is not occluded.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("OcclusionResult")
        public String occlusionResult;

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

        public FaceLivenessResponseBodyResultExtFaceInfo setOcclusionResult(String occlusionResult) {
            this.occlusionResult = occlusionResult;
            return this;
        }
        public String getOcclusionResult() {
            return this.occlusionResult;
        }

    }

    public static class FaceLivenessResponseBodyResult extends TeaModel {
        /**
         * <p>The results of the passive liveness detection. The value is in the JSON format. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/cadqvlft48igbpdc?spm=a2c63.p38356.0.i54#5ff42f7274agz">ExtFaceInfo</a>.</p>
         */
        @NameInMap("ExtFaceInfo")
        public FaceLivenessResponseBodyResultExtFaceInfo extFaceInfo;

        /**
         * <p>The authentication result. Valid values:</p>
         * <ul>
         * <li><p>Y: The authentication is passed.</p>
         * </li>
         * <li><p>N: The authentication is not passed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The code that corresponds to the verification result. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/cadqvlft48igbpdc?spm=a2c63.p38356.0.i54#5ff3e16174tl2">ResultObject.SubCode error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The transaction ID.</p>
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
