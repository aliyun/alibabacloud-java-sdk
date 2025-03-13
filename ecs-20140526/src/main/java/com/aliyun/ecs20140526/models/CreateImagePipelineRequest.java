// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineRequest extends TeaModel {
    /**
     * <p>The IDs of Alibaba Cloud accounts to which to share the image that will be created based on the image template. You can specify up to 20 account IDs.</p>
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
     * <p>The source image.</p>
     * <ul>
     * <li>If you set <code>BaseImageType</code> to IMAGE, set BaseImage to the ID of a custom image.</li>
     * <li>If you set <code>BaseImageType</code> to IMAGE_FAMILY, set BaseImage to the name of an image family.</li>
     * <li>If you set <code>BaseImageType</code> to OSS, you do not need to specify BaseImage.</li>
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
     * <li>IMAGE: image</li>
     * <li>IMAGE_FAMILY: image family</li>
     * <li>OSS: Object Storage Service (OSS) object</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("BaseImageType")
    public String baseImageType;

    /**
     * <p>The build content in the image template. The content cannot exceed 16 KB in size. For information about the commands supported by Image Builder, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>FROM IMAGE:m-bp67acfmxazb4p****</p>
     */
    @NameInMap("BuildContent")
    public String buildContent;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.**** For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to release the intermediate instance when the image cannot be created. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: true.</p>
     * <blockquote>
     * <p>If the intermediate instance cannot be started, the instance is released by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteInstanceOnFailure")
    public Boolean deleteInstanceOnFailure;

    /**
     * <p>The description of the image template. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image family. The image family name must be 2 to 128 characters in length. The name must start with a letter and cannot start with acs: or aliyun. The name cannot contain http:// or https:// and can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ImageFamily")
    @Deprecated
    public String imageFamily;

    /**
     * <p>The prefix of the image name. The prefix must be 2 to 64 characters in length. The prefix must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The prefix can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>The system generates the final complete image name that consists of the specified prefix and the ID of the build task (<code>ExecutionId</code>) in the format of <code>{ImageName}_{ExecutionId}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    @Deprecated
    public String imageName;

    /**
     * <p>目标镜像属性。</p>
     */
    @NameInMap("ImageOptions")
    public CreateImagePipelineRequestImageOptions imageOptions;

    /**
     * <p>The attributes and settings of the image that you want to import. If you set <code>BaseImageType</code> to OSS, you must specify this parameter.</p>
     */
    @NameInMap("ImportImageOptions")
    public CreateImagePipelineRequestImportImageOptions importImageOptions;

    /**
     * <p>The instance type. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query instance types.</p>
     * <p>If you do not configure this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the ecs.g6.large instance type is automatically selected. If available ecs.g6.large resources are insufficient, the ecs.g6.xlarge instance type is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The size of the outbound public bandwidth for the intermediate instance. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The name of the launch template. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <blockquote>
     * <p> If you do not specify <code>Name</code>, the return value of <code>ImagePipelineId</code> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testImagePipeline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether the image created based on the image template supports the NVMe protocol. Valid values:</p>
     * <ul>
     * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
     * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
     * <li>auto: The system automatically detects whether the image supports the NVMe protocol. The system automatically detects whether the NVMe driver is installed on your image before the new image is built. If you install or uninstall the NVMe driver during the image building process, the detection result may be incorrect. We recommend that you set the value to supported or unsupported based on the image building content.</li>
     * </ul>
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
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The repair mode of the image template.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Standard: the standard mode.</p>
     * <p>Supported check items in Linux operating systems:</p>
     * <ul>
     * <li>GUESTOS.CloudInit</li>
     * <li>GUESTOS.Dhcp</li>
     * <li>GUESTOS.Virtio</li>
     * <li>GUESTOS.OnlineResizeFS</li>
     * <li>GUESTOS.Grub</li>
     * <li>GUESTOS.Fstab</li>
     * </ul>
     * <p>Supported check items in Windows operating systems:</p>
     * <ul>
     * <li>GUESTOS.Virtio</li>
     * <li>GUESTOS.Update</li>
     * <li>GUESTOS.Hotfix</li>
     * <li>GUESTOS.Server</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> As the check and repair capabilities continue to improve, the number of check items may increase. For more information about check items, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image check</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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
     * <p>The system disk size of the intermediate instance. Unit: GiB. Valid values: 20 to 500.</p>
     * <p>Default value: 40.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The tags to add to the template.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateImagePipelineRequestTag> tag;

    /**
     * <p>The test content in the image template. The content cannot exceed 16 KB in size. For information about the commands supported by Image Builder, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("TestContent")
    public String testContent;

    /**
     * <p>The IDs of regions to which you want to distribute the image that is created based on the image template. You can specify up to 20 region IDs.</p>
     * <p>If you do not specify this parameter, the image is created only in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ToRegionId")
    public java.util.List<String> toRegionId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>If you do not specify this parameter, a new VPC and vSwitch are created. Make sure that the VPC quota in your account is sufficient. For more information, see <a href="https://help.aliyun.com/document_detail/27750.html">Limits and quotas</a>.</p>
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
         * <p>是否禁用目标镜像名称自动增加后缀。可能值：</p>
         * <ul>
         * <li>disable：禁用。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("ImageNameSuffix")
        public String imageNameSuffix;

        /**
         * <p>Specifies whether to retain Cloud Assistant Agent that is installed during the image building process. During the image building process, the system automatically installs Cloud Assistant Agent on the intermediate instance to run commands. You can choose whether to retain Cloud Assistant Agent that is installed during the image building process in the new image. Valid values:</p>
         * <ul>
         * <li>true: retains Cloud Assistant Agent that is installed during the image building process in the new image.</li>
         * <li>false: does not retain Cloud Assistant Agent that is installed during the image building process in the new image.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> The setting of this parameter does not affect Cloud Assistant Agent that comes with your image.</p>
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
         * <p>构建的目标镜像是否支持 NVMe。可能值：</p>
         * <ul>
         * <li>supported：支持。表示以该镜像创建的实例支持 NVMe 协议。</li>
         * <li>unsupported：不支持。表示以该镜像创建的实例不支持 NVMe 协议。</li>
         * <li>auto：自动检测。由系统自动检测您的镜像是否安装NVMe驱动，该行为发生在构建阶段前，若您在构建时安装或者卸载了NVMe驱动，可能会出现结果偏差，建议您根据构建内容设置为supported或unsupported。</li>
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
         * <p>标签键。N 的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持 128 个字符，不能以<code>aliyun</code>和<code>acs:</code>开头，不能包含<code>http://</code>或者<code>https://</code>。</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>资源的标签值。N 的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持 128 个字符，不能以<code>acs:</code>开头，不能包含<code>http://</code>或者<code>https://</code>。</p>
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
         * <p>描述信息。长度为2~256个英文或中文字符，不能以<code>http://</code>和<code>https://</code>开头。</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>目标镜像族系。长度为 2~128 个英文或中文字符。必须以大小写字母或中文开头，不能以 aliyun 和 acs:开头，不能包含 http://或者 https://。可以包含数字、半角冒号（:）、下划线（_）或者短划线（-）。</p>
         * 
         * <strong>example:</strong>
         * <p>family</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>目标镜像特性相关属性。</p>
         */
        @NameInMap("ImageFeatures")
        public CreateImagePipelineRequestImageOptionsImageFeatures imageFeatures;

        /**
         * <p>目标镜像名称前缀。长度为2~64个字符，必须以大小写字母或中文开头，不能以<code>http://</code>和<code>https://</code>开头。可以包含中文、英文、数字、半角冒号（:）、下划线（_）、半角句号（.）或者短划线（-）。</p>
         * <p>最终完整的镜像名称由系统自动拼接名称前缀与构建任务ID（<code>ExecutionId</code>），格式为<code>{ImageName}_{ExecutionId}</code>。</p>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>目标镜像标签。</p>
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
         * <p>The size of disk N in the custom image after the source image is imported.</p>
         * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the source image file. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>When the N value is 1, this parameter specifies the size of the system disk in the custom image. Valid values: 1 to 2048.</li>
         * <li>When the N value is an integer in the range of 2 to 17, this parameter specifies the size of a data disk in the custom image. Valid values: 1 to 2048.</li>
         * </ul>
         * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        /**
         * <p>The format of the image. Valid values:</p>
         * <ul>
         * <li>RAW</li>
         * <li>VHD</li>
         * <li>QCOW2</li>
         * </ul>
         * <p>This parameter is empty by default, which indicates that the system checks the format of the image and uses the check result as the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>RAW</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The OSS bucket where the image file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsimageos</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>The name (key) of the object that the uploaded image is stored as in the OSS bucket.</p>
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
        /**
         * <p>Specifies whether the imported original image supports the Non-Volatile Memory Express (NVMe) protocol. Valid values:</p>
         * <ul>
         * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
         * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
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

        public CreateImagePipelineRequestImportImageOptionsFeatures setNvmeSupport(String nvmeSupport) {
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

    }

    public static class CreateImagePipelineRequestImportImageOptions extends TeaModel {
        /**
         * <p>The system architecture of the system disk. If you specify a data disk snapshot to create the system disk of the image, use Architecture to specify the system architecture of the system disk. Valid values:</p>
         * <ul>
         * <li>x86_64</li>
         * <li>arm64</li>
         * </ul>
         * <p>Default value: x86_64.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The new boot mode of the image. Valid values:</p>
         * <ul>
         * <li>BIOS: BIOS mode</li>
         * <li>UEFI: Unified Extensible Firmware Interface (UEFI) mode</li>
         * </ul>
         * <p>Default value: BIOS. If you set Architecture to <code>arm64</code>, set this parameter to UEFI.</p>
         * <blockquote>
         * <p> Before you specify this parameter, make sure that you are familiar with the boot modes supported by the image. If you specify a boot mode that is not supported by the image, ECS instances created from the image cannot start as expected. For information about the boot modes of images, see the <a href="~~2244655#b9caa9b8bb1wf~~">Boot modes of images</a> section of the &quot;Best practices for ECS instance boot modes&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>BIOS</p>
         */
        @NameInMap("BootMode")
        public String bootMode;

        /**
         * <p>The information of disks from which the custom images are created.</p>
         * <ul>
         * <li>When the N value is 1, this parameter creates a custom image from the system disk.</li>
         * <li>When the N value is an integer in the range of 2 to 17, this parameter creates a custom image from a data disk.</li>
         * </ul>
         */
        @NameInMap("DiskDeviceMappings")
        public java.util.List<CreateImagePipelineRequestImportImageOptionsDiskDeviceMappings> diskDeviceMappings;

        /**
         * <p>The attributes of the image.</p>
         */
        @NameInMap("Features")
        public CreateImagePipelineRequestImportImageOptionsFeatures features;

        /**
         * <p>The type of the license to use to activate the operating system after the image is imported. Valid values:</p>
         * <ul>
         * <li>Auto: ECS detects the operating system of the image and allocates a license to the operating system. In this mode, the system first checks whether a license allocated by an official Alibaba Cloud channel is available for the operating system version specified by <code>Platform</code>. If a license allocated by an official Alibaba Cloud channel is available for the operating system version, the system allocates the license to the imported image. If no such license is available, the Bring Your Own License (BYOL) mode is used.</li>
         * <li>Aliyun: The license allocated by an official Alibaba Cloud channel for the operating system version specified by <code>Platform</code> is used.</li>
         * <li>BYOL: The license that comes with the source operating system is used. When you use the BYOL license, make sure that your license key is supported by Alibaba Cloud.</li>
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
         * <li>windows: Windows operating systems</li>
         * <li>linux: Linux operating systems</li>
         * </ul>
         * <p>Default value: linux.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The version of the operating system. Valid values:</p>
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
         * <p>Default value: Others Linux when the operating system type is linux, and Other Windows when the operating system type is windows.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RetainImportedImage")
        public Boolean retainImportedImage;

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

    }

    public static class CreateImagePipelineRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: 1 to 20. You cannot specify empty strings as tag keys. The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value must be 0 to 128 characters in length. It cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
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
