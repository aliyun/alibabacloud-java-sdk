// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateTemplateShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is a test template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputsExpression")
    public String inputsExpressionShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputsExpression")
    public String outputsExpressionShrink;

    /**
     * <strong>example:</strong>
     * <p>test-entity</p>
     */
    @NameInMap("RootEntity")
    public String rootEntity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-workspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static UpdateTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateShrinkRequest self = new UpdateTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateShrinkRequest setInputsExpressionShrink(String inputsExpressionShrink) {
        this.inputsExpressionShrink = inputsExpressionShrink;
        return this;
    }
    public String getInputsExpressionShrink() {
        return this.inputsExpressionShrink;
    }

    public UpdateTemplateShrinkRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateTemplateShrinkRequest setOutputsExpressionShrink(String outputsExpressionShrink) {
        this.outputsExpressionShrink = outputsExpressionShrink;
        return this;
    }
    public String getOutputsExpressionShrink() {
        return this.outputsExpressionShrink;
    }

    public UpdateTemplateShrinkRequest setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public UpdateTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
