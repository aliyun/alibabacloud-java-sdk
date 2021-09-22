// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateDeploymentVersionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("DeploymentVersion")
    public String deploymentVersion;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeployMetadata")
    public String deployMetadata;

    @NameInMap("DeployType")
    public String deployType;

    public static CreateDeploymentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentVersionRequest self = new CreateDeploymentVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDeploymentVersionRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public CreateDeploymentVersionRequest setDeploymentVersion(String deploymentVersion) {
        this.deploymentVersion = deploymentVersion;
        return this;
    }
    public String getDeploymentVersion() {
        return this.deploymentVersion;
    }

    public CreateDeploymentVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDeploymentVersionRequest setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public CreateDeploymentVersionRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

}
