// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceChannelRequest extends TeaModel {
    @NameInMap("ChannelIds")
    public java.util.List<String> channelIds;

    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchGetEdgeInstanceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceChannelRequest self = new BatchGetEdgeInstanceChannelRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceChannelRequest setChannelIds(java.util.List<String> channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    public java.util.List<String> getChannelIds() {
        return this.channelIds;
    }

    public BatchGetEdgeInstanceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public BatchGetEdgeInstanceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchGetEdgeInstanceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
