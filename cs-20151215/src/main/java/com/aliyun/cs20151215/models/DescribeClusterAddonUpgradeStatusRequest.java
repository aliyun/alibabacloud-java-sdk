// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonUpgradeStatusRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 组件ID。
    @NameInMap("ComponentId")
    public String componentId;

    public static DescribeClusterAddonUpgradeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonUpgradeStatusRequest self = new DescribeClusterAddonUpgradeStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonUpgradeStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterAddonUpgradeStatusRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}
