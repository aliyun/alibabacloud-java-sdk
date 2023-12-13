// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeDataCachesResponseBody extends TeaModel {
    /**
     * <p>The information about the data caches.</p>
     */
    @NameInMap("DataCaches")
    public java.util.List<DescribeDataCachesResponseBodyDataCaches> dataCaches;

    /**
     * <p>The query token. Set the value to the NextToken value that is returned in the previous call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCachesResponseBody self = new DescribeDataCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCachesResponseBody setDataCaches(java.util.List<DescribeDataCachesResponseBodyDataCaches> dataCaches) {
        this.dataCaches = dataCaches;
        return this;
    }
    public java.util.List<DescribeDataCachesResponseBodyDataCaches> getDataCaches() {
        return this.dataCaches;
    }

    public DescribeDataCachesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDataCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataCachesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataCachesResponseBodyDataCachesDataSource extends TeaModel {
        /**
         * <p>The parameters that are configured for the data source.</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   NAS</p>
         * <p>*   OSS</p>
         * <p>*   URL</p>
         * <p>*   SNAPSHOT</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDataCachesResponseBodyDataCachesDataSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCachesResponseBodyDataCachesDataSource self = new DescribeDataCachesResponseBodyDataCachesDataSource();
            return TeaModel.build(map, self);
        }

        public DescribeDataCachesResponseBodyDataCachesDataSource setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeDataCachesResponseBodyDataCachesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDataCachesResponseBodyDataCachesEvents extends TeaModel {
        /**
         * <p>The number of times that the event occurred.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the event started.</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The time when the event ended.</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The information about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The event name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The event cause.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The event type. Valid values:</p>
         * <br>
         * <p>*   Normal</p>
         * <p>*   Warning</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDataCachesResponseBodyDataCachesEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCachesResponseBodyDataCachesEvents self = new DescribeDataCachesResponseBodyDataCachesEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDataCachesResponseBodyDataCachesEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeDataCachesResponseBodyDataCachesEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public DescribeDataCachesResponseBodyDataCachesEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribeDataCachesResponseBodyDataCachesEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDataCachesResponseBodyDataCachesEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataCachesResponseBodyDataCachesEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeDataCachesResponseBodyDataCachesEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDataCachesResponseBodyDataCachesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDataCachesResponseBodyDataCachesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCachesResponseBodyDataCachesTags self = new DescribeDataCachesResponseBodyDataCachesTags();
            return TeaModel.build(map, self);
        }

        public DescribeDataCachesResponseBodyDataCachesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDataCachesResponseBodyDataCachesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDataCachesResponseBodyDataCaches extends TeaModel {
        /**
         * <p>The bucket that stores the data cache.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the elastic container instance that was generated when the data cache was created.</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The time when the data cache was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The data cache ID.</p>
         */
        @NameInMap("DataCacheId")
        public String dataCacheId;

        /**
         * <p>The information about the data source.</p>
         */
        @NameInMap("DataSource")
        public DescribeDataCachesResponseBodyDataCachesDataSource dataSource;

        /**
         * <p>The events.</p>
         */
        @NameInMap("Events")
        public java.util.List<DescribeDataCachesResponseBodyDataCachesEvents> events;

        /**
         * <p>The time when the data cache expires.</p>
         */
        @NameInMap("ExpireDateTime")
        public String expireDateTime;

        /**
         * <p>The ID of the local snapshot.</p>
         */
        @NameInMap("FlashSnapshotId")
        public String flashSnapshotId;

        /**
         * <p>The time when the data cache was last matched.</p>
         */
        @NameInMap("LastMatchedTime")
        public String lastMatchedTime;

        /**
         * <p>The data cache name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The vHost directory in which the data cache resides.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The creation progress of the data cache.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The size of the data cache. Unit: GiB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot ID.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The state of the data cache. Valid values:</p>
         * <br>
         * <p>*   Loading: The data cache is loading data.</p>
         * <p>*   Creating: The data cache is being created.</p>
         * <p>*   Available: The data cache is created.</p>
         * <p>*   Failed: The data cache failed to be created.</p>
         * <p>*   Updating: The data cache is being updated.</p>
         * <p>*   UpdateFailed: The data cache failed to be updated.</p>
         * <br>
         * <p>The data cache is available when it is in the Ready state.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are attached to the data cache.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDataCachesResponseBodyDataCachesTags> tags;

        public static DescribeDataCachesResponseBodyDataCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCachesResponseBodyDataCaches self = new DescribeDataCachesResponseBodyDataCaches();
            return TeaModel.build(map, self);
        }

        public DescribeDataCachesResponseBodyDataCaches setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeDataCachesResponseBodyDataCaches setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeDataCachesResponseBodyDataCaches setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDataCachesResponseBodyDataCaches setDataCacheId(String dataCacheId) {
            this.dataCacheId = dataCacheId;
            return this;
        }
        public String getDataCacheId() {
            return this.dataCacheId;
        }

        public DescribeDataCachesResponseBodyDataCaches setDataSource(DescribeDataCachesResponseBodyDataCachesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public DescribeDataCachesResponseBodyDataCachesDataSource getDataSource() {
            return this.dataSource;
        }

        public DescribeDataCachesResponseBodyDataCaches setEvents(java.util.List<DescribeDataCachesResponseBodyDataCachesEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeDataCachesResponseBodyDataCachesEvents> getEvents() {
            return this.events;
        }

        public DescribeDataCachesResponseBodyDataCaches setExpireDateTime(String expireDateTime) {
            this.expireDateTime = expireDateTime;
            return this;
        }
        public String getExpireDateTime() {
            return this.expireDateTime;
        }

        public DescribeDataCachesResponseBodyDataCaches setFlashSnapshotId(String flashSnapshotId) {
            this.flashSnapshotId = flashSnapshotId;
            return this;
        }
        public String getFlashSnapshotId() {
            return this.flashSnapshotId;
        }

        public DescribeDataCachesResponseBodyDataCaches setLastMatchedTime(String lastMatchedTime) {
            this.lastMatchedTime = lastMatchedTime;
            return this;
        }
        public String getLastMatchedTime() {
            return this.lastMatchedTime;
        }

        public DescribeDataCachesResponseBodyDataCaches setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataCachesResponseBodyDataCaches setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDataCachesResponseBodyDataCaches setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDataCachesResponseBodyDataCaches setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataCachesResponseBodyDataCaches setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDataCachesResponseBodyDataCaches setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDataCachesResponseBodyDataCaches setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeDataCachesResponseBodyDataCaches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataCachesResponseBodyDataCaches setTags(java.util.List<DescribeDataCachesResponseBodyDataCachesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDataCachesResponseBodyDataCachesTags> getTags() {
            return this.tags;
        }

    }

}
