// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteGrafanaResourceRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("UserId")
    public String userId;

    public static DeleteGrafanaResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaResourceRequest self = new DeleteGrafanaResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteGrafanaResourceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DeleteGrafanaResourceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
