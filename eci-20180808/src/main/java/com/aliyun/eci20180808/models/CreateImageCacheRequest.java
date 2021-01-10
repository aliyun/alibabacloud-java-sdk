// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateImageCacheRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ImageCacheName")
    public String imageCacheName;

    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ImageCacheSize")
    public Integer imageCacheSize;

    @NameInMap("VkClientVersion")
    public String vkClientVersion;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    @NameInMap("ImageRegistryCredential")
    public java.util.List<CreateImageCacheRequestImageRegistryCredential> imageRegistryCredential;

    @NameInMap("Image")
    public java.util.List<String> image;

    @NameInMap("Tag")
    public java.util.List<CreateImageCacheRequestTag> tag;

    public static CreateImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheRequest self = new CreateImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateImageCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateImageCacheRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateImageCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateImageCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageCacheRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateImageCacheRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateImageCacheRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateImageCacheRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public CreateImageCacheRequest setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        return this;
    }
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    public CreateImageCacheRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateImageCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageCacheRequest setImageCacheSize(Integer imageCacheSize) {
        this.imageCacheSize = imageCacheSize;
        return this;
    }
    public Integer getImageCacheSize() {
        return this.imageCacheSize;
    }

    public CreateImageCacheRequest setVkClientVersion(String vkClientVersion) {
        this.vkClientVersion = vkClientVersion;
        return this;
    }
    public String getVkClientVersion() {
        return this.vkClientVersion;
    }

    public CreateImageCacheRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateImageCacheRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public CreateImageCacheRequest setImageRegistryCredential(java.util.List<CreateImageCacheRequestImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<CreateImageCacheRequestImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public CreateImageCacheRequest setImage(java.util.List<String> image) {
        this.image = image;
        return this;
    }
    public java.util.List<String> getImage() {
        return this.image;
    }

    public CreateImageCacheRequest setTag(java.util.List<CreateImageCacheRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateImageCacheRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateImageCacheRequestImageRegistryCredential extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Server")
        public String server;

        @NameInMap("UserName")
        public String userName;

        public static CreateImageCacheRequestImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestImageRegistryCredential self = new CreateImageCacheRequestImageRegistryCredential();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestImageRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateImageCacheRequestImageRegistryCredential setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public CreateImageCacheRequestImageRegistryCredential setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateImageCacheRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateImageCacheRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestTag self = new CreateImageCacheRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImageCacheRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
