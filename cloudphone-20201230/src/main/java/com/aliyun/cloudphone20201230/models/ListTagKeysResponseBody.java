// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    // 资源列表
    @NameInMap("Keys")
    public ListTagKeysResponseBodyKeys keys;

    @NameInMap("MaxResults")
    public Integer maxResults;

    // 下一个查询开始Token，NextToken为空说明没有下一个
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponseBody setKeys(ListTagKeysResponseBodyKeys keys) {
        this.keys = keys;
        return this;
    }
    public ListTagKeysResponseBodyKeys getKeys() {
        return this.keys;
    }

    public ListTagKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTagKeysResponseBodyKeys extends TeaModel {
        @NameInMap("Key")
        public java.util.List<String> key;

        public static ListTagKeysResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyKeys self = new ListTagKeysResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyKeys setKey(java.util.List<String> key) {
            this.key = key;
            return this;
        }
        public java.util.List<String> getKey() {
            return this.key;
        }

    }

}
