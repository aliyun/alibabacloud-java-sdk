// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDriverConfigsRequest extends TeaModel {
    @NameInMap("DriverIds")
    public java.util.List<String> driverIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchGetEdgeInstanceDriverConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDriverConfigsRequest self = new BatchGetEdgeInstanceDriverConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDriverConfigsRequest setDriverIds(java.util.List<String> driverIds) {
        this.driverIds = driverIds;
        return this;
    }
    public java.util.List<String> getDriverIds() {
        return this.driverIds;
    }

    public BatchGetEdgeInstanceDriverConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchGetEdgeInstanceDriverConfigsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
