// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>The description of the dataset. It cannot exceed 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li>COMMON: General (default).</li>
     * <li>PIC: Image.</li>
     * <li>TEXT: Text.</li>
     * <li>TABLE: Table.</li>
     * <li>VIDEO: Video.</li>
     * <li>AUDIO: Audio.</li>
     * <li>INDEX: Index.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The initial version of the dataset.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InitVersion")
    public CreateDatasetRequestInitVersion initVersion;

    /**
     * <p>The name of the dataset. It must be a non-empty string and cannot exceed 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_oss_dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source of the dataset. Currently, only DataWorks is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DataWorks</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>OSS: Object Storage Service.</li>
     * <li>NAS: General-purpose NAS file storage.</li>
     * <li>EXTREMENAS: Extreme NAS file storage.</li>
     * <li>DLF_LANCE: Data Lake Formation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatasetRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDatasetRequest setInitVersion(CreateDatasetRequestInitVersion initVersion) {
        this.initVersion = initVersion;
        return this;
    }
    public CreateDatasetRequestInitVersion getInitVersion() {
        return this.initVersion;
    }

    public CreateDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasetRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateDatasetRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDatasetRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public static class CreateDatasetRequestInitVersion extends TeaModel {
        /**
         * <p>The description. It cannot exceed 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Initial Version</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The storage import configuration for the dataset. The required configuration information varies based on the storage type.</p>
         * <details>
         * <summary>NAS</summary>
         * For the values, refer to the response of the DescribeFileSystems API operation.
         * 
         * <pre><code class="language-JSON">{
         *   &quot;fileSystemId&quot;: &quot;3b6XXX89c9&quot;, // The ID of the file system.
         *   &quot;fileSystemStorageType&quot;: &quot;Performance&quot;, // The storage specification of the file system.
         *   &quot;vpcId&quot;: &quot;vpc-uf66oxxxrqge1t2gson7s&quot; // The VPC ID of the mount target.
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
         * <p>The mount path. It must start with /mnt/. Default value: /mnt/data.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-oss-bucket/test_dir/</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateDatasetRequestInitVersion build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestInitVersion self = new CreateDatasetRequestInitVersion();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestInitVersion setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateDatasetRequestInitVersion setImportInfo(java.util.Map<String, String> importInfo) {
            this.importInfo = importInfo;
            return this;
        }
        public java.util.Map<String, String> getImportInfo() {
            return this.importInfo;
        }

        public CreateDatasetRequestInitVersion setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateDatasetRequestInitVersion setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
