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
     * <p>The auto-renewal period of the instance.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values: 1, 3, and 5.</p>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values: 1.</p>
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
     * <p>The unit of the renewal period. Valid values:</p>
     * <ul>
     * <li><p>Month: month</p>
     * </li>
     * <li><p>Year: year</p>
     * </li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the elasticity assurance service. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal status of the instance. Valid values:</p>
     * <ul>
     * <li><p>AutoRenewal: Auto-renewal is enabled.</p>
     * </li>
     * <li><p>Normal: Auto-renewal is disabled.</p>
     * </li>
     * <li><p>NotRenewal: The instance will not be renewed. After this value is specified, the system no longer sends expiration reminders and sends only a non-renewal reminder three days before the expiration date. You can change the value for an elasticity assurance service from NotRenewal to Normal and then manually renew the service or enable auto-renewal.</p>
     * </li>
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
         * <p>The list of elasticity assurance service IDs to modify.</p>
         * <blockquote>
         * <p>You can modify up to 50 elasticity assurance services at a time.</p>
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
