// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddQueueRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The deployment set ID. You can obtain the deployment set ID by calling the <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> operation. Only the deployment sets that use low latency policy are supported.</p>
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
     * <p>The name of the queue. The name must be 1 to 63 characters in length and start with a letter. It can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>Specifies whether to use scaling groups of Auto Scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseESS")
    public Boolean useESS;

    public static AddQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        AddQueueRequest self = new AddQueueRequest();
        return TeaModel.build(map, self);
    }

    public AddQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddQueueRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public AddQueueRequest setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    public AddQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public AddQueueRequest setUseESS(Boolean useESS) {
        this.useESS = useESS;
        return this;
    }
    public Boolean getUseESS() {
        return this.useESS;
    }

}
