// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    /**
     * <p>The boot mode of the image. Valid values:</p>
     * <ul>
     * <li>BIOS: BIOS boot mode.</li>
     * <li>UEFI: UEFI boot mode.</li>
     * <li>UEFI-Preferred: Dual boot mode.</li>
     * </ul>
     * <notice>
     * 
     * <p>   To prevent instances from failing to start due to an unsupported boot mode, make sure that you understand the boot modes supported by the target image before you modify the boot mode. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
     * </notice>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The description of the custom image. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * <p>Default value: empty. The original description is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li>true: A precheck request is sent, and the image attributes are not modified. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false: A normal request is sent, and the image attributes are modified if the request passes the check.</li>
     * </ul>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The feature-related attributes of the image.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Features")
    public ModifyImageAttributeRequestFeatures features;

    /**
     * <p>The name of the image family. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with aliyun or acs:. It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
     * <p>Default value: empty.</p>
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
     * <p>The name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with aliyun or acs:. It cannot contain http:// or https://. It can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
     * <p>Default value: empty. The original name is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The license type used to activate the operating system after the image is imported. Only BYOL is supported.</p>
     * <p>BYOL: The license provided with the source operating system. If you use BYOL, you must ensure that your license key is supported on Alibaba Cloud.</p>
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
     * <p>The region ID of the custom image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The status of the image. Valid values:</p>
     * <ul>
     * <li>Deprecated: Sets the image to the deprecated state. If the custom image is shared, you must unshare it before you can set it to the deprecated state. You cannot share or copy a deprecated image. However, you can use the image to create instances or replace system disks.</li>
     * <li>Available: Sets the image to the available state. You can restore a deprecated image to the available state.</li>
     * </ul>
     * <blockquote>
     * <p>If you want to roll back a custom image in an image family to the previous version, you can set the latest available custom image to the deprecated state. However, if the image is the only available custom image in the image family, deprecating the image leaves the image family without any available custom images for creating instances. Proceed with caution.</p>
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
         * <li>v1: When you create an ECS instance from this image, you cannot set the metadata access mode to enforced.</li>
         * <li>v2: When you create an ECS instance from this image, you can set the metadata access mode to enforced.<notice>
         * 
         * You cannot change ImdsSupport from v2 to v1. To change the value, create a new image from a snapshot associated with this image and set the value to v1.</li>
         * </ul>
         * </notice>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("ImdsSupport")
        public String imdsSupport;

        /**
         * <p>Modifies the NVMe support attribute of the image. If this parameter is not specified, the original value is retained.</p>
         * <blockquote>
         * <p>Notice: Before you enable this feature, ensure that the NVMe driver is pre-installed in the operating system. Recommended procedure: install the driver on an instance, create a custom image, and then call this operation. Forcibly enabling this feature without the driver causes the instance to fail to start.</p>
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
