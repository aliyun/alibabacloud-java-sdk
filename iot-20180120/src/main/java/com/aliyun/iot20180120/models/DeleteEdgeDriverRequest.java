// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeDriverRequest extends TeaModel {
    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteEdgeDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeDriverRequest self = new DeleteEdgeDriverRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeDriverRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public DeleteEdgeDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
