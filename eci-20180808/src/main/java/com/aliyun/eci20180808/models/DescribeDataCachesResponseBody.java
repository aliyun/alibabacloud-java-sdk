// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeDataCachesResponseBody extends TeaModel {
    /**
     * <p>The information about the data caches.</p>
     */
    @NameInMap("DataCaches")
    public java.util.List<DataCaches> dataCaches;

    /**
     * <p>The query token. Set the value to the NextToken value that is returned in the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>d78f2dd8-5979-42fe-xaee-b16db43be5bc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B8756BA0-6452-419C-9727-37A6209C85E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCachesResponseBody self = new DescribeDataCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCachesResponseBody setDataCaches(java.util.List<DataCaches> dataCaches) {
        this.dataCaches = dataCaches;
        return this;
    }
    public java.util.List<DataCaches> getDataCaches() {
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

    public static class DataSource extends TeaModel {
        /**
         * <p>The parameters that are configured for the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;options&quot;: {
         *             &quot;path&quot;: &quot;/&quot;,
         *             &quot;server&quot;: &quot;0ce1f4****-or***.cn-hangzhou.nas.aliyuncs.com&quot;,
         *             &quot;vers&quot;: &quot;3&quot;,
         *             &quot;options&quot;: &quot;nolock,proto=tcp,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2,noresvport&quot;
         *       },
         *       &quot;type&quot;: &quot;NAS&quot;
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>NAS</li>
         * <li>OSS</li>
         * <li>URL</li>
         * <li>SNAPSHOT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataSource build(java.util.Map<String, ?> map) throws Exception {
            DataSource self = new DataSource();
            return TeaModel.build(map, self);
        }

        public DataSource setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class Events extends TeaModel {
        /**
         * <p>The number of times that the event occurred.</p>
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
         * <p>2021-06-16T02:14:48Z</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The time when the event ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-16T02:24:48Z</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully check data cache resource.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>datacache</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The reason for the transition into the current status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the event. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Warning</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static Events build(java.util.Map<String, ?> map) throws Exception {
            Events self = new Events();
            return TeaModel.build(map, self);
        }

        public Events setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public Events setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public Events setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public Events setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Events setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Events setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public Events setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class Tags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DataCaches extends TeaModel {
        /**
         * <p>The bucket that stores the data cache.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the elastic container instance that was generated when the data cache was created.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-8vb1y2w1dv7zeirn****</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The time when the data cache was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-16T02:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the data cache.</p>
         * 
         * <strong>example:</strong>
         * <p>edc-bp15l4vvys94oo******</p>
         */
        @NameInMap("DataCacheId")
        public String dataCacheId;

        /**
         * <p>The information about the data source.</p>
         */
        @NameInMap("DataSource")
        public DataSource dataSource;

        /**
         * <p>The events.</p>
         */
        @NameInMap("Events")
        public java.util.List<Events> events;

        /**
         * <p>The time when the data cache expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-26T02:43Z</p>
         */
        @NameInMap("ExpireDateTime")
        public String expireDateTime;

        /**
         * <p>The ID of the on-premises snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp12w3v37sit96t6****</p>
         */
        @NameInMap("FlashSnapshotId")
        public String flashSnapshotId;

        /**
         * <p>The time when the data cache was last matched.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-18T02:43Z</p>
         */
        @NameInMap("LastMatchedTime")
        public String lastMatchedTime;

        /**
         * <p>The name of the data cache.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The directory in which the virtual host of the data cache resides.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/models/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The creation progress of the data cache.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2hlt3ux4****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The size of the data cache. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2zec5oj8e1yhxijt****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The status of the data cache. Valid values:</p>
         * <ul>
         * <li>Loading: The data cache is loading data.</li>
         * <li>Creating: The data cache is being created.</li>
         * <li>Available: The data cache is created.</li>
         * <li>Failed: The data cache failed to be created.</li>
         * <li>Updating: The data cache is being updated.</li>
         * <li>UpdateFailed: The data cache failed to be updated.</li>
         * </ul>
         * <p>If the data cache is in the Available state, the data cache can be used.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are attached to the data cache.</p>
         */
        @NameInMap("Tags")
        public java.util.List<Tags> tags;

        public static DataCaches build(java.util.Map<String, ?> map) throws Exception {
            DataCaches self = new DataCaches();
            return TeaModel.build(map, self);
        }

        public DataCaches setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DataCaches setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DataCaches setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DataCaches setDataCacheId(String dataCacheId) {
            this.dataCacheId = dataCacheId;
            return this;
        }
        public String getDataCacheId() {
            return this.dataCacheId;
        }

        public DataCaches setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public DataSource getDataSource() {
            return this.dataSource;
        }

        public DataCaches setEvents(java.util.List<Events> events) {
            this.events = events;
            return this;
        }
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        public DataCaches setExpireDateTime(String expireDateTime) {
            this.expireDateTime = expireDateTime;
            return this;
        }
        public String getExpireDateTime() {
            return this.expireDateTime;
        }

        public DataCaches setFlashSnapshotId(String flashSnapshotId) {
            this.flashSnapshotId = flashSnapshotId;
            return this;
        }
        public String getFlashSnapshotId() {
            return this.flashSnapshotId;
        }

        public DataCaches setLastMatchedTime(String lastMatchedTime) {
            this.lastMatchedTime = lastMatchedTime;
            return this;
        }
        public String getLastMatchedTime() {
            return this.lastMatchedTime;
        }

        public DataCaches setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DataCaches setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DataCaches setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DataCaches setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DataCaches setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DataCaches setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DataCaches setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DataCaches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DataCaches setTags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

    }

}
