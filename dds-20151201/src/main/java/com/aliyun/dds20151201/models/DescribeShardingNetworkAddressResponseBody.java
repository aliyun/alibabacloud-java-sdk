// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeShardingNetworkAddressResponseBody extends TeaModel {
    @NameInMap("CompatibleConnections")
    public DescribeShardingNetworkAddressResponseBodyCompatibleConnections compatibleConnections;

    @NameInMap("NetworkAddresses")
    public DescribeShardingNetworkAddressResponseBodyNetworkAddresses networkAddresses;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeShardingNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardingNetworkAddressResponseBody self = new DescribeShardingNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShardingNetworkAddressResponseBody setCompatibleConnections(DescribeShardingNetworkAddressResponseBodyCompatibleConnections compatibleConnections) {
        this.compatibleConnections = compatibleConnections;
        return this;
    }
    public DescribeShardingNetworkAddressResponseBodyCompatibleConnections getCompatibleConnections() {
        return this.compatibleConnections;
    }

    public DescribeShardingNetworkAddressResponseBody setNetworkAddresses(DescribeShardingNetworkAddressResponseBodyNetworkAddresses networkAddresses) {
        this.networkAddresses = networkAddresses;
        return this;
    }
    public DescribeShardingNetworkAddressResponseBodyNetworkAddresses getNetworkAddresses() {
        return this.networkAddresses;
    }

    public DescribeShardingNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection extends TeaModel {
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetworkAddress")
        public String networkAddress;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Port")
        public String port;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection self = new DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection();
            return TeaModel.build(map, self);
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection setNetworkAddress(String networkAddress) {
            this.networkAddress = networkAddress;
            return this;
        }
        public String getNetworkAddress() {
            return this.networkAddress;
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeShardingNetworkAddressResponseBodyCompatibleConnections extends TeaModel {
        @NameInMap("CompatibleConnection")
        public java.util.List<DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection> compatibleConnection;

        public static DescribeShardingNetworkAddressResponseBodyCompatibleConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardingNetworkAddressResponseBodyCompatibleConnections self = new DescribeShardingNetworkAddressResponseBodyCompatibleConnections();
            return TeaModel.build(map, self);
        }

        public DescribeShardingNetworkAddressResponseBodyCompatibleConnections setCompatibleConnection(java.util.List<DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection> compatibleConnection) {
            this.compatibleConnection = compatibleConnection;
            return this;
        }
        public java.util.List<DescribeShardingNetworkAddressResponseBodyCompatibleConnectionsCompatibleConnection> getCompatibleConnection() {
            return this.compatibleConnection;
        }

    }

    public static class DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress extends TeaModel {
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetworkAddress")
        public String networkAddress;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Port")
        public String port;

        @NameInMap("Role")
        public String role;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress self = new DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress();
            return TeaModel.build(map, self);
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setNetworkAddress(String networkAddress) {
            this.networkAddress = networkAddress;
            return this;
        }
        public String getNetworkAddress() {
            return this.networkAddress;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeShardingNetworkAddressResponseBodyNetworkAddresses extends TeaModel {
        @NameInMap("NetworkAddress")
        public java.util.List<DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress> networkAddress;

        public static DescribeShardingNetworkAddressResponseBodyNetworkAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardingNetworkAddressResponseBodyNetworkAddresses self = new DescribeShardingNetworkAddressResponseBodyNetworkAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddresses setNetworkAddress(java.util.List<DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress> networkAddress) {
            this.networkAddress = networkAddress;
            return this;
        }
        public java.util.List<DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress> getNetworkAddress() {
            return this.networkAddress;
        }

    }

}
