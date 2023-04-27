// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceShrinkRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterIds")
    public String clusterIdsShrink;

    @NameInMap("Namespaces")
    public String namespacesShrink;

    @NameInMap("PolicyAction")
    public String policyAction;

    @NameInMap("PolicyName")
    public String policyName;

    public static DeployPolicyInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployPolicyInstanceShrinkRequest self = new DeployPolicyInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeployPolicyInstanceShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeployPolicyInstanceShrinkRequest setClusterIdsShrink(String clusterIdsShrink) {
        this.clusterIdsShrink = clusterIdsShrink;
        return this;
    }
    public String getClusterIdsShrink() {
        return this.clusterIdsShrink;
    }

    public DeployPolicyInstanceShrinkRequest setNamespacesShrink(String namespacesShrink) {
        this.namespacesShrink = namespacesShrink;
        return this;
    }
    public String getNamespacesShrink() {
        return this.namespacesShrink;
    }

    public DeployPolicyInstanceShrinkRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public DeployPolicyInstanceShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
