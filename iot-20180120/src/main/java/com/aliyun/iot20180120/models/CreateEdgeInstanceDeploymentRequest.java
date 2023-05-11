// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceDeploymentRequest extends TeaModel {
    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance for which you want to create a deployment task and obtain the instance ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeInstance](~~135214~~) operation to query the instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The type of the deployment task.</p>
     * <br>
     * <p>*   deploy: deploys the edge instance.</p>
     * <p>*   reset: resets the edge instance.</p>
     */
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
