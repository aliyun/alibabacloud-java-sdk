// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaKnowledgeBaseDocument extends TeaModel {
    /**
     * <p>The document description.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The number of chunks.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DocsCount")
    public Integer docsCount;

    /**
     * <p>The name of the document loader.</p>
     * 
     * <strong>example:</strong>
     * <p>ADBPGLoader</p>
     */
    @NameInMap("DocumentLoaderName")
    public String documentLoaderName;

    /**
     * <p>The file extension.</p>
     * 
     * <strong>example:</strong>
     * <p>md</p>
     */
    @NameInMap("FileExt")
    public String fileExt;

    /**
     * <p>The file size, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>20307</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>When the document was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-22 22:59:35</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>When the document was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-24 21:22:53</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The knowledge base ID.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <p>Keywords extracted from the document.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;test&quot;,&quot;abc&quot;]</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The document name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.md</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The document status. Valid values are:</p>
     * <ul>
     * <li><p><strong>0</strong>: Complete.</p>
     * </li>
     * <li><p><strong>-1</strong>: Unprocessed.</p>
     * </li>
     * <li><p><strong>-2</strong>: Parsing.</p>
     * </li>
     * <li><p><strong>-3</strong>: Failed.</p>
     * </li>
     * <li><p><strong>-4</strong>: Canceled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    /**
     * <p>The summary of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test document.</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>The name of the text splitter.</p>
     * 
     * <strong>example:</strong>
     * <p>ChineseRecursiveTextSplitter</p>
     */
    @NameInMap("TextSplitterName")
    public String textSplitterName;

    public static OneMetaKnowledgeBaseDocument build(java.util.Map<String, ?> map) throws Exception {
        OneMetaKnowledgeBaseDocument self = new OneMetaKnowledgeBaseDocument();
        return TeaModel.build(map, self);
    }

    public OneMetaKnowledgeBaseDocument setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OneMetaKnowledgeBaseDocument setDocsCount(Integer docsCount) {
        this.docsCount = docsCount;
        return this;
    }
    public Integer getDocsCount() {
        return this.docsCount;
    }

    public OneMetaKnowledgeBaseDocument setDocumentLoaderName(String documentLoaderName) {
        this.documentLoaderName = documentLoaderName;
        return this;
    }
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    public OneMetaKnowledgeBaseDocument setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public OneMetaKnowledgeBaseDocument setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public OneMetaKnowledgeBaseDocument setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OneMetaKnowledgeBaseDocument setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OneMetaKnowledgeBaseDocument setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public OneMetaKnowledgeBaseDocument setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public OneMetaKnowledgeBaseDocument setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OneMetaKnowledgeBaseDocument setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public OneMetaKnowledgeBaseDocument setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public OneMetaKnowledgeBaseDocument setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

}
