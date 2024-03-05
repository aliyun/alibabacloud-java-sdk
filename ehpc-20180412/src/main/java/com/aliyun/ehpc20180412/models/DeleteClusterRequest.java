// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to obtain cluster IDs.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to release Elastic Compute Service (ECS) instances that are created by using Elastic High Performance Computing (E-HPC).</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("ReleaseInstance")
    public String releaseInstance;

    public static DeleteClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterRequest self = new DeleteClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterRequest setReleaseInstance(String releaseInstance) {
        this.releaseInstance = releaseInstance;
        return this;
    }
    public String getReleaseInstance() {
        return this.releaseInstance;
    }

}
