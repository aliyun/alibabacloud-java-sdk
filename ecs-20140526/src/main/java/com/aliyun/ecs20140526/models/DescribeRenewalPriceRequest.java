// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceRequest extends TeaModel {
    /**
     * <p>The unified expiration day. If you specify this parameter, the system queries the price for renewing the instance until the unified expiration day. Valid values: 1 to 28.</p>
     * <p>For more information about the unified expiration day feature, see <a href="https://help.aliyun.com/document_detail/108486.html">Unify Instance Expiration Dates</a>.</p>
     * <blockquote>
     * <p>You cannot specify both the renewal duration parameters (<code>Period</code> and <code>PeriodUnit</code>) and the unified expiration day parameter (<code>ExpectedRenewDay</code>) at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExpectedRenewDay")
    public Integer expectedRenewDay;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies the renewal duration. Valid values:</p>
     * <ul>
     * <li><p>When the <code>PriceUnit</code> parameter is set to <code>Month</code>: 1 to 9.</p>
     * </li>
     * <li><p>When the <code>PriceUnit</code> parameter is set to <code>Year</code>: 1 to 3.</p>
     * </li>
     * </ul>
     * <p>Default Value: 1.</p>
     * <blockquote>
     * <p>You cannot specify both the renewal duration parameters (<code>Period</code> and <code>PeriodUnit</code>) and the unified expiration day parameter (<code>ExpectedRenewDay</code>) at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>Specifies the renewal period. Valid values:</p>
     * <ul>
     * <li><p>Month: The renewal period is one month.</p>
     * </li>
     * <li><p>Year: The renewal period is one year.</p>
     * </li>
     * </ul>
     * <p>Default Value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    /**
     * <p>The Region ID of the instance. You can invoke <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud Regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID for which to query the renewal price. When the parameter <code>ResourceType</code> is set to <code>instance</code>, <code>ResourceId</code> can be interpreted as <code>InstanceId</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1f2o4ldh8l29zv****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type for which to query the renewal price. Valid value: instance.</p>
     * <p>Default Value: instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeRenewalPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceRequest self = new DescribeRenewalPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceRequest setExpectedRenewDay(Integer expectedRenewDay) {
        this.expectedRenewDay = expectedRenewDay;
        return this;
    }
    public Integer getExpectedRenewDay() {
        return this.expectedRenewDay;
    }

    public DescribeRenewalPriceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRenewalPriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRenewalPriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeRenewalPriceRequest setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public DescribeRenewalPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRenewalPriceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeRenewalPriceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRenewalPriceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRenewalPriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
