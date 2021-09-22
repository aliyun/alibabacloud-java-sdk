// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteDeploymentVersionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("DeploymentVersion")
    public String deploymentVersion;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteDeploymentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentVersionRequest self = new DeleteDeploymentVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDeploymentVersionRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public DeleteDeploymentVersionRequest setDeploymentVersion(String deploymentVersion) {
        this.deploymentVersion = deploymentVersion;
        return this;
    }
    public String getDeploymentVersion() {
        return this.deploymentVersion;
    }

    public DeleteDeploymentVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
