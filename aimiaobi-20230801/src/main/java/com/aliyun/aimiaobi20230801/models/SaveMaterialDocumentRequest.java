// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveMaterialDocumentRequest extends TeaModel {
    /**
     * <p>Unique identifier for the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Author</p>
     * 
     * <strong>example:</strong>
     * <p>作者名称</p>
     */
    @NameInMap("Author")
    public String author;

    /**
     * <p>Is the material saved to both the private library and the shared library?</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BothSavePrivateAndShare")
    public Boolean bothSavePrivateAndShare;

    /**
     * <p>Document tags used for classification, etc.</p>
     */
    @NameInMap("DocKeywords")
    public java.util.List<String> docKeywords;

    /**
     * <p>Document type (html: web page, plainText: plain text, image: image, pdf: pdf, word: word, excel: excel, csv: csv, jsonLine: jsonLine)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>excel</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>URL uploaded by external customers, used only for record keeping</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxxx/xxx">http://xxxxx/xxx</a></p>
     */
    @NameInMap("ExternalUrl")
    public String externalUrl;

    /**
     * <p>Formatted content</p>
     * 
     * <strong>example:</strong>
     * <p>网页内容</p>
     */
    @NameInMap("HtmlContent")
    public String htmlContent;

    /**
     * <p>Publication time, format: yyyy-MM-dd HH:mm:ss</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-11 06:14:07</p>
     */
    @NameInMap("PubTime")
    public String pubTime;

    /**
     * <p>Sharing attribute: 0: private, 1: shared within the workspace</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShareAttr")
    public Integer shareAttr;

    /**
     * <p>Document source (UserUpload: User Upload, IntellijSearch: Intelligent Search, HotViewPoint: Hot Viewpoint)</p>
     * 
     * <strong>example:</strong>
     * <p>IntellijSearch</p>
     */
    @NameInMap("SrcFrom")
    public String srcFrom;

    /**
     * <p>Summary</p>
     * 
     * <strong>example:</strong>
     * <p>摘要</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>Parsed text content, empty for images</p>
     * 
     * <strong>example:</strong>
     * <p>文本内容</p>
     */
    @NameInMap("TextContent")
    public String textContent;

    /**
     * <p>Document title</p>
     * 
     * <strong>example:</strong>
     * <p>新闻标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>URL of the material</p>
     * 
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
