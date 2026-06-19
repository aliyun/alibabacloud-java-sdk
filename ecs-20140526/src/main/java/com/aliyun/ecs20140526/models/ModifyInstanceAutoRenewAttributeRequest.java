// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically renew the instance before it expires.</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration of the instance.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>When <code>PeriodUnit</code> is set to <code>Year</code>, the valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;}</li>
     * <li>When <code>PeriodUnit</code> is set to <code>Month</code>, the valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, &quot;12&quot;, &quot;24&quot;, &quot;36&quot;, &quot;48&quot;, &quot;60&quot;}</li>
     * <li>When <code>PeriodUnit</code> is set to <code>Week</code>, the valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;}</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>When <code>PeriodUnit</code> is set to <code>Year</code>, the valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;}</li>
     * <li>When <code>PeriodUnit</code> is set to <code>Month</code>, the valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, &quot;12&quot;, &quot;24&quot;, &quot;36&quot;, &quot;48&quot;, &quot;60&quot;}</li>
     * </ul>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <ul>
     * <li>When <code>PeriodUnit</code> is set to <code>Year</code>, the valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;}</li>
     * <li>When <code>PeriodUnit</code> is set to <code>Month</code>, the valid values of <code>Duration</code> are: {&quot;1&quot;, &quot;2&quot;, &quot;3&quot;, &quot;6&quot;, &quot;12&quot;, &quot;24&quot;, &quot;36&quot;, &quot;48&quot;, &quot;60&quot;}</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Instance ID. You can specify up to 100 subscription instances at a time. Separate multiple instance IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****,i-bp67acfmxazb4pi****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the renewal duration, that is, the unit of the <code>Duration</code> parameter. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Week</li>
     * <li>Month (default)</li>
     * <li>Year</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>Month (default)</li>
     * <li>Year</li>
     * </ul>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <ul>
     * <li>Month (default)</li>
     * <li>Year</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
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
     * <li><p>AutoRenewal: enables auto-renewal.</p>
     * </li>
     * <li><p>Normal: disables auto-renewal.</p>
     * </li>
     * <li><p>NotRenewal: does not renew the instance. After this value is set, the system no longer sends expiration reminders and only sends a non-renewal reminder three days before the instance expires. ECS instances that are set to not renew can be changed to pending renewal (<code>Normal</code>), and then manually renewed or set to auto-renewal.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The <code>RenewalStatus</code> parameter takes precedence over the <code>AutoRenew</code> parameter. If the <code>RenewalStatus</code> parameter is not specified, the <code>AutoRenew</code> parameter takes effect by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
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
