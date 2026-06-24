// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAttributeShrinkRequest extends TeaModel {
    /**
     * <p>The region ID of the delivery group. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The number of concurrent sessions, which is the number of sessions that can be simultaneously connected to a single resource. If too many sessions are connected simultaneously, the application experience may degrade. The valid values vary depending on the resource specification. The valid values for each resource specification are as follows:</p>
     * <ul>
     * <li>appstreaming.general.4c8g: 1 to 2.</li>
     * <li>appstreaming.general.8c16g: 1 to 4.</li>
     * <li>appstreaming.vgpu.8c16g.4g: 1 to 4.</li>
     * <li>appstreaming.vgpu.8c31g.16g: 1 to 4.</li>
     * <li>appstreaming.vgpu.14c93g.12g: 1 to 6.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCapacity")
    public Integer nodeCapacity;

    /**
     * <p>The automatic scaling policy of the delivery group.</p>
     */
    @NameInMap("NodePoolStrategy")
    public String nodePoolStrategyShrink;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ew7va2g1wl3vm****</p>
     */
    @NameInMap("PoolId")
    public String poolId;

    /**
     * <p>The product type.</p>
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
