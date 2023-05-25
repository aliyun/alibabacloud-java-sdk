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

    public static class DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo extends TeaModel {
        /**
         * <p>Key占用字节数。</p>
         */
        @NameInMap("Bytes")
        public Long bytes;

        /**
         * <p>Key的元素个数。</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>数据库名称。</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>Key内部数据类型。</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>Key过期时间，单位：毫秒（ms），0表示不过期。</p>
         */
        @NameInMap("ExpirationTimeMillis")
        public Long expirationTimeMillis;

        /**
         * <p>Key的名称。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>实例的数据节点ID。</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Redis数据结构类型。</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo self = new DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum extends TeaModel {
        @NameInMap("KeyInfo")
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo> keyInfo;

        public static DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum self = new DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum setKeyInfo(java.util.List<DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNumKeyInfo> getKeyInfo() {
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

    public static class DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo extends TeaModel {
        /**
         * <p>Key占用字节数。</p>
         */
        @NameInMap("Bytes")
        public Long bytes;

        /**
         * <p>Key的元素个数。</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>数据库名称。</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>Key内部数据类型。</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>Key过期时间，单位：毫秒（ms），0表示不过期。</p>
         */
        @NameInMap("ExpirationTimeMillis")
        public Long expirationTimeMillis;

        /**
         * <p>Key的名称。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>实例的数据节点ID</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Redis数据结构类型。</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo self = new DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes extends TeaModel {
        @NameInMap("KeyInfo")
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo> keyInfo;

        public static DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes self = new DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes setKeyInfo(java.util.List<DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytesKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo extends TeaModel {
        /**
         * <p>Key占用字节数。</p>
         */
        @NameInMap("Bytes")
        public Long bytes;

        /**
         * <p>Key的元素个数。</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>数据库名称。</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>Key内部数据类型。</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>Key过期时间，单位：毫秒（ms），0表示不过期。</p>
         */
        @NameInMap("ExpirationTimeMillis")
        public Long expirationTimeMillis;

        /**
         * <p>Key的名称。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>实例的数据节点ID。</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Redis数据结构类型。</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo self = new DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setExpirationTimeMillis(Long expirationTimeMillis) {
            this.expirationTimeMillis = expirationTimeMillis;
            return this;
        }
        public Long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum extends TeaModel {
        @NameInMap("KeyInfo")
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo> keyInfo;

        public static DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum self = new DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum setKeyInfo(java.util.List<DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo> keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNumKeyInfo> getKeyInfo() {
            return this.keyInfo;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyData extends TeaModel {
        @NameInMap("BigKeys")
        public DescribeCacheAnalysisJobResponseBodyDataBigKeys bigKeys;

        /**
         * <p>大Key详细信息，根据Key数量降序排列。</p>
         */
        @NameInMap("BigKeysOfNum")
        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum bigKeysOfNum;

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

        /**
         * <p>永不过期Key的详细信息，根据Key占用字节数降序排列。</p>
         */
        @NameInMap("UnexBigKeysOfBytes")
        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes unexBigKeysOfBytes;

        /**
         * <p>永不过期Key的详细信息，根据Key数量降序排列。</p>
         */
        @NameInMap("UnexBigKeysOfNum")
        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum unexBigKeysOfNum;

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

        public DescribeCacheAnalysisJobResponseBodyData setBigKeysOfNum(DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum bigKeysOfNum) {
            this.bigKeysOfNum = bigKeysOfNum;
            return this;
        }
        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum getBigKeysOfNum() {
            return this.bigKeysOfNum;
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

        public DescribeCacheAnalysisJobResponseBodyData setUnexBigKeysOfBytes(DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes unexBigKeysOfBytes) {
            this.unexBigKeysOfBytes = unexBigKeysOfBytes;
            return this;
        }
        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes getUnexBigKeysOfBytes() {
            return this.unexBigKeysOfBytes;
        }

        public DescribeCacheAnalysisJobResponseBodyData setUnexBigKeysOfNum(DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum unexBigKeysOfNum) {
            this.unexBigKeysOfNum = unexBigKeysOfNum;
            return this;
        }
        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfNum getUnexBigKeysOfNum() {
            return this.unexBigKeysOfNum;
        }

    }

}
