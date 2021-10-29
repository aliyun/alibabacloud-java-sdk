// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopHotKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeTopHotKeysResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Db")
        public Integer db;

        @NameInMap("Hot")
        public String hot;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("Lfu")
        public Integer lfu;

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
