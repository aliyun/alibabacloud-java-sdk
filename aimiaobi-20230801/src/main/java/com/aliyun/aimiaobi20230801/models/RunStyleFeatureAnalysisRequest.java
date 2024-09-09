// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStyleFeatureAnalysisRequest extends TeaModel {
    @NameInMap("Contents")
    public java.util.List<String> contents;

    @NameInMap("MaterialIds")
    public java.util.List<Long> materialIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunStyleFeatureAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunStyleFeatureAnalysisRequest self = new RunStyleFeatureAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunStyleFeatureAnalysisRequest setContents(java.util.List<String> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<String> getContents() {
        return this.contents;
    }

    public RunStyleFeatureAnalysisRequest setMaterialIds(java.util.List<Long> materialIds) {
        this.materialIds = materialIds;
        return this;
    }
    public java.util.List<Long> getMaterialIds() {
        return this.materialIds;
    }

    public RunStyleFeatureAnalysisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
