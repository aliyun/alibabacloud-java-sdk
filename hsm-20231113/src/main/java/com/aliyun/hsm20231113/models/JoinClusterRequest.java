// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class JoinClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-NZB9Oj5Yfd8Y****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the HSM that you want to add to the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-vj30bil8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static JoinClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinClusterRequest self = new JoinClusterRequest();
        return TeaModel.build(map, self);
    }

    public JoinClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public JoinClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
