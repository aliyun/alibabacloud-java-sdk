// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteEdgeInstanceChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BE0BD49EF5EF4D119D09CC1B25******</p>
     */
    @NameInMap("ChannelIds")
    public java.util.List<String> channelIds;

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
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchDeleteEdgeInstanceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteEdgeInstanceChannelRequest self = new BatchDeleteEdgeInstanceChannelRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteEdgeInstanceChannelRequest setChannelIds(java.util.List<String> channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    public java.util.List<String> getChannelIds() {
        return this.channelIds;
    }

    public BatchDeleteEdgeInstanceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public BatchDeleteEdgeInstanceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchDeleteEdgeInstanceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
