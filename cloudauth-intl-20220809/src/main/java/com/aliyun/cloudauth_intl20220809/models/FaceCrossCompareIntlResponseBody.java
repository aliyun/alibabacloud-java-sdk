// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCrossCompareIntlResponseBody extends TeaModel {
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
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public FaceCrossCompareIntlResponseBodyResult result;

    public static FaceCrossCompareIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceCrossCompareIntlResponseBody self = new FaceCrossCompareIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceCrossCompareIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceCrossCompareIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceCrossCompareIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceCrossCompareIntlResponseBody setResult(FaceCrossCompareIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceCrossCompareIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceCrossCompareIntlResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("FaceComparisonScoreA2B")
        public Double faceComparisonScoreA2B;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("FaceComparisonScoreB2C")
        public Double faceComparisonScoreB2C;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("FaceComparisonScoreC2A")
        public Double faceComparisonScoreC2A;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FacePassed")
        public String facePassed;

        /**
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceCrossCompareIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceCrossCompareIntlResponseBodyResult self = new FaceCrossCompareIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceCrossCompareIntlResponseBodyResult setFaceComparisonScoreA2B(Double faceComparisonScoreA2B) {
            this.faceComparisonScoreA2B = faceComparisonScoreA2B;
            return this;
        }
        public Double getFaceComparisonScoreA2B() {
            return this.faceComparisonScoreA2B;
        }

        public FaceCrossCompareIntlResponseBodyResult setFaceComparisonScoreB2C(Double faceComparisonScoreB2C) {
            this.faceComparisonScoreB2C = faceComparisonScoreB2C;
            return this;
        }
        public Double getFaceComparisonScoreB2C() {
            return this.faceComparisonScoreB2C;
        }

        public FaceCrossCompareIntlResponseBodyResult setFaceComparisonScoreC2A(Double faceComparisonScoreC2A) {
            this.faceComparisonScoreC2A = faceComparisonScoreC2A;
            return this;
        }
        public Double getFaceComparisonScoreC2A() {
            return this.faceComparisonScoreC2A;
        }

        public FaceCrossCompareIntlResponseBodyResult setFacePassed(String facePassed) {
            this.facePassed = facePassed;
            return this;
        }
        public String getFacePassed() {
            return this.facePassed;
        }

        public FaceCrossCompareIntlResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
