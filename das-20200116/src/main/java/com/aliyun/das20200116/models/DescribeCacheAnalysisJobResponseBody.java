// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCacheAnalysisJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeCacheAnalysisJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisJobResponseBody self = new DescribeCacheAnalysisJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCacheAnalysisJobResponseBody setData(DescribeCacheAnalysisJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCacheAnalysisJobResponseBodyData getData() {
        return this.data;
    }

    public DescribeCacheAnalysisJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCacheAnalysisJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCacheAnalysisJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo extends TeaModel {
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

        public static DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo self = new DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataBigKeys extends TeaModel {
        @NameInMap("KeyInfo")
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo> keyInfo;

        public static DescribeCacheAnalysisJobResponseBodyDataBigKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataBigKeys self = new DescribeCacheAnalysisJobResponseBodyDataBigKeys();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeys setKeyInfo(java.util.List<DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataBigKeysKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix extends TeaModel {
        @NameInMap("Bytes")
        public Long bytes;

        @NameInMap("Count")
        public Long count;

        @NameInMap("KeyNum")
        public Long keyNum;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Type")
        public String type;

        public static DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix self = new DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix setKeyNum(Long keyNum) {
            this.keyNum = keyNum;
            return this;
        }
        public Long getKeyNum() {
            return this.keyNum;
        }

        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes extends TeaModel {
        @NameInMap("Prefix")
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix> prefix;

        public static DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes self = new DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes setPrefix(java.util.List<DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix> prefix) {
            this.prefix = prefix;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix> getPrefix() {
            return this.prefix;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyData extends TeaModel {
        @NameInMap("BigKeys")
        public DescribeCacheAnalysisJobResponseBodyDataBigKeys bigKeys;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("KeyPrefixes")
        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes keyPrefixes;

        @NameInMap("Message")
        public String message;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("TaskState")
        public String taskState;

        public static DescribeCacheAnalysisJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyData self = new DescribeCacheAnalysisJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyData setBigKeys(DescribeCacheAnalysisJobResponseBodyDataBigKeys bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }
        public DescribeCacheAnalysisJobResponseBodyDataBigKeys getBigKeys() {
            return this.bigKeys;
        }

        public DescribeCacheAnalysisJobResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCacheAnalysisJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeCacheAnalysisJobResponseBodyData setKeyPrefixes(DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }
        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes getKeyPrefixes() {
            return this.keyPrefixes;
        }

        public DescribeCacheAnalysisJobResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeCacheAnalysisJobResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobResponseBodyData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

    }

}
