// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotKeysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeHotKeysResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeHotKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotKeysResponseBody self = new DescribeHotKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHotKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHotKeysResponseBody setData(DescribeHotKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeHotKeysResponseBodyData getData() {
        return this.data;
    }

    public DescribeHotKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHotKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHotKeysResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeHotKeysResponseBodyDataHotKey extends TeaModel {
        @NameInMap("Db")
        public Integer db;

        @NameInMap("Hot")
        public String hot;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("Size")
        public Long size;

        public static DescribeHotKeysResponseBodyDataHotKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotKeysResponseBodyDataHotKey self = new DescribeHotKeysResponseBodyDataHotKey();
            return TeaModel.build(map, self);
        }

        public DescribeHotKeysResponseBodyDataHotKey setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeHotKeysResponseBodyDataHotKey setHot(String hot) {
            this.hot = hot;
            return this;
        }
        public String getHot() {
            return this.hot;
        }

        public DescribeHotKeysResponseBodyDataHotKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHotKeysResponseBodyDataHotKey setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeHotKeysResponseBodyDataHotKey setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeHotKeysResponseBodyData extends TeaModel {
        @NameInMap("HotKey")
        public java.util.List<DescribeHotKeysResponseBodyDataHotKey> hotKey;

        public static DescribeHotKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotKeysResponseBodyData self = new DescribeHotKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeHotKeysResponseBodyData setHotKey(java.util.List<DescribeHotKeysResponseBodyDataHotKey> hotKey) {
            this.hotKey = hotKey;
            return this;
        }
        public java.util.List<DescribeHotKeysResponseBodyDataHotKey> getHotKey() {
            return this.hotKey;
        }

    }

}
