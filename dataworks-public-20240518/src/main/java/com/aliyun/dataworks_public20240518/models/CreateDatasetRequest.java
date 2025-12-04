// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InitVersion")
    public CreateDatasetRequestInitVersion initVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_oss_dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>DataWorks</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
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
         * <strong>example:</strong>
         * <p>Initial Version</p>
         */
        @NameInMap("Comment")
        public String comment;

        @NameInMap("ImportInfo")
        public java.util.Map<String, String> importInfo;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
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
