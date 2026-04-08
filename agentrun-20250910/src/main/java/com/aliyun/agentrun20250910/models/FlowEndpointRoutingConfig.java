// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class FlowEndpointRoutingConfig extends TeaModel {
    /**
     * <p>目标工作流版本号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>该版本在流量分配中的权重，0-100</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("weight")
    public Integer weight;

    public static FlowEndpointRoutingConfig build(java.util.Map<String, ?> map) throws Exception {
        FlowEndpointRoutingConfig self = new FlowEndpointRoutingConfig();
        return TeaModel.build(map, self);
    }

    public FlowEndpointRoutingConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public FlowEndpointRoutingConfig setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
