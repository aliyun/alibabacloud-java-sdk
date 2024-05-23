// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateMaterialDocumentShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Author")
    public String author;

    @NameInMap("DocKeywords")
    public String docKeywordsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocType")
    public String docType;

    @NameInMap("ExternalUrl")
    public String externalUrl;

    @NameInMap("HtmlContent")
    public String htmlContent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("PubTime")
    public String pubTime;

    @NameInMap("ShareAttr")
    public Integer shareAttr;

    @NameInMap("SrcFrom")
    public String srcFrom;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("TextContent")
    public String textContent;

    @NameInMap("Title")
    public String title;

    @NameInMap("Url")
    public String url;

    public static UpdateMaterialDocumentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterialDocumentShrinkRequest self = new UpdateMaterialDocumentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMaterialDocumentShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateMaterialDocumentShrinkRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public UpdateMaterialDocumentShrinkRequest setDocKeywordsShrink(String docKeywordsShrink) {
        this.docKeywordsShrink = docKeywordsShrink;
        return this;
    }
    public String getDocKeywordsShrink() {
        return this.docKeywordsShrink;
    }

    public UpdateMaterialDocumentShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public UpdateMaterialDocumentShrinkRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public UpdateMaterialDocumentShrinkRequest setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        return this;
    }
    public String getHtmlContent() {
        return this.htmlContent;
    }

    public UpdateMaterialDocumentShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMaterialDocumentShrinkRequest setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }
    public String getPubTime() {
        return this.pubTime;
    }

    public UpdateMaterialDocumentShrinkRequest setShareAttr(Integer shareAttr) {
        this.shareAttr = shareAttr;
        return this;
    }
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    public UpdateMaterialDocumentShrinkRequest setSrcFrom(String srcFrom) {
        this.srcFrom = srcFrom;
        return this;
    }
    public String getSrcFrom() {
        return this.srcFrom;
    }

    public UpdateMaterialDocumentShrinkRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public UpdateMaterialDocumentShrinkRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public UpdateMaterialDocumentShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateMaterialDocumentShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
