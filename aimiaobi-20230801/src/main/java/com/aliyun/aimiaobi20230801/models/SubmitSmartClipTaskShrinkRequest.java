// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartClipTaskShrinkRequest extends TeaModel {
    @NameInMap("EditingConfig")
    public String editingConfigShrink;

    @NameInMap("ExtendParam")
    public String extendParam;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputConfig")
    public String inputConfigShrink;

    @NameInMap("OutputConfig")
    public String outputConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitSmartClipTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartClipTaskShrinkRequest self = new SubmitSmartClipTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmartClipTaskShrinkRequest setEditingConfigShrink(String editingConfigShrink) {
        this.editingConfigShrink = editingConfigShrink;
        return this;
    }
    public String getEditingConfigShrink() {
        return this.editingConfigShrink;
    }

    public SubmitSmartClipTaskShrinkRequest setExtendParam(String extendParam) {
        this.extendParam = extendParam;
        return this;
    }
    public String getExtendParam() {
        return this.extendParam;
    }

    public SubmitSmartClipTaskShrinkRequest setInputConfigShrink(String inputConfigShrink) {
        this.inputConfigShrink = inputConfigShrink;
        return this;
    }
    public String getInputConfigShrink() {
        return this.inputConfigShrink;
    }

    public SubmitSmartClipTaskShrinkRequest setOutputConfigShrink(String outputConfigShrink) {
        this.outputConfigShrink = outputConfigShrink;
        return this;
    }
    public String getOutputConfigShrink() {
        return this.outputConfigShrink;
    }

    public SubmitSmartClipTaskShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
