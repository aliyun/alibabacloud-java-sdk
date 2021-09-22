// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteDeploymentRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentRequest self = new DeleteDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDeploymentRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public DeleteDeploymentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
