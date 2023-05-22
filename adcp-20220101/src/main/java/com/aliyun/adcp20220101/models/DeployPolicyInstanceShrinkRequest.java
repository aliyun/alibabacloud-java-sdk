// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>An array of JSON strings. The JSON strings in the array indicate the IDs of the associated clusters in which the policy instance is deployed.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIdsShrink;

    /**
     * <p>A list of namespaces.</p>
     */
    @NameInMap("Namespaces")
    public String namespacesShrink;

    /**
     * <p>The action of the policy. Valid values:</p>
     * <br>
     * <p>*   deny: blocks deployments that match the policy.</p>
     * <p>*   warn: generates alerts for deployments that match the policy.</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The name of the policy.</p>
     */
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
