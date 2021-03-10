// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeDriverVersionRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DriverId")
    @Validation(required = true)
    public String driverId;

    @NameInMap("DriverVersion")
    @Validation(required = true)
    public String driverVersion;

    public static DeleteEdgeDriverVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeDriverVersionRequest self = new DeleteEdgeDriverVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeDriverVersionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteEdgeDriverVersionRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public DeleteEdgeDriverVersionRequest setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }
    public String getDriverVersion() {
        return this.driverVersion;
    }

}
