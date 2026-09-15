// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class KnowledgeBaseChunk extends TeaModel {
    /**
     * <p>The sequence number of the chunk within the document, starting from 1 and numbered consecutively.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ChunkSeq")
    public Integer chunkSeq;

    /**
     * <p>The number of characters in the chunk content, measured in UTF-16 code units, consistent with MaxChunkSize. You can use this value to evaluate chunk saturation against the chunking configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>The content of the chunk.</p>
     * 
     * <strong>example:</strong>
     * <p>EventBridge supports routing events to multiple target services</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The time when the chunk was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-24T10:00:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The ID of the document to which the chunk belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-bp1xxxxxxxxxxxx</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>Indicates whether the chunk is enabled. Disabled chunks are excluded from retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The file name of the document to which the chunk belongs. This value is from the same source as the FileName returned by GetDocument.</p>
     * 
     * <strong>example:</strong>
     * <p>product-handbook.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The location of the chunk in the original document. The format varies by document type: for PDF, the value is p.PageNumber (such as p.3). For PPT/PPTX, the value is s.SlideNumber (such as s.2). For XLS/XLSX, the value is the sheet name. For other formats (such as txt, md, html, doc, or docx), this field is not returned if no source location is available.</p>
     * 
     * <strong>example:</strong>
     * <p>p.3</p>
     */
    @NameInMap("SourceLocation")
    public String sourceLocation;

    /**
     * <p>The hierarchical title path of the chunk, connected by &gt;. If no recognizable title exists in the original document, the value falls back to a summary of the first paragraph content (such as CONTENT). This field is for display purposes only.</p>
     * 
     * <strong>example:</strong>
     * <p>Installation Guide&gt;Prerequisites</p>
     */
    @NameInMap("TitlePath")
    public String titlePath;

    /**
     * <p>The time when the chunk was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-24T10:00:00Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static KnowledgeBaseChunk build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseChunk self = new KnowledgeBaseChunk();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseChunk setChunkSeq(Integer chunkSeq) {
        this.chunkSeq = chunkSeq;
        return this;
    }
    public Integer getChunkSeq() {
        return this.chunkSeq;
    }

    public KnowledgeBaseChunk setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public KnowledgeBaseChunk setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public KnowledgeBaseChunk setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public KnowledgeBaseChunk setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public KnowledgeBaseChunk setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public KnowledgeBaseChunk setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public KnowledgeBaseChunk setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    public KnowledgeBaseChunk setTitlePath(String titlePath) {
        this.titlePath = titlePath;
        return this;
    }
    public String getTitlePath() {
        return this.titlePath;
    }

    public KnowledgeBaseChunk setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
