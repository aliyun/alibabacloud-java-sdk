// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopHotKeysResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information about the hot keys.</p>
     */
    @NameInMap("Data")
    public DescribeTopHotKeysResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeTopHotKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopHotKeysResponseBody self = new DescribeTopHotKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopHotKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTopHotKeysResponseBody setData(DescribeTopHotKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTopHotKeysResponseBodyData getData() {
        return this.data;
    }

    public DescribeTopHotKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTopHotKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopHotKeysResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeTopHotKeysResponseBodyDataHotKey extends TeaModel {
        /**
         * <p>The database in which the key is stored.</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>The frequency at which the key is accessed, which indicates the QPS of the key.</p>
         */
        @NameInMap("Hot")
        public String hot;

        /**
         * <p>The key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the key.</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The statistical value that is calculated based on the least frequently used (LFU) caching algorithm.</p>
         */
        @NameInMap("Lfu")
        public Integer lfu;

        /**
         * <p>The ID of the data shard on the ApsaraDB for Redis instance.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeTopHotKeysResponseBodyDataHotKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopHotKeysResponseBodyDataHotKey self = new DescribeTopHotKeysResponseBodyDataHotKey();
            return TeaModel.build(map, self);
        }

        public DescribeTopHotKeysResponseBodyDataHotKey setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeTopHotKeysResponseBodyDataHotKey setHot(String hot) {
            this.hot = hot;
            return this;
        }
        public String getHot() {
            return this.hot;
        }

        public DescribeTopHotKeysResponseBodyDataHotKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTopHotKeysResponseBodyDataHotKey setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeTopHotKeysResponseBodyDataHotKey setLfu(Integer lfu) {
            this.lfu = lfu;
            return this;
        }
        public Integer getLfu() {
            return this.lfu;
        }

        public DescribeTopHotKeysResponseBodyDataHotKey setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeTopHotKeysResponseBodyData extends TeaModel {
        @NameInMap("HotKey")
        public java.util.List<DescribeTopHotKeysResponseBodyDataHotKey> hotKey;

        public static DescribeTopHotKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopHotKeysResponseBodyData self = new DescribeTopHotKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTopHotKeysResponseBodyData setHotKey(java.util.List<DescribeTopHotKeysResponseBodyDataHotKey> hotKey) {
            this.hotKey = hotKey;
            return this;
        }
        public java.util.List<DescribeTopHotKeysResponseBodyDataHotKey> getHotKey() {
            return this.hotKey;
        }

    }

}
