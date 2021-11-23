// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageDetailRequest extends TeaModel {
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    @NameInMap("EndPeriod")
    public String endPeriod;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PeriodType")
    public String periodType;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeResourceUsageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageDetailRequest self = new DescribeResourceUsageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageDetailRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeResourceUsageDetailRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeResourceUsageDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeResourceUsageDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeResourceUsageDetailRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeResourceUsageDetailRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceUsageDetailRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

}
