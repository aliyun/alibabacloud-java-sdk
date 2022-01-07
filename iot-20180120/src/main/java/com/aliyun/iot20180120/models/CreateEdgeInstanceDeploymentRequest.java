// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceDeploymentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Type")
    public String type;

    public static CreateEdgeInstanceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceDeploymentRequest self = new CreateEdgeInstanceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceDeploymentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEdgeInstanceDeploymentRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeInstanceDeploymentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
