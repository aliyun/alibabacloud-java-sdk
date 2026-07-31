// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal for the subscription dedicated host. Valid values:</p>
     * <ul>
     * <li><p>true: Enables auto-renewal for the subscription dedicated host.</p>
     * </li>
     * <li><p>false: Disables auto-renewal for the subscription dedicated host.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to enable auto-renewal for the dedicated host to follow the subscription ECS instances on the host.</p>
     * <p>If your dedicated host (DDH) uses the subscription billing method and the subscription ECS instances on the DDH have auto-renewal enabled, you can use this parameter to configure the DDH to automatically renew along with the ECS instances. When an ECS instance on the DDH is automatically renewed, if the DDH expires earlier than the new expiration time of the ECS instance, the DDH is also automatically renewed. The principle of DDH auto-renewal following ECS instances is as follows:</p>
     * <p>The DDH automatically determines the new expiration time of the corresponding ECS instance, and then selects the minimum renewal period that is greater than the ECS instance expiration time and meets the DDH renewal cycle. For details about the supported renewal cycles of DDHs, see the metric descriptions of the PeriodUnit and Duration parameters.</p>
     * <p>Example: A subscription DDH expires on January 15 of the current year. After a subscription ECS instance on the DDH is automatically renewed, the ECS instance expiration is extended to November 15 of the current year. The DDH lifecycle is 10 months shorter than the ECS instance lifecycle. In this case, the DDH selects the minimum renewal period that is greater than 10 months and meets the DDH renewal cycle, which is 12 months (PeriodUnit=Month and Duration=12).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AutoRenewWithEcs: Enables auto-renewal following the subscription ECS instances on the dedicated host.</li>
     * <li>StopRenewWithEcs: Disables auto-renewal following the subscription ECS instances on the dedicated host.</li>
     * <li>NoOperation: Does not change the current settings of the dedicated host.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to AutoRenewWithEcs, make sure that auto-renewal is enabled for the dedicated host (AutoRenew=true). Otherwise, this parameter only changes the parameter value, and the actual auto-renewal feature following ECS instances does not take effect.</p>
     * </blockquote>
     * <p>Default value: NoOperation.</p>
     * 
     * <strong>example:</strong>
     * <p>StopRenewWithEcs</p>
     */
    @NameInMap("AutoRenewWithEcs")
    public String autoRenewWithEcs;

    /**
     * <p>The IDs of dedicated hosts. You can specify up to 100 subscription dedicated host IDs. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp165p6xk2tlw61e****</p>
     */
    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    /**
     * <p>The renewal period. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If PeriodUnit is set to Week: 1, 2, 3, and 4.</li>
     * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
     * <li>If PeriodUnit is set to Year: 1, 2, 3, 4, and 5.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If PeriodUnit is set to Month: 1 and 12.</li>
     * <li>If PeriodUnit is set to Year: 1 and 12.</li>
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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Week</li>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
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
     * <p>The region ID of the dedicated host.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable auto-renewal for the subscription dedicated host. The RenewalStatus parameter takes precedence over the AutoRenew parameter. Valid values:</p>
     * <ul>
     * <li><p>AutoRenewal: Enables auto-renewal.</p>
     * </li>
     * <li><p>Normal: Disables auto-renewal but the system still sends expiration notifications.</p>
     * </li>
     * <li><p>NotRenewal: Disables auto-renewal and the system does not send expiration notifications. Three days before expiration, the system automatically sends a non-renewal notification. You can change the value of this parameter to Normal for a dedicated host, and then manually renew the host by calling <a href="https://help.aliyun.com/document_detail/134250.html">RenewDedicatedHosts</a> or set the value to AutoRenewal to enable auto-renewal.</p>
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
