// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindDriverFromEdgeInstanceRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DriverId")
    @Validation(required = true)
    public String driverId;

    public static UnbindDriverFromEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDriverFromEdgeInstanceRequest self = new UnbindDriverFromEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDriverFromEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UnbindDriverFromEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindDriverFromEdgeInstanceRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

}
