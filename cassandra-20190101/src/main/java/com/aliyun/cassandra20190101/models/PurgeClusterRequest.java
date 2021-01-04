// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class PurgeClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static PurgeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        PurgeClusterRequest self = new PurgeClusterRequest();
        return TeaModel.build(map, self);
    }

    public PurgeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
