// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageDetailRequest extends TeaModel {
    /**
     * <p>The ID of the account for which you want to query coverage details. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. You do not need to set this parameter if you query coverage details within a specific time range for the first time. The response returns a token that you can use to query coverage details that are displayed on the next page. If a null value is returned for the NextToken parameter, no more coverage details can be queried.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The time granularity at which coverage details are queried. Valid values: MONTH, DAY, and HOUR.</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The type of deduction plans whose coverage details are queried. Valid values: RI and SCU.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
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
