// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGsShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The IDs of SDG.</p>
     */
    @NameInMap("SdgIds")
    public String sdgIdsShrink;

    public static RemoveSDGsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGsShrinkRequest self = new RemoveSDGsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSDGsShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public RemoveSDGsShrinkRequest setSdgIdsShrink(String sdgIdsShrink) {
        this.sdgIdsShrink = sdgIdsShrink;
        return this;
    }
    public String getSdgIdsShrink() {
        return this.sdgIdsShrink;
    }

}
