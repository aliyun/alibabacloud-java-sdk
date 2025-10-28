// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteClusterMemberRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52984524-<strong><strong>-</strong></strong>-85f2-a34b0e5bb521</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The member ID of the ECS instance that you want to remove from the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zej4i2jdf3****jigng</p>
     */
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
