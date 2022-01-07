// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceChannelRequest extends TeaModel {
    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotIds")
    public java.util.List<String> iotIds;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchGetEdgeInstanceDeviceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceChannelRequest self = new BatchGetEdgeInstanceDeviceChannelRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public BatchGetEdgeInstanceDeviceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchGetEdgeInstanceDeviceChannelRequest setIotIds(java.util.List<String> iotIds) {
        this.iotIds = iotIds;
        return this;
    }
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

    public BatchGetEdgeInstanceDeviceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
