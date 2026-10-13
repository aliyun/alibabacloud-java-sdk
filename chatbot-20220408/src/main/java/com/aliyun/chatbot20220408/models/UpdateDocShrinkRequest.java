// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDocShrinkRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The document category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231001028593</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The document parsing/chunking configuration.
     * Configuration item: Splitter
     * KEY: Splitter
     * Valid values: paragraphSplitter - hierarchy recognition (default)
     * Valid values: treeSplitter - rule-based hierarchy</p>
     * <p>Configuration item: Document chunk size
     * KEY: ChunkSize
     * VALUE: Default 500. Range: [200,800]</p>
     * <p>Configuration item: Rule-based hierarchy
     * KEY: TreePatterns
     * VALUE: Default []</p>
     * <p>Configuration item: Document title source
     * KEY: TitleSource
     * Valid values: ocrTitle - OCR-recognized title (default)
     * Valid values: docName - document name as title.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The document content.</p>
     * 
     * <strong>example:</strong>
     * <p>Document content</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("DocMetadata")
    public String docMetadataShrink;

    /**
     * <p>The document name.</p>
     * 
     * <strong>example:</strong>
     * <p>Document QA Module Feature Description</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The end of the effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-11T23:59:59Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The document ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001905617</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>The document metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The start of the effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-25T16:28:36Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The list of tag IDs. If this parameter is left empty, the tag bindings are removed.</p>
     */
    @NameInMap("TagIds")
    public String tagIdsShrink;

    /**
     * <p>The document title.</p>
     * 
     * <strong>example:</strong>
     * <p>Document QA Feature Description</p>
     */
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

    public UpdateDocShrinkRequest setDocMetadataShrink(String docMetadataShrink) {
        this.docMetadataShrink = docMetadataShrink;
        return this;
    }
    public String getDocMetadataShrink() {
        return this.docMetadataShrink;
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
