// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeInstanceMessageRoutingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5zvK1COK1gtr********</p>
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
     * <p>123456</p>
     */
    @NameInMap("RouteId")
    public Long routeId;

    public static DeleteEdgeInstanceMessageRoutingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeInstanceMessageRoutingRequest self = new DeleteEdgeInstanceMessageRoutingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeInstanceMessageRoutingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteEdgeInstanceMessageRoutingRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteEdgeInstanceMessageRoutingRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

}
