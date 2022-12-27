// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootInstancesShrinkRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static RebootInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesShrinkRequest self = new RebootInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RebootInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
