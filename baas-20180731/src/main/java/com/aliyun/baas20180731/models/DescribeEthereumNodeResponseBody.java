// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeEthereumNodeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeResponseBody self = new DescribeEthereumNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumNodeResponseBody setResult(DescribeEthereumNodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeEthereumNodeResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeEthereumNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumNodeResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("EthereumId")
        public String ethereumId;

        @NameInMap("EthereumName")
        public String ethereumName;

        @NameInMap("Id")
        public String id;

        @NameInMap("NetworkId")
        public String networkId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RpcPort")
        public Integer rpcPort;

        @NameInMap("State")
        public String state;

        @NameInMap("WsPort")
        public Integer wsPort;

        public static DescribeEthereumNodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumNodeResponseBodyResult self = new DescribeEthereumNodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumNodeResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeEthereumNodeResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEthereumNodeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEthereumNodeResponseBodyResult setEthereumId(String ethereumId) {
            this.ethereumId = ethereumId;
            return this;
        }
        public String getEthereumId() {
            return this.ethereumId;
        }

        public DescribeEthereumNodeResponseBodyResult setEthereumName(String ethereumName) {
            this.ethereumName = ethereumName;
            return this;
        }
        public String getEthereumName() {
            return this.ethereumName;
        }

        public DescribeEthereumNodeResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEthereumNodeResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeEthereumNodeResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeEthereumNodeResponseBodyResult setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeEthereumNodeResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEthereumNodeResponseBodyResult setRpcPort(Integer rpcPort) {
            this.rpcPort = rpcPort;
            return this;
        }
        public Integer getRpcPort() {
            return this.rpcPort;
        }

        public DescribeEthereumNodeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEthereumNodeResponseBodyResult setWsPort(Integer wsPort) {
            this.wsPort = wsPort;
            return this;
        }
        public Integer getWsPort() {
            return this.wsPort;
        }

    }

}
