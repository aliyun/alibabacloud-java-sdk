// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineRequest extends TeaModel {
    /**
     * <p>The IDs of the Alibaba Cloud accounts to share the destination images with. You can specify up to 20 account IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("AddAccount")
    public java.util.List<Long> addAccount;

    /**
     * <p>The advanced settings.</p>
     */
    @NameInMap("AdvancedOptions")
    public CreateImagePipelineRequestAdvancedOptions advancedOptions;

    /**
     * <p>The base image. The value of this parameter varies based on the value of <code>BaseImageType</code>:</p>
     * <ul>
     * <li><p>If <code>BaseImageType</code> is <code>IMAGE</code>, specify the ID of the base image.</p>
     * </li>
     * <li><p>If <code>BaseImageType</code> is <code>IMAGE_FAMILY</code>, specify the name of the base image family.</p>
     * </li>
     * <li><p>If <code>BaseImageType</code> is <code>OSS</code>, this parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>m-bp67acfmxazb4p****</p>
     */
    @NameInMap("BaseImage")
    public String baseImage;

    /**
     * <p>The type of the base image. Valid values:</p>
     * <ul>
     * <li><p>IMAGE: An ECS image.</p>
     * </li>
     * <li><p>IMAGE_FAMILY: An image family.</p>
     * </li>
     * <li><p>OSS: An OSS object.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("BaseImageType")
    public String baseImageType;

    /**
     * <p>The content of the image build template. The content can be up to 16 KB in size. For more information about the supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Command reference for Image Builder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPONENT ic-bp12dvdzvr9k9*****
     * COMPONENT acs:ecs:cn-hangzhou:18689161186*****:imagecomponent/ComponentName/1.<em>.</em></p>
     */
    @NameInMap("BuildContent")
    public String buildContent;

    /**
     * <p>A client-generated, globally unique token to ensure the idempotence of the request. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Determines whether to release the intermediate instance when the image build fails. Valid values:</p>
     * <ul>
     * <li><p>true: The instance is released.</p>
     * </li>
     * <li><p>false: The instance is not released.</p>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * <blockquote>
     * <p>If an intermediate instance cannot be started, it is not retained by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteInstanceOnFailure")
    public Boolean deleteInstanceOnFailure;

    /**
     * <p>The description of the image pipeline template. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the destination image family.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated. Use <code>ImageOptions.ImageFamily</code> instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>family</p>
     */
    @NameInMap("ImageFamily")
    @Deprecated
    public String imageFamily;

    /**
     * <p>The prefix of the destination image name.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated. Use <code>ImageOptions.ImageName</code> instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    @Deprecated
    public String imageName;

    /**
     * <p>The properties of the destination image.</p>
     */
    @NameInMap("ImageOptions")
    public CreateImagePipelineRequestImageOptions imageOptions;

    /**
     * <p>The settings for importing an image. This parameter is required when <code>BaseImageType</code> is set to <code>OSS</code>.</p>
     */
    @NameInMap("ImportImageOptions")
    public CreateImagePipelineRequestImportImageOptions importImageOptions;

    /**
     * <p>The instance type of the intermediate instance. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query instance types.</p>
     * <p>If you do not specify this parameter, the system automatically selects an instance type with the minimum vCPUs and memory, subject to inventory. For example, <code>ecs.g6.large</code> is selected by default. If <code>ecs.g6.large</code> is out of stock, <code>ecs.g6.xlarge</code> is selected.</p>
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
     * <p>The name of the image pipeline. It must be 2 to 128 characters long, start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. Allowed characters include letters, digits, Chinese characters, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the value of <code>ImagePipelineId</code> is used as the name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testImagePipeline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether the destination image supports NVMe.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated. Use <code>ImageOptions.ImageFeatures.NvmeSupport</code> instead.</p>
     * </blockquote>
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
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The image repair mode in the image template.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Standard: The standard mode.</p>
     * <p>The check items for Linux systems include the following:</p>
     * <ul>
     * <li><p>GUESTOS.CloudInit</p>
     * </li>
     * <li><p>GUESTOS.Dhcp</p>
     * </li>
     * <li><p>GUESTOS.Virtio</p>
     * </li>
     * <li><p>GUESTOS.OnlineResizeFS</p>
     * </li>
     * <li><p>GUESTOS.Grub</p>
     * </li>
     * <li><p>GUESTOS.Fstab</p>
     * </li>
     * </ul>
     * <p>The check items for Windows systems include the following:</p>
     * <ul>
     * <li><p>GUESTOS.Virtio</p>
     * </li>
     * <li><p>GUESTOS.Update</p>
     * </li>
     * <li><p>GUESTOS.Hotfix</p>
     * </li>
     * <li><p>GUESTOS.Server</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The repair items may change as the check and repair capabilities are improved. For more information about each repair item, see <a href="https://help.aliyun.com/document_detail/439819.html">Image check overview</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("RepairMode")
    public String repairMode;

    /**
     * <p>The ID of the resource group.</p>
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
     * <p>The size of the system disk of the intermediate instance. Unit: GiB. Valid values: 20 to 500.</p>
     * <p>Default value: 40.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The tags to add to the image pipeline.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateImagePipelineRequestTag> tag;

    /**
     * <p>The content of the image test template. The content can be up to 16 KB in size. For more information about the supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Command reference for Image Builder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPONENT ic-bp12dvdzvr9k9*****
     * COMPONENT acs:ecs:cn-hangzhou:18689161186*****:imagecomponent/ComponentName/1.<em>.</em></p>
     */
    @NameInMap("TestContent")
    public String testContent;

    /**
     * <p>The IDs of destination regions for image distribution. You can specify up to 20 region IDs.</p>
     * <p>If you do not specify this parameter, the images are created only in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ToRegionId")
    public java.util.List<String> toRegionId;

    /**
     * <p>The ID of the VSwitch in the VPC that is used to launch the intermediate instance.</p>
     * <p>If you do not specify this parameter, a new VPC and VSwitch are created. Ensure that you have a sufficient quota of VPC resources. For more information, see <a href="https://help.aliyun.com/document_detail/27750.html">Usage limits</a>.</p>
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
         * <p>Specifies whether to disable the feature that automatically appends a suffix to the destination image name. Valid values:</p>
         * <ul>
         * <li>disable: Disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("ImageNameSuffix")
        public String imageNameSuffix;

        /**
         * <p>Specifies whether to retain Cloud Assistant in the destination image. During the image building process, Cloud Assistant is automatically installed on the intermediate instance to run commands. You can select whether to retain Cloud Assistant after the process is complete. Valid values:</p>
         * <ul>
         * <li><p>true: Retain Cloud Assistant.</p>
         * </li>
         * <li><p>false: Do not retain Cloud Assistant.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This setting does not affect the Cloud Assistant client that is already installed in your image.</p>
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
         * <p>Specifies whether the destination image supports NVMe. Valid values:</p>
         * <ul>
         * <li><p>supported: Instances created from this image support the NVMe protocol.</p>
         * </li>
         * <li><p>unsupported: Instances created from this image do not support the NVMe protocol.</p>
         * </li>
         * <li><p>auto: The system automatically checks whether the NVMe driver is installed on your image. This check is performed before the build phase. If you install or uninstall the NVMe driver during the build, the result may be inaccurate. We recommend that you set this parameter to supported or unsupported based on the build content.</p>
         * </li>
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
         * <p>The key of the tag. The tag key must be 1 to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be empty or up to 128 characters long. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The description of the destination image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the destination image family. The name must be 2 to 128 characters long and start with a letter or a Chinese character. It cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>. Allowed characters include letters, digits, Chinese characters, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>family</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The feature attributes of the destination image.</p>
         */
        @NameInMap("ImageFeatures")
        public CreateImagePipelineRequestImageOptionsImageFeatures imageFeatures;

        /**
         * <p>The prefix of the destination image name. The prefix must be 2 to 64 characters in length. It must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>The complete image name is automatically generated by concatenating the prefix and the build task ID (<code>ExecutionId</code>) in the <code>{ImageName}_{ExecutionId}</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The tags of the destination image.</p>
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
         * <p>The size of the disk to create from the image file, in GiB. For the system disk, this value must be greater than or equal to the size of the image file.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>When N is 1, the disk is the system disk. The size of the system disk can range from 1 GiB to 2,048 GiB.</p>
         * </li>
         * <li><p>When N is a value from 2 to 17, the disk is a data disk. The size of a data disk can range from 1 GiB to 2,048 GiB.</p>
         * </li>
         * </ul>
         * <p>After you upload the base image file to an OSS bucket, you can view the size of the image file in the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        /**
         * <p>The format of the image. Valid values:</p>
         * <ul>
         * <li><p>RAW</p>
         * </li>
         * <li><p>VHD</p>
         * </li>
         * <li><p>QCOW2</p>
         * </li>
         * </ul>
         * <p>Default value: If left empty, the system automatically detects the image format.</p>
         * 
         * <strong>example:</strong>
         * <p>RAW</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The OSS bucket that contains the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsimageos</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The name (key) of the image file that is stored in the OSS bucket.</p>
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
         * <p>Specifies whether the base image to be imported supports NVMe. Valid values:</p>
         * <ul>
         * <li><p>supported: Instances created from this image support the NVMe protocol.</p>
         * </li>
         * <li><p>unsupported: Instances created from this image do not support the NVMe protocol.</p>
         * </li>
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
         * <p>The architecture of the image to import. Valid values:</p>
         * <ul>
         * <li><p>x86_64</p>
         * </li>
         * <li><p>arm64</p>
         * </li>
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
         * <li><p>BIOS: BIOS boot mode.</p>
         * </li>
         * <li><p>UEFI: UEFI boot mode.</p>
         * </li>
         * </ul>
         * <p>Default value: BIOS. If <code>Architecture</code> is set to <code>arm64</code>, the default value is UEFI and this parameter can be set only to UEFI.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>To prevent startup failures, ensure the boot mode is supported by the image.</p>
         * 
         * <strong>example:</strong>
         * <p>BIOS</p>
         */
        @NameInMap("BootMode")
        public String bootMode;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The information about the disks of the custom image.</p>
         * <ul>
         * <li><p>When N is 1, the disk is a system disk.</p>
         * </li>
         * <li><p>When N is a value from 2 to 17, the disk is a data disk.</p>
         * </li>
         * </ul>
         */
        @NameInMap("DiskDeviceMappings")
        public java.util.List<CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings> diskDeviceMappings;

        /**
         * <p>The image feature attributes.</p>
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
         * <li><p>Auto: Alibaba Cloud attempts to assign a license based on the detected operating system. If an official Alibaba Cloud license for the specified <code>Platform</code> is unavailable, the system defaults to BYOL.</p>
         * </li>
         * <li><p>Aliyun: A license from an official Alibaba Cloud channel is used based on the specified <code>Platform</code>.</p>
         * </li>
         * <li><p>BYOL: The license that comes with the base operating system is used. When you use the BYOL mode, you must make sure that your license key is supported in Alibaba Cloud.</p>
         * </li>
         * </ul>
         * <p>Default value: Auto.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("LicenseType")
        public String licenseType;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><p>windows</p>
         * </li>
         * <li><p>linux</p>
         * </li>
         * </ul>
         * <p>Default value: linux.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The operating system distribution. Valid values:</p>
         * <ul>
         * <li><p>Aliyun</p>
         * </li>
         * <li><p>Anolis</p>
         * </li>
         * <li><p>CentOS</p>
         * </li>
         * <li><p>Ubuntu</p>
         * </li>
         * <li><p>CoreOS</p>
         * </li>
         * <li><p>SUSE</p>
         * </li>
         * <li><p>Debian</p>
         * </li>
         * <li><p>OpenSUSE</p>
         * </li>
         * <li><p>FreeBSD</p>
         * </li>
         * <li><p>RedHat</p>
         * </li>
         * <li><p>Kylin</p>
         * </li>
         * <li><p>UOS</p>
         * </li>
         * <li><p>Fedora</p>
         * </li>
         * <li><p>Fedora CoreOS</p>
         * </li>
         * <li><p>CentOS Stream</p>
         * </li>
         * <li><p>AlmaLinux</p>
         * </li>
         * <li><p>Rocky Linux</p>
         * </li>
         * <li><p>Gentoo</p>
         * </li>
         * <li><p>Customized Linux</p>
         * </li>
         * <li><p>Others Linux</p>
         * </li>
         * <li><p>Windows Server 2022</p>
         * </li>
         * <li><p>Windows Server 2019</p>
         * </li>
         * <li><p>Windows Server 2016</p>
         * </li>
         * <li><p>Windows Server 2012</p>
         * </li>
         * <li><p>Windows Server 2008</p>
         * </li>
         * <li><p>Windows Server 2003</p>
         * </li>
         * <li><p>Other Windows</p>
         * </li>
         * </ul>
         * <p>Default value: Others Linux if OSType is set to Linux, or Other Windows if OSType is set to Windows.</p>
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
         * <p>The key of tag N, where N is from 1 to 20. The tag key must be 1 to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N, where N is from 1 to 20. The tag value can be empty or up to 128 characters long. It cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
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
