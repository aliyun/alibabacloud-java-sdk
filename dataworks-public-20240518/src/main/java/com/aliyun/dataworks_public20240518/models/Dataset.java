// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    /**
     * <p>The description of the dataset. The length cannot exceed 1024 characters.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736756055000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>210484359</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li>COMMON</li>
     * <li>PIC</li>
     * <li>TEXT</li>
     * <li>TABLE</li>
     * <li>VIDEO</li>
     * <li>AUDIO</li>
     * <li>INDEX</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-dataset:1gxxxqjx155usz3hrv</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Dataset tags. Supported only for PAI datasets.</p>
     */
    @NameInMap("Labels")
    public java.util.List<DatasetLabel> labels;

    /**
     * <p>The latest dataset version object.</p>
     */
    @NameInMap("LatestVersion")
    public DatasetVersion latestVersion;

    /**
     * <p>The modification time. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736756055000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The dataset name. It must be a non-empty string and cannot exceed 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>test_dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source of the dataset. Currently supported sources:</p>
     * <ul>
     * <li>DataWorks</li>
     * <li>PAI</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DataWorks</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Instructions for using the dataset. Markdown rich text is supported.</p>
     * 
     * <strong>example:</strong>
     * <h2>introduction</h2>
     */
    @NameInMap("Readme")
    public String readme;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>OSS: Object Storage Service</li>
     * <li>NAS: General-purpose NAS file systems</li>
     * <li>EXTREM_NAS: Extreme NAS file systems</li>
     * <li>DLF_LANCE: Data Lake Formation</li>
     * <li>CPFS: Cloud Paralleled File System</li>
     * <li>BMCPFS: CPFS for Lingjun</li>
     * <li>MAXCOMPUTE: MaxCompute table</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
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
