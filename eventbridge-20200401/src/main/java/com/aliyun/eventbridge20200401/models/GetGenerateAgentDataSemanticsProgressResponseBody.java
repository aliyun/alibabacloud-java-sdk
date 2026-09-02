// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetGenerateAgentDataSemanticsProgressResponseBody extends TeaModel {
    /**
     * <p>The response code of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The generation progress details. When the initial generation is complete, a full snapshot of the current generation round is returned. When regeneration is complete, the current Metrics, Joins, Examples, and new Text are returned. To discard a regeneration, first call Get to retrieve the current official version, and then call Save with the four types of content unchanged to idempotently clean up temporary results.</p>
     */
    @NameInMap("Data")
    public GetGenerateAgentDataSemanticsProgressResponseBodyData data;

    /**
     * <p>The response message. If the request fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Data semantics generation task not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5DAF96FB-A4DF-548C-B8A1-F2A8D2F4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetGenerateAgentDataSemanticsProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGenerateAgentDataSemanticsProgressResponseBody self = new GetGenerateAgentDataSemanticsProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGenerateAgentDataSemanticsProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGenerateAgentDataSemanticsProgressResponseBody setData(GetGenerateAgentDataSemanticsProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGenerateAgentDataSemanticsProgressResponseBodyData getData() {
        return this.data;
    }

    public GetGenerateAgentDataSemanticsProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGenerateAgentDataSemanticsProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGenerateAgentDataSemanticsProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGenerateAgentDataSemanticsProgressResponseBodyData extends TeaModel {
        /**
         * <p>The error code returned when the generation task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DataSemanticsGenerateFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the generation task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to generate data semantics. Please retry later.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The SQL example knowledge returned when the generation is complete. A maximum of 50 items can be returned.</p>
         */
        @NameInMap("Examples")
        public java.util.List<AgentDataSemanticsExample> examples;

        /**
         * <p>The data association knowledge returned when the generation is complete. A maximum of 100 items can be returned.</p>
         */
        @NameInMap("Joins")
        public java.util.List<AgentDataSemanticsJoin> joins;

        /**
         * <p>The SQL expression knowledge returned when the generation is complete. A maximum of 100 items can be returned.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<AgentDataSemanticsMetric> metrics;

        /**
         * <p>The four-phase stage progress. This parameter may not be returned when the overall generation is complete.</p>
         */
        @NameInMap("Progress")
        public java.util.List<AgentDataSemanticsStageProgress> progress;

        /**
         * <p>The current overall stage.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERATE</p>
         */
        @NameInMap("Stage")
        public String stage;

        /**
         * <p>The Markdown text knowledge returned when the generation is complete.</p>
         */
        @NameInMap("Text")
        public AgentDataSemanticsText text;

        public static GetGenerateAgentDataSemanticsProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGenerateAgentDataSemanticsProgressResponseBodyData self = new GetGenerateAgentDataSemanticsProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setExamples(java.util.List<AgentDataSemanticsExample> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<AgentDataSemanticsExample> getExamples() {
            return this.examples;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setJoins(java.util.List<AgentDataSemanticsJoin> joins) {
            this.joins = joins;
            return this;
        }
        public java.util.List<AgentDataSemanticsJoin> getJoins() {
            return this.joins;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setMetrics(java.util.List<AgentDataSemanticsMetric> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<AgentDataSemanticsMetric> getMetrics() {
            return this.metrics;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setProgress(java.util.List<AgentDataSemanticsStageProgress> progress) {
            this.progress = progress;
            return this;
        }
        public java.util.List<AgentDataSemanticsStageProgress> getProgress() {
            return this.progress;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBodyData setText(AgentDataSemanticsText text) {
            this.text = text;
            return this;
        }
        public AgentDataSemanticsText getText() {
            return this.text;
        }

    }

}
