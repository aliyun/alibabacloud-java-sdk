// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagKeys")
    public java.util.List<ListTagKeysResponseBodyTagKeys> tagKeys;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTagKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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
        @NameInMap("TagCount")
        public Integer tagCount;

        @NameInMap("TagKey")
        public String tagKey;

        public static ListTagKeysResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyTagKeys self = new ListTagKeysResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyTagKeys setTagCount(Integer tagCount) {
            this.tagCount = tagCount;
            return this;
        }
        public Integer getTagCount() {
            return this.tagCount;
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
