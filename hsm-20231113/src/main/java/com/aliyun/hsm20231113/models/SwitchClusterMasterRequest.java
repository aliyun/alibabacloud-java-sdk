// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class SwitchClusterMasterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-w3G9vOJI2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the HSM that you want to promote to the master HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-vj30bil8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SwitchClusterMasterRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchClusterMasterRequest self = new SwitchClusterMasterRequest();
        return TeaModel.build(map, self);
    }

    public SwitchClusterMasterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SwitchClusterMasterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
