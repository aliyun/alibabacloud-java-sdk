// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ClusterState extends TeaModel {
    /**
     * <p>The stage progress information for cluster operations.</p>
     */
    @NameInMap("ClusterStage")
    public ClusterStage clusterStage;

    /**
     * <p>The cluster running status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The cluster running sub-status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    public static ClusterState build(java.util.Map<String, ?> map) throws Exception {
        ClusterState self = new ClusterState();
        return TeaModel.build(map, self);
    }

    public ClusterState setClusterStage(ClusterStage clusterStage) {
        this.clusterStage = clusterStage;
        return this;
    }
    public ClusterStage getClusterStage() {
        return this.clusterStage;
    }

    public ClusterState setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ClusterState setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

}
