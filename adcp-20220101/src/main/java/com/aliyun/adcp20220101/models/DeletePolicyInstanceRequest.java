// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    @NameInMap("PolicyName")
    public String policyName;

    public static DeletePolicyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceRequest self = new DeletePolicyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeletePolicyInstanceRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public DeletePolicyInstanceRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
