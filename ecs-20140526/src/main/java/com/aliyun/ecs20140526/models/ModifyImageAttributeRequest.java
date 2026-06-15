// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeRequest extends TeaModel {
    /**
     * <p>The boot mode of the image. Valid values:</p>
     * <ul>
     * <li><p><code>BIOS</code>: BIOS boot mode.</p>
     * </li>
     * <li><p><code>UEFI</code>: UEFI boot mode.</p>
     * </li>
     * <li><p><code>UEFI-Preferred</code>: UEFI-preferred boot mode.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>To prevent startup failures, verify the boot modes that the image supports before you change its boot mode. For more information, see <a href="~~2244655#b9caa9b8bb1wf~~">Boot modes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>BIOS</p>
     */
    @NameInMap("BootMode")
    public String bootMode;

    /**
     * <p>The new description of the custom image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>If you do not specify this parameter, the original description is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run to check whether the request is valid. Valid values:</p>
     * <ul>
     * <li><code>true</code>: performs a dry run to check the request for validity, syntax, and required permissions. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><code>false</code> (default): sends the request. If the request passes the validation checks, the operation is performed.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The features of the image.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Features")
    public ModifyImageAttributeRequestFeatures features;

    /**
     * <p>The name of the image family. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character. The name cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
     * <p>By default, this parameter is empty.</p>
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
     * <p>The name of the custom image. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character. The name cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
     * <p>If you do not specify this parameter, the original name is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The license type for activating the operating system after you import the image. The only valid value is <code>BYOL</code>.</p>
     * <p><code>BYOL</code>: Bring Your Own License. If you use the BYOL license type, you must ensure that your license key is supported for use on Alibaba Cloud.</p>
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
     * <p>The ID of the region where the custom image is located. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to view the latest list of Alibaba Cloud regions.</p>
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
     * <li><p><code>Deprecated</code>: Deprecates the image. If a custom image that you want to deprecate is shared, you must unshare it first. You cannot share or copy a deprecated image. However, you can use the image to create an instance or replace a system disk.</p>
     * </li>
     * <li><p><code>Available</code>: Makes the image available. You can change the status of a deprecated image to <code>Available</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>However, if this is the only available custom image in the image family, deprecating it prevents the creation of instances from any image in that family. Use this option with caution.</p>
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
         * <li><p><code>v1</code>: When you create an ECS instance from this image, you cannot set the metadata access mode to <code>enforced mode</code>.</p>
         * </li>
         * <li><p><code>v2</code>: When you create an ECS instance from this image, you can set the metadata access mode to <code>enforced mode</code>.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>You cannot change the value of <code>ImdsSupport</code> from <code>v2</code> to <code>v1</code>. To use the <code>v1</code> mode, create a new image from a snapshot that is associated with the image and set <code>ImdsSupport</code> to <code>v1</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("ImdsSupport")
        public String imdsSupport;

        /**
         * <p>Specifies whether the image supports NVMe. Valid values:</p>
         * <ul>
         * <li><p><code>supported</code>: The image supports NVMe. Instances that you create from this image support the NVMe protocol.</p>
         * </li>
         * <li><p><code>unsupported</code>: The image does not support NVMe. Instances that you create from this image do not support the NVMe protocol.</p>
         * </li>
         * </ul>
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
