// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UploadDocumentAsyncRequest extends TeaModel {
    @NameInMap("ChunkOverlap")
    public Integer chunkOverlap;

    @NameInMap("ChunkSize")
    public Integer chunkSize;

    @NameInMap("Collection")
    public String collection;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DocumentLoaderName")
    public String documentLoaderName;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Separators")
    public java.util.List<String> separators;

    @NameInMap("TextSplitterName")
    public String textSplitterName;

    @NameInMap("ZhTitleEnhance")
    public Boolean zhTitleEnhance;

    public static UploadDocumentAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentAsyncRequest self = new UploadDocumentAsyncRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocumentAsyncRequest setChunkOverlap(Integer chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    public Integer getChunkOverlap() {
        return this.chunkOverlap;
    }

    public UploadDocumentAsyncRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public UploadDocumentAsyncRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UploadDocumentAsyncRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UploadDocumentAsyncRequest setDocumentLoaderName(String documentLoaderName) {
        this.documentLoaderName = documentLoaderName;
        return this;
    }
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    public UploadDocumentAsyncRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UploadDocumentAsyncRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadDocumentAsyncRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadDocumentAsyncRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public UploadDocumentAsyncRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UploadDocumentAsyncRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UploadDocumentAsyncRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadDocumentAsyncRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadDocumentAsyncRequest setSeparators(java.util.List<String> separators) {
        this.separators = separators;
        return this;
    }
    public java.util.List<String> getSeparators() {
        return this.separators;
    }

    public UploadDocumentAsyncRequest setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public UploadDocumentAsyncRequest setZhTitleEnhance(Boolean zhTitleEnhance) {
        this.zhTitleEnhance = zhTitleEnhance;
        return this;
    }
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

}
