// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseBuildTaskShrinkRequest extends TeaModel {
    /**
     * <p>The content language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ContentLocale")
    public String contentLocale;

    /**
     * <p>The new description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input configuration that completely replaces the original input.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The associated knowledge base.</p>
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
     * <p>AUTO</p>
     */
    @NameInMap("LlmModel")
    public String llmModel;

    /**
     * <p>The new task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales Project Knowledge Building</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The workspace used for future runs.</p>
     * 
     * <strong>example:</strong>
     * <p>67890</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Updates the runtime resources based on the submitted fields. If ResourceGroupId or Cu is not provided, the original value is retained.</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResourceShrink;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The trigger configuration that completely replaces the original trigger.</p>
     */
    @NameInMap("Trigger")
    public String triggerShrink;

    public static UpdateKnowledgeBaseBuildTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseBuildTaskShrinkRequest self = new UpdateKnowledgeBaseBuildTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setContentLocale(String contentLocale) {
        this.contentLocale = contentLocale;
        return this;
    }
    public String getContentLocale() {
        return this.contentLocale;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setLlmModel(String llmModel) {
        this.llmModel = llmModel;
        return this;
    }
    public String getLlmModel() {
        return this.llmModel;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setRuntimeResourceShrink(String runtimeResourceShrink) {
        this.runtimeResourceShrink = runtimeResourceShrink;
        return this;
    }
    public String getRuntimeResourceShrink() {
        return this.runtimeResourceShrink;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateKnowledgeBaseBuildTaskShrinkRequest setTriggerShrink(String triggerShrink) {
        this.triggerShrink = triggerShrink;
        return this;
    }
    public String getTriggerShrink() {
        return this.triggerShrink;
    }

}
