// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddConnectorRequest extends TeaModel {
    /**
     * <p>The name of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-connector</p>
     */
    @NameInMap("ConnectorName")
    public String connectorName;

    /**
     * <p>The type of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("ConnectorType")
    public String connectorType;

    /**
     * <p>The description of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>File connector</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration parameters for the file connector.</p>
     */
    @NameInMap("FileConnectorConfig")
    public AddConnectorRequestFileConnectorConfig fileConnectorConfig;

    public static AddConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddConnectorRequest self = new AddConnectorRequest();
        return TeaModel.build(map, self);
    }

    public AddConnectorRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public AddConnectorRequest setConnectorType(String connectorType) {
        this.connectorType = connectorType;
        return this;
    }
    public String getConnectorType() {
        return this.connectorType;
    }

    public AddConnectorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddConnectorRequest setFileConnectorConfig(AddConnectorRequestFileConnectorConfig fileConnectorConfig) {
        this.fileConnectorConfig = fileConnectorConfig;
        return this;
    }
    public AddConnectorRequestFileConnectorConfig getFileConnectorConfig() {
        return this.fileConnectorConfig;
    }

    public static class AddConnectorRequestFileConnectorConfig extends TeaModel {
        /**
         * <p>The name of the storage bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>zyb-docker-registry-jn</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The region of the storage bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The file storage location. Valid values:</p>
         * <ul>
         * <li>OSS_CUSTOM: Use your own OSS storage. </li>
         * <li>OSS_PLATFORM: Use platform OSS storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS_CUSTOM</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static AddConnectorRequestFileConnectorConfig build(java.util.Map<String, ?> map) throws Exception {
            AddConnectorRequestFileConnectorConfig self = new AddConnectorRequestFileConnectorConfig();
            return TeaModel.build(map, self);
        }

        public AddConnectorRequestFileConnectorConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public AddConnectorRequestFileConnectorConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AddConnectorRequestFileConnectorConfig setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
