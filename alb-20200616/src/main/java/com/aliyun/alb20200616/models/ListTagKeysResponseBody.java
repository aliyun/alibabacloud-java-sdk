// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    // 本次查询返回记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 标签Key列表
    @NameInMap("TagKeys")
    public java.util.List<ListTagKeysResponseBodyTagKeys> tagKeys;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
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

    public ListTagKeysResponseBody setTagKeys(java.util.List<ListTagKeysResponseBodyTagKeys> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<ListTagKeysResponseBodyTagKeys> getTagKeys() {
        return this.tagKeys;
    }

    public ListTagKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagKeysResponseBodyTagKeys extends TeaModel {
        // 标签类型
        @NameInMap("Category")
        public String category;

        // 标签Key
        @NameInMap("TagKey")
        public String tagKey;

        public static ListTagKeysResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyTagKeys self = new ListTagKeysResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyTagKeys setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTagKeysResponseBodyTagKeys setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

}
