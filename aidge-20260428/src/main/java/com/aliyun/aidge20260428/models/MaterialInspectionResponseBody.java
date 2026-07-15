// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MaterialInspectionResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned for successful calls.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The material display detection result.</p>
     */
    @NameInMap("Data")
    public MaterialInspectionResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned for successful calls.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values: true: The call was successful. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MaterialInspectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaterialInspectionResponseBody self = new MaterialInspectionResponseBody();
        return TeaModel.build(map, self);
    }

    public MaterialInspectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MaterialInspectionResponseBody setData(MaterialInspectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MaterialInspectionResponseBodyData getData() {
        return this.data;
    }

    public MaterialInspectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MaterialInspectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MaterialInspectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MaterialInspectionResponseBodyDataResultSteps extends TeaModel {
        /**
         * <p>The step result. Valid values: PASS, FAIL, and UNABLE_TO_JUDGE.</p>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The step ID.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("StepId")
        public String stepId;

        public static MaterialInspectionResponseBodyDataResultSteps build(java.util.Map<String, ?> map) throws Exception {
            MaterialInspectionResponseBodyDataResultSteps self = new MaterialInspectionResponseBodyDataResultSteps();
            return TeaModel.build(map, self);
        }

        public MaterialInspectionResponseBodyDataResultSteps setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public MaterialInspectionResponseBodyDataResultSteps setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

    }

    public static class MaterialInspectionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The natural language summary, such as &quot;1 rule: 1 PASS, all inspection items are compliant.&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>1项规则：1 PASS，所有检测项合规</p>
         */
        @NameInMap("Evidence")
        public String evidence;

        /**
         * <p>The overall result. Valid values: PASS and FAIL.</p>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("OverallResult")
        public String overallResult;

        /**
         * <p>The request ID returned as-is from the input.</p>
         * 
         * <strong>example:</strong>
         * <p>req-001</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        /**
         * <p>The list of detection steps.</p>
         */
        @NameInMap("Steps")
        public java.util.List<MaterialInspectionResponseBodyDataResultSteps> steps;

        /**
         * <p>The detection type.</p>
         * 
         * <strong>example:</strong>
         * <p>Stamp</p>
         */
        @NameInMap("Type")
        public String type;

        public static MaterialInspectionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MaterialInspectionResponseBodyDataResult self = new MaterialInspectionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MaterialInspectionResponseBodyDataResult setEvidence(String evidence) {
            this.evidence = evidence;
            return this;
        }
        public String getEvidence() {
            return this.evidence;
        }

        public MaterialInspectionResponseBodyDataResult setOverallResult(String overallResult) {
            this.overallResult = overallResult;
            return this;
        }
        public String getOverallResult() {
            return this.overallResult;
        }

        public MaterialInspectionResponseBodyDataResult setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public MaterialInspectionResponseBodyDataResult setSteps(java.util.List<MaterialInspectionResponseBodyDataResultSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<MaterialInspectionResponseBodyDataResultSteps> getSteps() {
            return this.steps;
        }

        public MaterialInspectionResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MaterialInspectionResponseBodyData extends TeaModel {
        /**
         * <p>The inspection result.</p>
         */
        @NameInMap("Result")
        public MaterialInspectionResponseBodyDataResult result;

        /**
         * <p>The usage information. The key is the usage metric name and the value is the count.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MaterialInspectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MaterialInspectionResponseBodyData self = new MaterialInspectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MaterialInspectionResponseBodyData setResult(MaterialInspectionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public MaterialInspectionResponseBodyDataResult getResult() {
            return this.result;
        }

        public MaterialInspectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
