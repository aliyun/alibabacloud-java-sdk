// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAmountShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodePool")
    public String nodePoolShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ModifyNodePoolAmountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolAmountShrinkRequest self = new ModifyNodePoolAmountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolAmountShrinkRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ModifyNodePoolAmountShrinkRequest setNodePoolShrink(String nodePoolShrink) {
        this.nodePoolShrink = nodePoolShrink;
        return this;
    }
    public String getNodePoolShrink() {
        return this.nodePoolShrink;
    }

    public ModifyNodePoolAmountShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
