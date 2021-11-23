// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageDetailRequest extends TeaModel {
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

    public static DescribeResourceCoverageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceCoverageDetailRequest self = new DescribeResourceCoverageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceCoverageDetailRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeResourceCoverageDetailRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeResourceCoverageDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeResourceCoverageDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeResourceCoverageDetailRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeResourceCoverageDetailRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceCoverageDetailRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

}
