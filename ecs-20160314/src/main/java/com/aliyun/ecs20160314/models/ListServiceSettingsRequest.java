// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ListServiceSettingsRequest extends TeaModel {
    @NameInMap("CloudAssistantDeliverySettings")
    public Boolean cloudAssistantDeliverySettings;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListServiceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSettingsRequest self = new ListServiceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceSettingsRequest setCloudAssistantDeliverySettings(Boolean cloudAssistantDeliverySettings) {
        this.cloudAssistantDeliverySettings = cloudAssistantDeliverySettings;
        return this;
    }
    public Boolean getCloudAssistantDeliverySettings() {
        return this.cloudAssistantDeliverySettings;
    }

    public ListServiceSettingsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListServiceSettingsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListServiceSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceSettingsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListServiceSettingsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
