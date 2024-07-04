// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveInstanceSDGShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static RemoveInstanceSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceSDGShrinkRequest self = new RemoveInstanceSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
