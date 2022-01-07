// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeDriverRequest extends TeaModel {
    @NameInMap("DriverIds")
    public java.util.List<String> driverIds;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchGetEdgeDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeDriverRequest self = new BatchGetEdgeDriverRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeDriverRequest setDriverIds(java.util.List<String> driverIds) {
        this.driverIds = driverIds;
        return this;
    }
    public java.util.List<String> getDriverIds() {
        return this.driverIds;
    }

    public BatchGetEdgeDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
