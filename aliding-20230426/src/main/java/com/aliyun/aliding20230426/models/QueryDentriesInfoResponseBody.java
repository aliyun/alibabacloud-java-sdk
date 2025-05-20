// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentriesInfoResponseBody extends TeaModel {
    @NameInMap("Dentry")
    public QueryDentriesInfoResponseBodyDentry dentry;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static QueryDentriesInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDentriesInfoResponseBody self = new QueryDentriesInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDentriesInfoResponseBody setDentry(QueryDentriesInfoResponseBodyDentry dentry) {
        this.dentry = dentry;
        return this;
    }
    public QueryDentriesInfoResponseBodyDentry getDentry() {
        return this.dentry;
    }

    public QueryDentriesInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDentriesInfoResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryDentriesInfoResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryDentriesInfoResponseBodyDentryProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static QueryDentriesInfoResponseBodyDentryProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryDentriesInfoResponseBodyDentryProperties self = new QueryDentriesInfoResponseBodyDentryProperties();
            return TeaModel.build(map, self);
        }

        public QueryDentriesInfoResponseBodyDentryProperties setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class QueryDentriesInfoResponseBodyDentryThumbnail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static QueryDentriesInfoResponseBodyDentryThumbnail build(java.util.Map<String, ?> map) throws Exception {
            QueryDentriesInfoResponseBodyDentryThumbnail self = new QueryDentriesInfoResponseBodyDentryThumbnail();
            return TeaModel.build(map, self);
        }

        public QueryDentriesInfoResponseBodyDentryThumbnail setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryDentriesInfoResponseBodyDentryThumbnail setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryDentriesInfoResponseBodyDentryThumbnail setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class QueryDentriesInfoResponseBodyDentry extends TeaModel {
        @NameInMap("AppProperties")
        public java.util.Map<String, java.util.List<DentryAppPropertiesValue>> appProperties;

        /**
         * <strong>example:</strong>
         * <p>2025-03-26T02:19:35Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>qt8bGiSa7WnHKeRPtMuoiSJwiE</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>140901622636</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>qt8bGiSa7WnHKeRPtMuoiSJwiE</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC_OSS_PARTITION</p>
         */
        @NameInMap("PartitionType")
        public String partitionType;

        @NameInMap("Path")
        public String path;

        @NameInMap("Properties")
        public QueryDentriesInfoResponseBodyDentryProperties properties;

        /**
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>22443475065</p>
         */
        @NameInMap("SpaceId")
        public String spaceId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("StorageDriver")
        public String storageDriver;

        @NameInMap("Thumbnail")
        public QueryDentriesInfoResponseBodyDentryThumbnail thumbnail;

        /**
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1716258459684</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static QueryDentriesInfoResponseBodyDentry build(java.util.Map<String, ?> map) throws Exception {
            QueryDentriesInfoResponseBodyDentry self = new QueryDentriesInfoResponseBodyDentry();
            return TeaModel.build(map, self);
        }

        public QueryDentriesInfoResponseBodyDentry setAppProperties(java.util.Map<String, java.util.List<DentryAppPropertiesValue>> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.Map<String, java.util.List<DentryAppPropertiesValue>> getAppProperties() {
            return this.appProperties;
        }

        public QueryDentriesInfoResponseBodyDentry setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryDentriesInfoResponseBodyDentry setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryDentriesInfoResponseBodyDentry setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QueryDentriesInfoResponseBodyDentry setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDentriesInfoResponseBodyDentry setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryDentriesInfoResponseBodyDentry setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public QueryDentriesInfoResponseBodyDentry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentriesInfoResponseBodyDentry setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryDentriesInfoResponseBodyDentry setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public QueryDentriesInfoResponseBodyDentry setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryDentriesInfoResponseBodyDentry setProperties(QueryDentriesInfoResponseBodyDentryProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryDentriesInfoResponseBodyDentryProperties getProperties() {
            return this.properties;
        }

        public QueryDentriesInfoResponseBodyDentry setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public QueryDentriesInfoResponseBodyDentry setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public QueryDentriesInfoResponseBodyDentry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDentriesInfoResponseBodyDentry setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

        public QueryDentriesInfoResponseBodyDentry setThumbnail(QueryDentriesInfoResponseBodyDentryThumbnail thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public QueryDentriesInfoResponseBodyDentryThumbnail getThumbnail() {
            return this.thumbnail;
        }

        public QueryDentriesInfoResponseBodyDentry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryDentriesInfoResponseBodyDentry setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public QueryDentriesInfoResponseBodyDentry setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
