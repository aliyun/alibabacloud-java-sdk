// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class UpgradeClusterVersionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static UpgradeClusterVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterVersionRequest self = new UpgradeClusterVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterVersionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
