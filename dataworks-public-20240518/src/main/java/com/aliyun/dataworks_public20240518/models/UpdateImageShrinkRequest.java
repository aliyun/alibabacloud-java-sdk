// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateImageShrinkRequest extends TeaModel {
    /**
     * <p>The image visibility. Valid values:</p>
     * <ul>
     * <li>Public: visible to all users.</li>
     * <li>Private: visible only to the creator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The VPC ID associated with the ACR instance. This parameter is required when referencing an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("AcrAssociatedVpcId")
    public String acrAssociatedVpcId;

    /**
     * <p>The Container Registry (ACR) instance ID. This parameter is required when referencing an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>acr_instance_id</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The image build configuration.</p>
     */
    @NameInMap("BuildConfig")
    public String buildConfigShrink;

    /**
     * <p>The image description.</p>
     * 
     * <strong>example:</strong>
     * <p>create by xxxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The image URI. This parameter is required when referencing an ACR image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-beijing.cr.aliyuncs.com/namespace/image:0.1.0</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>task_image_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The image namespace. Set this parameter to DataWorks Default when referencing a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace_name</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The provider image ID. This parameter is required when referencing a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>System_shell_20251201</p>
     */
    @NameInMap("ProviderImageId")
    public String providerImageId;

    /**
     * <p>The image repository name. Set this parameter to DataWorks Default when referencing a DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>repo_name</p>
     */
    @NameInMap("RepositoryName")
    public String repositoryName;

    /**
     * <p>The image sub-purpose.</p>
     */
    @NameInMap("Supported")
    public String supportedShrink;

    public static UpdateImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageShrinkRequest self = new UpdateImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageShrinkRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateImageShrinkRequest setAcrAssociatedVpcId(String acrAssociatedVpcId) {
        this.acrAssociatedVpcId = acrAssociatedVpcId;
        return this;
    }
    public String getAcrAssociatedVpcId() {
        return this.acrAssociatedVpcId;
    }

    public UpdateImageShrinkRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public UpdateImageShrinkRequest setBuildConfigShrink(String buildConfigShrink) {
        this.buildConfigShrink = buildConfigShrink;
        return this;
    }
    public String getBuildConfigShrink() {
        return this.buildConfigShrink;
    }

    public UpdateImageShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateImageShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateImageShrinkRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public UpdateImageShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateImageShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateImageShrinkRequest setProviderImageId(String providerImageId) {
        this.providerImageId = providerImageId;
        return this;
    }
    public String getProviderImageId() {
        return this.providerImageId;
    }

    public UpdateImageShrinkRequest setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public UpdateImageShrinkRequest setSupportedShrink(String supportedShrink) {
        this.supportedShrink = supportedShrink;
        return this;
    }
    public String getSupportedShrink() {
        return this.supportedShrink;
    }

}
