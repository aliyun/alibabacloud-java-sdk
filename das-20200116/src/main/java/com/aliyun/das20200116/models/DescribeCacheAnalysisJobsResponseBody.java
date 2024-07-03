// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of cache analysis tasks.</p>
     */
    @NameInMap("Data")
    public DescribeCacheAnalysisJobsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeCacheAnalysisJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisJobsResponseBody self = new DescribeCacheAnalysisJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCacheAnalysisJobsResponseBody setData(DescribeCacheAnalysisJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCacheAnalysisJobsResponseBodyData getData() {
        return this.data;
    }

    public DescribeCacheAnalysisJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCacheAnalysisJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCacheAnalysisJobsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo extends TeaModel {
        /**
         * <p>The number of bytes that are occupied by the key.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Bytes")
        public Long bytes;

        /**
         * <p>The number of elements in the key.</p>
         * 
         * <strong>example:</strong>
         * <p>127</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>The data type of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>hashtable</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The expiration period of the key. Unit: milliseconds. A value of 0 indicates that the key does not expire.</p>
         * 
         * <strong>example:</strong>
         * <p>1596256542547</p>
         */
        @NameInMap("ExpirationTimeMillis")
        public Long expirationTimeMillis;

        /**
         * <p>The name of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>task_*****</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the data node on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The data type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo self = new DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys extends TeaModel {
        @NameInMap("KeyInfo")
        public java.util.List<DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo> keyInfo;

        public static DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys self = new DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys setKeyInfo(java.util.List<DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeysKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob extends TeaModel {
        /**
         * <p>The details about the large keys.</p>
         * <blockquote>
         * <p>The sub-parameters of this parameter and the content of the sub-parameters are not returned. To query the detailed information about the cache analysis tasks, call the <a href="https://help.aliyun.com/document_detail/443012.html">DescribeCacheAnalysisJob</a> operation.</p>
         * </blockquote>
         */
        @NameInMap("BigKeys")
        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys bigKeys;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp18ff4a195d****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the cache analysis task.</p>
         * 
         * <strong>example:</strong>
         * <p>sf79-sd99-sa37-****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the data node on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The state of the cache analysis task. Valid values:</p>
         * <ul>
         * <li><strong>BACKUP</strong>: The data is being backed up.</li>
         * <li><strong>ANALYZING</strong>: The data is being analyzed.</li>
         * <li><strong>FINISHED</strong>: The data is analyzed.</li>
         * <li><strong>FAILED</strong>: An error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKUP</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        public static DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob self = new DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob setBigKeys(DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }
        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys getBigKeys() {
            return this.bigKeys;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseBodyDataList extends TeaModel {
        @NameInMap("CacheAnalysisJob")
        public java.util.List<DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob> cacheAnalysisJob;

        public static DescribeCacheAnalysisJobsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseBodyDataList self = new DescribeCacheAnalysisJobsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseBodyDataList setCacheAnalysisJob(java.util.List<DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob> cacheAnalysisJob) {
            this.cacheAnalysisJob = cacheAnalysisJob;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJob> getCacheAnalysisJob() {
            return this.cacheAnalysisJob;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseBodyData extends TeaModel {
        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The ID of the data node on the instance.</p>
         */
        @NameInMap("List")
        public DescribeCacheAnalysisJobsResponseBodyDataList list;

        /**
         * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeCacheAnalysisJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseBodyData self = new DescribeCacheAnalysisJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeCacheAnalysisJobsResponseBodyData setList(DescribeCacheAnalysisJobsResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public DescribeCacheAnalysisJobsResponseBodyDataList getList() {
            return this.list;
        }

        public DescribeCacheAnalysisJobsResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public DescribeCacheAnalysisJobsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeCacheAnalysisJobsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
