// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateGeneratedContentRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Content")
    public String content;

    @NameInMap("ContentText")
    public String contentText;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Keywords")
    public java.util.List<String> keywords;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("Title")
    public String title;

    public static UpdateGeneratedContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGeneratedContentRequest self = new UpdateGeneratedContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGeneratedContentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateGeneratedContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateGeneratedContentRequest setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }
    public String getContentText() {
        return this.contentText;
    }

    public UpdateGeneratedContentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGeneratedContentRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public UpdateGeneratedContentRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateGeneratedContentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
