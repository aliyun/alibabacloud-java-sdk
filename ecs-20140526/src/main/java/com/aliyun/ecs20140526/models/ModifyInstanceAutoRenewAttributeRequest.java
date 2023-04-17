// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal for the instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period for the instance.</p>
     * <br>
     * <p>*   Valid values of `Duration` when `PeriodUnit` is set to `Year`: 1, 2, 3, 4, and 5.</p>
     * <p>*   Valid values of `Duration` when `PeriodUnit` is set to `Month` : 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the instance You can specify IDs of up to 100 subscription instances. Separate the instance IDs with commas (,).</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the renewal period (`Duration`). Default value: Month. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal state of the instance. Valid values:</p>
     * <br>
     * <p>*   AutoRenewal: Auto-renewal is enabled for the instance.</p>
     * <p>*   Normal: Auto-renewal is disabled for the instance.</p>
     * <p>*   NotRenewal: The instance is not renewed. The system no longer sends an expiration notification. Notifications for renewal are sent three days before the expiration time of the instance. You can change the value of this parameter from NotRenewal to `Normal` for an instance, and then manually renew the instance. Alternatively, you can set the RenewalStatus parameter to AutoRenewal.</p>
     * <br>
     * <p>> `RenewalStatus` takes precedence over `AutoRenew`. If you do not specify `RenewalStatus`, the `AutoRenew` parameter is used by default.</p>
     */
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
