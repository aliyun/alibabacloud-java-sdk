// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDocShrinkRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000049006</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The document parsing and chunking configuration.</p>
     * <p>Configuration item: Splitter
     * KEY: Splitter
     * Valid values:</p>
     * <ul>
     * <li>ParagraphSplitter: recognition-based hierarchy.</li>
     * <li>TreeSplitter: rule-based hierarchy.</li>
     * </ul>
     * <p>Configuration item: Document chunk size
     * KEY: ChunkSize
     * VALUE: Default value: 500. Value range: [200, 800].</p>
     * <p>Configuration item: Rule-based hierarchy
     * KEY: TreePatterns
     * VALUE: Default value: [].</p>
     * <p>Configuration item: Document title source
     * KEY: TitleSource
     * Valid values:</p>
     * <ul>
     * <li>ocrTitle: OCR-recognized title. This is the default value.</li>
     * <li>docName: the document name is used as the title.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The document content. Specify either this parameter or URL.</p>
     * 
     * <strong>example:</strong>
     * <p>Test content</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("DocMetadata")
    public String docMetadataShrink;

    /**
     * <p>The effective end time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2032-05-25T16:28:36Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The document metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The effective start time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-25T16:28:36Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The list of tag IDs.</p>
     */
    @NameInMap("TagIds")
    public String tagIdsShrink;

    /**
     * <p>The document title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The URL of the document. Specify either this parameter or Content. Supported formats: txt, pdf, markdown, doc, and docx. Limits for a single file: up to 100 pages, txt files smaller than 200 KB, pdf files smaller than 100 MB, markdown files smaller than 200 KB, doc files smaller than 100 MB, and docx files smaller than 100 MB.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.pdf">https://example.com/example.pdf</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateDocShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocShrinkRequest self = new CreateDocShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateDocShrinkRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateDocShrinkRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateDocShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDocShrinkRequest setDocMetadataShrink(String docMetadataShrink) {
        this.docMetadataShrink = docMetadataShrink;
        return this;
    }
    public String getDocMetadataShrink() {
        return this.docMetadataShrink;
    }

    public CreateDocShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateDocShrinkRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public CreateDocShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateDocShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

    public CreateDocShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDocShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
