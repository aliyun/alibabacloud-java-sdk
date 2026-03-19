// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptArtifactExportResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>15aeb61b-cdeb-4b70-94d7-99518040647e</p>
     */
    @NameInMap("ExportTaskId")
    public String exportTaskId;

    /**
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetPptArtifactExportResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPptArtifactExportResultRequest self = new GetPptArtifactExportResultRequest();
        return TeaModel.build(map, self);
    }

    public GetPptArtifactExportResultRequest setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public GetPptArtifactExportResultRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
