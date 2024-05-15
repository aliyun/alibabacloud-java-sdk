// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantSettingsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Cloud Assistant configurations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SettingType")
    public java.util.List<String> settingType;

    public static DescribeCloudAssistantSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantSettingsRequest self = new DescribeCloudAssistantSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantSettingsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCloudAssistantSettingsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCloudAssistantSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudAssistantSettingsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCloudAssistantSettingsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCloudAssistantSettingsRequest setSettingType(java.util.List<String> settingType) {
        this.settingType = settingType;
        return this;
    }
    public java.util.List<String> getSettingType() {
        return this.settingType;
    }

}
