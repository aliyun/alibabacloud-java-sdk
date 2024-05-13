// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonsUpgradeStatusRequest extends TeaModel {
    /**
     * <p>The list of component names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("componentIds")
    public java.util.List<String> componentIds;

    public static DescribeClusterAddonsUpgradeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonsUpgradeStatusRequest self = new DescribeClusterAddonsUpgradeStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonsUpgradeStatusRequest setComponentIds(java.util.List<String> componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public java.util.List<String> getComponentIds() {
        return this.componentIds;
    }

}
