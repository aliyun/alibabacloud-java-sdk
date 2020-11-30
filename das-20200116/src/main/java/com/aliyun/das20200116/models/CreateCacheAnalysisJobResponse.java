// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisJobResponse extends TeaModel {
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
    public CreateCacheAnalysisJobResponseData data;

    public static CreateCacheAnalysisJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheAnalysisJobResponse self = new CreateCacheAnalysisJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateCacheAnalysisJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCacheAnalysisJobResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCacheAnalysisJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCacheAnalysisJobResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateCacheAnalysisJobResponse setData(CreateCacheAnalysisJobResponseData data) {
        this.data = data;
        return this;
    }
    public CreateCacheAnalysisJobResponseData getData() {
        return this.data;
    }

    public static class CreateCacheAnalysisJobResponseDataBigKeysKeyInfo extends TeaModel {
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

        public static CreateCacheAnalysisJobResponseDataBigKeysKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateCacheAnalysisJobResponseDataBigKeysKeyInfo self = new CreateCacheAnalysisJobResponseDataBigKeysKeyInfo();
            return TeaModel.build(map, self);
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateCacheAnalysisJobResponseDataBigKeysKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCacheAnalysisJobResponseDataBigKeys extends TeaModel {
        @NameInMap("KeyInfo")
        @Validation(required = true)
        public java.util.List<CreateCacheAnalysisJobResponseDataBigKeysKeyInfo> keyInfo;

        public static CreateCacheAnalysisJobResponseDataBigKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateCacheAnalysisJobResponseDataBigKeys self = new CreateCacheAnalysisJobResponseDataBigKeys();
            return TeaModel.build(map, self);
        }

        public CreateCacheAnalysisJobResponseDataBigKeys setKeyInfo(java.util.List<CreateCacheAnalysisJobResponseDataBigKeysKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<CreateCacheAnalysisJobResponseDataBigKeysKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class CreateCacheAnalysisJobResponseData extends TeaModel {
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
        public CreateCacheAnalysisJobResponseDataBigKeys bigKeys;

        public static CreateCacheAnalysisJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateCacheAnalysisJobResponseData self = new CreateCacheAnalysisJobResponseData();
            return TeaModel.build(map, self);
        }

        public CreateCacheAnalysisJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateCacheAnalysisJobResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateCacheAnalysisJobResponseData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateCacheAnalysisJobResponseData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public CreateCacheAnalysisJobResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateCacheAnalysisJobResponseData setBigKeys(CreateCacheAnalysisJobResponseDataBigKeys bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }
        public CreateCacheAnalysisJobResponseDataBigKeys getBigKeys() {
            return this.bigKeys;
        }

    }

}
