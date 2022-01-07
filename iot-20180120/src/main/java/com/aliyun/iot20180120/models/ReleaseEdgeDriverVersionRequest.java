// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReleaseEdgeDriverVersionRequest extends TeaModel {
    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("DriverVersion")
    public String driverVersion;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static ReleaseEdgeDriverVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEdgeDriverVersionRequest self = new ReleaseEdgeDriverVersionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseEdgeDriverVersionRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public ReleaseEdgeDriverVersionRequest setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }
    public String getDriverVersion() {
        return this.driverVersion;
    }

    public ReleaseEdgeDriverVersionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
