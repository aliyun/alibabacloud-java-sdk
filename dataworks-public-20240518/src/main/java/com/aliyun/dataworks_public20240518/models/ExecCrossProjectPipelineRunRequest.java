// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecCrossProjectPipelineRunRequest extends TeaModel {
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

    public static ExecCrossProjectPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCrossProjectPipelineRunRequest self = new ExecCrossProjectPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public ExecCrossProjectPipelineRunRequest setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public ExecCrossProjectPipelineRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
