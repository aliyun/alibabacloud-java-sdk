// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
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
