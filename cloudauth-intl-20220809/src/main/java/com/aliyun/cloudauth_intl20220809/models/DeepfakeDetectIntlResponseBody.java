// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeepfakeDetectIntlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <strong>example:</strong>
     * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DeepfakeDetectIntlResponseBodyResultObject resultObject;

    public static DeepfakeDetectIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectIntlResponseBody self = new DeepfakeDetectIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeepfakeDetectIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeepfakeDetectIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeepfakeDetectIntlResponseBody setResultObject(DeepfakeDetectIntlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DeepfakeDetectIntlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DeepfakeDetectIntlResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <strong>example:</strong>
         * <p>SuspectDeepForgery,SuspectWarterMark</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        public static DeepfakeDetectIntlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeDetectIntlResponseBodyResultObject self = new DeepfakeDetectIntlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DeepfakeDetectIntlResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DeepfakeDetectIntlResponseBodyResultObject setRiskScore(java.util.Map<String, String> riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        public DeepfakeDetectIntlResponseBodyResultObject setRiskTag(String riskTag) {
            this.riskTag = riskTag;
            return this;
        }
        public String getRiskTag() {
            return this.riskTag;
        }

    }

}
