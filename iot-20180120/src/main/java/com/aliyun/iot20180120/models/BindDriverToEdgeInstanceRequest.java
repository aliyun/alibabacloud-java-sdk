// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindDriverToEdgeInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Drivers** page, move the pointer over the name of the driver that you want to bind and obtain the driver ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeDriver](~~155776~~) operation to query the driver ID.</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>The version number of the driver. By default, if you do not specify this parameter, the latest version of the driver is used.</p>
     */
    @NameInMap("DriverVersion")
    public String driverVersion;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance to which you want to bind a driver and obtain the instance ID.</p>
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
     * <p>The ID of the order.</p>
     * <br>
     * <p>>  This parameter is required if you use a third-party driver that is purchased from the IoT marketplace. If an official or self-developed driver is used, you do not need to specify this parameter.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    public static BindDriverToEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDriverToEdgeInstanceRequest self = new BindDriverToEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindDriverToEdgeInstanceRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public BindDriverToEdgeInstanceRequest setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }
    public String getDriverVersion() {
        return this.driverVersion;
    }

    public BindDriverToEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindDriverToEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BindDriverToEdgeInstanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
