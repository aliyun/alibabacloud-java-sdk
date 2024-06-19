// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeImageCachesResponseBody extends TeaModel {
    /**
     * <p>The information about image caches.</p>
     */
    @NameInMap("ImageCaches")
    public java.util.List<DescribeImageCachesResponseBodyImageCaches> imageCaches;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39FC2E43-3DD7-4CEF-9EF4-E4AD6E635301</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesResponseBody self = new DescribeImageCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageCachesResponseBody setImageCaches(java.util.List<DescribeImageCachesResponseBodyImageCaches> imageCaches) {
        this.imageCaches = imageCaches;
        return this;
    }
    public java.util.List<DescribeImageCachesResponseBodyImageCaches> getImageCaches() {
        return this.imageCaches;
    }

    public DescribeImageCachesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCachesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageCachesResponseBodyImageCachesEvents extends TeaModel {
        /**
         * <p>The number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the event started.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-09T02:24:48Z</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The time when the event ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-09T02:24:48Z</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully check image cache resource.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>imagetest.1661f31f851a****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cause of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the event. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeImageCachesResponseBodyImageCachesEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesResponseBodyImageCachesEvents self = new DescribeImageCachesResponseBodyImageCachesEvents();
            return TeaModel.build(map, self);
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

        public DescribeImageCachesResponseBodyImageCachesEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeImageCachesResponseBodyImageCachesEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeImageCachesResponseBodyImageCachesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>imc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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

    public static class DescribeImageCachesResponseBodyImageCaches extends TeaModel {
        /**
         * <p>The ID of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-bp18oq3m15prd9jb****</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The time when the image cache was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-09T02:24:07Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The elimination policy of the image cache. This parameter is empty by default, which indicates that the image cache is always retained.</p>
         * <p>You can set this parameter to LRU, which indicates that the image cache can be automatically deleted. When the number of image caches reaches the quota, the system automatically deletes the image caches whose EliminationStrategy parameter is set to LRU and that are least regularly used.</p>
         * 
         * <strong>example:</strong>
         * <p>LRU</p>
         */
        @NameInMap("EliminationStrategy")
        public String eliminationStrategy;

        /**
         * <p>The events of pulling an image to create the image cache.</p>
         */
        @NameInMap("Events")
        public java.util.List<DescribeImageCachesResponseBodyImageCachesEvents> events;

        /**
         * <p>The time when the image cache expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-10T09:00:48Z</p>
         */
        @NameInMap("ExpireDateTime")
        public String expireDateTime;

        /**
         * <p>The ID of the local snapshot. A temporary local snapshot is created if the instant image cache feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp12w3v37sit96t6****</p>
         */
        @NameInMap("FlashSnapshotId")
        public String flashSnapshotId;

        /**
         * <p>The ID of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-bp195erqe9o2pb09****</p>
         */
        @NameInMap("ImageCacheId")
        public String imageCacheId;

        /**
         * <p>The name of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imagetest</p>
         */
        @NameInMap("ImageCacheName")
        public String imageCacheName;

        /**
         * <p>The size of the image cache. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ImageCacheSize")
        public Integer imageCacheSize;

        /**
         * <p>The images contained in the image cache.</p>
         */
        @NameInMap("Images")
        public java.util.List<String> images;

        /**
         * <p>The time when the image cache was last matched.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-18T03:48:10Z</p>
         */
        @NameInMap("LastMatchedTime")
        public String lastMatchedTime;

        /**
         * <p>The progress of creating the snapshot that is used to create the image cache.</p>
         * <blockquote>
         * <p> If the instant image cache feature is enabled, the system creates a temporary local snapshot and then a regular snapshot. In this case, this parameter indicates the progress of creating the regular snapshot.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The region ID of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the image cache belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-2df3isufhi38****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the snapshot that corresponds to the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2zec5oj8e1yhxijt****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The status of the image cache. Valid values:</p>
         * <ul>
         * <li>Preparing: The image cache is being prepared.</li>
         * <li>Creating: The image is being created.</li>
         * <li>Ready: The image cache is created.</li>
         * <li>Failed: The image cache failed to be created.</li>
         * <li>Updating: The image cache is being updated.</li>
         * <li>UpdateFailed: The image cache failed to be updated.</li>
         * </ul>
         * <p>The image cache is ready for use when it is in the Ready state.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the image cache.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeImageCachesResponseBodyImageCachesTags> tags;

        public static DescribeImageCachesResponseBodyImageCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesResponseBodyImageCaches self = new DescribeImageCachesResponseBodyImageCaches();
            return TeaModel.build(map, self);
        }

        public DescribeImageCachesResponseBodyImageCaches setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeImageCachesResponseBodyImageCaches setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImageCachesResponseBodyImageCaches setEliminationStrategy(String eliminationStrategy) {
            this.eliminationStrategy = eliminationStrategy;
            return this;
        }
        public String getEliminationStrategy() {
            return this.eliminationStrategy;
        }

        public DescribeImageCachesResponseBodyImageCaches setEvents(java.util.List<DescribeImageCachesResponseBodyImageCachesEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeImageCachesResponseBodyImageCachesEvents> getEvents() {
            return this.events;
        }

        public DescribeImageCachesResponseBodyImageCaches setExpireDateTime(String expireDateTime) {
            this.expireDateTime = expireDateTime;
            return this;
        }
        public String getExpireDateTime() {
            return this.expireDateTime;
        }

        public DescribeImageCachesResponseBodyImageCaches setFlashSnapshotId(String flashSnapshotId) {
            this.flashSnapshotId = flashSnapshotId;
            return this;
        }
        public String getFlashSnapshotId() {
            return this.flashSnapshotId;
        }

        public DescribeImageCachesResponseBodyImageCaches setImageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }
        public String getImageCacheId() {
            return this.imageCacheId;
        }

        public DescribeImageCachesResponseBodyImageCaches setImageCacheName(String imageCacheName) {
            this.imageCacheName = imageCacheName;
            return this;
        }
        public String getImageCacheName() {
            return this.imageCacheName;
        }

        public DescribeImageCachesResponseBodyImageCaches setImageCacheSize(Integer imageCacheSize) {
            this.imageCacheSize = imageCacheSize;
            return this;
        }
        public Integer getImageCacheSize() {
            return this.imageCacheSize;
        }

        public DescribeImageCachesResponseBodyImageCaches setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public DescribeImageCachesResponseBodyImageCaches setLastMatchedTime(String lastMatchedTime) {
            this.lastMatchedTime = lastMatchedTime;
            return this;
        }
        public String getLastMatchedTime() {
            return this.lastMatchedTime;
        }

        public DescribeImageCachesResponseBodyImageCaches setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImageCachesResponseBodyImageCaches setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageCachesResponseBodyImageCaches setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImageCachesResponseBodyImageCaches setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeImageCachesResponseBodyImageCaches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageCachesResponseBodyImageCaches setTags(java.util.List<DescribeImageCachesResponseBodyImageCachesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeImageCachesResponseBodyImageCachesTags> getTags() {
            return this.tags;
        }

    }

}
