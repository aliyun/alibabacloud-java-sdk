// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumNodeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateEthereumNodeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateEthereumNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumNodeResponseBody self = new UpdateEthereumNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumNodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdateEthereumNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEthereumNodeResponseBody setResult(UpdateEthereumNodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateEthereumNodeResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateEthereumNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateEthereumNodeResponseBodyResult extends TeaModel {
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

        public static UpdateEthereumNodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateEthereumNodeResponseBodyResult self = new UpdateEthereumNodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateEthereumNodeResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateEthereumNodeResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateEthereumNodeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateEthereumNodeResponseBodyResult setEthereumId(String ethereumId) {
            this.ethereumId = ethereumId;
            return this;
        }
        public String getEthereumId() {
            return this.ethereumId;
        }

        public UpdateEthereumNodeResponseBodyResult setEthereumName(String ethereumName) {
            this.ethereumName = ethereumName;
            return this;
        }
        public String getEthereumName() {
            return this.ethereumName;
        }

        public UpdateEthereumNodeResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateEthereumNodeResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public UpdateEthereumNodeResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public UpdateEthereumNodeResponseBodyResult setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public UpdateEthereumNodeResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEthereumNodeResponseBodyResult setRpcPort(Integer rpcPort) {
            this.rpcPort = rpcPort;
            return this;
        }
        public Integer getRpcPort() {
            return this.rpcPort;
        }

        public UpdateEthereumNodeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateEthereumNodeResponseBodyResult setWsPort(Integer wsPort) {
            this.wsPort = wsPort;
            return this;
        }
        public Integer getWsPort() {
            return this.wsPort;
        }

    }

}
