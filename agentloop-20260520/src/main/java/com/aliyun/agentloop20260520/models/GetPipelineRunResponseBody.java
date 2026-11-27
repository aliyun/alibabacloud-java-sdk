// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpaceName")
    public String agentSpaceName;

    /**
     * <p>The list of asynchronous node execution statuses.</p>
     */
    @NameInMap("asyncNodes")
    public java.util.List<GetPipelineRunResponseBodyAsyncNodes> asyncNodes;

    /**
     * <p>The current number of retries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("attempt")
    public Integer attempt;

    /**
     * <p>The semantic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ExpressionEvaluationError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to evaluate filter expression in node &quot;node-1&quot;: column &quot;score&quot; does not exist.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The end time in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:10.000Z</p>
     */
    @NameInMap("finishTime")
    public String finishTime;

    /**
     * <p>The start time of the data window in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The maximum number of retries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxAttempts")
    public Integer maxAttempts;

    /**
     * <p>The next retry time in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:01:00.000Z</p>
     */
    @NameInMap("nextRetryTime")
    public String nextRetryTime;

    /**
     * <p>The list of node execution records.</p>
     */
    @NameInMap("nodeExecutions")
    public java.util.List<GetPipelineRunResponseBodyNodeExecutions> nodeExecutions;

    /**
     * <p>The name of the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>my-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The frozen pipeline configuration snapshot for this run.</p>
     */
    @NameInMap("pipelineSnapshot")
    public GetPipelineRunResponseBodyPipelineSnapshot pipelineSnapshot;

    /**
     * <p>The request ID used to locate the request during troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The inline run results. This parameter is returned only when output.inline is set to true during triggering.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;outputRows&quot;: 100, &quot;summary&quot;: &quot;processed 100 rows, 92 matched&quot;, &quot;passed&quot;: true}</p>
     */
    @NameInMap("results")
    public java.util.Map<String, ?> results;

    /**
     * <p>Run Id</p>
     * 
     * <strong>example:</strong>
     * <p>run-20260101-0001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The execution start time in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:01.000Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The run statistics, including processedRows (number of processed rows), processedBytes (number of processed bytes), outputRows (number of output rows), outputBytes (number of output bytes), elapsedMs (elapsed time in milliseconds), cpuSec (CPU seconds), cpuCores (number of CPU cores), and tokenCount (number of consumed tokens).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;processedRows&quot;:1000,&quot;elapsedMs&quot;:2500}</p>
     */
    @NameInMap("stats")
    public java.util.Map<String, ?> stats;

    /**
     * <p>The run status. Valid values: Pending, Running, Succeeded, Failed, and Cancelled.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The frozen task version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskVersion")
    public Integer taskVersion;

    /**
     * <p>The end time of the data window in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735747200</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    /**
     * <p>The total number of input records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    /**
     * <p>The trigger time in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00.000Z</p>
     */
    @NameInMap("triggerTime")
    public String triggerTime;

    /**
     * <p>The trigger type. Valid values: Scheduled, Manual, and RunOnce.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static GetPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunResponseBody self = new GetPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunResponseBody setAgentSpaceName(String agentSpaceName) {
        this.agentSpaceName = agentSpaceName;
        return this;
    }
    public String getAgentSpaceName() {
        return this.agentSpaceName;
    }

    public GetPipelineRunResponseBody setAsyncNodes(java.util.List<GetPipelineRunResponseBodyAsyncNodes> asyncNodes) {
        this.asyncNodes = asyncNodes;
        return this;
    }
    public java.util.List<GetPipelineRunResponseBodyAsyncNodes> getAsyncNodes() {
        return this.asyncNodes;
    }

    public GetPipelineRunResponseBody setAttempt(Integer attempt) {
        this.attempt = attempt;
        return this;
    }
    public Integer getAttempt() {
        return this.attempt;
    }

    public GetPipelineRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineRunResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetPipelineRunResponseBody setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public GetPipelineRunResponseBody setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
        return this;
    }
    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    public GetPipelineRunResponseBody setNextRetryTime(String nextRetryTime) {
        this.nextRetryTime = nextRetryTime;
        return this;
    }
    public String getNextRetryTime() {
        return this.nextRetryTime;
    }

    public GetPipelineRunResponseBody setNodeExecutions(java.util.List<GetPipelineRunResponseBodyNodeExecutions> nodeExecutions) {
        this.nodeExecutions = nodeExecutions;
        return this;
    }
    public java.util.List<GetPipelineRunResponseBodyNodeExecutions> getNodeExecutions() {
        return this.nodeExecutions;
    }

    public GetPipelineRunResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public GetPipelineRunResponseBody setPipelineSnapshot(GetPipelineRunResponseBodyPipelineSnapshot pipelineSnapshot) {
        this.pipelineSnapshot = pipelineSnapshot;
        return this;
    }
    public GetPipelineRunResponseBodyPipelineSnapshot getPipelineSnapshot() {
        return this.pipelineSnapshot;
    }

    public GetPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineRunResponseBody setResults(java.util.Map<String, ?> results) {
        this.results = results;
        return this;
    }
    public java.util.Map<String, ?> getResults() {
        return this.results;
    }

    public GetPipelineRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetPipelineRunResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetPipelineRunResponseBody setStats(java.util.Map<String, ?> stats) {
        this.stats = stats;
        return this;
    }
    public java.util.Map<String, ?> getStats() {
        return this.stats;
    }

    public GetPipelineRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetPipelineRunResponseBody setTaskVersion(Integer taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }
    public Integer getTaskVersion() {
        return this.taskVersion;
    }

    public GetPipelineRunResponseBody setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public GetPipelineRunResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetPipelineRunResponseBody setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }
    public String getTriggerTime() {
        return this.triggerTime;
    }

    public GetPipelineRunResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public static class GetPipelineRunResponseBodyAsyncNodes extends TeaModel {
        /**
         * <p>The number of execution attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("attempt")
        public Integer attempt;

        /**
         * <p>The external task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hs-001</p>
         */
        @NameInMap("externalTaskId")
        public String externalTaskId;

        /**
         * <p>The number of failed records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failedCount")
        public Long failedCount;

        /**
         * <p>The number of consumed input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <p>The number of ready work items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("itemReadyCount")
        public Long itemReadyCount;

        /**
         * <p>The latest error message.</p>
         * 
         * <strong>example:</strong>
         * <p>example-error</p>
         */
        @NameInMap("lastError")
        public String lastError;

        /**
         * <p>The node execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ne-001</p>
         */
        @NameInMap("nodeExecutionId")
        public String nodeExecutionId;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>stage-1</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>annotation</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>The number of consumed output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <p>The total number of records in the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("recordCount")
        public Long recordCount;

        /**
         * <p>Indicates whether the node has been routed to the downstream stage.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("routed")
        public Boolean routed;

        /**
         * <p>The latest signal type.</p>
         * 
         * <strong>example:</strong>
         * <p>STAGE_COMPLETED</p>
         */
        @NameInMap("signalType")
        public String signalType;

        /**
         * <p>The number of start attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startAttempts")
        public Integer startAttempts;

        /**
         * <p>The asynchronous node status.</p>
         * 
         * <strong>example:</strong>
         * <p>WAITING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("taskVersion")
        public Integer taskVersion;

        /**
         * <p>The total number of consumed tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetPipelineRunResponseBodyAsyncNodes build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyAsyncNodes self = new GetPipelineRunResponseBodyAsyncNodes();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyAsyncNodes setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public GetPipelineRunResponseBodyAsyncNodes setExternalTaskId(String externalTaskId) {
            this.externalTaskId = externalTaskId;
            return this;
        }
        public String getExternalTaskId() {
            return this.externalTaskId;
        }

        public GetPipelineRunResponseBodyAsyncNodes setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public GetPipelineRunResponseBodyAsyncNodes setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetPipelineRunResponseBodyAsyncNodes setItemReadyCount(Long itemReadyCount) {
            this.itemReadyCount = itemReadyCount;
            return this;
        }
        public Long getItemReadyCount() {
            return this.itemReadyCount;
        }

        public GetPipelineRunResponseBodyAsyncNodes setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public GetPipelineRunResponseBodyAsyncNodes setNodeExecutionId(String nodeExecutionId) {
            this.nodeExecutionId = nodeExecutionId;
            return this;
        }
        public String getNodeExecutionId() {
            return this.nodeExecutionId;
        }

        public GetPipelineRunResponseBodyAsyncNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPipelineRunResponseBodyAsyncNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetPipelineRunResponseBodyAsyncNodes setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetPipelineRunResponseBodyAsyncNodes setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public GetPipelineRunResponseBodyAsyncNodes setRouted(Boolean routed) {
            this.routed = routed;
            return this;
        }
        public Boolean getRouted() {
            return this.routed;
        }

        public GetPipelineRunResponseBodyAsyncNodes setSignalType(String signalType) {
            this.signalType = signalType;
            return this;
        }
        public String getSignalType() {
            return this.signalType;
        }

        public GetPipelineRunResponseBodyAsyncNodes setStartAttempts(Integer startAttempts) {
            this.startAttempts = startAttempts;
            return this;
        }
        public Integer getStartAttempts() {
            return this.startAttempts;
        }

        public GetPipelineRunResponseBodyAsyncNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineRunResponseBodyAsyncNodes setTaskVersion(Integer taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }
        public Integer getTaskVersion() {
            return this.taskVersion;
        }

        public GetPipelineRunResponseBodyAsyncNodes setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetPipelineRunResponseBodyNodeExecutionsInputRef extends TeaModel {
        /**
         * <p>The immutable data boundary identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("boundary")
        public String boundary;

        /**
         * <p>The data digest.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:abcdef</p>
         */
        @NameInMap("digest")
        public String digest;

        /**
         * <p>The reference data type.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The data owner identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The data resource identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-001</p>
         */
        @NameInMap("resource")
        public String resource;

        /**
         * <p>The data schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schemaVersion")
        public String schemaVersion;

        public static GetPipelineRunResponseBodyNodeExecutionsInputRef build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyNodeExecutionsInputRef self = new GetPipelineRunResponseBodyNodeExecutionsInputRef();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyNodeExecutionsInputRef setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public GetPipelineRunResponseBodyNodeExecutionsInputRef setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetPipelineRunResponseBodyNodeExecutionsInputRef setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetPipelineRunResponseBodyNodeExecutionsInputRef setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPipelineRunResponseBodyNodeExecutionsInputRef setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GetPipelineRunResponseBodyNodeExecutionsInputRef setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class GetPipelineRunResponseBodyNodeExecutionsOutputRef extends TeaModel {
        /**
         * <p>The immutable data boundary identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("boundary")
        public String boundary;

        /**
         * <p>The data digest.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:abcdef</p>
         */
        @NameInMap("digest")
        public String digest;

        /**
         * <p>The reference data type.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The data owner identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The data resource identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-001</p>
         */
        @NameInMap("resource")
        public String resource;

        /**
         * <p>The data schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schemaVersion")
        public String schemaVersion;

        public static GetPipelineRunResponseBodyNodeExecutionsOutputRef build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyNodeExecutionsOutputRef self = new GetPipelineRunResponseBodyNodeExecutionsOutputRef();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyNodeExecutionsOutputRef setBoundary(String boundary) {
            this.boundary = boundary;
            return this;
        }
        public String getBoundary() {
            return this.boundary;
        }

        public GetPipelineRunResponseBodyNodeExecutionsOutputRef setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetPipelineRunResponseBodyNodeExecutionsOutputRef setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetPipelineRunResponseBodyNodeExecutionsOutputRef setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPipelineRunResponseBodyNodeExecutionsOutputRef setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GetPipelineRunResponseBodyNodeExecutionsOutputRef setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class GetPipelineRunResponseBodyNodeExecutions extends TeaModel {
        /**
         * <p>The number of execution attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("attempt")
        public Integer attempt;

        /**
         * <p>The completion event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-001</p>
         */
        @NameInMap("completionEventId")
        public String completionEventId;

        /**
         * <p>The node error code.</p>
         * 
         * <strong>example:</strong>
         * <p>StageFailed</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The node error message.</p>
         * 
         * <strong>example:</strong>
         * <p>stage execution failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The external task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hs-001</p>
         */
        @NameInMap("externalTaskId")
        public String externalTaskId;

        /**
         * <p>The node end time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:10Z</p>
         */
        @NameInMap("finishedAtTime")
        public String finishedAtTime;

        /**
         * <p>The number of input records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("inputCount")
        public Long inputCount;

        /**
         * <p>The node input data reference.</p>
         */
        @NameInMap("inputRef")
        public GetPipelineRunResponseBodyNodeExecutionsInputRef inputRef;

        /**
         * <p>The node execution mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ASYNC</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The node execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ne-001</p>
         */
        @NameInMap("nodeExecutionId")
        public String nodeExecutionId;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>stage-1</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>annotation</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>The node execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The number of output records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("outputCount")
        public Long outputCount;

        /**
         * <p>The node output data reference.</p>
         */
        @NameInMap("outputRef")
        public GetPipelineRunResponseBodyNodeExecutionsOutputRef outputRef;

        /**
         * <p>The output start resource identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset-001</p>
         */
        @NameInMap("outputStartResource")
        public String outputStartResource;

        /**
         * <p>The output start sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("outputStartSeq")
        public Long outputStartSeq;

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>run-20260101-0001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The node start time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:01Z</p>
         */
        @NameInMap("startedAtTime")
        public String startedAtTime;

        /**
         * <p>The node execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>WAITING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("taskVersion")
        public Integer taskVersion;

        public static GetPipelineRunResponseBodyNodeExecutions build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyNodeExecutions self = new GetPipelineRunResponseBodyNodeExecutions();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyNodeExecutions setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public GetPipelineRunResponseBodyNodeExecutions setCompletionEventId(String completionEventId) {
            this.completionEventId = completionEventId;
            return this;
        }
        public String getCompletionEventId() {
            return this.completionEventId;
        }

        public GetPipelineRunResponseBodyNodeExecutions setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetPipelineRunResponseBodyNodeExecutions setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetPipelineRunResponseBodyNodeExecutions setExternalTaskId(String externalTaskId) {
            this.externalTaskId = externalTaskId;
            return this;
        }
        public String getExternalTaskId() {
            return this.externalTaskId;
        }

        public GetPipelineRunResponseBodyNodeExecutions setFinishedAtTime(String finishedAtTime) {
            this.finishedAtTime = finishedAtTime;
            return this;
        }
        public String getFinishedAtTime() {
            return this.finishedAtTime;
        }

        public GetPipelineRunResponseBodyNodeExecutions setInputCount(Long inputCount) {
            this.inputCount = inputCount;
            return this;
        }
        public Long getInputCount() {
            return this.inputCount;
        }

        public GetPipelineRunResponseBodyNodeExecutions setInputRef(GetPipelineRunResponseBodyNodeExecutionsInputRef inputRef) {
            this.inputRef = inputRef;
            return this;
        }
        public GetPipelineRunResponseBodyNodeExecutionsInputRef getInputRef() {
            return this.inputRef;
        }

        public GetPipelineRunResponseBodyNodeExecutions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetPipelineRunResponseBodyNodeExecutions setNodeExecutionId(String nodeExecutionId) {
            this.nodeExecutionId = nodeExecutionId;
            return this;
        }
        public String getNodeExecutionId() {
            return this.nodeExecutionId;
        }

        public GetPipelineRunResponseBodyNodeExecutions setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPipelineRunResponseBodyNodeExecutions setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetPipelineRunResponseBodyNodeExecutions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetPipelineRunResponseBodyNodeExecutions setOutputCount(Long outputCount) {
            this.outputCount = outputCount;
            return this;
        }
        public Long getOutputCount() {
            return this.outputCount;
        }

        public GetPipelineRunResponseBodyNodeExecutions setOutputRef(GetPipelineRunResponseBodyNodeExecutionsOutputRef outputRef) {
            this.outputRef = outputRef;
            return this;
        }
        public GetPipelineRunResponseBodyNodeExecutionsOutputRef getOutputRef() {
            return this.outputRef;
        }

        public GetPipelineRunResponseBodyNodeExecutions setOutputStartResource(String outputStartResource) {
            this.outputStartResource = outputStartResource;
            return this;
        }
        public String getOutputStartResource() {
            return this.outputStartResource;
        }

        public GetPipelineRunResponseBodyNodeExecutions setOutputStartSeq(Long outputStartSeq) {
            this.outputStartSeq = outputStartSeq;
            return this;
        }
        public Long getOutputStartSeq() {
            return this.outputStartSeq;
        }

        public GetPipelineRunResponseBodyNodeExecutions setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetPipelineRunResponseBodyNodeExecutions setStartedAtTime(String startedAtTime) {
            this.startedAtTime = startedAtTime;
            return this;
        }
        public String getStartedAtTime() {
            return this.startedAtTime;
        }

        public GetPipelineRunResponseBodyNodeExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineRunResponseBodyNodeExecutions setTaskVersion(Integer taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }
        public Integer getTaskVersion() {
            return this.taskVersion;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineSnapshotNodes extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>stage-1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The node parameters in a key-value structure, which vary depending on the node type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;stageId&quot;:&quot;stage-1&quot;}</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The node path.</p>
         * 
         * <strong>example:</strong>
         * <p>/stage-1</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>annotation</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineRunResponseBodyPipelineSnapshotNodes build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineSnapshotNodes self = new GetPipelineRunResponseBodyPipelineSnapshotNodes();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineSnapshotNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPipelineRunResponseBodyPipelineSnapshotNodes setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetPipelineRunResponseBodyPipelineSnapshotNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetPipelineRunResponseBodyPipelineSnapshotNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineRunResponseBodyPipelineSnapshot extends TeaModel {
        /**
         * <p>The list of frozen orchestration nodes.</p>
         */
        @NameInMap("nodes")
        public java.util.List<GetPipelineRunResponseBodyPipelineSnapshotNodes> nodes;

        public static GetPipelineRunResponseBodyPipelineSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineSnapshot self = new GetPipelineRunResponseBodyPipelineSnapshot();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineSnapshot setNodes(java.util.List<GetPipelineRunResponseBodyPipelineSnapshotNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineSnapshotNodes> getNodes() {
            return this.nodes;
        }

    }

}
