// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopBigKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeTopBigKeysResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeTopBigKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopBigKeysResponseBody self = new DescribeTopBigKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopBigKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTopBigKeysResponseBody setData(DescribeTopBigKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTopBigKeysResponseBodyData getData() {
        return this.data;
    }

    public DescribeTopBigKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTopBigKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopBigKeysResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeTopBigKeysResponseBodyDataBigKey extends TeaModel {
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

        public static DescribeTopBigKeysResponseBodyDataBigKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopBigKeysResponseBodyDataBigKey self = new DescribeTopBigKeysResponseBodyDataBigKey();
            return TeaModel.build(map, self);
        }

        public DescribeTopBigKeysResponseBodyDataBigKey setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeTopBigKeysResponseBodyDataBigKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTopBigKeysResponseBodyDataBigKey setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeTopBigKeysResponseBodyDataBigKey setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeTopBigKeysResponseBodyDataBigKey setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeTopBigKeysResponseBodyData extends TeaModel {
        @NameInMap("BigKey")
        public java.util.List<DescribeTopBigKeysResponseBodyDataBigKey> bigKey;

        public static DescribeTopBigKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopBigKeysResponseBodyData self = new DescribeTopBigKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTopBigKeysResponseBodyData setBigKey(java.util.List<DescribeTopBigKeysResponseBodyDataBigKey> bigKey) {
            this.bigKey = bigKey;
            return this;
        }
        public java.util.List<DescribeTopBigKeysResponseBodyDataBigKey> getBigKey() {
            return this.bigKey;
        }

    }

}
