// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotBigKeysResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of hot keys and large keys.</p>
     */
    @NameInMap("Data")
    public DescribeHotBigKeysResponseBodyData data;

    /**
     * <p>The returned message.</p>
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

    public static DescribeHotBigKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotBigKeysResponseBody self = new DescribeHotBigKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHotBigKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHotBigKeysResponseBody setData(DescribeHotBigKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeHotBigKeysResponseBodyData getData() {
        return this.data;
    }

    public DescribeHotBigKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHotBigKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHotBigKeysResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeHotBigKeysResponseBodyDataBigKeysBigKey extends TeaModel {
        /**
         * <p>The database in which the key is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>The key.</p>
         * 
         * <strong>example:</strong>
         * <p>abc:def:eng</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>zset</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The ID of the data shard on the ApsaraDB for Redis instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The number of elements in the key.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Size")
        public Long size;

        public static DescribeHotBigKeysResponseBodyDataBigKeysBigKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotBigKeysResponseBodyDataBigKeysBigKey self = new DescribeHotBigKeysResponseBodyDataBigKeysBigKey();
            return TeaModel.build(map, self);
        }

        public DescribeHotBigKeysResponseBodyDataBigKeysBigKey setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeHotBigKeysResponseBodyDataBigKeysBigKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHotBigKeysResponseBodyDataBigKeysBigKey setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeHotBigKeysResponseBodyDataBigKeysBigKey setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeHotBigKeysResponseBodyDataBigKeysBigKey setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeHotBigKeysResponseBodyDataBigKeys extends TeaModel {
        @NameInMap("BigKey")
        public java.util.List<DescribeHotBigKeysResponseBodyDataBigKeysBigKey> bigKey;

        public static DescribeHotBigKeysResponseBodyDataBigKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotBigKeysResponseBodyDataBigKeys self = new DescribeHotBigKeysResponseBodyDataBigKeys();
            return TeaModel.build(map, self);
        }

        public DescribeHotBigKeysResponseBodyDataBigKeys setBigKey(java.util.List<DescribeHotBigKeysResponseBodyDataBigKeysBigKey> bigKey) {
            this.bigKey = bigKey;
            return this;
        }
        public java.util.List<DescribeHotBigKeysResponseBodyDataBigKeysBigKey> getBigKey() {
            return this.bigKey;
        }

    }

    public static class DescribeHotBigKeysResponseBodyDataHotKeysHotKey extends TeaModel {
        /**
         * <p>The database in which the key is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>The frequency at which the key is accessed, which indicates the queries per second (QPS) of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>5500~6000</p>
         */
        @NameInMap("Hot")
        public String hot;

        /**
         * <p>The key.</p>
         * 
         * <strong>example:</strong>
         * <p>abc:def:eng</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>zset</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The statistical value that is calculated based on the least frequently used (LFU) caching algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>253</p>
         */
        @NameInMap("Lfu")
        public Integer lfu;

        /**
         * <p>The ID of the data shard on the ApsaraDB for Redis instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeHotBigKeysResponseBodyDataHotKeysHotKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotBigKeysResponseBodyDataHotKeysHotKey self = new DescribeHotBigKeysResponseBodyDataHotKeysHotKey();
            return TeaModel.build(map, self);
        }

        public DescribeHotBigKeysResponseBodyDataHotKeysHotKey setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeHotBigKeysResponseBodyDataHotKeysHotKey setHot(String hot) {
            this.hot = hot;
            return this;
        }
        public String getHot() {
            return this.hot;
        }

        public DescribeHotBigKeysResponseBodyDataHotKeysHotKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHotBigKeysResponseBodyDataHotKeysHotKey setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeHotBigKeysResponseBodyDataHotKeysHotKey setLfu(Integer lfu) {
            this.lfu = lfu;
            return this;
        }
        public Integer getLfu() {
            return this.lfu;
        }

        public DescribeHotBigKeysResponseBodyDataHotKeysHotKey setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeHotBigKeysResponseBodyDataHotKeys extends TeaModel {
        @NameInMap("HotKey")
        public java.util.List<DescribeHotBigKeysResponseBodyDataHotKeysHotKey> hotKey;

        public static DescribeHotBigKeysResponseBodyDataHotKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotBigKeysResponseBodyDataHotKeys self = new DescribeHotBigKeysResponseBodyDataHotKeys();
            return TeaModel.build(map, self);
        }

        public DescribeHotBigKeysResponseBodyDataHotKeys setHotKey(java.util.List<DescribeHotBigKeysResponseBodyDataHotKeysHotKey> hotKey) {
            this.hotKey = hotKey;
            return this;
        }
        public java.util.List<DescribeHotBigKeysResponseBodyDataHotKeysHotKey> getHotKey() {
            return this.hotKey;
        }

    }

    public static class DescribeHotBigKeysResponseBodyData extends TeaModel {
        /**
         * <p>The reason why the large key failed to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>current version doesn\&quot;t support</p>
         */
        @NameInMap("BigKeyMsg")
        public String bigKeyMsg;

        /**
         * <p>The list of large keys.</p>
         */
        @NameInMap("BigKeys")
        public DescribeHotBigKeysResponseBodyDataBigKeys bigKeys;

        /**
         * <p>The reason why the hot key failed to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>current version doesn\&quot;t support</p>
         */
        @NameInMap("HotKeyMsg")
        public String hotKeyMsg;

        /**
         * <p>The list of hot keys.</p>
         */
        @NameInMap("HotKeys")
        public DescribeHotBigKeysResponseBodyDataHotKeys hotKeys;

        public static DescribeHotBigKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotBigKeysResponseBodyData self = new DescribeHotBigKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeHotBigKeysResponseBodyData setBigKeyMsg(String bigKeyMsg) {
            this.bigKeyMsg = bigKeyMsg;
            return this;
        }
        public String getBigKeyMsg() {
            return this.bigKeyMsg;
        }

        public DescribeHotBigKeysResponseBodyData setBigKeys(DescribeHotBigKeysResponseBodyDataBigKeys bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }
        public DescribeHotBigKeysResponseBodyDataBigKeys getBigKeys() {
            return this.bigKeys;
        }

        public DescribeHotBigKeysResponseBodyData setHotKeyMsg(String hotKeyMsg) {
            this.hotKeyMsg = hotKeyMsg;
            return this;
        }
        public String getHotKeyMsg() {
            return this.hotKeyMsg;
        }

        public DescribeHotBigKeysResponseBodyData setHotKeys(DescribeHotBigKeysResponseBodyDataHotKeys hotKeys) {
            this.hotKeys = hotKeys;
            return this;
        }
        public DescribeHotBigKeysResponseBodyDataHotKeys getHotKeys() {
            return this.hotKeys;
        }

    }

}
