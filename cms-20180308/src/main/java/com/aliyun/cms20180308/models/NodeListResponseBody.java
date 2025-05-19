// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Nodes")
    public NodeListResponseBodyNodes nodes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageTotal")
    public Integer pageTotal;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static NodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NodeListResponseBody self = new NodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public NodeListResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public NodeListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NodeListResponseBody setNodes(NodeListResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public NodeListResponseBodyNodes getNodes() {
        return this.nodes;
    }

    public NodeListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public NodeListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public NodeListResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    public NodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NodeListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public NodeListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class NodeListResponseBodyNodesNode extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AliyunHost")
        public Boolean aliyunHost;

        @NameInMap("EipAddress")
        public String eipAddress;

        @NameInMap("EipId")
        public String eipId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("IpGroup")
        public String ipGroup;

        @NameInMap("NatIp")
        public String natIp;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("OperatingSystem")
        public String operatingSystem;

        @NameInMap("Region")
        public String region;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("TianjimonVersion")
        public String tianjimonVersion;

        public static NodeListResponseBodyNodesNode build(java.util.Map<String, ?> map) throws Exception {
            NodeListResponseBodyNodesNode self = new NodeListResponseBodyNodesNode();
            return TeaModel.build(map, self);
        }

        public NodeListResponseBodyNodesNode setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public NodeListResponseBodyNodesNode setAliyunHost(Boolean aliyunHost) {
            this.aliyunHost = aliyunHost;
            return this;
        }
        public Boolean getAliyunHost() {
            return this.aliyunHost;
        }

        public NodeListResponseBodyNodesNode setEipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public String getEipAddress() {
            return this.eipAddress;
        }

        public NodeListResponseBodyNodesNode setEipId(String eipId) {
            this.eipId = eipId;
            return this;
        }
        public String getEipId() {
            return this.eipId;
        }

        public NodeListResponseBodyNodesNode setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public NodeListResponseBodyNodesNode setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public NodeListResponseBodyNodesNode setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public NodeListResponseBodyNodesNode setIpGroup(String ipGroup) {
            this.ipGroup = ipGroup;
            return this;
        }
        public String getIpGroup() {
            return this.ipGroup;
        }

        public NodeListResponseBodyNodesNode setNatIp(String natIp) {
            this.natIp = natIp;
            return this;
        }
        public String getNatIp() {
            return this.natIp;
        }

        public NodeListResponseBodyNodesNode setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public NodeListResponseBodyNodesNode setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public NodeListResponseBodyNodesNode setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public NodeListResponseBodyNodesNode setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public NodeListResponseBodyNodesNode setTianjimonVersion(String tianjimonVersion) {
            this.tianjimonVersion = tianjimonVersion;
            return this;
        }
        public String getTianjimonVersion() {
            return this.tianjimonVersion;
        }

    }

    public static class NodeListResponseBodyNodes extends TeaModel {
        @NameInMap("Node")
        public java.util.List<NodeListResponseBodyNodesNode> node;

        public static NodeListResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            NodeListResponseBodyNodes self = new NodeListResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public NodeListResponseBodyNodes setNode(java.util.List<NodeListResponseBodyNodesNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<NodeListResponseBodyNodesNode> getNode() {
            return this.node;
        }

    }

}
