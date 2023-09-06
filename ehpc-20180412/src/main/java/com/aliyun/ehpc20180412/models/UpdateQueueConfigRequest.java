// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateQueueConfigRequest extends TeaModel {
    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The instance type of the node.</p>
     * <br>
     * <p>You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.</p>
     */
    @NameInMap("ComputeInstanceType")
    public String computeInstanceType;

    /**
     * <p>The ID of the deployment set. You can obtain the deployment set ID by calling the [DescribeDeploymentSets](~~91313~~) operation. Only the deployment sets that use low latency policy are supported.</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    /**
     * <p>The name of the queue.</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The resource group ID.</p>
     * <br>
     * <p>You can call the [ListResourceGroups](~~158855~~) operation to query the IDs of resource groups.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static UpdateQueueConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueConfigRequest self = new UpdateQueueConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQueueConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateQueueConfigRequest setComputeInstanceType(String computeInstanceType) {
        this.computeInstanceType = computeInstanceType;
        return this;
    }
    public String getComputeInstanceType() {
        return this.computeInstanceType;
    }

    public UpdateQueueConfigRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public UpdateQueueConfigRequest setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    public UpdateQueueConfigRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public UpdateQueueConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
