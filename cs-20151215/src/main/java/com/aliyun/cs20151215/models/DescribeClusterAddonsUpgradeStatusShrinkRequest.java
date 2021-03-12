// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonsUpgradeStatusShrinkRequest extends TeaModel {
    // 组件名称列表。
    @NameInMap("componentIds")
    public String componentIdsShrink;

    public static DescribeClusterAddonsUpgradeStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonsUpgradeStatusShrinkRequest self = new DescribeClusterAddonsUpgradeStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonsUpgradeStatusShrinkRequest setComponentIdsShrink(String componentIdsShrink) {
        this.componentIdsShrink = componentIdsShrink;
        return this;
    }
    public String getComponentIdsShrink() {
        return this.componentIdsShrink;
    }

}
