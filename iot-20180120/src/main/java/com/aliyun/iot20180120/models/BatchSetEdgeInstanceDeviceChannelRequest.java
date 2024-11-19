// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchSetEdgeInstanceDeviceChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BE0BD49EF5EF4D119D09CC1B25******</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9c1ae7bd59f1469abbdccc9592******</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6GaTtvTj7vJhiS******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hathoyxglj9jpYPyw3WN******</p>
     */
    @NameInMap("IotIds")
    public java.util.List<String> iotIds;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchSetEdgeInstanceDeviceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetEdgeInstanceDeviceChannelRequest self = new BatchSetEdgeInstanceDeviceChannelRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetEdgeInstanceDeviceChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public BatchSetEdgeInstanceDeviceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public BatchSetEdgeInstanceDeviceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchSetEdgeInstanceDeviceChannelRequest setIotIds(java.util.List<String> iotIds) {
        this.iotIds = iotIds;
        return this;
    }
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

    public BatchSetEdgeInstanceDeviceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
