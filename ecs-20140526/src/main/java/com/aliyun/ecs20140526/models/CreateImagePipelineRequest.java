// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineRequest extends TeaModel {
    /**
     * <p>The IDs of Alibaba Cloud accounts with which you want to share the image that is created based on the image template. You can specify up to 20 account IDs.</p>
     */
    @NameInMap("AddAccount")
    public java.util.List<Long> addAccount;

    /**
     * <p>The source image.</p>
     * <br>
     * <p>*   If you set the `BaseImageType` parameter to IMAGE, set the BaseImage parameter to the ID of a custom image.</p>
     * <p>*   If you set the `BaseImageType` parameter to IMAGE_FAMILY, set the BaseImage parameter to the name of an image family.</p>
     */
    @NameInMap("BaseImage")
    public String baseImage;

    /**
     * <p>The type of the source image. Valid values:</p>
     * <br>
     * <p>*   IMAGE: image</p>
     * <p>*   IMAGE_FAMILY: image family</p>
     */
    @NameInMap("BaseImageType")
    public String baseImageType;

    /**
     * <p>The content of the image template. The content cannot exceed 16 KB in size and can contain up to 127 commands. For information about the commands that are supported by the image template, see the "Usage notes" section in this topic.</p>
     */
    @NameInMap("BuildContent")
    public String buildContent;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. **The token can contain only ASCII characters and cannot exceed 64 characters in length.** For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to release the intermediate instance if the image cannot be created. Valid values:</p>
     * <br>
     * <p>*   true: releases the intermediate instance if the image cannot be created.</p>
     * <p>*   false: does not release the intermediate instance if the image cannot be created.</p>
     * <br>
     * <p>Default value: true.</p>
     * <br>
     * <p>> If the intermediate instance cannot be started, the instance is automatically released.</p>
     */
    @NameInMap("DeleteInstanceOnFailure")
    public Boolean deleteInstanceOnFailure;

    /**
     * <p>The description of the image template. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The prefix of the image name. The prefix must be 2 to 64 characters in length. The prefix must start with a letter but cannot start with `http://` or `https://`. The prefix can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>The system generates the final image name that consists of the specified prefix and the ID of the build task (`ExecutionId`) in the `{ImageName}_{ExecutionId}` format.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The instance type. You can call the [DescribeInstanceTypes](~~25620~~) to query supported instance types.</p>
     * <br>
     * <p>If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is selected. This configuration is subject to the resource availability of instance types. For example, the ecs.g6.large instance type is selected. If the available ecs.g6.large resources are insufficient, the ecs.g6.xlarge instance type is selected.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The size of the outbound public bandwidth of the intermediate instance. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The name of the image template. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>> If you do not specify the `Name` parameter, the value of the `ImagePipelineId` return parameter is used.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image template that you want to create. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
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
     * <p>The size of the system disk of the intermediate instance. Unit: GiB. Valid values: 20 to 500.</p>
     * <br>
     * <p>Default value: 40.</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The tags that you want to add to the image template.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateImagePipelineRequestTag> tag;

    /**
     * <p>The IDs of regions to which you want to distribute the image that is created based on the image template. You can specify up to 20 region IDs.</p>
     * <br>
     * <p>If you do not specify this parameter, the image is created only in the current region.</p>
     */
    @NameInMap("ToRegionId")
    public java.util.List<String> toRegionId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>If you do not specify this parameter, a new virtual private cloud (VPC) and vSwitch are created by default. Make sure that the VPC quota of your account is sufficient. For more information, see [Limits](~~27750~~).</p>
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

    public CreateImagePipelineRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
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

    public static class CreateImagePipelineRequestTag extends TeaModel {
        /**
         * <p>The keys of tags. You can specify up to 20 tag keys. The tag key cannot be an empty string. The tag key must be 1 to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of tags. You can specify up to 20 tag values. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `acs:`.</p>
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
