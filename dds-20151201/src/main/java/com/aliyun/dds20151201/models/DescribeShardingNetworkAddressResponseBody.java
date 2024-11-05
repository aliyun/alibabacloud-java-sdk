// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeShardingNetworkAddressResponseBody extends TeaModel {
    /**
     * <p>The endpoints of DynamoDB-compatible instances.</p>
     */
    @NameInMap("CompatibleConnections")
    public DescribeShardingNetworkAddressResponseBodyCompatibleConnections compatibleConnections;

    /**
     * <p>The endpoints of the ApsaraDB for MongoDB sharded cluster instance.</p>
     */
    @NameInMap("NetworkAddresses")
    public DescribeShardingNetworkAddressResponseBodyNetworkAddresses networkAddresses;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18D8AAFD-6BEB-420F-8164-810CB0C0AA39</p>
     */
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
        /**
         * <p>The remaining duration of the classic network endpoint. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2591963</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.140.xxx.xx</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxxxxxxxx.mongodb.rds.aliyuncs.com</p>
         */
        @NameInMap("NetworkAddress")
        public String networkAddress;

        /**
         * <p>The network type of the instance.</p>
         * <ul>
         * <li><strong>VPC</strong>: virtual private cloud</li>
         * <li><strong>Classic</strong>: classic network</li>
         * <li><strong>Public</strong>: the Internet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The port that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3717</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The VPC ID of the instance.</p>
         * <blockquote>
         * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bpxxxxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch in the Virtual Private Cloud (VPC).</p>
         * <blockquote>
         * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bpxxxxxxxx</p>
         */
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
        /**
         * <p>The public endpoint type. Valid values:</p>
         * <ul>
         * <li><strong>SRV</strong></li>
         * <li><strong>Normal</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SRV</p>
         */
        @NameInMap("ConnectionType")
        public String connectionType;

        /**
         * <p>The remaining duration of the classic network endpoint. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2591963</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.140.xxx.xx</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The connection string of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
         */
        @NameInMap("NetworkAddress")
        public String networkAddress;

        /**
         * <p>The network type of the instance.</p>
         * <ul>
         * <li><strong>VPC</strong>: virtual private cloud</li>
         * <li><strong>Classic</strong>: classic network</li>
         * <li><strong>Public</strong>: the Internet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The ID of the mongos node.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bpxxxxxxxx</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li><strong>mongos</strong>: mongos node</li>
         * <li><strong>shard</strong>: shard node</li>
         * <li><strong>configserver</strong>: Configserver node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mongos</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3717</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li>Primary</li>
         * <li>Secondary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Txt record which can be used to store MongoDB-related meta data, such as version, configuration parameters and etc. With the combination of txt record and other technology, for example SRV record, the MongoDB client can complete the complex service discovery and configuration passing.</p>
         * 
         * <strong>example:</strong>
         * <p>mongo.example.com. IN TXT &quot;config=replicaSet=myReplicaSet&quot;</p>
         */
        @NameInMap("TxtRecord")
        public String txtRecord;

        /**
         * <p>The VPC ID of the instance.</p>
         * <blockquote>
         * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bpxxxxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch in the VPC.</p>
         * <blockquote>
         * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bpxxxxxxxx</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress self = new DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress();
            return TeaModel.build(map, self);
        }

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
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

        public DescribeShardingNetworkAddressResponseBodyNetworkAddressesNetworkAddress setTxtRecord(String txtRecord) {
            this.txtRecord = txtRecord;
            return this;
        }
        public String getTxtRecord() {
            return this.txtRecord;
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
