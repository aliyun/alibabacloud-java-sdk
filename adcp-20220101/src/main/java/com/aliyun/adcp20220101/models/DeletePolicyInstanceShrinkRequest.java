// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c09946603cd764dac96135f51d1ba****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>A array of JSON strings. The JSON strings in the array indicate the IDs of the associated clusters for which the policy is deleted.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIdsShrink;

    /**
     * <p>The name of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACKNoEnvVarSecrets</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static DeletePolicyInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceShrinkRequest self = new DeletePolicyInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeletePolicyInstanceShrinkRequest setClusterIdsShrink(String clusterIdsShrink) {
        this.clusterIdsShrink = clusterIdsShrink;
        return this;
    }
    public String getClusterIdsShrink() {
        return this.clusterIdsShrink;
    }

    public DeletePolicyInstanceShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
