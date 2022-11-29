// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceActiveOpsTaskShrinkRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static CreateInstanceActiveOpsTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceActiveOpsTaskShrinkRequest self = new CreateInstanceActiveOpsTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceActiveOpsTaskShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
