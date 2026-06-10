// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDocShrinkRequest extends TeaModel {
    /**
     * <p>The key for the business space. If this parameter is not specified, the default business space is used. You can obtain the key from the Business Management page of your primary account.</p>
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
     * <p>The configuration for document splitting. Set the key to <code>Splitter</code>. Valid values are <code>paragraphSplitter</code> (identifies content hierarchy) and <code>treeSplitter</code> (uses a rule-based hierarchy).</p>
     * <p>The document chunk size. Set the key to <code>ChunkSize</code>. The default value is 500. The value must be in the range of 200 to 800.</p>
     * <p>The patterns for the rule-based hierarchy. Set the key to <code>TreePatterns</code>. The default value is an empty array (<code>[]</code>).</p>
     * <p>The document title source. Set the key to <code>TitleSource</code>. Valid values are <code>ocrTitle</code> (default), which uses the title recognized by Optical Character Recognition (OCR), and <code>docName</code>, which uses the document name as the title.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The document content. You must specify either this parameter or <code>Url</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>测试内容</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("DocMetadata")
    public String docMetadataShrink;

    /**
     * <p>The time when the document expires. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2032-05-25T16:28:36Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The passthrough data of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("Meta")
    public String meta;

    /**
     * <p>The time when the document takes effect. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-25T16:28:36Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>A list of tag IDs.</p>
     */
    @NameInMap("TagIds")
    public String tagIdsShrink;

    /**
     * <p>The document title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The URL of the document. You must specify either this parameter or <code>Content</code>. Supported formats include .txt, .pdf, .markdown, .doc, and .docx. The following limits apply to a single file: a maximum of 100 pages, less than 200 KB for .txt and .markdown files, and less than 100 MB for .pdf, .doc, and .docx files.</p>
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
