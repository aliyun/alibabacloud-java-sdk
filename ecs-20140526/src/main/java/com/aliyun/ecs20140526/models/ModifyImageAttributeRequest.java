// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    // The new boot mode of the custom image. Valid values:
    // 
    // *   BIOS
    // *   UEFI
    // 
    // >  You must know which boot modes the specified image supports. When you use this parameter to change the boot mode of the image, specify a boot mode supported by the image to ensure that instances which use this image can start normally.
    @NameInMap("BootMode")
    public String bootMode;

    // The new description of the custom image. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
    // 
    // This parameter is empty by default, which indicates that the original description is retained.
    @NameInMap("Description")
    public String description;

    // The attributes of the custom image.
    @NameInMap("Features")
    public ModifyImageAttributeRequestFeatures features;

    // The new name of the image family. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with acs: or aliyun. It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
    // 
    // This parameter is empty by default.
    @NameInMap("ImageFamily")
    public String imageFamily;

    // The ID of the custom image.
    @NameInMap("ImageId")
    public String imageId;

    // The new name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with acs: or aliyun. It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
    // 
    // This parameter is empty by default, which indicates that the original name is retained.
    @NameInMap("ImageName")
    public String imageName;

    // The type of the license to use to activate the operating system after the source image is imported. Valid values:
    // 
    // *   Auto: ECS checks the operating system of the source image and allocates a license to the operating system. ECS first checks whether the operating system distribution specified by `Platform` has a license allocated through an official Alibaba Cloud channel. If yes, the allocated license is used. If not, the license that comes with the source operating system is used.
    // *   Aliyun: The license allocated through an official Alibaba Cloud channel is used for the operating system distribution specified by `Platform`.
    // *   BYOL: The license that comes with the source operating system is used. In this case, make sure that your license key can be used in Alibaba Cloud.
    // 
    // Default value: Auto.
    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the custom image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The new state of the custom image. Valid values:
    // 
    // *   Deprecated: puts the image into the Deprecated state. If the custom image is shared, you must unshare it before you can put it into the Deprecated state. Images in the Deprecated state cannot be shared or copied, but can be used to create instances or replace system disks.
    // *   Available: puts the image into the Available state. You can restore an image from the Deprecated state to the Available state.
    // 
    // >  If you want to roll back a custom image in the image family to a previous version, you can put the latest available custom image into the Deprecated state. An instance family cannot be used to create instances if no custom images are in the Available state within the instance family. Proceed with caution if only a single custom image is in the Available state within the image family.
    @NameInMap("Status")
    public String status;

    public static ModifyImageAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeRequest self = new ModifyImageAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public ModifyImageAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyImageAttributeRequest setFeatures(ModifyImageAttributeRequestFeatures features) {
        this.features = features;
        return this;
    }
    public ModifyImageAttributeRequestFeatures getFeatures() {
        return this.features;
    }

    public ModifyImageAttributeRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public ModifyImageAttributeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageAttributeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyImageAttributeRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public ModifyImageAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyImageAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyImageAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImageAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyImageAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyImageAttributeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ModifyImageAttributeRequestFeatures extends TeaModel {
        // Specifies whether to support the Non-Volatile Memory Express (NVMe) protocol. Valid values:
        // 
        // *   supported: The custom image supports the NVMe protocol. Instances created from this image also support the NVMe protocol.
        // *   unsupported: The custom image does not support the NVMe protocol. Instances created from this image do not support the NVMe protocol.
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static ModifyImageAttributeRequestFeatures build(java.util.Map<String, ?> map) throws Exception {
            ModifyImageAttributeRequestFeatures self = new ModifyImageAttributeRequestFeatures();
            return TeaModel.build(map, self);
        }

        public ModifyImageAttributeRequestFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

}
