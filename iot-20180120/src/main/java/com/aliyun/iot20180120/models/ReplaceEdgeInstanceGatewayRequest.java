// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReplaceEdgeInstanceGatewayRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oTCJomvT95WPyPPQ5sje******</p>
     */
    @NameInMap("CurrentGatewayId")
    public String currentGatewayId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>G4TGWGYwpo8zwr******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>65SkFyhZcU5d3PO2Ri13******</p>
     */
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
