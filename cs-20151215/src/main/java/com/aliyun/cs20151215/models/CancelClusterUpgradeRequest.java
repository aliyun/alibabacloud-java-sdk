// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelClusterUpgradeRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    public static CancelClusterUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelClusterUpgradeRequest self = new CancelClusterUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public CancelClusterUpgradeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
