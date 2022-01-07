// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReplaceEdgeInstanceGatewayRequest extends TeaModel {
    @NameInMap("CurrentGatewayId")
    public String currentGatewayId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("NewGatewayId")
    public String newGatewayId;

    public static ReplaceEdgeInstanceGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceEdgeInstanceGatewayRequest self = new ReplaceEdgeInstanceGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceEdgeInstanceGatewayRequest setCurrentGatewayId(String currentGatewayId) {
        this.currentGatewayId = currentGatewayId;
        return this;
    }
    public String getCurrentGatewayId() {
        return this.currentGatewayId;
    }

    public ReplaceEdgeInstanceGatewayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReplaceEdgeInstanceGatewayRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ReplaceEdgeInstanceGatewayRequest setNewGatewayId(String newGatewayId) {
        this.newGatewayId = newGatewayId;
        return this;
    }
    public String getNewGatewayId() {
        return this.newGatewayId;
    }

}
