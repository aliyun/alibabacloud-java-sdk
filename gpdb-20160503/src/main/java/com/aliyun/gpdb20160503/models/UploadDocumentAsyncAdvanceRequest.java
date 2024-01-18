// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UploadDocumentAsyncAdvanceRequest extends TeaModel {
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
    public java.io.InputStream fileUrlObject;

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

    public static UploadDocumentAsyncAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentAsyncAdvanceRequest self = new UploadDocumentAsyncAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocumentAsyncAdvanceRequest setChunkOverlap(Integer chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    public Integer getChunkOverlap() {
        return this.chunkOverlap;
    }

    public UploadDocumentAsyncAdvanceRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public UploadDocumentAsyncAdvanceRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UploadDocumentAsyncAdvanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UploadDocumentAsyncAdvanceRequest setDocumentLoaderName(String documentLoaderName) {
        this.documentLoaderName = documentLoaderName;
        return this;
    }
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    public UploadDocumentAsyncAdvanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UploadDocumentAsyncAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadDocumentAsyncAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public UploadDocumentAsyncAdvanceRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public UploadDocumentAsyncAdvanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UploadDocumentAsyncAdvanceRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UploadDocumentAsyncAdvanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadDocumentAsyncAdvanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadDocumentAsyncAdvanceRequest setSeparators(java.util.List<String> separators) {
        this.separators = separators;
        return this;
    }
    public java.util.List<String> getSeparators() {
        return this.separators;
    }

    public UploadDocumentAsyncAdvanceRequest setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public UploadDocumentAsyncAdvanceRequest setZhTitleEnhance(Boolean zhTitleEnhance) {
        this.zhTitleEnhance = zhTitleEnhance;
        return this;
    }
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

}
