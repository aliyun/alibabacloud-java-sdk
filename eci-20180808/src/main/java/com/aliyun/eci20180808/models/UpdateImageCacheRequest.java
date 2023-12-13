// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateImageCacheRequest extends TeaModel {
    /**
     * <p>The information about the Container Registry Enterprise Edition instance.</p>
     */
    @NameInMap("AcrRegistryInfo")
    public java.util.List<UpdateImageCacheRequestAcrRegistryInfo> acrRegistryInfo;

    /**
     * <p>Specifies whether to enable reuse of image cache layers. If you enable this feature and the image cache that you want to create and an existing image cache contain duplicate image layers, the system reuses the duplicate image layers to create the new image cache. This accelerates the creation of the image cache. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request?](~~25693~~)</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the elastic IP address (EIP). If you want to pull public images, you must make sure that the elastic container instance can access the Internet. To enable Internet access, you can configure an EIP or a NAT gateway for the instance.</p>
     */
    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    /**
     * <p>The elimination policy for the image cache. This parameter is empty by default, which indicates that the image cache is always retained.</p>
     * <br>
     * <p>You can set this parameter to LRU, which indicates that the image cache can be automatically deleted. When the number of image caches reaches the quota, the system automatically deletes the image caches whose EliminationStrategy parameter is set to LRU and that are least recently used.</p>
     */
    @NameInMap("EliminationStrategy")
    public String eliminationStrategy;

    /**
     * <p>Specifies whether to enable the instant image cache feature. The feature can accelerate the creation of image caches. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Flash")
    public Boolean flash;

    /**
     * <p>The number of duplicates of temporary local snapshots. By default, the system creates one snapshot for each image cache. If you use the image cache to create multiple elastic container instances at a time, we recommend that you configure this parameter to create multiple snapshot duplicates for the image cache. We recommend that you create one snapshot duplicate for creation of every 1,000 elastic container instances.</p>
     * <br>
     * <p>> If you enable the instant image cache feature by setting Flash to true, a local snapshot is first created during the creation of the image cache. After the local snapshot is created, regular snapshots start to be created. After the regular snapshots are created, the local snapshot is automatically deleted.</p>
     */
    @NameInMap("FlashCopyCount")
    public Integer flashCopyCount;

    /**
     * <p>Container images that are used to create the image cache.</p>
     */
    @NameInMap("Image")
    public java.util.List<String> image;

    /**
     * <p>The ID of the image cache.</p>
     */
    @NameInMap("ImageCacheId")
    public String imageCacheId;

    /**
     * <p>The name of the image cache.</p>
     */
    @NameInMap("ImageCacheName")
    public String imageCacheName;

    /**
     * <p>The size of the image cache. Unit: GiB. Default value: 20.</p>
     */
    @NameInMap("ImageCacheSize")
    public Integer imageCacheSize;

    /**
     * <p>The information about the image repository.</p>
     */
    @NameInMap("ImageRegistryCredential")
    public java.util.List<UpdateImageCacheRequestImageRegistryCredential> imageRegistryCredential;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image cache.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the image cache belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The retention period of the image cache. Unit: days. When the retention period elapses, the image cache expires and is deleted. By default, image caches never expire.</p>
     * <br>
     * <p>> The image caches that fail to be created are retained for only 1 day.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the security group to which the image cache belongs.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The number of duplicates of regular snapshots. By default, the system creates one snapshot for each image cache. If you use the image cache to create multiple elastic container instances at a time, we recommend that you configure this parameter to create multiple snapshot duplicates for the image cache. We recommend that you create one snapshot duplicate for creation of every 1,000 elastic container instances.</p>
     * <br>
     * <p>> If you disable the instant image cache feature by setting Flash to false, only regular snapshots are generated when you create an image cache.</p>
     */
    @NameInMap("StandardCopyCount")
    public Integer standardCopyCount;

    /**
     * <p>The tags to add to the image cache. A maximum of 20 tags can be added to the image cache.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateImageCacheRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the image cache is connected.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static UpdateImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageCacheRequest self = new UpdateImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageCacheRequest setAcrRegistryInfo(java.util.List<UpdateImageCacheRequestAcrRegistryInfo> acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public java.util.List<UpdateImageCacheRequestAcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public UpdateImageCacheRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public UpdateImageCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateImageCacheRequest setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        return this;
    }
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    public UpdateImageCacheRequest setEliminationStrategy(String eliminationStrategy) {
        this.eliminationStrategy = eliminationStrategy;
        return this;
    }
    public String getEliminationStrategy() {
        return this.eliminationStrategy;
    }

    public UpdateImageCacheRequest setFlash(Boolean flash) {
        this.flash = flash;
        return this;
    }
    public Boolean getFlash() {
        return this.flash;
    }

    public UpdateImageCacheRequest setFlashCopyCount(Integer flashCopyCount) {
        this.flashCopyCount = flashCopyCount;
        return this;
    }
    public Integer getFlashCopyCount() {
        return this.flashCopyCount;
    }

    public UpdateImageCacheRequest setImage(java.util.List<String> image) {
        this.image = image;
        return this;
    }
    public java.util.List<String> getImage() {
        return this.image;
    }

    public UpdateImageCacheRequest setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    public UpdateImageCacheRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public UpdateImageCacheRequest setImageCacheSize(Integer imageCacheSize) {
        this.imageCacheSize = imageCacheSize;
        return this;
    }
    public Integer getImageCacheSize() {
        return this.imageCacheSize;
    }

    public UpdateImageCacheRequest setImageRegistryCredential(java.util.List<UpdateImageCacheRequestImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<UpdateImageCacheRequestImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public UpdateImageCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateImageCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateImageCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateImageCacheRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateImageCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateImageCacheRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateImageCacheRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public UpdateImageCacheRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UpdateImageCacheRequest setStandardCopyCount(Integer standardCopyCount) {
        this.standardCopyCount = standardCopyCount;
        return this;
    }
    public Integer getStandardCopyCount() {
        return this.standardCopyCount;
    }

    public UpdateImageCacheRequest setTag(java.util.List<UpdateImageCacheRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateImageCacheRequestTag> getTag() {
        return this.tag;
    }

    public UpdateImageCacheRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class UpdateImageCacheRequestAcrRegistryInfo extends TeaModel {
        /**
         * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).</p>
         */
        @NameInMap("Domain")
        public java.util.List<String> domain;

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static UpdateImageCacheRequestAcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageCacheRequestAcrRegistryInfo self = new UpdateImageCacheRequestAcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public UpdateImageCacheRequestAcrRegistryInfo setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

        public UpdateImageCacheRequestAcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateImageCacheRequestAcrRegistryInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public UpdateImageCacheRequestAcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateImageCacheRequestImageRegistryCredential extends TeaModel {
        /**
         * <p>The password that is used to access the image repository.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The image repository address without `http://` or `https://` as a prefix.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username that is used to access the image repository.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static UpdateImageCacheRequestImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageCacheRequestImageRegistryCredential self = new UpdateImageCacheRequestImageRegistryCredential();
            return TeaModel.build(map, self);
        }

        public UpdateImageCacheRequestImageRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateImageCacheRequestImageRegistryCredential setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public UpdateImageCacheRequestImageRegistryCredential setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class UpdateImageCacheRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the image cache.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the image cache.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateImageCacheRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageCacheRequestTag self = new UpdateImageCacheRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateImageCacheRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateImageCacheRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
