// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateApplicationVersionShrinkRequest extends TeaModel {
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

    @NameInMap("ScriptProfile")
    public String scriptProfileShrink;

    @NameInMap("SourceVersionId")
    public String sourceVersionId;

    @NameInMap("SynthesizerConfig")
    public String synthesizerConfigShrink;

    @NameInMap("ToolConfig")
    public String toolConfigShrink;

    @NameInMap("TranscriberConfig")
    public String transcriberConfigShrink;

    public static CreateApplicationVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationVersionShrinkRequest self = new CreateApplicationVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationVersionShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationVersionShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public CreateApplicationVersionShrinkRequest setInteractionConfigShrink(String interactionConfigShrink) {
        this.interactionConfigShrink = interactionConfigShrink;
        return this;
    }
    public String getInteractionConfigShrink() {
        return this.interactionConfigShrink;
    }

    public CreateApplicationVersionShrinkRequest setLabelConfigShrink(String labelConfigShrink) {
        this.labelConfigShrink = labelConfigShrink;
        return this;
    }
    public String getLabelConfigShrink() {
        return this.labelConfigShrink;
    }

    public CreateApplicationVersionShrinkRequest setRagConfigShrink(String ragConfigShrink) {
        this.ragConfigShrink = ragConfigShrink;
        return this;
    }
    public String getRagConfigShrink() {
        return this.ragConfigShrink;
    }

    public CreateApplicationVersionShrinkRequest setScriptProfileShrink(String scriptProfileShrink) {
        this.scriptProfileShrink = scriptProfileShrink;
        return this;
    }
    public String getScriptProfileShrink() {
        return this.scriptProfileShrink;
    }

    public CreateApplicationVersionShrinkRequest setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }
    public String getSourceVersionId() {
        return this.sourceVersionId;
    }

    public CreateApplicationVersionShrinkRequest setSynthesizerConfigShrink(String synthesizerConfigShrink) {
        this.synthesizerConfigShrink = synthesizerConfigShrink;
        return this;
    }
    public String getSynthesizerConfigShrink() {
        return this.synthesizerConfigShrink;
    }

    public CreateApplicationVersionShrinkRequest setToolConfigShrink(String toolConfigShrink) {
        this.toolConfigShrink = toolConfigShrink;
        return this;
    }
    public String getToolConfigShrink() {
        return this.toolConfigShrink;
    }

    public CreateApplicationVersionShrinkRequest setTranscriberConfigShrink(String transcriberConfigShrink) {
        this.transcriberConfigShrink = transcriberConfigShrink;
        return this;
    }
    public String getTranscriberConfigShrink() {
        return this.transcriberConfigShrink;
    }

}
