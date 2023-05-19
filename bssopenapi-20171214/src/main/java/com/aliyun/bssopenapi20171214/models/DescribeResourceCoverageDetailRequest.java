// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageDetailRequest extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The name and billing method of the service.</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The zone.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token of the next page.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The total amount of resources consumed.</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The operation that you want to perform. Set the value to DescribeResourceCoverageDetail.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the account.</p>
     */
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
