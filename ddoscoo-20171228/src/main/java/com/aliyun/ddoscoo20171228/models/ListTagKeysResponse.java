// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListTagKeysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("TagKeys")
    @Validation(required = true)
    public java.util.List<ListTagKeysResponseTagKeys> tagKeys;

    public static ListTagKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponse self = new ListTagKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagKeysResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTagKeysResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagKeysResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTagKeysResponse setTagKeys(java.util.List<ListTagKeysResponseTagKeys> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<ListTagKeysResponseTagKeys> getTagKeys() {
        return this.tagKeys;
    }

    public static class ListTagKeysResponseTagKeys extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagCount")
        @Validation(required = true)
        public Integer tagCount;

        public static ListTagKeysResponseTagKeys build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseTagKeys self = new ListTagKeysResponseTagKeys();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseTagKeys setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagKeysResponseTagKeys setTagCount(Integer tagCount) {
            this.tagCount = tagCount;
            return this;
        }
        public Integer getTagCount() {
            return this.tagCount;
        }

    }

}
