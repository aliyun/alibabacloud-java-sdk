// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DatasetVersion extends TeaModel {
    /**
     * <p>The dataset version description.</p>
     * 
     * <strong>example:</strong>
     * <p>Initial version</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736756055000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The creator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17815XXX61016173</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The associated dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-datasetVersion:0gfxxxjx155usz3hrv</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The dataset version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-datasetVersion:0gfxxxjx155usz3hrv:1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The storage import configuration of the dataset. The required configuration information varies based on the storage type.</p>
     * <details>
     * <summary>NAS</summary>
     * For valid values, refer to the response of the DescribeFileSystems API operation.
     * 
     * <pre><code class="language-JSON">{
     *   &quot;fileSystemId&quot;: &quot;3b6XXX89c9&quot;, // File system ID
     *   &quot;fileSystemStorageType&quot;: &quot;Performance&quot;, // Storage specification of the file system
     *   &quot;vpcId&quot;: &quot;vpc-uf66oxxxrqge1t2gson7s&quot; // VPC ID of the mount target
     * }
     * </code></pre>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fileSystemId&quot;:&quot;3b6XXX89c9&quot;,&quot;fileSystemStorageType&quot;:&quot;Performance&quot;,&quot;vpcId&quot;:&quot;vpc-uf66oxxxrqge1t2gson7s&quot;}</p>
     */
    @NameInMap("ImportInfo")
    public java.util.Map<String, String> importInfo;

    /**
     * <p>The PAI dataset labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<DatasetLabel> labels;

    /**
     * <p>The modification timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736756055000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The mount path. Default value: /mnt/data.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/data</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>The storage type. This property is read-only and remains consistent with the corresponding property of the associated dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The URL.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-oss-bucket/test_dir/</p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>The dataset version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
