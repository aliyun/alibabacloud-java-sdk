// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeTagValuesResponseBody extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTagValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValuesResponseBody self = new DescribeTagValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagValuesResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeTagValuesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagValuesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagValuesResponseBody setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

    public DescribeTagValuesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
