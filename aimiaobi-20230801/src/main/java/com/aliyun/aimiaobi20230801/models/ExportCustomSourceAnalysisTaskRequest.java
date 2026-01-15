// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportCustomSourceAnalysisTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>jsonLine</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c9f226b02cca4f42a84c5e955c39dfd2</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExportCustomSourceAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomSourceAnalysisTaskRequest self = new ExportCustomSourceAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExportCustomSourceAnalysisTaskRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportCustomSourceAnalysisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExportCustomSourceAnalysisTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
