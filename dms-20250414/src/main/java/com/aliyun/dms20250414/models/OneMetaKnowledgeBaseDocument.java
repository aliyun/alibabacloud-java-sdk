// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaKnowledgeBaseDocument extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DocsCount")
    public Integer docsCount;

    @NameInMap("DocumentLoaderName")
    public String documentLoaderName;

    @NameInMap("FileExt")
    public String fileExt;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("KbUuid")
    public String kbUuid;

    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("Name")
    public String name;

    @NameInMap("State")
    public Integer state;

    @NameInMap("Summary")
    public String summary;

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
