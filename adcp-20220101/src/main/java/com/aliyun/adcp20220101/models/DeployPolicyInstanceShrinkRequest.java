// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c102fe5f1ee5d4c87a68121a77d8b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>An array of JSON strings. The JSON strings in the array indicate the IDs of the associated clusters in which the policy instance is deployed.</p>
     * <p>This parameter is required.</p>
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
     * <ul>
     * <li>deny: blocks deployments that match the policy.</li>
     * <li>warn: generates alerts for deployments that match the policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>warn</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The name of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACKNoEnvVarSecrets</p>
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
