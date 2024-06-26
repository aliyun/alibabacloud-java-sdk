// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeConfigurationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeEthereumNodeConfigurationResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumNodeConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeConfigurationResponseBody self = new DescribeEthereumNodeConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeConfigurationResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumNodeConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumNodeConfigurationResponseBody setResult(java.util.List<DescribeEthereumNodeConfigurationResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeEthereumNodeConfigurationResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeEthereumNodeConfigurationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumNodeConfigurationResponseBodyResult extends TeaModel {
        @NameInMap("GenesisJson")
        public String genesisJson;

        @NameInMap("IP")
        public String IP;

        @NameInMap("NodePub")
        public String nodePub;

        @NameInMap("P2pPort")
        public Integer p2pPort;

        @NameInMap("PermissionedNodesJson")
        public String permissionedNodesJson;

        @NameInMap("RaftPort")
        public Integer raftPort;

        @NameInMap("RpcPort")
        public Integer rpcPort;

        @NameInMap("StaticNodesJson")
        public String staticNodesJson;

        @NameInMap("TMJson")
        public String TMJson;

        @NameInMap("TMPort")
        public Integer TMPort;

        @NameInMap("TMPub")
        public String TMPub;

        @NameInMap("WSPort")
        public Integer WSPort;

        public static DescribeEthereumNodeConfigurationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumNodeConfigurationResponseBodyResult self = new DescribeEthereumNodeConfigurationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setGenesisJson(String genesisJson) {
            this.genesisJson = genesisJson;
            return this;
        }
        public String getGenesisJson() {
            return this.genesisJson;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setNodePub(String nodePub) {
            this.nodePub = nodePub;
            return this;
        }
        public String getNodePub() {
            return this.nodePub;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setP2pPort(Integer p2pPort) {
            this.p2pPort = p2pPort;
            return this;
        }
        public Integer getP2pPort() {
            return this.p2pPort;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setPermissionedNodesJson(String permissionedNodesJson) {
            this.permissionedNodesJson = permissionedNodesJson;
            return this;
        }
        public String getPermissionedNodesJson() {
            return this.permissionedNodesJson;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setRaftPort(Integer raftPort) {
            this.raftPort = raftPort;
            return this;
        }
        public Integer getRaftPort() {
            return this.raftPort;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setRpcPort(Integer rpcPort) {
            this.rpcPort = rpcPort;
            return this;
        }
        public Integer getRpcPort() {
            return this.rpcPort;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setStaticNodesJson(String staticNodesJson) {
            this.staticNodesJson = staticNodesJson;
            return this;
        }
        public String getStaticNodesJson() {
            return this.staticNodesJson;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setTMJson(String TMJson) {
            this.TMJson = TMJson;
            return this;
        }
        public String getTMJson() {
            return this.TMJson;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setTMPort(Integer TMPort) {
            this.TMPort = TMPort;
            return this;
        }
        public Integer getTMPort() {
            return this.TMPort;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setTMPub(String TMPub) {
            this.TMPub = TMPub;
            return this;
        }
        public String getTMPub() {
            return this.TMPub;
        }

        public DescribeEthereumNodeConfigurationResponseBodyResult setWSPort(Integer WSPort) {
            this.WSPort = WSPort;
            return this;
        }
        public Integer getWSPort() {
            return this.WSPort;
        }

    }

}
