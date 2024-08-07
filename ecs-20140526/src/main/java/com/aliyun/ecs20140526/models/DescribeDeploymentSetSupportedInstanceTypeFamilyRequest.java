// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetSupportedInstanceTypeFamilyRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The deployment strategy. Valid values:</p>
     * <ul>
     * <li>Availability: high availability strategy</li>
     * <li>AvailabilityGroup: high availability group strategy</li>
     * <li>LowLatency: low latency strategy</li>
     * </ul>
     * <p>Default value: Availability.</p>
     * 
     * <strong>example:</strong>
     * <p>Availability</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static DescribeDeploymentSetSupportedInstanceTypeFamilyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetSupportedInstanceTypeFamilyRequest self = new DescribeDeploymentSetSupportedInstanceTypeFamilyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
