// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MaterialInspectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MaterialInspectionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("Result")
        public String result;

        /**
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
         * <strong>example:</strong>
         * <p>1项规则：1 PASS，所有检测项合规</p>
         */
        @NameInMap("Evidence")
        public String evidence;

        /**
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("OverallResult")
        public String overallResult;

        /**
         * <strong>example:</strong>
         * <p>req-001</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        @NameInMap("Steps")
        public java.util.List<MaterialInspectionResponseBodyDataResultSteps> steps;

        /**
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
        @NameInMap("Result")
        public MaterialInspectionResponseBodyDataResult result;

        /**
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
