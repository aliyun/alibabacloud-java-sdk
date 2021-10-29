// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotBigKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeHotBigKeysResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Db")
        public Integer db;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("NodeId")
        public String nodeId;

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
        @NameInMap("BigKeyMsg")
        public String bigKeyMsg;

        @NameInMap("BigKeys")
        public DescribeHotBigKeysResponseBodyDataBigKeys bigKeys;

        @NameInMap("HotKeyMsg")
        public String hotKeyMsg;

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
