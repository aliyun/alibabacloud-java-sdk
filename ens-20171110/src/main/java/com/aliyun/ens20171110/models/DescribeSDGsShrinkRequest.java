// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGsShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of instances that you want to query. By default, all instances are queried.</p>
     * <blockquote>
     * <p> If you specify the <strong>SDGIds</strong> and <strong>InstanceIds</strong> parameters at the same time, the query result is the intersection of the two conditions.</p>
     * </blockquote>
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
