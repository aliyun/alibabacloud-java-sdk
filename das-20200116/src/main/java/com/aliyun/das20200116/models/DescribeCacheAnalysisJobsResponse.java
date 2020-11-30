// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeCacheAnalysisJobsResponseData data;

    public static DescribeCacheAnalysisJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisJobsResponse self = new DescribeCacheAnalysisJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisJobsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCacheAnalysisJobsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCacheAnalysisJobsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCacheAnalysisJobsResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeCacheAnalysisJobsResponse setData(DescribeCacheAnalysisJobsResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeCacheAnalysisJobsResponseData getData() {
        return this.data;
    }

    public static class DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("Bytes")
        @Validation(required = true)
        public Long bytes;

        @NameInMap("Db")
        @Validation(required = true)
        public Integer db;

        @NameInMap("Encoding")
        @Validation(required = true)
        public String encoding;

        @NameInMap("ExpirationTimeMillis")
        @Validation(required = true)
        public Long expirationTimeMillis;

        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("NodeId")
        @Validation(required = true)
        public String nodeId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo self = new DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys extends TeaModel {
        @NameInMap("KeyInfo")
        @Validation(required = true)
        public java.util.List<DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo> keyInfo;

        public static DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys self = new DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys setKeyInfo(java.util.List<DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeysKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("NodeId")
        @Validation(required = true)
        public String nodeId;

        @NameInMap("TaskState")
        @Validation(required = true)
        public String taskState;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("BigKeys")
        @Validation(required = true)
        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys bigKeys;

        public static DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob self = new DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob setBigKeys(DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }
        public DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJobBigKeys getBigKeys() {
            return this.bigKeys;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseDataList extends TeaModel {
        @NameInMap("CacheAnalysisJob")
        @Validation(required = true)
        public java.util.List<DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob> cacheAnalysisJob;

        public static DescribeCacheAnalysisJobsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseDataList self = new DescribeCacheAnalysisJobsResponseDataList();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseDataList setCacheAnalysisJob(java.util.List<DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob> cacheAnalysisJob) {
            this.cacheAnalysisJob = cacheAnalysisJob;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobsResponseDataListCacheAnalysisJob> getCacheAnalysisJob() {
            return this.cacheAnalysisJob;
        }

    }

    public static class DescribeCacheAnalysisJobsResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("PageNo")
        @Validation(required = true)
        public Long pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("Extra")
        @Validation(required = true)
        public String extra;

        @NameInMap("List")
        @Validation(required = true)
        public DescribeCacheAnalysisJobsResponseDataList list;

        public static DescribeCacheAnalysisJobsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobsResponseData self = new DescribeCacheAnalysisJobsResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobsResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeCacheAnalysisJobsResponseData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public DescribeCacheAnalysisJobsResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeCacheAnalysisJobsResponseData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeCacheAnalysisJobsResponseData setList(DescribeCacheAnalysisJobsResponseDataList list) {
            this.list = list;
            return this;
        }
        public DescribeCacheAnalysisJobsResponseDataList getList() {
            return this.list;
        }

    }

}
