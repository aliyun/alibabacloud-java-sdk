// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CloseEdgeInstanceDeploymentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static CloseEdgeInstanceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseEdgeInstanceDeploymentRequest self = new CloseEdgeInstanceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CloseEdgeInstanceDeploymentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CloseEdgeInstanceDeploymentRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
