// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStyleFeatureAnalysisShrinkRequest extends TeaModel {
    @NameInMap("Contents")
    public String contentsShrink;

    @NameInMap("MaterialIds")
    public String materialIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunStyleFeatureAnalysisShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunStyleFeatureAnalysisShrinkRequest self = new RunStyleFeatureAnalysisShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunStyleFeatureAnalysisShrinkRequest setContentsShrink(String contentsShrink) {
        this.contentsShrink = contentsShrink;
        return this;
    }
    public String getContentsShrink() {
        return this.contentsShrink;
    }

    public RunStyleFeatureAnalysisShrinkRequest setMaterialIdsShrink(String materialIdsShrink) {
        this.materialIdsShrink = materialIdsShrink;
        return this;
    }
    public String getMaterialIdsShrink() {
        return this.materialIdsShrink;
    }

    public RunStyleFeatureAnalysisShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
