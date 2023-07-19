// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeTagKeysResponseBody extends TeaModel {
    /**
     * <p>The type of the tag.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The start page of the returned pages.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tags returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The key of the tag.</p>
     */
    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

    /**
     * <p>The total number of returned tag keys.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysResponseBody self = new DescribeTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeTagKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagKeysResponseBody setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    public DescribeTagKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
