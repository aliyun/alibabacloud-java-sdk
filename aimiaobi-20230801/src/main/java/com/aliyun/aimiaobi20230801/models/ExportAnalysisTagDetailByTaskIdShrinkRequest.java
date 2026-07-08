// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportAnalysisTagDetailByTaskIdShrinkRequest extends TeaModel {
    /**
     * <p>Category filter list.</p>
     */
    @NameInMap("Categories")
    public String categoriesShrink;

    /**
     * <p>Unique task ID.</p>
     * <blockquote>
     * <p>By default, do not specify TaskId. The system automatically generates it. If subsequent tasks use the same TaskId, they belong to the same conversation group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Unique identifier for Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get Workspace ID</a>.</p>
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
