// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CloseEdgeInstanceDeploymentRequest extends TeaModel {
    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance for which you want to stop deployment tasks and obtain the instance ID.</p>
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
