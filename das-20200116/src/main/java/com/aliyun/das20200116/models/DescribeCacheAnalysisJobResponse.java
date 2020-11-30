// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobResponse extends TeaModel {
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
    public DescribeCacheAnalysisJobResponseData data;

    public static DescribeCacheAnalysisJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisJobResponse self = new DescribeCacheAnalysisJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCacheAnalysisJobResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCacheAnalysisJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCacheAnalysisJobResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeCacheAnalysisJobResponse setData(DescribeCacheAnalysisJobResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeCacheAnalysisJobResponseData getData() {
        return this.data;
    }

    public static class DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo extends TeaModel {
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

        public static DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo self = new DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobResponseDataBigKeys extends TeaModel {
        @NameInMap("KeyInfo")
        @Validation(required = true)
        public java.util.List<DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo> keyInfo;

        public static DescribeCacheAnalysisJobResponseDataBigKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseDataBigKeys self = new DescribeCacheAnalysisJobResponseDataBigKeys();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseDataBigKeys setKeyInfo(java.util.List<DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseDataBigKeysKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix extends TeaModel {
        @NameInMap("Prefix")
        @Validation(required = true)
        public String prefix;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Bytes")
        @Validation(required = true)
        public Long bytes;

        @NameInMap("KeyNum")
        @Validation(required = true)
        public Long keyNum;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix self = new DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix setKeyNum(Long keyNum) {
            this.keyNum = keyNum;
            return this;
        }
        public Long getKeyNum() {
            return this.keyNum;
        }

        public DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeCacheAnalysisJobResponseDataKeyPrefixes extends TeaModel {
        @NameInMap("Prefix")
        @Validation(required = true)
        public java.util.List<DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix> prefix;

        public static DescribeCacheAnalysisJobResponseDataKeyPrefixes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseDataKeyPrefixes self = new DescribeCacheAnalysisJobResponseDataKeyPrefixes();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseDataKeyPrefixes setPrefix(java.util.List<DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix> prefix) {
            this.prefix = prefix;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseDataKeyPrefixesPrefix> getPrefix() {
            return this.prefix;
        }

    }

    public static class DescribeCacheAnalysisJobResponseData extends TeaModel {
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
        public DescribeCacheAnalysisJobResponseDataBigKeys bigKeys;

        @NameInMap("KeyPrefixes")
        @Validation(required = true)
        public DescribeCacheAnalysisJobResponseDataKeyPrefixes keyPrefixes;

        public static DescribeCacheAnalysisJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseData self = new DescribeCacheAnalysisJobResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeCacheAnalysisJobResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCacheAnalysisJobResponseData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobResponseData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeCacheAnalysisJobResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeCacheAnalysisJobResponseData setBigKeys(DescribeCacheAnalysisJobResponseDataBigKeys bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }
        public DescribeCacheAnalysisJobResponseDataBigKeys getBigKeys() {
            return this.bigKeys;
        }

        public DescribeCacheAnalysisJobResponseData setKeyPrefixes(DescribeCacheAnalysisJobResponseDataKeyPrefixes keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }
        public DescribeCacheAnalysisJobResponseDataKeyPrefixes getKeyPrefixes() {
            return this.keyPrefixes;
        }

    }

}
