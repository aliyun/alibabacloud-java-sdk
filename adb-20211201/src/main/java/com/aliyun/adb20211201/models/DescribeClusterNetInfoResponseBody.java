// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterNetInfoResponseBody extends TeaModel {
    /**
     * <p>The network type of the cluster. Only the Virtual Private Cloud (VPC) network type is supported. <strong>VPC</strong> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    /**
     * <p>The network information about the cluster.</p>
     */
    @NameInMap("Items")
    public DescribeClusterNetInfoResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69A29B65-CD0C-52B1-BE42-8B454569747F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetInfoResponseBody self = new DescribeClusterNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetInfoResponseBody setClusterNetworkType(String clusterNetworkType) {
        this.clusterNetworkType = clusterNetworkType;
        return this;
    }
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    public DescribeClusterNetInfoResponseBody setItems(DescribeClusterNetInfoResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeClusterNetInfoResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeClusterNetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts extends TeaModel {
        @NameInMap("Port")
        public String port;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts self = new DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeClusterNetInfoResponseBodyItemsAddressPorts extends TeaModel {
        @NameInMap("ports")
        public java.util.List<DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts> ports;

        public static DescribeClusterNetInfoResponseBodyItemsAddressPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNetInfoResponseBodyItemsAddressPorts self = new DescribeClusterNetInfoResponseBodyItemsAddressPorts();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNetInfoResponseBodyItemsAddressPorts setPorts(java.util.List<DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeClusterNetInfoResponseBodyItemsAddressPortsPorts> getPorts() {
            return this.ports;
        }

    }

    public static class DescribeClusterNetInfoResponseBodyItemsAddress extends TeaModel {
        /**
         * <p>The endpoint of the cluster.</p>
         * <ul>
         * <li>If the network type of the cluster is VPC, the VPC endpoint of the cluster is returned.</li>
         * <li>If the network type of the cluster is Public, the public endpoint of the cluster is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amv-wz9dqvn0o7****.ads.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The prefix of the endpoint.</p>
         * <ul>
         * <li>If the network type of the cluster is VPC, the prefix of the private endpoint is returned.</li>
         * <li>If the network type of the cluster is Public, the prefix of the public endpoint is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amv-wz9dqvn0o7****</p>
         */
        @NameInMap("ConnectionStringPrefix")
        public String connectionStringPrefix;

        /**
         * <p>The IP address of the endpoint.</p>
         * <ul>
         * <li>If the network type of the cluster is VPC, the IP address of the private endpoint is returned.</li>
         * <li>If the network type of the cluster is Public, the IP address of the public endpoint is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: Internet.</li>
         * <li><strong>VPC</strong>: VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number that is used to connect to the cluster. <strong>3306</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        @NameInMap("Ports")
        public DescribeClusterNetInfoResponseBodyItemsAddressPorts ports;

        /**
         * <p>The VPC ID.</p>
         * <blockquote>
         * <p>If NetType is set to Public, an empty string is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbhucmd5b****</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID of the cluster.</p>
         * <blockquote>
         * <p>If NetType is set to Public, an empty string is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1syh8vvw8yec****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeClusterNetInfoResponseBodyItemsAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNetInfoResponseBodyItemsAddress self = new DescribeClusterNetInfoResponseBodyItemsAddress();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setConnectionStringPrefix(String connectionStringPrefix) {
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }
        public String getConnectionStringPrefix() {
            return this.connectionStringPrefix;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setPorts(DescribeClusterNetInfoResponseBodyItemsAddressPorts ports) {
            this.ports = ports;
            return this;
        }
        public DescribeClusterNetInfoResponseBodyItemsAddressPorts getPorts() {
            return this.ports;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeClusterNetInfoResponseBodyItemsAddress setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeClusterNetInfoResponseBodyItems extends TeaModel {
        @NameInMap("Address")
        public java.util.List<DescribeClusterNetInfoResponseBodyItemsAddress> address;

        public static DescribeClusterNetInfoResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNetInfoResponseBodyItems self = new DescribeClusterNetInfoResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNetInfoResponseBodyItems setAddress(java.util.List<DescribeClusterNetInfoResponseBodyItemsAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<DescribeClusterNetInfoResponseBodyItemsAddress> getAddress() {
            return this.address;
        }

    }

}
