// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class RunPipelineResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpaceName")
    public String agentSpaceName;

    /**
     * <p>The pipeline name.</p>
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
     * <p>The run ID created by this trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>run-20260101-0001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The current status of the run. The status is typically Pending after the run is queued.</p>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("status")
    public String status;

    public static RunPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunPipelineResponseBody self = new RunPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public RunPipelineResponseBody setAgentSpaceName(String agentSpaceName) {
        this.agentSpaceName = agentSpaceName;
        return this;
    }
    public String getAgentSpaceName() {
        return this.agentSpaceName;
    }

    public RunPipelineResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public RunPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunPipelineResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public RunPipelineResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
