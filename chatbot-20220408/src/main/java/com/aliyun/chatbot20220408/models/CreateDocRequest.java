// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDocRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Config")
    public String config;

    @NameInMap("Content")
    public String content;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Meta")
    public String meta;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Title")
    public String title;

    public static CreateDocRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocRequest self = new CreateDocRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateDocRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateDocRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateDocRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDocRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateDocRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public CreateDocRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateDocRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
