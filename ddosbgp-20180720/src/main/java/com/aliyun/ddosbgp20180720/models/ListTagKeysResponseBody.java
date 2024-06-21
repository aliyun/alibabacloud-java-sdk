// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97935DF1-0289-4AA2-9DD1-72377838B16B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tags and the details of each tag.</p>
     */
    @NameInMap("TagKeys")
    public java.util.List<ListTagKeysResponseBodyTagKeys> tagKeys;

    /**
     * <p>The total number of tags.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
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
        /**
         * <p>The total number of tag values that correspond to each key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagCount")
        public Integer tagCount;

        /**
         * <p>The key of each tag.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
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
