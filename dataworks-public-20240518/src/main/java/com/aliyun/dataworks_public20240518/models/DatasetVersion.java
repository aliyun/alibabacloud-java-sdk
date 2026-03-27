// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DatasetVersion extends TeaModel {
    /**
     * <p>The dataset version description.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Creation time (milliseconds)</p>
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
     * <p>The corresponding dataset ID.</p>
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
     * <p>The storage import configuration for the dataset; required configuration varies by storage type.</p>
     * <p><strong>NAS</strong></p>
     * <p>Refer to the return values from the file storage API DescribeFileSystems.</p>
     * <pre><code class="language-JSON">{
     * &quot;fileSystemId&quot;: &quot;3b6XXX89c9&quot;, // The file system ID.
     * &quot;fileSystemStorageType&quot;:  &quot;Performance&quot; // The file system storage type.
     * &quot;vpcId&quot;: &quot;vpc-uf66oxxxrqge1t2gson7s&quot; // The VPC ID of the mount point.
     * }
     * </code></pre>
     */
    @NameInMap("ImportInfo")
    public java.util.Map<String, String> importInfo;

    /**
     * <p>The PAI dataset label.</p>
     */
    @NameInMap("Labels")
    public java.util.List<DatasetLabel> labels;

    /**
     * <p>Modification time (milliseconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1736756055000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The mount path. Defaults to /mnt/data.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/data</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>Storage type (read-only); consistent with the corresponding property of the parent dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>URL</p>
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
