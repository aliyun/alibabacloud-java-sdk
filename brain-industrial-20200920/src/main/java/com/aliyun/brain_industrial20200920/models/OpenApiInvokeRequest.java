// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class OpenApiInvokeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>119397</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;a&quot;:{&quot;value&quot;:1}}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <strong>example:</strong>
     * <p>215168378e7b43789cabeef1d0db9320</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static OpenApiInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiInvokeRequest self = new OpenApiInvokeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiInvokeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public OpenApiInvokeRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public OpenApiInvokeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
