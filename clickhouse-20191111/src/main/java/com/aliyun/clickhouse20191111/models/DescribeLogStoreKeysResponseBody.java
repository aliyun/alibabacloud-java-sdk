// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogStoreKeysResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LogStoreKeys")
    public DescribeLogStoreKeysResponseBodyLogStoreKeys logStoreKeys;

    public static DescribeLogStoreKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreKeysResponseBody self = new DescribeLogStoreKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogStoreKeysResponseBody setLogStoreKeys(DescribeLogStoreKeysResponseBodyLogStoreKeys logStoreKeys) {
        this.logStoreKeys = logStoreKeys;
        return this;
    }
    public DescribeLogStoreKeysResponseBodyLogStoreKeys getLogStoreKeys() {
        return this.logStoreKeys;
    }

    public static class DescribeLogStoreKeysResponseBodyLogStoreKeys extends TeaModel {
        @NameInMap("LogStoreKey")
        public java.util.List<String> logStoreKey;

        public static DescribeLogStoreKeysResponseBodyLogStoreKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogStoreKeysResponseBodyLogStoreKeys self = new DescribeLogStoreKeysResponseBodyLogStoreKeys();
            return TeaModel.build(map, self);
        }

        public DescribeLogStoreKeysResponseBodyLogStoreKeys setLogStoreKey(java.util.List<String> logStoreKey) {
            this.logStoreKey = logStoreKey;
            return this;
        }
        public java.util.List<String> getLogStoreKey() {
            return this.logStoreKey;
        }

    }

}
