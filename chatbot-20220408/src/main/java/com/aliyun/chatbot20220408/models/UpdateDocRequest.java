// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDocRequest extends TeaModel {
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

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("Meta")
    public String meta;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Title")
    public String title;

    public static UpdateDocRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocRequest self = new UpdateDocRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDocRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateDocRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateDocRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDocRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public UpdateDocRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateDocRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateDocRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public UpdateDocRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateDocRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
