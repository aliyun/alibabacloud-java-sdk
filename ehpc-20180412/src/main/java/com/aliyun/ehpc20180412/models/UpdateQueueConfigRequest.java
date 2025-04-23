// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateQueueConfigRequest extends TeaModel {
    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The instance type of the node.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188592.html">ListPreferredEcsTypes</a> operation to query the recommended instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.n1.tiny</p>
     */
    @NameInMap("ComputeInstanceType")
    public String computeInstanceType;

    /**
     * <p>The ID of the deployment set. You can obtain the deployment set ID by calling the <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> operation. Only the deployment sets that use low latency policy are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1frxuzdg87zh4pzq****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The communication mode of the elastic network interface (ENI). Valid values:</p>
     * <ul>
     * <li>Standard: uses the TCP communication mode.</li>
     * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    /**
     * <p>The name of the queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workq</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The resource group ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the IDs of resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
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
