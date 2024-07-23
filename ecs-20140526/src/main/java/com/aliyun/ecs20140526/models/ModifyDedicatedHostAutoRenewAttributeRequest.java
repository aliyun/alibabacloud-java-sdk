// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically renew the subscription. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to automatically renew the subscription dedicated hosts along with the subscription ECS instances hosted on the dedicated hosts.</p>
     * <p>If auto-renewal is enabled for the subscription ECS instances hosted on the subscription dedicated hosts, you can specify this parameter to automatically renew the dedicated hosts along with the subscription ECS instances. When the subscription ECS instances hosted on your dedicated hosts are automatically renewed, the subscription dedicated hosts are also automatically renewed if the expiration time of the dedicated hosts is earlier than the expiration time of the renewed instances. Take note of the following items:</p>
     * <p>When the subscription dedicated hosts are configured to be automatically renewed along with the subscription ECS instances hosted on the dedicated hosts, the system checks the expiration time of the renewed instances and selects a minimum renewal duration for the dedicated hosts so that the dedicated hosts are renewed by a duration that ends later than the expiration time of the renewed instances. For more information about supported renewal durations, see the descriptions of the <code>PeriodUnit</code> and <code>Duration</code> parameters.</p>
     * <p>For example, assume that a dedicated host expires on January 15 of the current year. Subscription ECS instances hosted on the dedicated host are configured to be automatically renewed to November 15 of the same year. The expiration time of the dedicated host is earlier than the expiration time of the ECS instances by 10 months. In this case, the system selects a renewal duration of 12 months (a minimum duration calculated based on a <code>Duration</code> value of 12 and a <code>PeriodUnit</code> value of Month) for the dedicated host. This ensures that the dedicated host expires later than the ECS instances.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AutoRenewWithEcs: automatically renews the subscription dedicated hosts along with the subscription ECS instances hosted on the dedicated hosts.</li>
     * <li>StopRenewWithEcs: does not automatically renew the subscription dedicated hosts along with the subscription ECS instances hosted on the dedicated hosts.</li>
     * <li>NoOperation: does not change the current settings for the dedicated hosts.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to AutoRenewWithEcs, make sure that <code>AutoRenew</code> is set to true to enable auto-renewal for the dedicated hosts. Otherwise, the subscription dedicated hosts are not automatically renewed along with the subscription ECS instances hosted on the dedicated hosts.</p>
     * </blockquote>
     * <p>Default value: NoOperation.</p>
     * 
     * <strong>example:</strong>
     * <p>StopRenewWithEcs</p>
     */
    @NameInMap("AutoRenewWithEcs")
    public String autoRenewWithEcs;

    /**
     * <p>The IDs of dedicated hosts. You can specify up to 100 subscription dedicated host IDs. Separate the IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp165p6xk2tlw61e****</p>
     */
    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    /**
     * <p>The renewal duration.</p>
     * <ul>
     * <li>Valid values when PeriodUnit is set to Month: 1 and 12</li>
     * <li>Valid values when PeriodUnit is set to Year: 1 and 12</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the renewal period. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>Default value: Month</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the dedicated host.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to automatically renew the subscription dedicated host. The <code>RenewalStatus</code> parameter takes precedence over the <code>AutoRenew</code> parameter. Valid values:</p>
     * <ul>
     * <li>AutoRenewal: The dedicated hosts are automatically renewed.</li>
     * <li>Normal: The dedicated hosts are not automatically renewed, and renewal notifications are sent.</li>
     * <li>NotRenewal: The dedicated hosts are not automatically renewed, and no expiration notification is sent. A notification of no renewal is automatically sent three days before the end of the current subscription cycle. You can change the value of this parameter from NotRenewal to Normal and manually renew the dedicated hosts by calling the <a href="https://help.aliyun.com/document_detail/134250.html">RenewDedicatedHosts</a> operation. Alternatively, you can renew the dedicated hosts by setting this parameter to AutoRenewal.</li>
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
