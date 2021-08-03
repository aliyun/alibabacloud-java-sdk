// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePostPaidDesktopBillsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("BillStartTime")
    public String billStartTime;

    @NameInMap("BillEndTime")
    public String billEndTime;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static DescribePostPaidDesktopBillsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePostPaidDesktopBillsRequest self = new DescribePostPaidDesktopBillsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePostPaidDesktopBillsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePostPaidDesktopBillsRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribePostPaidDesktopBillsRequest setBillStartTime(String billStartTime) {
        this.billStartTime = billStartTime;
        return this;
    }
    public String getBillStartTime() {
        return this.billStartTime;
    }

    public DescribePostPaidDesktopBillsRequest setBillEndTime(String billEndTime) {
        this.billEndTime = billEndTime;
        return this;
    }
    public String getBillEndTime() {
        return this.billEndTime;
    }

    public DescribePostPaidDesktopBillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePostPaidDesktopBillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
