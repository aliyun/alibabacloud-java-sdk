// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageTotalRequest extends TeaModel {
    /**
     * <p>The time granularity at which total coverage data is queried. Valid values: MONTH, DAY, and HOUR.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The information about the coverage rate of deduction plans within a period.</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The status code.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The total amount of the resources deducted from deduction plans.</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeResourceCoverageTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceCoverageTotalRequest self = new DescribeResourceCoverageTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceCoverageTotalRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeResourceCoverageTotalRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeResourceCoverageTotalRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeResourceCoverageTotalRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceCoverageTotalRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

}
