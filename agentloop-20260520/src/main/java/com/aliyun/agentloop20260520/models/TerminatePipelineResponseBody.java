// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class TerminatePipelineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpaceName")
    public String agentSpaceName;

    /**
     * <strong>example:</strong>
     * <p>my-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Terminated</p>
     */
    @NameInMap("scheduleStatus")
    public String scheduleStatus;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00.000Z</p>
     */
    @NameInMap("terminateTime")
    public String terminateTime;

    /**
     * <strong>example:</strong>
     * <p>project deprecated</p>
     */
    @NameInMap("terminatedReason")
    public String terminatedReason;

    public static TerminatePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminatePipelineResponseBody self = new TerminatePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminatePipelineResponseBody setAgentSpaceName(String agentSpaceName) {
        this.agentSpaceName = agentSpaceName;
        return this;
    }
    public String getAgentSpaceName() {
        return this.agentSpaceName;
    }

    public TerminatePipelineResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public TerminatePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TerminatePipelineResponseBody setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

    public TerminatePipelineResponseBody setTerminateTime(String terminateTime) {
        this.terminateTime = terminateTime;
        return this;
    }
    public String getTerminateTime() {
        return this.terminateTime;
    }

    public TerminatePipelineResponseBody setTerminatedReason(String terminatedReason) {
        this.terminatedReason = terminatedReason;
        return this;
    }
    public String getTerminatedReason() {
        return this.terminatedReason;
    }

}
