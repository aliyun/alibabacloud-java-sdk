// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanSpecificationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Specifications")
    public java.util.List<String> specifications;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeElasticPlanSpecificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanSpecificationsResponseBody self = new DescribeElasticPlanSpecificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanSpecificationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeElasticPlanSpecificationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeElasticPlanSpecificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticPlanSpecificationsResponseBody setSpecifications(java.util.List<String> specifications) {
        this.specifications = specifications;
        return this;
    }
    public java.util.List<String> getSpecifications() {
        return this.specifications;
    }

    public DescribeElasticPlanSpecificationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
