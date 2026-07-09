// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ResumePipelineResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace where the pipeline is located.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpaceName")
    public String agentSpaceName;

    /**
     * <p>The committed watermark, in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("committedWatermark")
    public Long committedWatermark;

    /**
     * <p>The next scheduling trigger time, in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735664400</p>
     */
    @NameInMap("nextTriggerTime")
    public Long nextTriggerTime;

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
     * <p>The scheduling status. The value is fixed to Active.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("scheduleStatus")
    public String scheduleStatus;

    public static ResumePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumePipelineResponseBody self = new ResumePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumePipelineResponseBody setAgentSpaceName(String agentSpaceName) {
        this.agentSpaceName = agentSpaceName;
        return this;
    }
    public String getAgentSpaceName() {
        return this.agentSpaceName;
    }

    public ResumePipelineResponseBody setCommittedWatermark(Long committedWatermark) {
        this.committedWatermark = committedWatermark;
        return this;
    }
    public Long getCommittedWatermark() {
        return this.committedWatermark;
    }

    public ResumePipelineResponseBody setNextTriggerTime(Long nextTriggerTime) {
        this.nextTriggerTime = nextTriggerTime;
        return this;
    }
    public Long getNextTriggerTime() {
        return this.nextTriggerTime;
    }

    public ResumePipelineResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public ResumePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumePipelineResponseBody setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

}
