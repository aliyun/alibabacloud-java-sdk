// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCacheAnalysisJobsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Bytes")
        public Long bytes;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Db")
        public Integer db;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("ExpirationTimeMillis")
        public Long expirationTimeMillis;

        @NameInMap("Key")
        public String key;

        @NameInMap("NodeId")
        public String nodeId;

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
        @NameInMap("BigKeys")
        public DescribeCacheAnalysisJobsResponseBodyDataListCacheAnalysisJobBigKeys bigKeys;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("NodeId")
        public String nodeId;

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
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public DescribeCacheAnalysisJobsResponseBodyDataList list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

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
