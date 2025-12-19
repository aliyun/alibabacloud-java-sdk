// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class BindPptArtifactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12342</p>
     */
    @NameInMap("ArtifactId")
    public Integer artifactId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>85da2bfe-6f05-41af-9841-d73c5bbf43a2</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-xgpt3m25qdosdjr3</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static BindPptArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        BindPptArtifactRequest self = new BindPptArtifactRequest();
        return TeaModel.build(map, self);
    }

    public BindPptArtifactRequest setArtifactId(Integer artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public Integer getArtifactId() {
        return this.artifactId;
    }

    public BindPptArtifactRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public BindPptArtifactRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
