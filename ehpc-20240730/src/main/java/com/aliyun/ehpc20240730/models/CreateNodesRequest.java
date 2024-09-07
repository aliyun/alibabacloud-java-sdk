// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComputeNode")
    public NodeTemplate computeNode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("HPCInterConnect")
    public String HPCInterConnect;

    /**
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("HostnamePrefix")
    public String hostnamePrefix;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("HostnameSuffix")
    public String hostnameSuffix;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepAlive")
    public String keepAlive;

    /**
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForOOSBandwidthScheduler</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1lfcjbfb099rrjn****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodesRequest self = new CreateNodesRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodesRequest setComputeNode(NodeTemplate computeNode) {
        this.computeNode = computeNode;
        return this;
    }
    public NodeTemplate getComputeNode() {
        return this.computeNode;
    }

    public CreateNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public CreateNodesRequest setHPCInterConnect(String HPCInterConnect) {
        this.HPCInterConnect = HPCInterConnect;
        return this;
    }
    public String getHPCInterConnect() {
        return this.HPCInterConnect;
    }

    public CreateNodesRequest setHostnamePrefix(String hostnamePrefix) {
        this.hostnamePrefix = hostnamePrefix;
        return this;
    }
    public String getHostnamePrefix() {
        return this.hostnamePrefix;
    }

    public CreateNodesRequest setHostnameSuffix(String hostnameSuffix) {
        this.hostnameSuffix = hostnameSuffix;
        return this;
    }
    public String getHostnameSuffix() {
        return this.hostnameSuffix;
    }

    public CreateNodesRequest setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public String getKeepAlive() {
        return this.keepAlive;
    }

    public CreateNodesRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateNodesRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateNodesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
