// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainSubnetNodeListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainSubnetNodeListResponseBodyResult> result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainSubnetNodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainSubnetNodeListResponseBody self = new DescribeAntChainSubnetNodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainSubnetNodeListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainSubnetNodeListResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainSubnetNodeListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainSubnetNodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainSubnetNodeListResponseBody setResult(java.util.List<DescribeAntChainSubnetNodeListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainSubnetNodeListResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeAntChainSubnetNodeListResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainSubnetNodeListResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainSubnetNodeListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList extends TeaModel {
        @NameInMap("DiskTotal")
        public String diskTotal;

        @NameInMap("DiskUse")
        public String diskUse;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodePort")
        public String nodePort;

        @NameInMap("NodeSource")
        public String nodeSource;

        @NameInMap("NodeState")
        public String nodeState;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("PublicKey")
        public String publicKey;

        public static DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList self = new DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setDiskTotal(String diskTotal) {
            this.diskTotal = diskTotal;
            return this;
        }
        public String getDiskTotal() {
            return this.diskTotal;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setDiskUse(String diskUse) {
            this.diskUse = diskUse;
            return this;
        }
        public String getDiskUse() {
            return this.diskUse;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setNodePort(String nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public String getNodePort() {
            return this.nodePort;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setNodeSource(String nodeSource) {
            this.nodeSource = nodeSource;
            return this;
        }
        public String getNodeSource() {
            return this.nodeSource;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setNodeState(String nodeState) {
            this.nodeState = nodeState;
            return this;
        }
        public String getNodeState() {
            return this.nodeState;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

    }

    public static class DescribeAntChainSubnetNodeListResponseBodyResult extends TeaModel {
        @NameInMap("ChainNodeInfoList")
        public java.util.List<DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList> chainNodeInfoList;

        @NameInMap("ConsortiumAdmin")
        public Boolean consortiumAdmin;

        public static DescribeAntChainSubnetNodeListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainSubnetNodeListResponseBodyResult self = new DescribeAntChainSubnetNodeListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainSubnetNodeListResponseBodyResult setChainNodeInfoList(java.util.List<DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList> chainNodeInfoList) {
            this.chainNodeInfoList = chainNodeInfoList;
            return this;
        }
        public java.util.List<DescribeAntChainSubnetNodeListResponseBodyResultChainNodeInfoList> getChainNodeInfoList() {
            return this.chainNodeInfoList;
        }

        public DescribeAntChainSubnetNodeListResponseBodyResult setConsortiumAdmin(Boolean consortiumAdmin) {
            this.consortiumAdmin = consortiumAdmin;
            return this;
        }
        public Boolean getConsortiumAdmin() {
            return this.consortiumAdmin;
        }

    }

}
