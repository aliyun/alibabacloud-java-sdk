// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartClipTaskShrinkRequest extends TeaModel {
    /**
     * <p>Video editing configuration.</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfigShrink;

    /**
     * <p>Additional extended parameters. These parameters merge with InputConfig, OutputConfig, and EditingConfig.</p>
     */
    @NameInMap("ExtendParam")
    public String extendParam;

    /**
     * <p>Input configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputConfig")
    public String inputConfigShrink;

    /**
     * <p>Output configuration.</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfigShrink;

    /**
     * <p>Alibaba Cloud Model Studio workspace ID. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>业务空间ID</p>
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
