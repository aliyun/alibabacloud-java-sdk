// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeEthereumNodesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodesResponseBody self = new DescribeEthereumNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumNodesResponseBody setResult(java.util.List<DescribeEthereumNodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeEthereumNodesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeEthereumNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumNodesResponseBodyResult extends TeaModel {
        @NameInMap("Consensus")
        public String consensus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("EthereumId")
        public String ethereumId;

        @NameInMap("EthereumName")
        public String ethereumName;

        @NameInMap("External")
        public Boolean external;

        @NameInMap("Id")
        public String id;

        @NameInMap("NetworkId")
        public Long networkId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RpcPort")
        public String rpcPort;

        @NameInMap("State")
        public String state;

        @NameInMap("Validator")
        public Boolean validator;

        @NameInMap("WsPort")
        public String wsPort;

        public static DescribeEthereumNodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumNodesResponseBodyResult self = new DescribeEthereumNodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumNodesResponseBodyResult setConsensus(String consensus) {
            this.consensus = consensus;
            return this;
        }
        public String getConsensus() {
            return this.consensus;
        }

        public DescribeEthereumNodesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeEthereumNodesResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEthereumNodesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEthereumNodesResponseBodyResult setEthereumId(String ethereumId) {
            this.ethereumId = ethereumId;
            return this;
        }
        public String getEthereumId() {
            return this.ethereumId;
        }

        public DescribeEthereumNodesResponseBodyResult setEthereumName(String ethereumName) {
            this.ethereumName = ethereumName;
            return this;
        }
        public String getEthereumName() {
            return this.ethereumName;
        }

        public DescribeEthereumNodesResponseBodyResult setExternal(Boolean external) {
            this.external = external;
            return this;
        }
        public Boolean getExternal() {
            return this.external;
        }

        public DescribeEthereumNodesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEthereumNodesResponseBodyResult setNetworkId(Long networkId) {
            this.networkId = networkId;
            return this;
        }
        public Long getNetworkId() {
            return this.networkId;
        }

        public DescribeEthereumNodesResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeEthereumNodesResponseBodyResult setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeEthereumNodesResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEthereumNodesResponseBodyResult setRpcPort(String rpcPort) {
            this.rpcPort = rpcPort;
            return this;
        }
        public String getRpcPort() {
            return this.rpcPort;
        }

        public DescribeEthereumNodesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEthereumNodesResponseBodyResult setValidator(Boolean validator) {
            this.validator = validator;
            return this;
        }
        public Boolean getValidator() {
            return this.validator;
        }

        public DescribeEthereumNodesResponseBodyResult setWsPort(String wsPort) {
            this.wsPort = wsPort;
            return this;
        }
        public String getWsPort() {
            return this.wsPort;
        }

    }

}
