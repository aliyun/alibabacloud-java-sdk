// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateDeploymentVersionRequest extends TeaModel {
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

    public static UpdateDeploymentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentVersionRequest self = new UpdateDeploymentVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDeploymentVersionRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public UpdateDeploymentVersionRequest setDeploymentVersion(String deploymentVersion) {
        this.deploymentVersion = deploymentVersion;
        return this;
    }
    public String getDeploymentVersion() {
        return this.deploymentVersion;
    }

    public UpdateDeploymentVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDeploymentVersionRequest setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

}
