// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoReleaseTimeRequest extends TeaModel {
    /**
     * <p>The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <ul>
     * <li>The automatic release time must be at least 30 minutes later than the current time.</li>
     * <li>The automatic release time can be up to 3 years earlier than the current time.</li>
     * <li>If the value of the seconds (ss) is not 00, it is automatically set to 00.</li>
     * <li>If <code>AutoReleaseTime</code> is not configured, the automatic release feature is disabled, and the dedicated host will not be automatically released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2019-06-04T13:35:00Z</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>The ID of the dedicated host.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp165p6xk2tlw61e****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static ModifyDedicatedHostAutoReleaseTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoReleaseTimeRequest self = new ModifyDedicatedHostAutoReleaseTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoReleaseTimeRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public ModifyDedicatedHostAutoReleaseTimeRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyDedicatedHostAutoReleaseTimeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDedicatedHostAutoReleaseTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedHostAutoReleaseTimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostAutoReleaseTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDedicatedHostAutoReleaseTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
