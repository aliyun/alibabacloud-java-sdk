// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeployFunctionRequest extends TeaModel {
    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DeployFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployFunctionRequest self = new DeployFunctionRequest();
        return TeaModel.build(map, self);
    }

    public DeployFunctionRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public DeployFunctionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
