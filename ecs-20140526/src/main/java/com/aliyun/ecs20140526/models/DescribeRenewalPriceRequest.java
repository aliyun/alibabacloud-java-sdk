// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceRequest extends TeaModel {
    /**
     * <p>The synchronized expiration date. If you specify this parameter, the price for renewing a specified instance to the specified synchronized expiration date is queried. Valid values: 1 to 28.</p>
     * <p>For information about how to synchronize the expiration dates of instances, see <a href="https://help.aliyun.com/document_detail/108486.html">Synchronize the expiration dates of instances</a>.</p>
     * <blockquote>
     * <p>The renewal period-related parameter pair (<code>Period</code> and <code>PeriodUnit</code>) and the <code>ExpectedRenewDay</code> parameter are mutually exclusive.</p>
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
     * <p>The renewal period. Valid values:</p>
     * <ul>
     * <li>Valid values when the <code>PriceUnit</code> parameter is set to <code>Month</code>: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>Valid values when the <code>PriceUnit</code> parameter is set to <code>Year</code>: 1, 2, 3.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * <blockquote>
     * <p>The renewal period-related parameter pair (<code>Period</code> and <code>PeriodUnit</code>) and the <code>ExpectedRenewDay</code> parameter are mutually exclusive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal period. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource. If the <code>ResourceType</code> parameter is set to<code> instance</code>, the value of the <code>ResourceId</code> parameter is the ID of the specified instance.``</p>
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
     * <p>The type of the resource. Set the value to instance.</p>
     * <p>Default value: instance.</p>
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
