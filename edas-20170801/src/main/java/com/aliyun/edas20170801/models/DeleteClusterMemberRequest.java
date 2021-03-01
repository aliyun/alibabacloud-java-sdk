// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteClusterMemberRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterMemberId")
    public String clusterMemberId;

    public static DeleteClusterMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterMemberRequest self = new DeleteClusterMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterMemberRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterMemberRequest setClusterMemberId(String clusterMemberId) {
        this.clusterMemberId = clusterMemberId;
        return this;
    }
    public String getClusterMemberId() {
        return this.clusterMemberId;
    }

}
