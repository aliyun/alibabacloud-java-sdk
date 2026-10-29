// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodeRenewPriceRequest extends TeaModel {
    /**
     * <p>The list of cloud phone matrix IDs.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The subscription period. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: Month.</li>
     * <li><strong>Year</strong>: Year.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the promotion.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static DescribeCloudPhoneNodeRenewPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodeRenewPriceRequest self = new DescribeCloudPhoneNodeRenewPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodeRenewPriceRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public DescribeCloudPhoneNodeRenewPriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeCloudPhoneNodeRenewPriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeCloudPhoneNodeRenewPriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
