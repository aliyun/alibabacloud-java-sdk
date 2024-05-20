// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDocShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Config")
    public String config;

    @NameInMap("Content")
    public String content;

    @NameInMap("DocName")
    public String docName;

    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("Meta")
    public String meta;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TagIds")
    public String tagIdsShrink;

    @NameInMap("Title")
    public String title;

    public static UpdateDocShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocShrinkRequest self = new UpdateDocShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDocShrinkRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateDocShrinkRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateDocShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDocShrinkRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public UpdateDocShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateDocShrinkRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateDocShrinkRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public UpdateDocShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateDocShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

    public UpdateDocShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
