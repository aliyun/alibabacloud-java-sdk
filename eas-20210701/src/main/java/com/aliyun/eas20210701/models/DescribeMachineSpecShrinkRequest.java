// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("InstanceTypes")
    @Deprecated
    public String instanceTypesShrink;

    public static DescribeMachineSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineSpecShrinkRequest self = new DescribeMachineSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DescribeMachineSpecShrinkRequest setInstanceTypesShrink(String instanceTypesShrink) {
        this.instanceTypesShrink = instanceTypesShrink;
        return this;
    }
    public String getInstanceTypesShrink() {
        return this.instanceTypesShrink;
    }

}
