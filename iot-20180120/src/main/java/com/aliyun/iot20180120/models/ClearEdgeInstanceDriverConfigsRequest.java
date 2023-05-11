// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearEdgeInstanceDriverConfigsRequest extends TeaModel {
    /**
     * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Drivers** page, move the pointer over the name of the driver whose configurations you want to delete and obtain the driver ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeDriver](~~155776~~) operation to query the driver ID.</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance that uses the driver and obtain the instance ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeInstance](~~135214~~) operation to query the instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is not required for the public instance but required for your purchased instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static ClearEdgeInstanceDriverConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearEdgeInstanceDriverConfigsRequest self = new ClearEdgeInstanceDriverConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ClearEdgeInstanceDriverConfigsRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public ClearEdgeInstanceDriverConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ClearEdgeInstanceDriverConfigsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
