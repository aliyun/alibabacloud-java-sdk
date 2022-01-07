// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceDeploymentRequest extends TeaModel {
    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GetEdgeInstanceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceDeploymentRequest self = new GetEdgeInstanceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceDeploymentRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public GetEdgeInstanceDeploymentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEdgeInstanceDeploymentRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
