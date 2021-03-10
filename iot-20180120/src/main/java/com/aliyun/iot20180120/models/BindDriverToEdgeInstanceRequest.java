// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindDriverToEdgeInstanceRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DriverId")
    @Validation(required = true)
    public String driverId;

    @NameInMap("DriverVersion")
    public String driverVersion;

    @NameInMap("OrderId")
    public String orderId;

    public static BindDriverToEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDriverToEdgeInstanceRequest self = new BindDriverToEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindDriverToEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BindDriverToEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public BindDriverToEdgeInstanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
