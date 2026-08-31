// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID to which to share the built image through image sharing. Valid values of N: 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("AddAccount")
    public java.util.List<Long> addAccount;

    /**
     * <p>The advanced configuration.</p>
     */
    @NameInMap("AdvancedOptions")
    public CreateImagePipelineRequestAdvancedOptions advancedOptions;

    /**
     * <p>The source image.</p>
     * <ul>
     * <li>If <code>BaseImageType=IMAGE</code>, set this parameter to an image ID.</li>
     * <li>If <code>BaseImageType=IMAGE_FAMILY</code>, set this parameter to an image family name.</li>
     * <li>If <code>BaseImageType=OSS</code>, you do not need to set this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>m-bp67acfmxazb4p****</p>
     */
    @NameInMap("BaseImage")
    public String baseImage;

    /**
     * <p>The type of the source image. Valid values:</p>
     * <ul>
     * <li>IMAGE: image.</li>
     * <li>IMAGE_FAMILY: image family.</li>
     * <li>OSS: OSS object.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("BaseImageType")
    public String baseImageType;

    /**
     * <p>The content of the image build template. The content size cannot exceed 16 KB. For more information about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPONENT ic-bp12dvdzvr9k9*****
     * COMPONENT acs:ecs:cn-hangzhou:18689161186*****:imagecomponent/ComponentName/1.<em>.</em></p>
     */
    @NameInMap("BuildContent")
    public String buildContent;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to release the intermediate instance if the image fails to be built. Valid values:</p>
     * <ul>
     * <li>true: releases the intermediate instance.</li>
     * <li>false: does not release the intermediate instance.</li>
     * </ul>
     * <p>Default value: true.</p>
     * <blockquote>
     * <p>If the intermediate instance fails to start, the instance is not retained by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteInstanceOnFailure")
    public Boolean deleteInstanceOnFailure;

    /**
     * <p>The description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image family of the built image.
     * <notice>
     * This parameter is deprecated. Use ImageOptions.ImageFamily instead.
     * </notice></p>
     * 
     * <strong>example:</strong>
     * <p>family</p>
     */
    @NameInMap("ImageFamily")
    @Deprecated
    public String imageFamily;

    /**
     * <p>The prefix of the name of the built image.
     * <notice>
     * This parameter is deprecated. Use ImageOptions.ImageName instead.
     * </notice></p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    @Deprecated
    public String imageName;

    /**
     * <p>The properties of the built image.</p>
     */
    @NameInMap("ImageOptions")
    public CreateImagePipelineRequestImageOptions imageOptions;

    /**
     * <p>The properties and settings for importing an image. This parameter is required when <code>BaseImageType=OSS</code>.</p>
     */
    @NameInMap("ImportImageOptions")
    public CreateImagePipelineRequestImportImageOptions importImageOptions;

    /**
     * <p>The instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query different instance types.</p>
     * <p>If you do not specify this parameter, the instance type that has the minimum number of vCPUs and the smallest memory size is automatically selected. The selection is subject to the inventory of instance types. For example, the ecs.g6.large instance type is selected by default. If the inventory of the ecs.g6.large instance type is insufficient, the ecs.g6.xlarge instance type is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The outbound public bandwidth of the intermediate instance. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The template name. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. The name cannot start with <code>http://</code> or <code>https://</code>. The name can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <blockquote>
     * <p>If you do not specify <code>Name</code>, the <code>ImagePipelineId</code> return value is used by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testImagePipeline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether the built image supports NVMe.
     * <notice>
     * This parameter is deprecated. Use ImageOptions.ImageFeatures.NvmeSupport instead.
     * </notice></p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("NvmeSupport")
    @Deprecated
    public String nvmeSupport;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepairItem")
    public java.util.List<String> repairItem;

    /**
     * <p>The repair option in the image template.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Standard: standard mode.</p>
     * <p>Detection items for Linux include:</p>
     * <ul>
     * <li>GUESTOS.CloudInit</li>
     * <li>GUESTOS.Dhcp</li>
     * <li>GUESTOS.Virtio</li>
     * <li>GUESTOS.OnlineResizeFS</li>
     * <li>GUESTOS.Grub</li>
     * <li>GUESTOS.Fstab</li>
     * </ul>
     * <p>Detection items for Windows include:</p>
     * <ul>
     * <li>GUESTOS.Virtio</li>
     * <li>GUESTOS.Update</li>
     * <li>GUESTOS.Hotfix</li>
     * <li>GUESTOS.Server</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>As detection and repair capabilities continue to improve, the repair items may increase. For more information about the repair items, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image detection</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("RepairMode")
    public String repairMode;

    /**
     * <p>The ID of the enterprise resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The system disk size of the intermediate instance. Unit: GiB. Valid values: 20 to 500.</p>
     * <p>Default value: 40.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateImagePipelineRequestTag> tag;

    /**
     * <p>The content of the image test template. The content size cannot exceed 16 KB. For more information about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPONENT ic-bp12dvdzvr9k9*****
     * COMPONENT acs:ecs:cn-hangzhou:18689161186*****:imagecomponent/ComponentName/1.<em>.</em></p>
     */
    @NameInMap("TestContent")
    public String testContent;

    /**
     * <p>The regions to which to distribute the built image. Valid values of N: 1 to 20.</p>
     * <p>If you do not specify this parameter, the image is created only in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ToRegionId")
    public java.util.List<String> toRegionId;

    /**
     * <p>The ID of the vSwitch in the VPC.</p>
     * <p>If you do not specify this parameter, a new VPC and vSwitch are created by default. Make sure that the VPC resource quota in your account is sufficient. For more information, see <a href="https://help.aliyun.com/document_detail/27750.html">Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp67acfmxazb4p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateImagePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImagePipelineRequest self = new CreateImagePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreateImagePipelineRequest setAddAccount(java.util.List<Long> addAccount) {
        this.addAccount = addAccount;
        return this;
    }
    public java.util.List<Long> getAddAccount() {
        return this.addAccount;
    }

    public CreateImagePipelineRequest setAdvancedOptions(CreateImagePipelineRequestAdvancedOptions advancedOptions) {
        this.advancedOptions = advancedOptions;
        return this;
    }
    public CreateImagePipelineRequestAdvancedOptions getAdvancedOptions() {
        return this.advancedOptions;
    }

    public CreateImagePipelineRequest setBaseImage(String baseImage) {
        this.baseImage = baseImage;
        return this;
    }
    public String getBaseImage() {
        return this.baseImage;
    }

    public CreateImagePipelineRequest setBaseImageType(String baseImageType) {
        this.baseImageType = baseImageType;
        return this;
    }
    public String getBaseImageType() {
        return this.baseImageType;
    }

    public CreateImagePipelineRequest setBuildContent(String buildContent) {
        this.buildContent = buildContent;
        return this;
    }
    public String getBuildContent() {
        return this.buildContent;
    }

    public CreateImagePipelineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImagePipelineRequest setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
        this.deleteInstanceOnFailure = deleteInstanceOnFailure;
        return this;
    }
    public Boolean getDeleteInstanceOnFailure() {
        return this.deleteInstanceOnFailure;
    }

    public CreateImagePipelineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public CreateImagePipelineRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    @Deprecated
    public CreateImagePipelineRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateImagePipelineRequest setImageOptions(CreateImagePipelineRequestImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public CreateImagePipelineRequestImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public CreateImagePipelineRequest setImportImageOptions(CreateImagePipelineRequestImportImageOptions importImageOptions) {
        this.importImageOptions = importImageOptions;
        return this;
    }
    public CreateImagePipelineRequestImportImageOptions getImportImageOptions() {
        return this.importImageOptions;
    }

    public CreateImagePipelineRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateImagePipelineRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateImagePipelineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    @Deprecated
    public CreateImagePipelineRequest setNvmeSupport(String nvmeSupport) {
        this.nvmeSupport = nvmeSupport;
        return this;
    }
    public String getNvmeSupport() {
        return this.nvmeSupport;
    }

    public CreateImagePipelineRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateImagePipelineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateImagePipelineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImagePipelineRequest setRepairItem(java.util.List<String> repairItem) {
        this.repairItem = repairItem;
        return this;
    }
    public java.util.List<String> getRepairItem() {
        return this.repairItem;
    }

    public CreateImagePipelineRequest setRepairMode(String repairMode) {
        this.repairMode = repairMode;
        return this;
    }
    public String getRepairMode() {
        return this.repairMode;
    }

    public CreateImagePipelineRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateImagePipelineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateImagePipelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateImagePipelineRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateImagePipelineRequest setTag(java.util.List<CreateImagePipelineRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateImagePipelineRequestTag> getTag() {
        return this.tag;
    }

    public CreateImagePipelineRequest setTestContent(String testContent) {
        this.testContent = testContent;
        return this;
    }
    public String getTestContent() {
        return this.testContent;
    }

    public CreateImagePipelineRequest setToRegionId(java.util.List<String> toRegionId) {
        this.toRegionId = toRegionId;
        return this;
    }
    public java.util.List<String> getToRegionId() {
        return this.toRegionId;
    }

    public CreateImagePipelineRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateImagePipelineRequestAdvancedOptions extends TeaModel {
        /**
         * <p>Specifies whether to disable the automatic suffix for the built image name. Valid values:</p>
         * <ul>
         * <li>disable: disables the automatic suffix.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("ImageNameSuffix")
        public String imageNameSuffix;

        /**
         * <p>Specifies whether to retain Cloud Assistant. During the build process, the system automatically installs Cloud Assistant on the intermediate instance to run commands. You can choose whether to retain Cloud Assistant in the built image. Valid values:</p>
         * <ul>
         * <li>true: retains Cloud Assistant.</li>
         * <li>false: does not retain Cloud Assistant.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This setting does not affect Cloud Assistant that is already included in your image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RetainCloudAssistant")
        public Boolean retainCloudAssistant;

        public static CreateImagePipelineRequestAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestAdvancedOptions self = new CreateImagePipelineRequestAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestAdvancedOptions setImageNameSuffix(String imageNameSuffix) {
            this.imageNameSuffix = imageNameSuffix;
            return this;
        }
        public String getImageNameSuffix() {
            return this.imageNameSuffix;
        }

        public CreateImagePipelineRequestAdvancedOptions setRetainCloudAssistant(Boolean retainCloudAssistant) {
            this.retainCloudAssistant = retainCloudAssistant;
            return this;
        }
        public Boolean getRetainCloudAssistant() {
            return this.retainCloudAssistant;
        }

    }

    public static class CreateImagePipelineRequestImageOptionsImageFeatures extends TeaModel {
        /**
         * <p>Specifies whether the built image supports NVMe. Valid values:</p>
         * <ul>
         * <li>supported: The instances created from this image support the NVMe protocol.</li>
         * <li>unsupported: The instances created from this image do not support the NVMe protocol.</li>
         * <li>auto: The system automatically detects whether your image has the NVMe driver installed. This detection occurs before the build phase. If you install or uninstall the NVMe driver during the build, the result may be inaccurate. Set this parameter to supported or unsupported based on your build content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static CreateImagePipelineRequestImageOptionsImageFeatures build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestImageOptionsImageFeatures self = new CreateImagePipelineRequestImageOptionsImageFeatures();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestImageOptionsImageFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class CreateImagePipelineRequestImageOptionsImageTags extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateImagePipelineRequestImageOptionsImageTags build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestImageOptionsImageTags self = new CreateImagePipelineRequestImageOptionsImageTags();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestImageOptionsImageTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImagePipelineRequestImageOptionsImageTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateImagePipelineRequestImageOptions extends TeaModel {
        /**
         * <p>The description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image family of the built image. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. The name cannot start with aliyun or acs:. The name cannot contain http:// or https://. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>family</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The image feature properties of the built image.</p>
         */
        @NameInMap("ImageFeatures")
        public CreateImagePipelineRequestImageOptionsImageFeatures imageFeatures;

        /**
         * <p>The prefix of the name of the built image. The name must be 2 to 64 characters in length and must start with a letter or a Chinese character. The name cannot start with <code>http://</code> or <code>https://</code>. The name can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>The final complete image name is automatically generated by the system by concatenating the name prefix and the build task ID (<code>ExecutionId</code>) in the format of <code>{ImageName}_{ExecutionId}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The tags of the built image.</p>
         */
        @NameInMap("ImageTags")
        public java.util.List<CreateImagePipelineRequestImageOptionsImageTags> imageTags;

        public static CreateImagePipelineRequestImageOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestImageOptions self = new CreateImagePipelineRequestImageOptions();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestImageOptions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateImagePipelineRequestImageOptions setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public CreateImagePipelineRequestImageOptions setImageFeatures(CreateImagePipelineRequestImageOptionsImageFeatures imageFeatures) {
            this.imageFeatures = imageFeatures;
            return this;
        }
        public CreateImagePipelineRequestImageOptionsImageFeatures getImageFeatures() {
            return this.imageFeatures;
        }

        public CreateImagePipelineRequestImageOptions setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public CreateImagePipelineRequestImageOptions setImageTags(java.util.List<CreateImagePipelineRequestImageOptionsImageTags> imageTags) {
            this.imageTags = imageTags;
            return this;
        }
        public java.util.List<CreateImagePipelineRequestImageOptionsImageTags> getImageTags() {
            return this.imageTags;
        }

    }

    public static class CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings extends TeaModel {
        /**
         * <p>The size of the custom image after the image is imported.</p>
         * <p>The size consists of the system disk and data disks. Make sure that the system disk size is greater than or equal to the size of the imported image file. Valid values:</p>
         * <ul>
         * <li>When N=1, the entry represents the system disk. Valid values: 1 GiB to 2048 GiB.</li>
         * <li>When N=2 to 17, the entry represents a data disk. Valid values: 1 GiB to 2048 GiB.</li>
         * </ul>
         * <p>After you upload the source image file to OSS, you can view the size of the image file in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        /**
         * <p>The image format. Valid values:</p>
         * <ul>
         * <li>RAW.</li>
         * <li>VHD.</li>
         * <li>QCOW2.</li>
         * </ul>
         * <p>Default value: none. Alibaba Cloud automatically detects the image format, and the detected format prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>RAW</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The OSS bucket in which the image file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsimageos</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The file name (key) of the image file stored in the OSS bucket after the image is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_5.4_32.raw</p>
         */
        @NameInMap("OSSObject")
        public String OSSObject;

        public static CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings self = new CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings setDiskImageSize(Integer diskImageSize) {
            this.diskImageSize = diskImageSize;
            return this;
        }
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        public CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings setOSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        public CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings setOSSObject(String OSSObject) {
            this.OSSObject = OSSObject;
            return this;
        }
        public String getOSSObject() {
            return this.OSSObject;
        }

    }

    public static class CreateImagePipelineRequestImportImageOptionsFeatures extends TeaModel {
        @NameInMap("ImdsSupport")
        public String imdsSupport;

        /**
         * <p>Specifies whether the imported original image supports NVMe. Valid values:</p>
         * <ul>
         * <li>supported: The instances created from this image support the NVMe protocol.</li>
         * <li>unsupported: The instances created from this image do not support the NVMe protocol.</li>
         * </ul>
         * <p>Default value: unsupported.</p>
         * 
         * <strong>example:</strong>
         * <p>supported</p>
         */
        @NameInMap("NvmeSupport")
        public String nvmeSupport;

        public static CreateImagePipelineRequestImportImageOptionsFeatures build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestImportImageOptionsFeatures self = new CreateImagePipelineRequestImportImageOptionsFeatures();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestImportImageOptionsFeatures setImdsSupport(String imdsSupport) {
            this.imdsSupport = imdsSupport;
            return this;
        }
        public String getImdsSupport() {
            return this.imdsSupport;
        }

        public CreateImagePipelineRequestImportImageOptionsFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class CreateImagePipelineRequestImportImageOptionsImportImageTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateImagePipelineRequestImportImageOptionsImportImageTags build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestImportImageOptionsImportImageTags self = new CreateImagePipelineRequestImportImageOptionsImportImageTags();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestImportImageOptionsImportImageTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImagePipelineRequestImportImageOptionsImportImageTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateImagePipelineRequestImportImageOptions extends TeaModel {
        /**
         * <p>The system architecture of the system disk when a data disk snapshot is used as the system disk. Valid values:</p>
         * <ul>
         * <li>x86_64.</li>
         * <li>arm64.</li>
         * </ul>
         * <p>Default value: x86_64.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The boot mode of the image. Valid values:</p>
         * <ul>
         * <li>BIOS: BIOS boot mode.</li>
         * <li>UEFI: UEFI boot mode.</li>
         * </ul>
         * <p>Default value: BIOS. If <code>Architecture=arm64</code>, the default value is UEFI, and only UEFI is supported.</p>
         * <notice>
         * 
         * <p>To prevent instances from failing to start due to an unsupported boot mode, make sure that you understand the boot modes supported by the image before you set this parameter. For more information about image boot modes, see <a href="~~2244655#b9caa9b8bb1wf~~">Image boot modes</a>.</p>
         * </notice>
         * 
         * <strong>example:</strong>
         * <p>BIOS</p>
         */
        @NameInMap("BootMode")
        public String bootMode;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of custom image information.</p>
         * <ul>
         * <li>When N=1, the entry represents the system disk.</li>
         * <li>When N=2 to 17, the entry represents a data disk.</li>
         * </ul>
         */
        @NameInMap("DiskDeviceMappings")
        public java.util.List<CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings> diskDeviceMappings;

        /**
         * <p>The image feature properties.</p>
         */
        @NameInMap("Features")
        public CreateImagePipelineRequestImportImageOptionsFeatures features;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImportImageTags")
        public java.util.List<CreateImagePipelineRequestImportImageOptionsImportImageTags> importImageTags;

        /**
         * <p>The license type used to activate the operating system after the image is imported. Valid values:</p>
         * <ul>
         * <li>Auto: Alibaba Cloud detects the source operating system and assigns a license. In automatic mode, the system first checks whether a license distributed through official Alibaba Cloud channels exists for the <code>Platform</code> you specified and assigns the license to the imported image. If no such license exists, the system switches to BYOL (Bring Your Own License) mode.</li>
         * <li>Aliyun: uses a license distributed through official Alibaba Cloud channels based on the <code>Platform</code> you specified.</li>
         * <li>BYOL: uses the license that comes with the source operating system. When you use BYOL, make sure that your license key supports use on Alibaba Cloud.</li>
         * </ul>
         * <p>Default value: Auto.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("LicenseType")
        public String licenseType;

        /**
         * <p>The operating system type. Valid values:</p>
         * <ul>
         * <li>windows.</li>
         * <li>linux.</li>
         * </ul>
         * <p>Default value: linux.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The operating system version. Valid values:</p>
         * <ul>
         * <li>Aliyun</li>
         * <li>Anolis</li>
         * <li>CentOS</li>
         * <li>Ubuntu</li>
         * <li>CoreOS</li>
         * <li>SUSE</li>
         * <li>Debian</li>
         * <li>OpenSUSE</li>
         * <li>FreeBSD</li>
         * <li>RedHat</li>
         * <li>Kylin</li>
         * <li>UOS</li>
         * <li>Fedora</li>
         * <li>Fedora CoreOS</li>
         * <li>CentOS Stream</li>
         * <li>AlmaLinux</li>
         * <li>Rocky Linux</li>
         * <li>Gentoo</li>
         * <li>Customized Linux</li>
         * <li>Others Linux</li>
         * <li>Windows Server 2022</li>
         * <li>Windows Server 2019</li>
         * <li>Windows Server 2016</li>
         * <li>Windows Server 2012</li>
         * <li>Windows Server 2008</li>
         * <li>Windows Server 2003</li>
         * <li>Other Windows</li>
         * </ul>
         * <p>Default value: Others Linux if the operating system type is Linux. Otherwise, the default value is Other Windows.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RetainImportedImage")
        public Boolean retainImportedImage;

        @NameInMap("RetentionStrategy")
        public String retentionStrategy;

        @NameInMap("RoleName")
        public String roleName;

        public static CreateImagePipelineRequestImportImageOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestImportImageOptions self = new CreateImagePipelineRequestImportImageOptions();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestImportImageOptions setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public CreateImagePipelineRequestImportImageOptions setBootMode(String bootMode) {
            this.bootMode = bootMode;
            return this;
        }
        public String getBootMode() {
            return this.bootMode;
        }

        public CreateImagePipelineRequestImportImageOptions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateImagePipelineRequestImportImageOptions setDiskDeviceMappings(java.util.List<CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings> diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public java.util.List<CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings> getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public CreateImagePipelineRequestImportImageOptions setFeatures(CreateImagePipelineRequestImportImageOptionsFeatures features) {
            this.features = features;
            return this;
        }
        public CreateImagePipelineRequestImportImageOptionsFeatures getFeatures() {
            return this.features;
        }

        public CreateImagePipelineRequestImportImageOptions setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public CreateImagePipelineRequestImportImageOptions setImportImageTags(java.util.List<CreateImagePipelineRequestImportImageOptionsImportImageTags> importImageTags) {
            this.importImageTags = importImageTags;
            return this;
        }
        public java.util.List<CreateImagePipelineRequestImportImageOptionsImportImageTags> getImportImageTags() {
            return this.importImageTags;
        }

        public CreateImagePipelineRequestImportImageOptions setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public CreateImagePipelineRequestImportImageOptions setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public CreateImagePipelineRequestImportImageOptions setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateImagePipelineRequestImportImageOptions setRetainImportedImage(Boolean retainImportedImage) {
            this.retainImportedImage = retainImportedImage;
            return this;
        }
        public Boolean getRetainImportedImage() {
            return this.retainImportedImage;
        }

        public CreateImagePipelineRequestImportImageOptions setRetentionStrategy(String retentionStrategy) {
            this.retentionStrategy = retentionStrategy;
            return this;
        }
        public String getRetentionStrategy() {
            return this.retentionStrategy;
        }

        public CreateImagePipelineRequestImportImageOptions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class CreateImagePipelineRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateImagePipelineRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateImagePipelineRequestTag self = new CreateImagePipelineRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateImagePipelineRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImagePipelineRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
