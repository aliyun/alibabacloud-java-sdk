// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateImageCacheRequest extends TeaModel {
    /**
     * <p>Information about the Container Registry Enterprise Edition instance. For more information, see [Pull images from a Container Registry Enterprise Edition instance without using secrets](~~194250~~).</p>
     */
    @NameInMap("AcrRegistryInfo")
    public java.util.List<CreateImageCacheRequestAcrRegistryInfo> acrRegistryInfo;

    /**
     * <p>Comments.</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>Specifies whether to enable reuse of image cache layers. If you enable this feature, and the image cache that you want to create and an existing image cache contain duplicate image layers, the system reuses the duplicate image layers to create the new image cache. This accelerates the creation of the image cache. Valid values:</p>
     * <br>
     * <p>*   true: enables reuse of image cache layers.</p>
     * <p>*   false: disables reuse of image cache layers.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the elastic IP address (EIP). If you want to pull images over the Internet, make sure that the elastic container instance can access the Internet. You can configure an EIP or a NAT gateway for the elastic container instance to access the Internet.</p>
     */
    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    /**
     * <p>The elimination policy of the image cache. This parameter is empty by default, which indicates that the image cache is always retained.</p>
     * <br>
     * <p>You can set this parameter to LRU, which indicates that the image cache can be automatically deleted. When the number of image caches reaches the quota, the system automatically deletes the image caches whose EliminationStrategy parameter is set to LRU and that are least commonly used.</p>
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
     * <p>The number of temporary local snapshots. By default, the system creates one snapshot for each image cache. If an image cache is used to create multiple elastic container instances at a time, we recommend that you set this parameter to create multiple snapshots for the image cache. We recommend that you create one snapshot for creation of every 1,000 elastic container instances.</p>
     * <br>
     * <p>>  If you set the Flash parameter to true, instant image cache is enabled. During the creation of the image cache, the system first creates a temporary local snapshot for you to instantly use the snapshot. After the temporary local snapshot is created, the system begins to create a regular snapshot. After the regular snapshot is created, the temporary local snapshot is automatically deleted.</p>
     */
    @NameInMap("FlashCopyCount")
    public Integer flashCopyCount;

    /**
     * <p>Container image N that is used to create the image cache.</p>
     */
    @NameInMap("Image")
    public java.util.List<String> image;

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
     * <p>The image repository.</p>
     */
    @NameInMap("ImageRegistryCredential")
    public java.util.List<CreateImageCacheRequestImageRegistryCredential> imageRegistryCredential;

    /**
     * <p>The address of the self-managed image repository.</p>
     * <br>
     * <p>When you create an image cache by using an image in a self-managed image repository that uses a self-signed certificate, you must specify this parameter to skip the certificate authentication. This can prevent the image from failing to pull due to certificate authentication failures.</p>
     */
    @NameInMap("InsecureRegistry")
    public String insecureRegistry;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The address of the self-managed image repository. When you create an image cache by using an image in a self-managed image repository that uses the HTTP protocol, you must specify this parameter. This way, Elastic Container Instance uses the HTTP protocol instead of the default HTTPS protocol to pull the image. This can prevent the image from failing to pull due to different protocols.</p>
     */
    @NameInMap("PlainHttpRegistry")
    public String plainHttpRegistry;

    /**
     * <p>The region ID of the image cache.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The retention period of the image cache. Unit: days. When the retention period ends, the image cache expires and is deleted. By default, image caches never expire.</p>
     * <br>
     * <p>>  The image caches that fail to be created are only retained for one day.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The number of regular snapshots. By default, the system creates one snapshot for each image cache. If an image cache is used to create multiple elastic container instances at a time, we recommend that you set this parameter to create multiple snapshots for the image cache. We recommend that you create one snapshot for creation of every 1,000 elastic container instances.</p>
     * <br>
     * <p>>  If you set the Flash parameter to false, instant image cache is disabled. In this case, only regular snapshots are generated during the creation of the image cache.</p>
     */
    @NameInMap("StandardCopyCount")
    public Integer standardCopyCount;

    /**
     * <p>The tag of the image cache.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateImageCacheRequestTag> tag;

    /**
     * <p>The ID of the vSwitch. You can specify up to 10 vSwitch IDs. Separate multiple vSwitch IDs with commas (,). Example: `vsw-***,vsw-***`.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the image cache.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheRequest self = new CreateImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheRequest setAcrRegistryInfo(java.util.List<CreateImageCacheRequestAcrRegistryInfo> acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public java.util.List<CreateImageCacheRequestAcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public CreateImageCacheRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateImageCacheRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public CreateImageCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageCacheRequest setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        return this;
    }
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    public CreateImageCacheRequest setEliminationStrategy(String eliminationStrategy) {
        this.eliminationStrategy = eliminationStrategy;
        return this;
    }
    public String getEliminationStrategy() {
        return this.eliminationStrategy;
    }

    public CreateImageCacheRequest setFlash(Boolean flash) {
        this.flash = flash;
        return this;
    }
    public Boolean getFlash() {
        return this.flash;
    }

    public CreateImageCacheRequest setFlashCopyCount(Integer flashCopyCount) {
        this.flashCopyCount = flashCopyCount;
        return this;
    }
    public Integer getFlashCopyCount() {
        return this.flashCopyCount;
    }

    public CreateImageCacheRequest setImage(java.util.List<String> image) {
        this.image = image;
        return this;
    }
    public java.util.List<String> getImage() {
        return this.image;
    }

    public CreateImageCacheRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public CreateImageCacheRequest setImageCacheSize(Integer imageCacheSize) {
        this.imageCacheSize = imageCacheSize;
        return this;
    }
    public Integer getImageCacheSize() {
        return this.imageCacheSize;
    }

    public CreateImageCacheRequest setImageRegistryCredential(java.util.List<CreateImageCacheRequestImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<CreateImageCacheRequestImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public CreateImageCacheRequest setInsecureRegistry(String insecureRegistry) {
        this.insecureRegistry = insecureRegistry;
        return this;
    }
    public String getInsecureRegistry() {
        return this.insecureRegistry;
    }

    public CreateImageCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateImageCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateImageCacheRequest setPlainHttpRegistry(String plainHttpRegistry) {
        this.plainHttpRegistry = plainHttpRegistry;
        return this;
    }
    public String getPlainHttpRegistry() {
        return this.plainHttpRegistry;
    }

    public CreateImageCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageCacheRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public CreateImageCacheRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateImageCacheRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateImageCacheRequest setStandardCopyCount(Integer standardCopyCount) {
        this.standardCopyCount = standardCopyCount;
        return this;
    }
    public Integer getStandardCopyCount() {
        return this.standardCopyCount;
    }

    public CreateImageCacheRequest setTag(java.util.List<CreateImageCacheRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateImageCacheRequestTag> getTag() {
        return this.tag;
    }

    public CreateImageCacheRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateImageCacheRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateImageCacheRequestAcrRegistryInfo extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM roles in the Alibaba Cloud account to which the elastic container instance belongs.</p>
         */
        @NameInMap("ArnService")
        public String arnService;

        /**
         * <p>The ARN of the RAM roles in the Alibaba Cloud account to which the Container Registry Enterprise Edition instance belongs.</p>
         */
        @NameInMap("ArnUser")
        public String arnUser;

        /**
         * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).</p>
         */
        @NameInMap("Domain")
        public java.util.List<String> domain;

        /**
         * <p>The ID of Container Registry Enterprise Edition instance N.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of Container Registry Enterprise Edition instance N.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of Container Registry Enterprise Edition instance N.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateImageCacheRequestAcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestAcrRegistryInfo self = new CreateImageCacheRequestAcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheRequestAcrRegistryInfo setArnService(String arnService) {
            this.arnService = arnService;
            return this;
        }
        public String getArnService() {
            return this.arnService;
        }

        public CreateImageCacheRequestAcrRegistryInfo setArnUser(String arnUser) {
            this.arnUser = arnUser;
            return this;
        }
        public String getArnUser() {
            return this.arnUser;
        }

        public CreateImageCacheRequestAcrRegistryInfo setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

        public CreateImageCacheRequestAcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateImageCacheRequestAcrRegistryInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateImageCacheRequestAcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateImageCacheRequestImageRegistryCredential extends TeaModel {
        /**
         * <p>The password that is used to log on to image repository N.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The address of the image repository without the `http://` or `https://` prefix.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username that is used to log on to image repository N.</p>
         */
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
        /**
         * <p>The key of tag N of the image cache. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the image cache. Valid values of N: 1 to 20.</p>
         */
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
