// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDocRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000049006</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>2032-05-25T16:28:36Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <strong>example:</strong>
     * <p>2022-05-25T16:28:36Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TagIds")
    public java.util.List<Long> tagIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.pdf">https://example.com/example.pdf</a></p>
     */
    @NameInMap("Url")
    public String url;

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

    public CreateDocRequest setTagIds(java.util.List<Long> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<Long> getTagIds() {
        return this.tagIds;
    }

    public CreateDocRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDocRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
