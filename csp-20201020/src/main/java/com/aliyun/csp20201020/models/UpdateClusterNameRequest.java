// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class UpdateClusterNameRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateClusterNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNameRequest self = new UpdateClusterNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNameRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateClusterNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
