// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseBuildTaskShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency token for the creation request.</p>
     * 
     * <strong>example:</strong>
     * <p>task-create-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language of the content.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ContentLocale")
    public String contentLocale;

    /**
     * <p>The description of the task. The description can be up to 1,024 characters in length. If this parameter is omitted, no description is set.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies the input scope by selecting projects, entities, sources, or files based on the type.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The ID of the knowledge base to which the task belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The specific model ID or AUTO.</p>
     * 
     * <strong>example:</strong>
     * <p>model-001</p>
     */
    @NameInMap("LlmModel")
    public String llmModel;

    /**
     * <p>The name of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Project space knowledge building</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the workspace where the task runs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67890</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group and Builder compute units (CUs).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    /**
     * <p>The manual or periodic trigger configuration.</p>
     */
    @NameInMap("Trigger")
    public String triggerShrink;

    /**
     * <p>The available build types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT_SPACE_BUILD</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateKnowledgeBaseBuildTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseBuildTaskShrinkRequest self = new CreateKnowledgeBaseBuildTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setContentLocale(String contentLocale) {
        this.contentLocale = contentLocale;
        return this;
    }
    public String getContentLocale() {
        return this.contentLocale;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setLlmModel(String llmModel) {
        this.llmModel = llmModel;
        return this;
    }
    public String getLlmModel() {
        return this.llmModel;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

    public CreateKnowledgeBaseBuildTaskShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
