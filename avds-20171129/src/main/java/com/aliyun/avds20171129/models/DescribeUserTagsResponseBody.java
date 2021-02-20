// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeUserTagsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("List")
    public java.util.List<DescribeUserTagsResponseBodyList> list;

    @NameInMap("Count")
    public Integer count;

    public static DescribeUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagsResponseBody self = new DescribeUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUserTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserTagsResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeUserTagsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUserTagsResponseBody setList(java.util.List<DescribeUserTagsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeUserTagsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeUserTagsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public static class DescribeUserTagsResponseBodyList extends TeaModel {
        @NameInMap("AssetCount")
        public Integer assetCount;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeUserTagsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserTagsResponseBodyList self = new DescribeUserTagsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeUserTagsResponseBodyList setAssetCount(Integer assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Integer getAssetCount() {
            return this.assetCount;
        }

        public DescribeUserTagsResponseBodyList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

}
