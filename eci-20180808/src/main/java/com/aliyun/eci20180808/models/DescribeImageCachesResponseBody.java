// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeImageCachesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageCaches")
    public java.util.List<DescribeImageCachesResponseBodyImageCaches> imageCaches;

    public static DescribeImageCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesResponseBody self = new DescribeImageCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCachesResponseBody setImageCaches(java.util.List<DescribeImageCachesResponseBodyImageCaches> imageCaches) {
        this.imageCaches = imageCaches;
        return this;
    }
    public java.util.List<DescribeImageCachesResponseBodyImageCaches> getImageCaches() {
        return this.imageCaches;
    }

    public static class DescribeImageCachesResponseBodyImageCachesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeImageCachesResponseBodyImageCachesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesResponseBodyImageCachesTags self = new DescribeImageCachesResponseBodyImageCachesTags();
            return TeaModel.build(map, self);
        }

        public DescribeImageCachesResponseBodyImageCachesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageCachesResponseBodyImageCachesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeImageCachesResponseBodyImageCachesEvents extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        public static DescribeImageCachesResponseBodyImageCachesEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesResponseBodyImageCachesEvents self = new DescribeImageCachesResponseBodyImageCachesEvents();
            return TeaModel.build(map, self);
        }

        public DescribeImageCachesResponseBodyImageCachesEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageCachesResponseBodyImageCachesEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribeImageCachesResponseBodyImageCachesEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeImageCachesResponseBodyImageCachesEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageCachesResponseBodyImageCachesEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageCachesResponseBodyImageCachesEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

    }

    public static class DescribeImageCachesResponseBodyImageCaches extends TeaModel {
        @NameInMap("Images")
        public java.util.List<String> images;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ExpireDateTime")
        public String expireDateTime;

        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        @NameInMap("Tags")
        public java.util.List<DescribeImageCachesResponseBodyImageCachesTags> tags;

        @NameInMap("Events")
        public java.util.List<DescribeImageCachesResponseBodyImageCachesEvents> events;

        @NameInMap("ImageCacheId")
        public String imageCacheId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ImageCacheName")
        public String imageCacheName;

        public static DescribeImageCachesResponseBodyImageCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesResponseBodyImageCaches self = new DescribeImageCachesResponseBodyImageCaches();
            return TeaModel.build(map, self);
        }

        public DescribeImageCachesResponseBodyImageCaches setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public DescribeImageCachesResponseBodyImageCaches setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImageCachesResponseBodyImageCaches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageCachesResponseBodyImageCaches setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImageCachesResponseBodyImageCaches setExpireDateTime(String expireDateTime) {
            this.expireDateTime = expireDateTime;
            return this;
        }
        public String getExpireDateTime() {
            return this.expireDateTime;
        }

        public DescribeImageCachesResponseBodyImageCaches setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeImageCachesResponseBodyImageCaches setTags(java.util.List<DescribeImageCachesResponseBodyImageCachesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeImageCachesResponseBodyImageCachesTags> getTags() {
            return this.tags;
        }

        public DescribeImageCachesResponseBodyImageCaches setEvents(java.util.List<DescribeImageCachesResponseBodyImageCachesEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeImageCachesResponseBodyImageCachesEvents> getEvents() {
            return this.events;
        }

        public DescribeImageCachesResponseBodyImageCaches setImageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }
        public String getImageCacheId() {
            return this.imageCacheId;
        }

        public DescribeImageCachesResponseBodyImageCaches setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageCachesResponseBodyImageCaches setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImageCachesResponseBodyImageCaches setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImageCachesResponseBodyImageCaches setImageCacheName(String imageCacheName) {
            this.imageCacheName = imageCacheName;
            return this;
        }
        public String getImageCacheName() {
            return this.imageCacheName;
        }

    }

}
