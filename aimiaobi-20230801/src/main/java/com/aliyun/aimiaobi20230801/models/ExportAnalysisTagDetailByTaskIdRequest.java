// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportAnalysisTagDetailByTaskIdRequest extends TeaModel {
    /**
     * <p>Category filter list.</p>
     */
    @NameInMap("Categories")
    public java.util.List<String> categories;

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

    public static ExportAnalysisTagDetailByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportAnalysisTagDetailByTaskIdRequest self = new ExportAnalysisTagDetailByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public ExportAnalysisTagDetailByTaskIdRequest setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public ExportAnalysisTagDetailByTaskIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExportAnalysisTagDetailByTaskIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
