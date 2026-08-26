// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateServerIdeInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The credential injection configuration for the instance. After this feature is enabled, you can use the default RAM role chain or specify a custom RAM role.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The number of CUs used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Cu")
    public Integer cu;

    /**
     * <p>The list of datasets mounted to the instance.</p>
     */
    @NameInMap("Datasets")
    public String datasetsShrink;

    /**
     * <p>The image ID. You can call ListServerIdeImages to obtain the image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>System_serveride_notebook_20240822</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image URL. This parameter is required when you use a non-official DataWorks image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/example/serveride:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The name of the personal development environment instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notebook_dev</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The Alibaba Cloud account ID of the user who owns the instance. If this parameter is not specified, the current caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>20933221576142****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The DataWorks resource group identifier. You can specify the numeric ID of the resource group or the full identifier in the Serverless_res_group_{tenantId}_{resgId} format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_123456789012345_9876543210****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The user command configuration to be executed when the instance starts.</p>
     */
    @NameInMap("UserCommand")
    public String userCommandShrink;

    /**
     * <p>The Virtual Private Cloud (VPC) configuration used by the instance.</p>
     */
    @NameInMap("UserVpc")
    public String userVpcShrink;

    public static CreateServerIdeInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerIdeInstanceShrinkRequest self = new CreateServerIdeInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerIdeInstanceShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateServerIdeInstanceShrinkRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public CreateServerIdeInstanceShrinkRequest setDatasetsShrink(String datasetsShrink) {
        this.datasetsShrink = datasetsShrink;
        return this;
    }
    public String getDatasetsShrink() {
        return this.datasetsShrink;
    }

    public CreateServerIdeInstanceShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateServerIdeInstanceShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateServerIdeInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateServerIdeInstanceShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateServerIdeInstanceShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateServerIdeInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServerIdeInstanceShrinkRequest setUserCommandShrink(String userCommandShrink) {
        this.userCommandShrink = userCommandShrink;
        return this;
    }
    public String getUserCommandShrink() {
        return this.userCommandShrink;
    }

    public CreateServerIdeInstanceShrinkRequest setUserVpcShrink(String userVpcShrink) {
        this.userVpcShrink = userVpcShrink;
        return this;
    }
    public String getUserVpcShrink() {
        return this.userVpcShrink;
    }

}
