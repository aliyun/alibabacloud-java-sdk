// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Id")
    public String id;

    @NameInMap("Labels")
    public java.util.List<DatasetLabel> labels;

    @NameInMap("LatestVersion")
    public DatasetVersion latestVersion;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Origin")
    public String origin;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Readme")
    public String readme;

    @NameInMap("StorageType")
    public String storageType;

    public static Dataset build(java.util.Map<String, ?> map) throws Exception {
        Dataset self = new Dataset();
        return TeaModel.build(map, self);
    }

    public Dataset setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Dataset setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Dataset setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public Dataset setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public Dataset setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Dataset setLabels(java.util.List<DatasetLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<DatasetLabel> getLabels() {
        return this.labels;
    }

    public Dataset setLatestVersion(DatasetVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public DatasetVersion getLatestVersion() {
        return this.latestVersion;
    }

    public Dataset setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public Dataset setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Dataset setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public Dataset setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public Dataset setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

    public Dataset setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
