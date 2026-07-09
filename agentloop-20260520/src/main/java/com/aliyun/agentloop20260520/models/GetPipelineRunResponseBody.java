// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace to which the pipeline belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpaceName")
    public String agentSpaceName;

    /**
     * <p>The current retry count.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("attempt")
    public Integer attempt;

    /**
     * <p>The semantic error code.</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The finish time, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:10.000Z</p>
     */
    @NameInMap("finishTime")
    public String finishTime;

    /**
     * <p>The start of the data window, in UNIX seconds.</p>
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
     * <p>The next retry time, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:01:00.000Z</p>
     */
    @NameInMap("nextRetryTime")
    public String nextRetryTime;

    /**
     * <p>The name of the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>my-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The inline run results. This field is returned only when output.inline is set to true at trigger time.</p>
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
     * <p>The execution start time, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:01.000Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The run statistics, including processedRows (number of processed rows), processedBytes (number of processed bytes), outputRows (number of output rows), outputBytes (number of output bytes), elapsedMs (elapsed time in milliseconds), cpuSec (CPU seconds), cpuCores (number of CPU cores), and tokenCount (number of tokens consumed).</p>
     */
    @NameInMap("stats")
    public java.util.Map<String, ?> stats;

    /**
     * <p>The run status. Valid values:</p>
     * <ul>
     * <li>Pending</li>
     * <li>Running</li>
     * <li>Succeeded</li>
     * <li>Failed</li>
     * <li>Cancelled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The end of the data window, in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735747200</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    /**
     * <p>The trigger time, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00.000Z</p>
     */
    @NameInMap("triggerTime")
    public String triggerTime;

    /**
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li>Scheduled</li>
     * <li>Manual</li>
     * <li>RunOnce</li>
     * </ul>
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

    public GetPipelineRunResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
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

    public GetPipelineRunResponseBody setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
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

}
