// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeployApplicationsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeploymentVersion")
    public String deploymentVersion;

    @NameInMap("ApplicationGroupNames")
    public java.util.List<String> applicationGroupNames;

    public static DeployApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationsRequest self = new DeployApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeployApplicationsRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public DeployApplicationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeployApplicationsRequest setDeploymentVersion(String deploymentVersion) {
        this.deploymentVersion = deploymentVersion;
        return this;
    }
    public String getDeploymentVersion() {
        return this.deploymentVersion;
    }

    public DeployApplicationsRequest setApplicationGroupNames(java.util.List<String> applicationGroupNames) {
        this.applicationGroupNames = applicationGroupNames;
        return this;
    }
    public java.util.List<String> getApplicationGroupNames() {
        return this.applicationGroupNames;
    }

}
