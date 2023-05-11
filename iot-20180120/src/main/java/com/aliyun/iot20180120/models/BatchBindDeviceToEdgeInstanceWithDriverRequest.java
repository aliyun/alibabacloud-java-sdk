// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchBindDeviceToEdgeInstanceWithDriverRequest extends TeaModel {
    /**
     * <p>The IDs of the devices.</p>
     * <br>
     * <p>You can call the [QueryDevice](~~69905~~) operation to query detailed information about all devices that belong to the current Alibaba Cloud account and obtain the required device IDs.</p>
     * <br>
     * <p>>  You can specify a maximum of 20 device IDs when you call the BatchBindDeviceToEdgeInstanceWithDriver operation.</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Drivers** page, move the pointer over the name of the driver that you want to configure and obtain the driver ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeDriver](~~155776~~) operation to query the driver ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotIds")
    public java.util.List<String> iotIds;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance to which you want to bind multiple devices and obtain the instance ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeInstance](~~135214~~) operation to query the instance ID.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchBindDeviceToEdgeInstanceWithDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDeviceToEdgeInstanceWithDriverRequest self = new BatchBindDeviceToEdgeInstanceWithDriverRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindDeviceToEdgeInstanceWithDriverRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public BatchBindDeviceToEdgeInstanceWithDriverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchBindDeviceToEdgeInstanceWithDriverRequest setIotIds(java.util.List<String> iotIds) {
        this.iotIds = iotIds;
        return this;
    }
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

    public BatchBindDeviceToEdgeInstanceWithDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
