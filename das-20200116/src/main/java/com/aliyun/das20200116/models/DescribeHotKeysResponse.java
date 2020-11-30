// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotKeysResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeHotKeysResponseData data;

    public static DescribeHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotKeysResponse self = new DescribeHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHotKeysResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHotKeysResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHotKeysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHotKeysResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeHotKeysResponse setData(DescribeHotKeysResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeHotKeysResponseData getData() {
        return this.data;
    }

    public static class DescribeHotKeysResponseDataHotKey extends TeaModel {
        @NameInMap("Db")
        @Validation(required = true)
        public Integer db;

        @NameInMap("KeyType")
        @Validation(required = true)
        public String keyType;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Hot")
        @Validation(required = true)
        public String hot;

        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        public static DescribeHotKeysResponseDataHotKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotKeysResponseDataHotKey self = new DescribeHotKeysResponseDataHotKey();
            return TeaModel.build(map, self);
        }

        public DescribeHotKeysResponseDataHotKey setDb(Integer db) {
            this.db = db;
            return this;
        }
        public Integer getDb() {
            return this.db;
        }

        public DescribeHotKeysResponseDataHotKey setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeHotKeysResponseDataHotKey setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeHotKeysResponseDataHotKey setHot(String hot) {
            this.hot = hot;
            return this;
        }
        public String getHot() {
            return this.hot;
        }

        public DescribeHotKeysResponseDataHotKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class DescribeHotKeysResponseData extends TeaModel {
        @NameInMap("HotKey")
        @Validation(required = true)
        public java.util.List<DescribeHotKeysResponseDataHotKey> hotKey;

        public static DescribeHotKeysResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHotKeysResponseData self = new DescribeHotKeysResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeHotKeysResponseData setHotKey(java.util.List<DescribeHotKeysResponseDataHotKey> hotKey) {
            this.hotKey = hotKey;
            return this;
        }
        public java.util.List<DescribeHotKeysResponseDataHotKey> getHotKey() {
            return this.hotKey;
        }

    }

}
