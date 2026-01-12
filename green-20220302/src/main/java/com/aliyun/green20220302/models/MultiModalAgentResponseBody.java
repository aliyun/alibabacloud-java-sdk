// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MultiModalAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MultiModalAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiModalAgentResponseBody self = new MultiModalAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiModalAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MultiModalAgentResponseBody setData(MultiModalAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiModalAgentResponseBodyData getData() {
        return this.data;
    }

    public MultiModalAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiModalAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MultiModalAgentResponseBodyDataResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>TRACER_SLB_ALL_DEST_WEIGHT_0</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static MultiModalAgentResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MultiModalAgentResponseBodyDataResult self = new MultiModalAgentResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MultiModalAgentResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MultiModalAgentResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MultiModalAgentResponseBodyDataResult setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class MultiModalAgentResponseBodyDataUsage extends TeaModel {
        @NameInMap("AgentDetail")
        public java.util.Map<String, ?> agentDetail;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ContentLength")
        public Long contentLength;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PromptLength")
        public Long promptLength;

        public static MultiModalAgentResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            MultiModalAgentResponseBodyDataUsage self = new MultiModalAgentResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public MultiModalAgentResponseBodyDataUsage setAgentDetail(java.util.Map<String, ?> agentDetail) {
            this.agentDetail = agentDetail;
            return this;
        }
        public java.util.Map<String, ?> getAgentDetail() {
            return this.agentDetail;
        }

        public MultiModalAgentResponseBodyDataUsage setContentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }
        public Long getContentLength() {
            return this.contentLength;
        }

        public MultiModalAgentResponseBodyDataUsage setPromptLength(Long promptLength) {
            this.promptLength = promptLength;
            return this;
        }
        public Long getPromptLength() {
            return this.promptLength;
        }

    }

    public static class MultiModalAgentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Result")
        public java.util.List<MultiModalAgentResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Usage")
        public MultiModalAgentResponseBodyDataUsage usage;

        public static MultiModalAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiModalAgentResponseBodyData self = new MultiModalAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiModalAgentResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public MultiModalAgentResponseBodyData setResult(java.util.List<MultiModalAgentResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<MultiModalAgentResponseBodyDataResult> getResult() {
            return this.result;
        }

        public MultiModalAgentResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public MultiModalAgentResponseBodyData setUsage(MultiModalAgentResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public MultiModalAgentResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
