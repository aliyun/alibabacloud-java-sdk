// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAttributeShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the region where the delivery group resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cn-shanghai: China (Shanghai)</li>
     * <li>cn-hangzhou: China (Hangzhou)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCapacity")
    public Integer nodeCapacity;

    /**
     * <p>The auto scaling policy used by the delivery group.</p>
     */
    @NameInMap("NodePoolStrategy")
    public String nodePoolStrategyShrink;

    /**
     * <strong>example:</strong>
     * <p>rg-ew7va2g1wl3vm****</p>
     */
    @NameInMap("PoolId")
    public String poolId;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
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
