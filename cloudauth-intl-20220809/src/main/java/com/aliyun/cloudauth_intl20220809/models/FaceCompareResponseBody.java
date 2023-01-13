// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCompareResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static class FaceCompareResponseBodyResult extends TeaModel {
        @NameInMap("FaceComparisonScore")
        public Double faceComparisonScore;

        @NameInMap("Passed")
        public String passed;

        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceCompareResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceCompareResponseBodyResult self = new FaceCompareResponseBodyResult();
            return TeaModel.build(map, self);
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
