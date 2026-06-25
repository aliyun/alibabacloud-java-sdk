// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecShrinkRequest extends TeaModel {
    /**
     * <p>The billing method. The default value is \<code>PostPaid\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>No input required</p>
     */
    @NameInMap("InstanceTypes")
    @Deprecated
    public String instanceTypesShrink;

    /**
     * <p>The resource type. The default value is \<code>Public\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeMachineSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineSpecShrinkRequest self = new DescribeMachineSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMachineSpecShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    @Deprecated
    public DescribeMachineSpecShrinkRequest setInstanceTypesShrink(String instanceTypesShrink) {
        this.instanceTypesShrink = instanceTypesShrink;
        return this;
    }
    public String getInstanceTypesShrink() {
        return this.instanceTypesShrink;
    }

    public DescribeMachineSpecShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
