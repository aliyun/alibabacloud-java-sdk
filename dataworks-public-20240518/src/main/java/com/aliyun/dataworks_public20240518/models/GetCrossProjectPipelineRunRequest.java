// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrossProjectPipelineRunRequest extends TeaModel {
    /**
     * <p>The cross-workspace deployment flow ID.</p>
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

    public static GetCrossProjectPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrossProjectPipelineRunRequest self = new GetCrossProjectPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public GetCrossProjectPipelineRunRequest setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public GetCrossProjectPipelineRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
