// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishCrossProjectPipelineRunRequest extends TeaModel {
    /**
     * <p>The ID of the cross-workspace publish flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcfd4160-e2ff-4603-9719-09128fe733df</p>
     */
    @NameInMap("PipelineRunId")
    public String pipelineRunId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The reason for stopping the cross-workspace publish flow.</p>
     * 
     * <strong>example:</strong>
     * <p>The target publish plan has changed. Stop the flow that has not been executed</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static AbolishCrossProjectPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        AbolishCrossProjectPipelineRunRequest self = new AbolishCrossProjectPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public AbolishCrossProjectPipelineRunRequest setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public AbolishCrossProjectPipelineRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AbolishCrossProjectPipelineRunRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
