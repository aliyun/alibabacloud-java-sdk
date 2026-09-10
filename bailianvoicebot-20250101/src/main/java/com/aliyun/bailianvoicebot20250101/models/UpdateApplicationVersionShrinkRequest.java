// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateApplicationVersionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("InteractionConfig")
    public String interactionConfigShrink;

    @NameInMap("LabelConfig")
    public String labelConfigShrink;

    @NameInMap("RagConfig")
    public String ragConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScriptProfile")
    public String scriptProfileShrink;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SynthesizerConfig")
    public String synthesizerConfigShrink;

    @NameInMap("ToolConfig")
    public String toolConfigShrink;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TranscriberConfig")
    public String transcriberConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static UpdateApplicationVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationVersionShrinkRequest self = new UpdateApplicationVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationVersionShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationVersionShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateApplicationVersionShrinkRequest setInteractionConfigShrink(String interactionConfigShrink) {
        this.interactionConfigShrink = interactionConfigShrink;
        return this;
    }
    public String getInteractionConfigShrink() {
        return this.interactionConfigShrink;
    }

    public UpdateApplicationVersionShrinkRequest setLabelConfigShrink(String labelConfigShrink) {
        this.labelConfigShrink = labelConfigShrink;
        return this;
    }
    public String getLabelConfigShrink() {
        return this.labelConfigShrink;
    }

    public UpdateApplicationVersionShrinkRequest setRagConfigShrink(String ragConfigShrink) {
        this.ragConfigShrink = ragConfigShrink;
        return this;
    }
    public String getRagConfigShrink() {
        return this.ragConfigShrink;
    }

    public UpdateApplicationVersionShrinkRequest setScriptProfileShrink(String scriptProfileShrink) {
        this.scriptProfileShrink = scriptProfileShrink;
        return this;
    }
    public String getScriptProfileShrink() {
        return this.scriptProfileShrink;
    }

    public UpdateApplicationVersionShrinkRequest setSynthesizerConfigShrink(String synthesizerConfigShrink) {
        this.synthesizerConfigShrink = synthesizerConfigShrink;
        return this;
    }
    public String getSynthesizerConfigShrink() {
        return this.synthesizerConfigShrink;
    }

    public UpdateApplicationVersionShrinkRequest setToolConfigShrink(String toolConfigShrink) {
        this.toolConfigShrink = toolConfigShrink;
        return this;
    }
    public String getToolConfigShrink() {
        return this.toolConfigShrink;
    }

    public UpdateApplicationVersionShrinkRequest setTranscriberConfigShrink(String transcriberConfigShrink) {
        this.transcriberConfigShrink = transcriberConfigShrink;
        return this;
    }
    public String getTranscriberConfigShrink() {
        return this.transcriberConfigShrink;
    }

    public UpdateApplicationVersionShrinkRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
