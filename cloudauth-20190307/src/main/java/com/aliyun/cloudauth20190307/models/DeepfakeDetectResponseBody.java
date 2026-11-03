// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeepfakeDetectResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success, and other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
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
     * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
         * <p>The facial attribute output fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;age\&quot;:49,\&quot;env\&quot;:\&quot;other\&quot;,\&quot;expression\&quot;:0,\&quot;gender\&quot;:1,\&quot;glasses\&quot;:1,\&quot;hat\&quot;:0,\&quot;mask\&quot;:0,\&quot;others\&quot;:0,\&quot;smoking\&quot;:0,\&quot;tattoo\&quot;:0}</p>
         */
        @NameInMap("FaceAttributeInfo")
        public String faceAttributeInfo;

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
         * <p>The map of risk scores.</p>
         */
        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <p>The risk tags. Multiple tags are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>SuspectDeepForgery: suspected deepfake.</li>
         * <li>SuspectPSFace: suspected synthetic attack.</li>
         * <li>SuspectTemple: suspected black market attack.</li>
         * <li>SuspectRemake: suspected recaptured face.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SuspectDeepForgery, SuspectPSFace</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        public static DeepfakeDetectResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeDetectResponseBodyResultObject self = new DeepfakeDetectResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DeepfakeDetectResponseBodyResultObject setFaceAttributeInfo(String faceAttributeInfo) {
            this.faceAttributeInfo = faceAttributeInfo;
            return this;
        }
        public String getFaceAttributeInfo() {
            return this.faceAttributeInfo;
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
