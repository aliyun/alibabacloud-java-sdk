// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>An array of JSON strings. The JSON strings in the array indicate the IDs of the associated clusters in which the policy instance is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    /**
     * <p>A list of namespaces.</p>
     */
    @NameInMap("Namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The action of the policy. Valid values:</p>
     * <br>
     * <p>*   deny: blocks deployments that match the policy.</p>
     * <p>*   warn: generates alerts for deployments that match the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static DeployPolicyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployPolicyInstanceRequest self = new DeployPolicyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeployPolicyInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeployPolicyInstanceRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public DeployPolicyInstanceRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public DeployPolicyInstanceRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public DeployPolicyInstanceRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
