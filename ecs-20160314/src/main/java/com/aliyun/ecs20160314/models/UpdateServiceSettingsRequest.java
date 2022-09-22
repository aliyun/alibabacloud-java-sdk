// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class UpdateServiceSettingsRequest extends TeaModel {
    @NameInMap("CloudAssistantDeliverySettings")
    public CloudAssistantDeliverySettings cloudAssistantDeliverySettings;

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

    public static UpdateServiceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSettingsRequest self = new UpdateServiceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSettingsRequest setCloudAssistantDeliverySettings(CloudAssistantDeliverySettings cloudAssistantDeliverySettings) {
        this.cloudAssistantDeliverySettings = cloudAssistantDeliverySettings;
        return this;
    }
    public CloudAssistantDeliverySettings getCloudAssistantDeliverySettings() {
        return this.cloudAssistantDeliverySettings;
    }

    public UpdateServiceSettingsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateServiceSettingsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateServiceSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceSettingsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateServiceSettingsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class CloudAssistantDeliverySettings extends TeaModel {
        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssEnabled")
        public Boolean ossEnabled;

        @NameInMap("OssKeyPrefix")
        public String ossKeyPrefix;

        @NameInMap("SlsEnabled")
        public Boolean slsEnabled;

        @NameInMap("SlsLogstoreName")
        public String slsLogstoreName;

        @NameInMap("SlsProjectName")
        public String slsProjectName;

        public static CloudAssistantDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            CloudAssistantDeliverySettings self = new CloudAssistantDeliverySettings();
            return TeaModel.build(map, self);
        }

        public CloudAssistantDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public CloudAssistantDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public CloudAssistantDeliverySettings setOssKeyPrefix(String ossKeyPrefix) {
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }
        public String getOssKeyPrefix() {
            return this.ossKeyPrefix;
        }

        public CloudAssistantDeliverySettings setSlsEnabled(Boolean slsEnabled) {
            this.slsEnabled = slsEnabled;
            return this;
        }
        public Boolean getSlsEnabled() {
            return this.slsEnabled;
        }

        public CloudAssistantDeliverySettings setSlsLogstoreName(String slsLogstoreName) {
            this.slsLogstoreName = slsLogstoreName;
            return this;
        }
        public String getSlsLogstoreName() {
            return this.slsLogstoreName;
        }

        public CloudAssistantDeliverySettings setSlsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }
        public String getSlsProjectName() {
            return this.slsProjectName;
        }

    }

}
