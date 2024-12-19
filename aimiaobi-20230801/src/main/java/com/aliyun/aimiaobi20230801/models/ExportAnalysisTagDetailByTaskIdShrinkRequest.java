// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportAnalysisTagDetailByTaskIdShrinkRequest extends TeaModel {
    @NameInMap("Categories")
    public String categoriesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExportAnalysisTagDetailByTaskIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportAnalysisTagDetailByTaskIdShrinkRequest self = new ExportAnalysisTagDetailByTaskIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportAnalysisTagDetailByTaskIdShrinkRequest setCategoriesShrink(String categoriesShrink) {
        this.categoriesShrink = categoriesShrink;
        return this;
    }
    public String getCategoriesShrink() {
        return this.categoriesShrink;
    }

    public ExportAnalysisTagDetailByTaskIdShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExportAnalysisTagDetailByTaskIdShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
