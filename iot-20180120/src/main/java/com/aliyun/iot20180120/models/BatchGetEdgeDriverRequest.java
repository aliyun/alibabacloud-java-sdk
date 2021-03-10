// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeDriverRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DriverIds")
    @Validation(required = true)
    public java.util.List<String> driverIds;

    public static BatchGetEdgeDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeDriverRequest self = new BatchGetEdgeDriverRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchGetEdgeDriverRequest setDriverIds(java.util.List<String> driverIds) {
        this.driverIds = driverIds;
        return this;
    }
    public java.util.List<String> getDriverIds() {
        return this.driverIds;
    }

}
