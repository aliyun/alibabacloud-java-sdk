// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeepfakeDetectIntlStreamResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return message.</p>
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
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information.</p>
     */
    @NameInMap("ResultObject")
    public DeepfakeDetectIntlStreamResponseBodyResultObject resultObject;

    public static DeepfakeDetectIntlStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectIntlStreamResponseBody self = new DeepfakeDetectIntlStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectIntlStreamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeepfakeDetectIntlStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeepfakeDetectIntlStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeepfakeDetectIntlStreamResponseBody setResultObject(DeepfakeDetectIntlStreamResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DeepfakeDetectIntlStreamResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DeepfakeDetectIntlStreamResponseBodyResultObject extends TeaModel {
        /**
         * <p>The risk result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: low risk.</li>
         * <li><strong>1</strong>: high risk.</li>
         * <li><strong>2</strong>: suspicious.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The risk score map.</p>
         */
        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <p>The risk tags. Multiple tags are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>SuspectDeepForgery: suspected deepfake.</li>
         * <li>SuspectPSFace: suspected synthetic attack.</li>
         * <li>SuspectTemple: suspected template attack.</li>
         * <li>SuspectRemake: suspected presentation attack.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SuspectDeepForgery</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        /**
         * <p>The unique identifier of the authentication request.</p>
         * 
         * <strong>example:</strong>
         * <p>hksb7ba1b28130d24e015d69********</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static DeepfakeDetectIntlStreamResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeDetectIntlStreamResponseBodyResultObject self = new DeepfakeDetectIntlStreamResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DeepfakeDetectIntlStreamResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DeepfakeDetectIntlStreamResponseBodyResultObject setRiskScore(java.util.Map<String, String> riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        public DeepfakeDetectIntlStreamResponseBodyResultObject setRiskTag(String riskTag) {
            this.riskTag = riskTag;
            return this;
        }
        public String getRiskTag() {
            return this.riskTag;
        }

        public DeepfakeDetectIntlStreamResponseBodyResultObject setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
