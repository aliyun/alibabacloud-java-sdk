// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DiduiAreaDeductionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The floor display area inference result.</p>
     */
    @NameInMap("Data")
    public DiduiAreaDeductionResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DiduiAreaDeductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiduiAreaDeductionResponseBody self = new DiduiAreaDeductionResponseBody();
        return TeaModel.build(map, self);
    }

    public DiduiAreaDeductionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DiduiAreaDeductionResponseBody setData(DiduiAreaDeductionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DiduiAreaDeductionResponseBodyData getData() {
        return this.data;
    }

    public DiduiAreaDeductionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DiduiAreaDeductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiduiAreaDeductionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel extends TeaModel {
        /**
         * <p>The floor display area, in square meters.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5334</p>
         */
        @NameInMap("AreaM2")
        public Double areaM2;

        /**
         * <p>The left edge length, in meters.</p>
         * 
         * <strong>example:</strong>
         * <p>1.025</p>
         */
        @NameInMap("LeftEdgeM")
        public Double leftEdgeM;

        /**
         * <p>The right edge length, in meters.</p>
         * 
         * <strong>example:</strong>
         * <p>1.419</p>
         */
        @NameInMap("RightEdgeM")
        public Double rightEdgeM;

        public static DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel build(java.util.Map<String, ?> map) throws Exception {
            DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel self = new DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel();
            return TeaModel.build(map, self);
        }

        public DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel setAreaM2(Double areaM2) {
            this.areaM2 = areaM2;
            return this;
        }
        public Double getAreaM2() {
            return this.areaM2;
        }

        public DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel setLeftEdgeM(Double leftEdgeM) {
            this.leftEdgeM = leftEdgeM;
            return this;
        }
        public Double getLeftEdgeM() {
            return this.leftEdgeM;
        }

        public DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel setRightEdgeM(Double rightEdgeM) {
            this.rightEdgeM = rightEdgeM;
            return this;
        }
        public Double getRightEdgeM() {
            return this.rightEdgeM;
        }

    }

    public static class DiduiAreaDeductionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The stage 4 area label.</p>
         */
        @NameInMap("Stage4AreaLabel")
        public DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel stage4AreaLabel;

        public static DiduiAreaDeductionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DiduiAreaDeductionResponseBodyDataResult self = new DiduiAreaDeductionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DiduiAreaDeductionResponseBodyDataResult setStage4AreaLabel(DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel stage4AreaLabel) {
            this.stage4AreaLabel = stage4AreaLabel;
            return this;
        }
        public DiduiAreaDeductionResponseBodyDataResultStage4AreaLabel getStage4AreaLabel() {
            return this.stage4AreaLabel;
        }

    }

    public static class DiduiAreaDeductionResponseBodyData extends TeaModel {
        /**
         * <p>The number of downstream call attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attempts")
        public Integer attempts;

        /**
         * <p>The workflow error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The downstream HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        /**
         * <p>The downstream call latency, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LatencyMs")
        public Long latencyMs;

        /**
         * <p>The workflow description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The model request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>model_req_id_xx</p>
         */
        @NameInMap("ModelRequestId")
        public String modelRequestId;

        /**
         * <p>The business request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>643913D2-063F-599C-B3DF-B8D415CE171F</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        /**
         * <p>The area calculation result.</p>
         */
        @NameInMap("Result")
        public DiduiAreaDeductionResponseBodyDataResult result;

        /**
         * <p>The workflow status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The workflow business status.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static DiduiAreaDeductionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DiduiAreaDeductionResponseBodyData self = new DiduiAreaDeductionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DiduiAreaDeductionResponseBodyData setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public DiduiAreaDeductionResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DiduiAreaDeductionResponseBodyData setHttpStatus(Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        public DiduiAreaDeductionResponseBodyData setLatencyMs(Long latencyMs) {
            this.latencyMs = latencyMs;
            return this;
        }
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        public DiduiAreaDeductionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DiduiAreaDeductionResponseBodyData setModelRequestId(String modelRequestId) {
            this.modelRequestId = modelRequestId;
            return this;
        }
        public String getModelRequestId() {
            return this.modelRequestId;
        }

        public DiduiAreaDeductionResponseBodyData setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public DiduiAreaDeductionResponseBodyData setResult(DiduiAreaDeductionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public DiduiAreaDeductionResponseBodyDataResult getResult() {
            return this.result;
        }

        public DiduiAreaDeductionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DiduiAreaDeductionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DiduiAreaDeductionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
