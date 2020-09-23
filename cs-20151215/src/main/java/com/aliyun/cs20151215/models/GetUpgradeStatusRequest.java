// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetUpgradeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeStatusRequest self = new GetUpgradeStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetUpgradeStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
