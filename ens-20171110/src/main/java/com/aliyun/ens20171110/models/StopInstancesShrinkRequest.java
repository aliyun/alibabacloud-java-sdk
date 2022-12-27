// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopInstancesShrinkRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static StopInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesShrinkRequest self = new StopInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
