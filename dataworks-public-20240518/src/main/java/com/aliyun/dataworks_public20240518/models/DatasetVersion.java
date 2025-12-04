// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DatasetVersion extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("Id")
    public String id;

    @NameInMap("ImportInfo")
    public java.util.Map<String, String> importInfo;

    @NameInMap("Labels")
    public java.util.List<DatasetLabel> labels;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    @NameInMap("MountPath")
    public String mountPath;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Url")
    public String url;

    @NameInMap("VersionNumber")
    public Integer versionNumber;

    public static DatasetVersion build(java.util.Map<String, ?> map) throws Exception {
        DatasetVersion self = new DatasetVersion();
        return TeaModel.build(map, self);
    }

    public DatasetVersion setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DatasetVersion setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DatasetVersion setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public DatasetVersion setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DatasetVersion setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DatasetVersion setImportInfo(java.util.Map<String, String> importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public java.util.Map<String, String> getImportInfo() {
        return this.importInfo;
    }

    public DatasetVersion setLabels(java.util.List<DatasetLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<DatasetLabel> getLabels() {
        return this.labels;
    }

    public DatasetVersion setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public DatasetVersion setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public DatasetVersion setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DatasetVersion setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DatasetVersion setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }
    public Integer getVersionNumber() {
        return this.versionNumber;
    }

}
