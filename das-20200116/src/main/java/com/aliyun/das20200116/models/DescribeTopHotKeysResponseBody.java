// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopHotKeysResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
        @NameInMap("Category")
        public String category;

        /**
         * <p>The database in which the key is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Db")
        public Integer db;

        /**
         * <p>The frequency at which the key is accessed, which indicates the QPS of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>5500~6000</p>
         */
        @NameInMap("Hot")
        public String hot;

        @NameInMap("InBytes")
        public Long inBytes;

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

        @NameInMap("OutBytes")
        public Long outBytes;

        public static DescribeTopHotKeysResponseBodyDataHotKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopHotKeysResponseBodyDataHotKey self = new DescribeTopHotKeysResponseBodyDataHotKey();
            return TeaModel.build(map, self);
        }

        public DescribeTopHotKeysResponseBodyDataHotKey setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
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

        public DescribeTopHotKeysResponseBodyDataHotKey setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
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

        public DescribeTopHotKeysResponseBodyDataHotKey setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
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
