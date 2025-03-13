// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The auto-renewal period for the elasticity assurance.</p>
     * <ul>
     * <li>Valid values when <code>PeriodUnit</code> is set to <code>Year</code>: 1, 3, and 5.</li>
     * <li>Valid values when <code>PeriodUnit</code> is set to <code>Month</code>: 1.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the region to which the elasticity assurance belongs. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal status of the elasticity assurance. Valid values:</p>
     * <ul>
     * <li>AutoRenewal: Auto-renewal is enabled for the elasticity assurance.</li>
     * <li>Normal: Auto-renewal is disabled for the elasticity assurance.</li>
     * <li>NotRenewal: The elasticity assurance is not renewed. The system no longer sends an expiration notification but sends only a renewal notification three days before the elasticity assurance expires. You can change the value of this parameter from NotRenewal to <code>Normal</code> for an elasticity assurance, and then manually renew the elasticity assurance. Alternatively, you can set the RenewalStatus parameter to AutoRenewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyElasticityAssuranceAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticityAssuranceAutoRenewAttributeRequest self = new ModifyElasticityAssuranceAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setPrivatePoolOptions(ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The IDs of elasticity assurances.</p>
         * <blockquote>
         * <p> You can renew up to 50 elasticity assurances at a time.</p>
         * </blockquote>
         */
        @NameInMap("Id")
        public java.util.List<String> id;

        public static ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions self = new ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyElasticityAssuranceAutoRenewAttributeRequestPrivatePoolOptions setId(java.util.List<String> id) {
            this.id = id;
            return this;
        }
        public java.util.List<String> getId() {
            return this.id;
        }

    }

}
