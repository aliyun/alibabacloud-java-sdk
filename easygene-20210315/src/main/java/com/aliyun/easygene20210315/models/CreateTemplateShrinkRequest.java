// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateTemplateShrinkRequest extends TeaModel {
    // 应用的名称
    @NameInMap("AppName")
    public String appName;

    // 应用的版本
    @NameInMap("AppRevision")
    public String appRevision;

    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 应用模板描述
    @NameInMap("Description")
    public String description;

    // 应用的输入
    @NameInMap("InputsExpression")
    public String inputsExpressionShrink;

    // 应用标签
    @NameInMap("Labels")
    public String labels;

    // 应用的输出
    @NameInMap("OutputsExpression")
    public String outputsExpressionShrink;

    // 根实体类型
    @NameInMap("RootEntity")
    public String rootEntity;

    // 应用模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 工作空间名称
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
