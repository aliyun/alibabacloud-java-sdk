// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PausePipelineResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace where the pipeline is located.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpaceName")
    public String agentSpaceName;

    /**
     * <p>The time when the pipeline was paused, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00.000Z</p>
     */
    @NameInMap("pauseTime")
    public String pauseTime;

    /**
     * <p>The reason for pausing the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>manual maintenance</p>
     */
    @NameInMap("pausedReason")
    public String pausedReason;

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
     * <p>The scheduling status. The value is fixed as Paused.</p>
     * 
     * <strong>example:</strong>
     * <p>Paused</p>
     */
    @NameInMap("scheduleStatus")
    public String scheduleStatus;

    public static PausePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PausePipelineResponseBody self = new PausePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public PausePipelineResponseBody setAgentSpaceName(String agentSpaceName) {
        this.agentSpaceName = agentSpaceName;
        return this;
    }
    public String getAgentSpaceName() {
        return this.agentSpaceName;
    }

    public PausePipelineResponseBody setPauseTime(String pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public String getPauseTime() {
        return this.pauseTime;
    }

    public PausePipelineResponseBody setPausedReason(String pausedReason) {
        this.pausedReason = pausedReason;
        return this;
    }
    public String getPausedReason() {
        return this.pausedReason;
    }

    public PausePipelineResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public PausePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PausePipelineResponseBody setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

}
