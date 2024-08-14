// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateGeneratedContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>government</p>
     */
    @NameInMap("ContentDomain")
    public String contentDomain;

    @NameInMap("ContentText")
    public String contentText;

    @NameInMap("Keywords")
    public java.util.List<String> keywords;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static CreateGeneratedContentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGeneratedContentRequest self = new CreateGeneratedContentRequest();
        return TeaModel.build(map, self);
    }

    public CreateGeneratedContentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateGeneratedContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateGeneratedContentRequest setContentDomain(String contentDomain) {
        this.contentDomain = contentDomain;
        return this;
    }
    public String getContentDomain() {
        return this.contentDomain;
    }

    public CreateGeneratedContentRequest setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }
    public String getContentText() {
        return this.contentText;
    }

    public CreateGeneratedContentRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public CreateGeneratedContentRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateGeneratedContentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateGeneratedContentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateGeneratedContentRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
