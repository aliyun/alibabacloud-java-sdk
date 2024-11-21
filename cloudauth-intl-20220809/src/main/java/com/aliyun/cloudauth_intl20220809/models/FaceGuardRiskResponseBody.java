// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceGuardRiskResponseBody extends TeaModel {
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
     * <p>595E387B-3F0E-5C52-BD02-8EFE63D41FD5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public FaceGuardRiskResponseBodyResult result;

    public static FaceGuardRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceGuardRiskResponseBody self = new FaceGuardRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceGuardRiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FaceGuardRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FaceGuardRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceGuardRiskResponseBody setResult(FaceGuardRiskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public FaceGuardRiskResponseBodyResult getResult() {
        return this.result;
    }

    public static class FaceGuardRiskResponseBodyResult extends TeaModel {
        @NameInMap("RiskExtends")
        public String riskExtends;

        /**
         * <strong>example:</strong>
         * <p>ROOT,VPN,HOOK</p>
         */
        @NameInMap("RiskTags")
        public String riskTags;

        /**
         * <strong>example:</strong>
         * <p>hk573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static FaceGuardRiskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            FaceGuardRiskResponseBodyResult self = new FaceGuardRiskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public FaceGuardRiskResponseBodyResult setRiskExtends(String riskExtends) {
            this.riskExtends = riskExtends;
            return this;
        }
        public String getRiskExtends() {
            return this.riskExtends;
        }

        public FaceGuardRiskResponseBodyResult setRiskTags(String riskTags) {
            this.riskTags = riskTags;
            return this;
        }
        public String getRiskTags() {
            return this.riskTags;
        }

        public FaceGuardRiskResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
