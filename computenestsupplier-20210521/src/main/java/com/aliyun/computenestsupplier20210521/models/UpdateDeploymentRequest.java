// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateDeploymentRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeploymentName")
    public String deploymentName;

    @NameInMap("DefaultVersion")
    public String defaultVersion;

    public static UpdateDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentRequest self = new UpdateDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDeploymentRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public UpdateDeploymentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDeploymentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDeploymentRequest setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
    public String getDeploymentName() {
        return this.deploymentName;
    }

    public UpdateDeploymentRequest setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }
    public String getDefaultVersion() {
        return this.defaultVersion;
    }

}
