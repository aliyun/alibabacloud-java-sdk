// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateServerIdeInstanceShrinkRequest extends TeaModel {
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
     * <p>The image ID. You can call ListServerIdeImages to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>System_serveride_notebook_20240822</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image URL. This parameter is required when you use a non-DataWorks official image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/example/serveride:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The personal development environment instance ID. You can call ListServerIdeInstances to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>699573</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the personal development environment instance.</p>
     * 
     * <strong>example:</strong>
     * <p>notebook_dev</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The VPC configuration used by the instance.</p>
     */
    @NameInMap("UserVpc")
    public String userVpcShrink;

    public static UpdateServerIdeInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerIdeInstanceShrinkRequest self = new UpdateServerIdeInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerIdeInstanceShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public UpdateServerIdeInstanceShrinkRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public UpdateServerIdeInstanceShrinkRequest setDatasetsShrink(String datasetsShrink) {
        this.datasetsShrink = datasetsShrink;
        return this;
    }
    public String getDatasetsShrink() {
        return this.datasetsShrink;
    }

    public UpdateServerIdeInstanceShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateServerIdeInstanceShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public UpdateServerIdeInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateServerIdeInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateServerIdeInstanceShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateServerIdeInstanceShrinkRequest setUserVpcShrink(String userVpcShrink) {
        this.userVpcShrink = userVpcShrink;
        return this;
    }
    public String getUserVpcShrink() {
        return this.userVpcShrink;
    }

}
