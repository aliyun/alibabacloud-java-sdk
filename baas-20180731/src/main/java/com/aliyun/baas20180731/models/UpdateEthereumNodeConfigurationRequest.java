// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumNodeConfigurationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IP")
    public String IP;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodePub")
    public String nodePub;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("P2pPort")
    public Integer p2pPort;

    @NameInMap("RaftPort")
    public Integer raftPort;

    @NameInMap("RpcPort")
    public Integer rpcPort;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TMPort")
    public Integer TMPort;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TMPub")
    public String TMPub;

    @NameInMap("WSPort")
    public Integer WSPort;

    public static UpdateEthereumNodeConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumNodeConfigurationRequest self = new UpdateEthereumNodeConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumNodeConfigurationRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public UpdateEthereumNodeConfigurationRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateEthereumNodeConfigurationRequest setNodePub(String nodePub) {
        this.nodePub = nodePub;
        return this;
    }
    public String getNodePub() {
        return this.nodePub;
    }

    public UpdateEthereumNodeConfigurationRequest setP2pPort(Integer p2pPort) {
        this.p2pPort = p2pPort;
        return this;
    }
    public Integer getP2pPort() {
        return this.p2pPort;
    }

    public UpdateEthereumNodeConfigurationRequest setRaftPort(Integer raftPort) {
        this.raftPort = raftPort;
        return this;
    }
    public Integer getRaftPort() {
        return this.raftPort;
    }

    public UpdateEthereumNodeConfigurationRequest setRpcPort(Integer rpcPort) {
        this.rpcPort = rpcPort;
        return this;
    }
    public Integer getRpcPort() {
        return this.rpcPort;
    }

    public UpdateEthereumNodeConfigurationRequest setTMPort(Integer TMPort) {
        this.TMPort = TMPort;
        return this;
    }
    public Integer getTMPort() {
        return this.TMPort;
    }

    public UpdateEthereumNodeConfigurationRequest setTMPub(String TMPub) {
        this.TMPub = TMPub;
        return this;
    }
    public String getTMPub() {
        return this.TMPub;
    }

    public UpdateEthereumNodeConfigurationRequest setWSPort(Integer WSPort) {
        this.WSPort = WSPort;
        return this;
    }
    public Integer getWSPort() {
        return this.WSPort;
    }

}
