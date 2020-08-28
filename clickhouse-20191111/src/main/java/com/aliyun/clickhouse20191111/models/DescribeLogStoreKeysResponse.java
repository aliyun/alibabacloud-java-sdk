// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogStoreKeysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LogStoreKeys")
    @Validation(required = true)
    public DescribeLogStoreKeysResponseLogStoreKeys logStoreKeys;

    public static DescribeLogStoreKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreKeysResponse self = new DescribeLogStoreKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreKeysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogStoreKeysResponse setLogStoreKeys(DescribeLogStoreKeysResponseLogStoreKeys logStoreKeys) {
        this.logStoreKeys = logStoreKeys;
        return this;
    }
    public DescribeLogStoreKeysResponseLogStoreKeys getLogStoreKeys() {
        return this.logStoreKeys;
    }

    public static class DescribeLogStoreKeysResponseLogStoreKeys extends TeaModel {
        @NameInMap("LogStoreKey")
        @Validation(required = true)
        public java.util.List<String> logStoreKey;

        public static DescribeLogStoreKeysResponseLogStoreKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogStoreKeysResponseLogStoreKeys self = new DescribeLogStoreKeysResponseLogStoreKeys();
            return TeaModel.build(map, self);
        }

        public DescribeLogStoreKeysResponseLogStoreKeys setLogStoreKey(java.util.List<String> logStoreKey) {
            this.logStoreKey = logStoreKey;
            return this;
        }
        public java.util.List<String> getLogStoreKey() {
            return this.logStoreKey;
        }

    }

}
