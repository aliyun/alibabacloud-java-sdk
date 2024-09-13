// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGsShrinkRequest extends TeaModel {
    /**
     * <p>The AIC instance ID to be queried.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The IDs of SDGs that you want to query. By default, all SDGs are queried.</p>
     */
    @NameInMap("SDGIds")
    public String SDGIdsShrink;

    public static DescribeSDGsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGsShrinkRequest self = new DescribeSDGsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDGsShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DescribeSDGsShrinkRequest setSDGIdsShrink(String SDGIdsShrink) {
        this.SDGIdsShrink = SDGIdsShrink;
        return this;
    }
    public String getSDGIdsShrink() {
        return this.SDGIdsShrink;
    }

}
