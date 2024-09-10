// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateTemplateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>4.1.4.1-v1.0</p>
     */
    @NameInMap("AppRevision")
    public String appRevision;

    /**
     * <strong>example:</strong>
     * <p>GFjZT93cy1mMDE4OTgxNGU1ZTkK</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>{&quot;key1&quot;: &quot;value1&quot;}</p>
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
     * <p>ProduceVersion</p>
     */
    @NameInMap("RevisionTag")
    public String revisionTag;

    /**
     * <strong>example:</strong>
     * <p>TestEntity</p>
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

    public static CreateTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateShrinkRequest self = new CreateTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateTemplateShrinkRequest setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public CreateTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTemplateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateShrinkRequest setInputsExpressionShrink(String inputsExpressionShrink) {
        this.inputsExpressionShrink = inputsExpressionShrink;
        return this;
    }
    public String getInputsExpressionShrink() {
        return this.inputsExpressionShrink;
    }

    public CreateTemplateShrinkRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateTemplateShrinkRequest setOutputsExpressionShrink(String outputsExpressionShrink) {
        this.outputsExpressionShrink = outputsExpressionShrink;
        return this;
    }
    public String getOutputsExpressionShrink() {
        return this.outputsExpressionShrink;
    }

    public CreateTemplateShrinkRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateTemplateShrinkRequest setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public CreateTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
