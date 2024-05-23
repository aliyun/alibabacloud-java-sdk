// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGShrinkRequest extends TeaModel {
    /**
     * <p>IDs of Android in Container (AIC) instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static RemoveSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGShrinkRequest self = new RemoveSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSDGShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
