// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveMaterialDocumentShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Author")
    public String author;

    @NameInMap("BothSavePrivateAndShare")
    public Boolean bothSavePrivateAndShare;

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

    public static SaveMaterialDocumentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMaterialDocumentShrinkRequest self = new SaveMaterialDocumentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveMaterialDocumentShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveMaterialDocumentShrinkRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public SaveMaterialDocumentShrinkRequest setBothSavePrivateAndShare(Boolean bothSavePrivateAndShare) {
        this.bothSavePrivateAndShare = bothSavePrivateAndShare;
        return this;
    }
    public Boolean getBothSavePrivateAndShare() {
        return this.bothSavePrivateAndShare;
    }

    public SaveMaterialDocumentShrinkRequest setDocKeywordsShrink(String docKeywordsShrink) {
        this.docKeywordsShrink = docKeywordsShrink;
        return this;
    }
    public String getDocKeywordsShrink() {
        return this.docKeywordsShrink;
    }

    public SaveMaterialDocumentShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public SaveMaterialDocumentShrinkRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public SaveMaterialDocumentShrinkRequest setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        return this;
    }
    public String getHtmlContent() {
        return this.htmlContent;
    }

    public SaveMaterialDocumentShrinkRequest setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }
    public String getPubTime() {
        return this.pubTime;
    }

    public SaveMaterialDocumentShrinkRequest setShareAttr(Integer shareAttr) {
        this.shareAttr = shareAttr;
        return this;
    }
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    public SaveMaterialDocumentShrinkRequest setSrcFrom(String srcFrom) {
        this.srcFrom = srcFrom;
        return this;
    }
    public String getSrcFrom() {
        return this.srcFrom;
    }

    public SaveMaterialDocumentShrinkRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public SaveMaterialDocumentShrinkRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public SaveMaterialDocumentShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SaveMaterialDocumentShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
