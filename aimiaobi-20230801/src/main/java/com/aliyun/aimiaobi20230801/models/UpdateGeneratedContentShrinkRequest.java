// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateGeneratedContentShrinkRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The body of the article in rich text format.</p>
     * 
     * <strong>example:</strong>
     * <p>正文</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The body of the article in plain text format.</p>
     * 
     * <strong>example:</strong>
     * <p>正文</p>
     */
    @NameInMap("ContentText")
    public String contentText;

    /**
     * <p>The unique identifier of the document.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The keywords.</p>
     */
    @NameInMap("Keywords")
    public String keywordsShrink;

    /**
     * <p>The last prompt that was used to generate the content.</p>
     * 
     * <strong>example:</strong>
     * <p>创作xx文章</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>文章名称</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateGeneratedContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGeneratedContentShrinkRequest self = new UpdateGeneratedContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGeneratedContentShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateGeneratedContentShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateGeneratedContentShrinkRequest setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }
    public String getContentText() {
        return this.contentText;
    }

    public UpdateGeneratedContentShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGeneratedContentShrinkRequest setKeywordsShrink(String keywordsShrink) {
        this.keywordsShrink = keywordsShrink;
        return this;
    }
    public String getKeywordsShrink() {
        return this.keywordsShrink;
    }

    public UpdateGeneratedContentShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateGeneratedContentShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
