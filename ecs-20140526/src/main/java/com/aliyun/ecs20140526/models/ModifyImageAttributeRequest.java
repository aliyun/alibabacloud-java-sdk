// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    /**
     * <p>The boot mode of the image. Valid values:</p>
     * <ul>
     * <li>BIOS: Basic Input/Output System (BIOS) boot mode.</li>
     * <li>UEFI: Unified Extensible Firmware Interface (UEFI) boot mode.</li>
     * <li>UEFI-Preferred: dual boot mode.</li>
     * </ul>
     * <notice>
     * 
     * <p>   To prevent instances from failing to start due to an unsupported boot mode, make sure that you understand the boot modes supported by the image before you modify this parameter. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
     * </notice>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The description of the custom image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: null, which indicates that the original description is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The image feature attributes.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Features")
    public ModifyImageAttributeRequestFeatures features;

    /**
     * <p>The name of the image family. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), or hyphens (-).</p>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp18ygjuqnwhechc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), or hyphens (-).</p>
     * <p>Default value: null, which indicates that the original name is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The license type used to activate the operating system after the image is imported. Currently, only BYOL is supported.</p>
     * <p>BYOL: The license that comes with the source operating system. When you use BYOL, make sure that your license key supports use on Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>BYOL</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the custom image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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

    /**
     * <p>The image status. Valid values:</p>
     * <ul>
     * <li>Deprecated: Sets the image to the deprecated state. If you have shared the custom image, you must unshare it before you can set it to the deprecated state. A deprecated image cannot be shared or copied. However, you can use the image to create instances or replace system disks.</li>
     * <li>Available: Sets the image to the available state. You can restore a deprecated image to the available state.</li>
     * </ul>
     * <blockquote>
     * <p>To roll back a custom image in an image family to the previous version, you can set the latest available custom image to the deprecated state. However, if the image is the only available custom image in the image family, the image family will have no available custom image for creating instances after the image is deprecated. Proceed with caution.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Deprecated</p>
     */
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

    public ModifyImageAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
        /**
         * <p>The metadata access mode of the image. Valid values:</p>
         * <ul>
         * <li>v1: When you create an ECS instance from this image, you cannot set the metadata access mode to IMDSv2 only (hardened mode).</li>
         * <li>v2: When you create an ECS instance from this image, you can set the metadata access mode to IMDSv2 only (hardened mode).<notice>
         * 
         * ImdsSupport cannot be changed from v2 to v1. If you need to change it, create a new image from the snapshot associated with this image and set the value to v1.</li>
         * </ul>
         * </notice>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("ImdsSupport")
        public String imdsSupport;

        /**
         * <p>Modifies the NVMe support attribute of the image. If this parameter is not specified, the current value is retained.</p>
         * <blockquote>
         * <p>Notice: Before enabling this feature, make sure that the NVMe driver is pre-installed in the operating system. Recommended procedure: install the driver on an instance, create a custom image, and then call this operation. Forcibly enabling this feature without the driver will cause instance startup failures.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>supported</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static ModifyImageAttributeRequestFeatures build(java.util.Map<String, ?> map) throws Exception {
            ModifyImageAttributeRequestFeatures self = new ModifyImageAttributeRequestFeatures();
            return TeaModel.build(map, self);
        }

        public ModifyImageAttributeRequestFeatures setImdsSupport(String imdsSupport) {
            this.imdsSupport = imdsSupport;
            return this;
        }
        public String getImdsSupport() {
            return this.imdsSupport;
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
