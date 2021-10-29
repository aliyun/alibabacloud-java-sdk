// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateCacheAnalysisJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CreateCacheAnalysisJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheAnalysisJobResponseBody self = new CreateCacheAnalysisJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCacheAnalysisJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCacheAnalysisJobResponseBody setData(CreateCacheAnalysisJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCacheAnalysisJobResponseBodyData getData() {
        return this.data;
    }

    public CreateCacheAnalysisJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCacheAnalysisJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCacheAnalysisJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo extends TeaModel {
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

        public static CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo self = new CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo();
            return TeaModel.build(map, self);
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCacheAnalysisJobResponseBodyDataBigKeys extends TeaModel {
        @NameInMap("KeyInfo")
        public java.util.List<CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo> keyInfo;

        public static CreateCacheAnalysisJobResponseBodyDataBigKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateCacheAnalysisJobResponseBodyDataBigKeys self = new CreateCacheAnalysisJobResponseBodyDataBigKeys();
            return TeaModel.build(map, self);
        }

        public CreateCacheAnalysisJobResponseBodyDataBigKeys setKeyInfo(java.util.List<CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<CreateCacheAnalysisJobResponseBodyDataBigKeysKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class CreateCacheAnalysisJobResponseBodyData extends TeaModel {
        @NameInMap("BigKeys")
        public CreateCacheAnalysisJobResponseBodyDataBigKeys bigKeys;

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

        public static CreateCacheAnalysisJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCacheAnalysisJobResponseBodyData self = new CreateCacheAnalysisJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCacheAnalysisJobResponseBodyData setBigKeys(CreateCacheAnalysisJobResponseBodyDataBigKeys bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }
        public CreateCacheAnalysisJobResponseBodyDataBigKeys getBigKeys() {
            return this.bigKeys;
        }

        public CreateCacheAnalysisJobResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateCacheAnalysisJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateCacheAnalysisJobResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateCacheAnalysisJobResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateCacheAnalysisJobResponseBodyData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

    }

}
