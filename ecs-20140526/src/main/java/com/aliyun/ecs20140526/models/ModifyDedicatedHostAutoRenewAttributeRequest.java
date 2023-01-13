// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically renew the subscription dedicated host. Valid values:</p>
     * <br>
     * <p>*   true: automatically renews the subscription dedicated host.</p>
     * <p>*   false: does not automatically renew the subscription dedicated host.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to automatically renew the subscription dedicated host along with the subscription ECS instances hosted on it.</p>
     * <br>
     * <p>If auto-renewal is enabled for the subscription ECS instances hosted on your subscription dedicated host, you can specify this parameter to automatically renew the dedicated host along with the subscription ECS instances. When the subscription ECS instances hosted on your dedicated host are automatically renewed, the dedicated host is also automatically renewed if the expiration time of the dedicated host is earlier than the expiration time of the renewed instances.</p>
     * <br>
     * <p>When the dedicated host is configured to be automatically renewed along with the subscription ECS instances hosted on it, the dedicated host determines the expiration time of the renewed instances, and selects a minimum value from the valid values of the Duration parameter so that the dedicated host is renewed by a duration that expires later than the expiration time of the renewed instances. For more information about supported renewal durations, see the descriptions of the `PeriodUnit` and `Duration` parameters.</p>
     * <br>
     * <p>For example, assume that you have a subscription dedicated host that expires on January 15 of the current year. Subscription ECS instances hosted on the dedicated host have the auto-renewal feature enabled, and are automatically renewed to November 15 of the same year. The expiration time of the dedicated host is earlier than the expiration time of the ECS instances by 10 months. In this case, the dedicated host selects a renewal duration of 12 months, which is the minimum value of the `Duration` parameter (`PeriodUnit=Month`) that allows the dedicated host to expire later than the ECS instances.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   AutoRenewWithEcs: automatically renews the subscription dedicated host along with the subscription ECS instances hosted on it.</p>
     * <p>*   StopRenewWithEcs: does not automatically renew the subscription dedicated host along with the subscription ECS instances hosted on it.</p>
     * <p>*   NoOperation: does not change the current settings for the dedicated host.</p>
     * <br>
     * <p>>  If you set this parameter to AutoRenewWithEcs, make sure that `AutoRenew` is set to true to enable auto-renewal for the dedicated host. Otherwise, only the parameter value is changed. The dedicated host is not automatically renewed along with the subscription ECS instances hosted on it.</p>
     * <br>
     * <p>Default value: NoOperation.</p>
     */
    @NameInMap("AutoRenewWithEcs")
    public String autoRenewWithEcs;

    /**
     * <p>The IDs of the dedicated hosts. You can specify up to 100 subscription dedicated host IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    /**
     * <p>The renewal duration of the dedicated host. Valid values:</p>
     * <br>
     * <p>*   When the PeriodUnit parameter is set to Week, the valid values of the Duration parameter are 1, 2, and 3.</p>
     * <p>*   When the PeriodUnit parameter is set to Month, the valid values of the Duration parameter are 1, 2, 3, 6, and 12.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the renewal duration. Valid values:</p>
     * <br>
     * <p>*   Week</p>
     * <p>*   Month</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the dedicated host.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to automatically renew the subscription dedicated host. The `RenewalStatus` parameter takes precedence over the `AutoRenew` parameter. Valid values:</p>
     * <br>
     * <p>*   AutoRenewal: automatically renews the subscription dedicated host.</p>
     * <p>*   Normal: does not automatically renew the subscription dedicated host, but notifications for renewal are sent.</p>
     * <p>*   NotRenewal: does not automatically renew the subscription dedicated host, and no expiration notification is sent. Notifications for renewal are automatically sent three days before the expiration time of the subscription dedicated host. You can change the value of this parameter from NotRenewal to Normal for the dedicated host and manually renew it by calling the [RenewDedicatedHosts](~~134250~~) operation. Alternatively, you can renew it by setting this parameter to AutoRenewal.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDedicatedHostAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoRenewAttributeRequest self = new ModifyDedicatedHostAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setAutoRenewWithEcs(String autoRenewWithEcs) {
        this.autoRenewWithEcs = autoRenewWithEcs;
        return this;
    }
    public String getAutoRenewWithEcs() {
        return this.autoRenewWithEcs;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setDedicatedHostIds(String dedicatedHostIds) {
        this.dedicatedHostIds = dedicatedHostIds;
        return this;
    }
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDedicatedHostAutoRenewAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
