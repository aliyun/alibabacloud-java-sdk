// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public RunAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EF4B5C9B-3BC8-5171-A47B-4C5CF3DC3258</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static RunAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunAgentResponseBody self = new RunAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public RunAgentResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public RunAgentResponseBody setData(RunAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunAgentResponseBodyData getData() {
        return this.data;
    }

    public RunAgentResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RunAgentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public RunAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RunAgentResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class RunAgentResponseBodyDataFunctionCallResponses extends TeaModel {
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-21 16:37:14</p>
         */
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("functionArgs")
        public String functionArgs;

        /**
         * <strong>example:</strong>
         * <p>web_search</p>
         */
        @NameInMap("functionName")
        public String functionName;

        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>2025-01-21 16:37:14</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static RunAgentResponseBodyDataFunctionCallResponses build(java.util.Map<String, ?> map) throws Exception {
            RunAgentResponseBodyDataFunctionCallResponses self = new RunAgentResponseBodyDataFunctionCallResponses();
            return TeaModel.build(map, self);
        }

        public RunAgentResponseBodyDataFunctionCallResponses setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RunAgentResponseBodyDataFunctionCallResponses setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public RunAgentResponseBodyDataFunctionCallResponses setFunctionArgs(String functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public String getFunctionArgs() {
            return this.functionArgs;
        }

        public RunAgentResponseBodyDataFunctionCallResponses setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public RunAgentResponseBodyDataFunctionCallResponses setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public RunAgentResponseBodyDataFunctionCallResponses setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class RunAgentResponseBodyDataResponseChoicesMessage extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("roleDisplayName")
        public String roleDisplayName;

        public static RunAgentResponseBodyDataResponseChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            RunAgentResponseBodyDataResponseChoicesMessage self = new RunAgentResponseBodyDataResponseChoicesMessage();
            return TeaModel.build(map, self);
        }

        public RunAgentResponseBodyDataResponseChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunAgentResponseBodyDataResponseChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public RunAgentResponseBodyDataResponseChoicesMessage setRoleDisplayName(String roleDisplayName) {
            this.roleDisplayName = roleDisplayName;
            return this;
        }
        public String getRoleDisplayName() {
            return this.roleDisplayName;
        }

    }

    public static class RunAgentResponseBodyDataResponseChoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("message")
        public RunAgentResponseBodyDataResponseChoicesMessage message;

        public static RunAgentResponseBodyDataResponseChoices build(java.util.Map<String, ?> map) throws Exception {
            RunAgentResponseBodyDataResponseChoices self = new RunAgentResponseBodyDataResponseChoices();
            return TeaModel.build(map, self);
        }

        public RunAgentResponseBodyDataResponseChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public RunAgentResponseBodyDataResponseChoices setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RunAgentResponseBodyDataResponseChoices setMessage(RunAgentResponseBodyDataResponseChoicesMessage message) {
            this.message = message;
            return this;
        }
        public RunAgentResponseBodyDataResponseChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class RunAgentResponseBodyDataResponse extends TeaModel {
        @NameInMap("choices")
        public java.util.List<RunAgentResponseBodyDataResponseChoices> choices;

        /**
         * <strong>example:</strong>
         * <p>1737448637</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <strong>example:</strong>
         * <p>d91d9afa-7cfc-4235-b012-a6f8e6ffa443</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>2025-01-21T16:37:17.497206762</p>
         */
        @NameInMap("time")
        public String time;

        public static RunAgentResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            RunAgentResponseBodyDataResponse self = new RunAgentResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public RunAgentResponseBodyDataResponse setChoices(java.util.List<RunAgentResponseBodyDataResponseChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<RunAgentResponseBodyDataResponseChoices> getChoices() {
            return this.choices;
        }

        public RunAgentResponseBodyDataResponse setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public RunAgentResponseBodyDataResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RunAgentResponseBodyDataResponse setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RunAgentResponseBodyDataResponse setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class RunAgentResponseBodyData extends TeaModel {
        @NameInMap("functionCallResponses")
        public java.util.List<RunAgentResponseBodyDataFunctionCallResponses> functionCallResponses;

        /**
         * <strong>example:</strong>
         * <p>766</p>
         */
        @NameInMap("inputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>988</p>
         */
        @NameInMap("outputTokens")
        public Integer outputTokens;

        @NameInMap("response")
        public RunAgentResponseBodyDataResponse response;

        /**
         * <strong>example:</strong>
         * <p>4vlag5ken3</p>
         */
        @NameInMap("threadId")
        public String threadId;

        /**
         * <strong>example:</strong>
         * <p>5bdb9809856c58acb92001f8ae65773c</p>
         */
        @NameInMap("traceId")
        public String traceId;

        /**
         * <strong>example:</strong>
         * <p>w4paqoezm2</p>
         */
        @NameInMap("versionId")
        public String versionId;

        public static RunAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunAgentResponseBodyData self = new RunAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunAgentResponseBodyData setFunctionCallResponses(java.util.List<RunAgentResponseBodyDataFunctionCallResponses> functionCallResponses) {
            this.functionCallResponses = functionCallResponses;
            return this;
        }
        public java.util.List<RunAgentResponseBodyDataFunctionCallResponses> getFunctionCallResponses() {
            return this.functionCallResponses;
        }

        public RunAgentResponseBodyData setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public RunAgentResponseBodyData setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public RunAgentResponseBodyData setResponse(RunAgentResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public RunAgentResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public RunAgentResponseBodyData setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

        public RunAgentResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public RunAgentResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
