// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateImageShrinkRequest extends TeaModel {
    /**
     * <p>The visibility of the image. Valid values:</p>
     * <ul>
     * <li>Public: The image is visible to all users.</li>
     * <li>Private: The image is visible only to the creator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The ID of the virtual private cloud (VPC) associated with the ACR instance. This parameter is required if you reference an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("AcrAssociatedVpcId")
    public String acrAssociatedVpcId;

    /**
     * <p>The ACR instance ID. This parameter is required if you reference an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>acr_instance_id</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The build configuration of the image.</p>
     */
    @NameInMap("BuildConfig")
    public String buildConfigShrink;

    /**
     * <p>The client token that is used to ensure idempotence.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dasfsd-94fqwe-da8d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the image. The description can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>create by xxxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to synchronize the image to MaxCompute. Specify this parameter when you reference an ACR image. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSyncMaxCompute")
    public Boolean enableSyncMaxCompute;

    /**
     * <p>The URI of the image. This parameter is required if you reference an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-beijing.cr.aliyuncs.com/namespace/image:0.1.0</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The name of the image. The name can contain lowercase letters, digits, and underscores (_), and can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task_image_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the image. If you reference a DataWorks official image, set this parameter to DataWorks Default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace_name</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the image provided by the image provider. This parameter is required if you reference a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>System_shell_20251201</p>
     */
    @NameInMap("ProviderImageId")
    public String providerImageId;

    /**
     * <p>The reference data type of the image. Valid values:</p>
     * <ul>
     * <li>ACR: ACR image repository.</li>
     * <li>DataWorks: DataWorks official image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACR</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>The name of the image repository. If you reference a DataWorks official image, set this parameter to DataWorks Default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repo_name</p>
     */
    @NameInMap("RepositoryName")
    public String repositoryName;

    /**
     * <p>The sub-purpose of the image.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Supported")
    public String supportedShrink;

    public static CreateImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageShrinkRequest self = new CreateImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageShrinkRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateImageShrinkRequest setAcrAssociatedVpcId(String acrAssociatedVpcId) {
        this.acrAssociatedVpcId = acrAssociatedVpcId;
        return this;
    }
    public String getAcrAssociatedVpcId() {
        return this.acrAssociatedVpcId;
    }

    public CreateImageShrinkRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateImageShrinkRequest setBuildConfigShrink(String buildConfigShrink) {
        this.buildConfigShrink = buildConfigShrink;
        return this;
    }
    public String getBuildConfigShrink() {
        return this.buildConfigShrink;
    }

    public CreateImageShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateImageShrinkRequest setEnableSyncMaxCompute(Boolean enableSyncMaxCompute) {
        this.enableSyncMaxCompute = enableSyncMaxCompute;
        return this;
    }
    public Boolean getEnableSyncMaxCompute() {
        return this.enableSyncMaxCompute;
    }

    public CreateImageShrinkRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public CreateImageShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImageShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateImageShrinkRequest setProviderImageId(String providerImageId) {
        this.providerImageId = providerImageId;
        return this;
    }
    public String getProviderImageId() {
        return this.providerImageId;
    }

    public CreateImageShrinkRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public CreateImageShrinkRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public CreateImageShrinkRequest setSupportedShrink(String supportedShrink) {
        this.supportedShrink = supportedShrink;
        return this;
    }
    public String getSupportedShrink() {
        return this.supportedShrink;
    }

}
