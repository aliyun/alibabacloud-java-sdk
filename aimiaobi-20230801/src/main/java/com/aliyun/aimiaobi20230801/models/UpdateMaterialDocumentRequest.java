// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateMaterialDocumentRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67c520d1fa43455ea44fb69fa402d54d_p_beebot_public</p>
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
     * <p>Document tags for categorization</p>
     */
    @NameInMap("DocKeywords")
    public java.util.List<String> docKeywords;

    /**
     * <p>Document type. Valid values: html, plainText, image, pdf, word, excel, csv, jsonLine</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>URL uploaded by an external customer. Used only for record keeping</p>
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
     * <p>Primary key</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Publication time in yyyy-MM-dd HH:mm:ss format</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-11 06:14:07</p>
     */
    @NameInMap("PubTime")
    public String pubTime;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Sharing attribute. Valid values: 0 (private), 1 (shared within the workspace)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShareAttr")
    public Integer shareAttr;

    /**
     * <p>Source of the document. Valid values: UserUpload, IntellijSearch, HotViewPoint</p>
     * 
     * <strong>example:</strong>
     * <p>UserUpload</p>
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
     * <p>Parsed text content. Empty for images</p>
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
     * <p>标题</p>
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

    public static UpdateMaterialDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterialDocumentRequest self = new UpdateMaterialDocumentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMaterialDocumentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateMaterialDocumentRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public UpdateMaterialDocumentRequest setDocKeywords(java.util.List<String> docKeywords) {
        this.docKeywords = docKeywords;
        return this;
    }
    public java.util.List<String> getDocKeywords() {
        return this.docKeywords;
    }

    public UpdateMaterialDocumentRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public UpdateMaterialDocumentRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public UpdateMaterialDocumentRequest setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        return this;
    }
    public String getHtmlContent() {
        return this.htmlContent;
    }

    public UpdateMaterialDocumentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMaterialDocumentRequest setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }
    public String getPubTime() {
        return this.pubTime;
    }

    public UpdateMaterialDocumentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateMaterialDocumentRequest setShareAttr(Integer shareAttr) {
        this.shareAttr = shareAttr;
        return this;
    }
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    public UpdateMaterialDocumentRequest setSrcFrom(String srcFrom) {
        this.srcFrom = srcFrom;
        return this;
    }
    public String getSrcFrom() {
        return this.srcFrom;
    }

    public UpdateMaterialDocumentRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public UpdateMaterialDocumentRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public UpdateMaterialDocumentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateMaterialDocumentRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
