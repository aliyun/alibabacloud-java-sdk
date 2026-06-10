// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceRequest extends TeaModel {
    /**
     * <p>The instance ID. The value for this parameter depends on the resource type:</p>
     * <ul>
     * <li><p>If <code>ResourceType</code> is set to <code>Desktop</code>, set <code>InstanceId</code> to the cloud desktop ID.</p>
     * </li>
     * <li><p>If <code>ResourceType</code> is set to <code>DesktopGroup</code>, set <code>InstanceId</code> to the desktop pool ID.</p>
     * </li>
     * <li><p>If <code>ResourceType</code> is set to <code>Bandwidth</code>, set <code>InstanceId</code> to the premium bandwidth ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecd-6ldllk9zxcpfhs****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance IDs. The values to provide depend on the resource type (<code>ResourceType</code>).</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The renewal duration. The valid values depend on the <code>PeriodUnit</code> parameter.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, the valid values are 1, 2, 3, and 6.</p>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, the valid values are 1, 2, and 3.</p>
     * </li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit for the <code>Period</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to get a list of regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>Desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeRenewalPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceRequest self = new DescribeRenewalPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRenewalPriceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeRenewalPriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeRenewalPriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeRenewalPriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public DescribeRenewalPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRenewalPriceRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public DescribeRenewalPriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
