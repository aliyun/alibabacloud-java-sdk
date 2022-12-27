// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartInstancesShrinkRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static StartInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesShrinkRequest self = new StartInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
