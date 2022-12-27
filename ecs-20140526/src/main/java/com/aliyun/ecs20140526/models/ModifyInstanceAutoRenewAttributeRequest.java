// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewAttributeRequest extends TeaModel {
    // Specifies whether to enable auto-renewal.
    // 
    // Default value: false.
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // The auto-renewal period.
    // 
    // *   When `PeriodUnit` is set to `Year`, valid values of `Duration` are 1, 2, and 3.
    // *   When `PeriodUnit` is set to `Month`, valid values of `Duration` are 1, 2, 3, 6, and 12.
    @NameInMap("Duration")
    public Integer duration;

    // The ID of the instance. A maximum of 100 instance IDs can be specified at a time. Separate multiple instance IDs with commas (,).
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The unit of the renewal duration (`Period`). Default value: month. Default value: Month. Valid values:
    // 
    // *   Month
    // *   Year
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The auto-renewal status of the instance. Valid values:
    // 
    // *   AutoRenewal: Auto-renewal is enabled for the instance.
    // *   Normal: Auto-renewal is disabled for the instance.
    // *   NotRenewal: The instance will not be renewed upon expiration. The system no longer sends an expiration reminder, but sends only a non-renewal reminder three days before the expiration date. You can change the value of this parameter from NotRenewal to `Normal` for an instance, and then manually renew the instance. Alternatively, you can set the RenewalStatus parameter to AutoRenewal.
    // 
    // >  `RenewalStatus` takes precedence over `AutoRenew`. If you do not specify `RenewalStatus`, the `AutoRenew` parameter is used by default.
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewAttributeRequest self = new ModifyInstanceAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewAttributeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyInstanceAutoRenewAttributeRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyInstanceAutoRenewAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAutoRenewAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceAutoRenewAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAutoRenewAttributeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyInstanceAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public ModifyInstanceAutoRenewAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceAutoRenewAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
