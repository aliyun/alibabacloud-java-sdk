// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class AicsOpenApiInvokeShrinkRequest extends TeaModel {
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
    public String paramShrink;

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

    public static AicsOpenApiInvokeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AicsOpenApiInvokeShrinkRequest self = new AicsOpenApiInvokeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AicsOpenApiInvokeShrinkRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AicsOpenApiInvokeShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public AicsOpenApiInvokeShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public AicsOpenApiInvokeShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
