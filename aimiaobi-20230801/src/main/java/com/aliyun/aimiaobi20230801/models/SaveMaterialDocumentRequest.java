// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveMaterialDocumentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Author")
    public String author;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BothSavePrivateAndShare")
    public Boolean bothSavePrivateAndShare;

    @NameInMap("DocKeywords")
    public java.util.List<String> docKeywords;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>excel</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxxx/xxx">http://xxxxx/xxx</a></p>
     */
    @NameInMap("ExternalUrl")
    public String externalUrl;

    @NameInMap("HtmlContent")
    public String htmlContent;

    /**
     * <strong>example:</strong>
     * <p>2023-04-11 06:14:07</p>
     */
    @NameInMap("PubTime")
    public String pubTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShareAttr")
    public Integer shareAttr;

    /**
     * <strong>example:</strong>
     * <p>IntellijSearch</p>
     */
    @NameInMap("SrcFrom")
    public String srcFrom;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("TextContent")
    public String textContent;

    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxxx/xxx">http://xxxxx/xxx</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static SaveMaterialDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMaterialDocumentRequest self = new SaveMaterialDocumentRequest();
        return TeaModel.build(map, self);
    }

    public SaveMaterialDocumentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveMaterialDocumentRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public SaveMaterialDocumentRequest setBothSavePrivateAndShare(Boolean bothSavePrivateAndShare) {
        this.bothSavePrivateAndShare = bothSavePrivateAndShare;
        return this;
    }
    public Boolean getBothSavePrivateAndShare() {
        return this.bothSavePrivateAndShare;
    }

    public SaveMaterialDocumentRequest setDocKeywords(java.util.List<String> docKeywords) {
        this.docKeywords = docKeywords;
        return this;
    }
    public java.util.List<String> getDocKeywords() {
        return this.docKeywords;
    }

    public SaveMaterialDocumentRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public SaveMaterialDocumentRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public SaveMaterialDocumentRequest setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        return this;
    }
    public String getHtmlContent() {
        return this.htmlContent;
    }

    public SaveMaterialDocumentRequest setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }
    public String getPubTime() {
        return this.pubTime;
    }

    public SaveMaterialDocumentRequest setShareAttr(Integer shareAttr) {
        this.shareAttr = shareAttr;
        return this;
    }
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    public SaveMaterialDocumentRequest setSrcFrom(String srcFrom) {
        this.srcFrom = srcFrom;
        return this;
    }
    public String getSrcFrom() {
        return this.srcFrom;
    }

    public SaveMaterialDocumentRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public SaveMaterialDocumentRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public SaveMaterialDocumentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SaveMaterialDocumentRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
