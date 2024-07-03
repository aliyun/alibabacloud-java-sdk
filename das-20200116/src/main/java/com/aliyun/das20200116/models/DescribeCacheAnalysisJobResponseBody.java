// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Data")
    public DescribeCacheAnalysisJobResponseBodyData data;

    /**
     * <p>The message that is returned for the request.</p>
     * <blockquote>
     * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
         * <p>task_x****</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the data node on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
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
         * <p>task_x****</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the data node on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
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

    public static class DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel extends TeaModel {
        @NameInMap("AnalysisTs")
        public Long analysisTs;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("TotalBytes")
        public Long totalBytes;

        @NameInMap("TotalKeys")
        public Long totalKeys;

        public static DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel self = new DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel setAnalysisTs(Long analysisTs) {
            this.analysisTs = analysisTs;
            return this;
        }
        public Long getAnalysisTs() {
            return this.analysisTs;
        }

        public DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel setTotalKeys(Long totalKeys) {
            this.totalKeys = totalKeys;
            return this;
        }
        public Long getTotalKeys() {
            return this.totalKeys;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount extends TeaModel {
        @NameInMap("ExpiryLevel")
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel> expiryLevel;

        public static DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount self = new DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount setExpiryLevel(java.util.List<DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel> expiryLevel) {
            this.expiryLevel = expiryLevel;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCountExpiryLevel> getExpiryLevel() {
            return this.expiryLevel;
        }

    }

    public static class DescribeCacheAnalysisJobResponseBodyDataKeyPrefixesPrefix extends TeaModel {
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
         * <p>The number of keys that contain the prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("KeyNum")
        public Long keyNum;

        /**
         * <p>The prefix of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>task_</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The data type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
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
         * <p>task_x****</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the data node on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
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
         * <p>task_x****</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the data node on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
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
        /**
         * <p>The details of the large keys. The returned large keys are sorted in descending order based on the number of bytes occupied by the keys.</p>
         */
        @NameInMap("BigKeys")
        public DescribeCacheAnalysisJobResponseBodyDataBigKeys bigKeys;

        /**
         * <p>The details of the large keys. The returned large keys are sorted in descending order based on the number of keys.</p>
         */
        @NameInMap("BigKeysOfNum")
        public DescribeCacheAnalysisJobResponseBodyDataBigKeysOfNum bigKeysOfNum;

        @NameInMap("ExpiryKeysLevelCount")
        public DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount expiryKeysLevelCount;

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
         * <p>The prefixes of the keys.</p>
         */
        @NameInMap("KeyPrefixes")
        public DescribeCacheAnalysisJobResponseBodyDataKeyPrefixes keyPrefixes;

        /**
         * <p>The message that is returned for the request.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
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

        /**
         * <p>The details of permanent keys. The returned keys are sorted in descending order based on the number of bytes occupied by the keys.</p>
         */
        @NameInMap("UnexBigKeysOfBytes")
        public DescribeCacheAnalysisJobResponseBodyDataUnexBigKeysOfBytes unexBigKeysOfBytes;

        /**
         * <p>The details of permanent keys. The returned keys are sorted in descending order based on the number of keys.</p>
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

        public DescribeCacheAnalysisJobResponseBodyData setExpiryKeysLevelCount(DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount expiryKeysLevelCount) {
            this.expiryKeysLevelCount = expiryKeysLevelCount;
            return this;
        }
        public DescribeCacheAnalysisJobResponseBodyDataExpiryKeysLevelCount getExpiryKeysLevelCount() {
            return this.expiryKeysLevelCount;
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
