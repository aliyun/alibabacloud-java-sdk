// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class AicsOpenApiInvokeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>119397</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;a&quot;:1}</p>
     */
    @NameInMap("Param")
    public java.util.Map<String, ?> param;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ae5f9884c9914ed7af72b07e6c1616f9</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <strong>example:</strong>
     * <p>EXPERIMENT</p>
     */
    @NameInMap("Type")
    public String type;

    public static AicsOpenApiInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        AicsOpenApiInvokeRequest self = new AicsOpenApiInvokeRequest();
        return TeaModel.build(map, self);
    }

    public AicsOpenApiInvokeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AicsOpenApiInvokeRequest setParam(java.util.Map<String, ?> param) {
        this.param = param;
        return this;
    }
    public java.util.Map<String, ?> getParam() {
        return this.param;
    }

    public AicsOpenApiInvokeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public AicsOpenApiInvokeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
