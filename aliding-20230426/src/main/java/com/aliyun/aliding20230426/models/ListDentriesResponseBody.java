// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDentriesResponseBody extends TeaModel {
    @NameInMap("dentries")
    public java.util.List<ListDentriesResponseBodyDentries> dentries;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static ListDentriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDentriesResponseBody self = new ListDentriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDentriesResponseBody setDentries(java.util.List<ListDentriesResponseBodyDentries> dentries) {
        this.dentries = dentries;
        return this;
    }
    public java.util.List<ListDentriesResponseBodyDentries> getDentries() {
        return this.dentries;
    }

    public ListDentriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDentriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDentriesResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListDentriesResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListDentriesResponseBodyDentriesProperties extends TeaModel {
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static ListDentriesResponseBodyDentriesProperties build(java.util.Map<String, ?> map) throws Exception {
            ListDentriesResponseBodyDentriesProperties self = new ListDentriesResponseBodyDentriesProperties();
            return TeaModel.build(map, self);
        }

        public ListDentriesResponseBodyDentriesProperties setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class ListDentriesResponseBodyDentriesThumbnail extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Url")
        public String url;

        @NameInMap("Width")
        public Integer width;

        public static ListDentriesResponseBodyDentriesThumbnail build(java.util.Map<String, ?> map) throws Exception {
            ListDentriesResponseBodyDentriesThumbnail self = new ListDentriesResponseBodyDentriesThumbnail();
            return TeaModel.build(map, self);
        }

        public ListDentriesResponseBodyDentriesThumbnail setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListDentriesResponseBodyDentriesThumbnail setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListDentriesResponseBodyDentriesThumbnail setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListDentriesResponseBodyDentries extends TeaModel {
        @NameInMap("AppProperties")
        public java.util.Map<String, java.util.List<DentriesAppPropertiesValue>> appProperties;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModifierId")
        public String modifierId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("PartitionType")
        public String partitionType;

        @NameInMap("Path")
        public String path;

        @NameInMap("Properties")
        public ListDentriesResponseBodyDentriesProperties properties;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageDriver")
        public String storageDriver;

        @NameInMap("Thumbnail")
        public ListDentriesResponseBodyDentriesThumbnail thumbnail;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Version")
        public Long version;

        public static ListDentriesResponseBodyDentries build(java.util.Map<String, ?> map) throws Exception {
            ListDentriesResponseBodyDentries self = new ListDentriesResponseBodyDentries();
            return TeaModel.build(map, self);
        }

        public ListDentriesResponseBodyDentries setAppProperties(java.util.Map<String, java.util.List<DentriesAppPropertiesValue>> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.Map<String, java.util.List<DentriesAppPropertiesValue>> getAppProperties() {
            return this.appProperties;
        }

        public ListDentriesResponseBodyDentries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDentriesResponseBodyDentries setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDentriesResponseBodyDentries setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDentriesResponseBodyDentries setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDentriesResponseBodyDentries setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDentriesResponseBodyDentries setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListDentriesResponseBodyDentries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDentriesResponseBodyDentries setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListDentriesResponseBodyDentries setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public ListDentriesResponseBodyDentries setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListDentriesResponseBodyDentries setProperties(ListDentriesResponseBodyDentriesProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListDentriesResponseBodyDentriesProperties getProperties() {
            return this.properties;
        }

        public ListDentriesResponseBodyDentries setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListDentriesResponseBodyDentries setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListDentriesResponseBodyDentries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDentriesResponseBodyDentries setStorageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }
        public String getStorageDriver() {
            return this.storageDriver;
        }

        public ListDentriesResponseBodyDentries setThumbnail(ListDentriesResponseBodyDentriesThumbnail thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public ListDentriesResponseBodyDentriesThumbnail getThumbnail() {
            return this.thumbnail;
        }

        public ListDentriesResponseBodyDentries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDentriesResponseBodyDentries setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListDentriesResponseBodyDentries setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
