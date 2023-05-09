// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAttributeShrinkRequest extends TeaModel {
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("NodeCapacity")
    public Integer nodeCapacity;

    @NameInMap("NodePoolStrategy")
    public String nodePoolStrategyShrink;

    @NameInMap("PoolId")
    public String poolId;

    /**
     * <p>产品类型。</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ModifyNodePoolAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolAttributeShrinkRequest self = new ModifyNodePoolAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolAttributeShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ModifyNodePoolAttributeShrinkRequest setNodeCapacity(Integer nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
        return this;
    }
    public Integer getNodeCapacity() {
        return this.nodeCapacity;
    }

    public ModifyNodePoolAttributeShrinkRequest setNodePoolStrategyShrink(String nodePoolStrategyShrink) {
        this.nodePoolStrategyShrink = nodePoolStrategyShrink;
        return this;
    }
    public String getNodePoolStrategyShrink() {
        return this.nodePoolStrategyShrink;
    }

    public ModifyNodePoolAttributeShrinkRequest setPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }
    public String getPoolId() {
        return this.poolId;
    }

    public ModifyNodePoolAttributeShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
