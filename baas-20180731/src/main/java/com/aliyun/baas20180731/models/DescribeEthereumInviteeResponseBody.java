// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumInviteeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeEthereumInviteeResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumInviteeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumInviteeResponseBody self = new DescribeEthereumInviteeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumInviteeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumInviteeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumInviteeResponseBody setResult(java.util.List<DescribeEthereumInviteeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeEthereumInviteeResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeEthereumInviteeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumInviteeResponseBodyResult extends TeaModel {
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

        @NameInMap("WsPort")
        public String wsPort;

        public static DescribeEthereumInviteeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumInviteeResponseBodyResult self = new DescribeEthereumInviteeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumInviteeResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeEthereumInviteeResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEthereumInviteeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEthereumInviteeResponseBodyResult setEthereumId(String ethereumId) {
            this.ethereumId = ethereumId;
            return this;
        }
        public String getEthereumId() {
            return this.ethereumId;
        }

        public DescribeEthereumInviteeResponseBodyResult setEthereumName(String ethereumName) {
            this.ethereumName = ethereumName;
            return this;
        }
        public String getEthereumName() {
            return this.ethereumName;
        }

        public DescribeEthereumInviteeResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEthereumInviteeResponseBodyResult setNetworkId(Long networkId) {
            this.networkId = networkId;
            return this;
        }
        public Long getNetworkId() {
            return this.networkId;
        }

        public DescribeEthereumInviteeResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeEthereumInviteeResponseBodyResult setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeEthereumInviteeResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEthereumInviteeResponseBodyResult setRpcPort(String rpcPort) {
            this.rpcPort = rpcPort;
            return this;
        }
        public String getRpcPort() {
            return this.rpcPort;
        }

        public DescribeEthereumInviteeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEthereumInviteeResponseBodyResult setWsPort(String wsPort) {
            this.wsPort = wsPort;
            return this;
        }
        public String getWsPort() {
            return this.wsPort;
        }

    }

}
