// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeepfakeDetectResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DeepfakeDetectResponseBodyResultObject resultObject;

    public static DeepfakeDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectResponseBody self = new DeepfakeDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeepfakeDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeepfakeDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeepfakeDetectResponseBody setResultObject(DeepfakeDetectResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DeepfakeDetectResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DeepfakeDetectResponseBodyResultObject extends TeaModel {
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

        public static DeepfakeDetectResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeDetectResponseBodyResultObject self = new DeepfakeDetectResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DeepfakeDetectResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DeepfakeDetectResponseBodyResultObject setRiskScore(java.util.Map<String, String> riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        public DeepfakeDetectResponseBodyResultObject setRiskTag(String riskTag) {
            this.riskTag = riskTag;
            return this;
        }
        public String getRiskTag() {
            return this.riskTag;
        }

    }

}
