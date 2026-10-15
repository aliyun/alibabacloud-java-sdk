// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageTotalRequest extends TeaModel {
    /**
     * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end of the query time range. Format: yyyy-MM-dd HH:mm:ss. The query excludes this time. If this parameter is left empty, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-02 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The time granularity. Valid values:</p>
     * <ul>
     * <li>MONTH: month</li>
     * <li>DAY: day</li>
     * <li>HOUR: hour</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>RI: reserved instance</li>
     * <li>SCU: storage capacity unit</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RI</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start of the query time range. Format: yyyy-MM-dd HH:mm:ss. The query includes this time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
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
