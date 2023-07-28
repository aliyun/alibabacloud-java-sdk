// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoResponseBody extends TeaModel {
    /**
     * <p>The network type of the cluster.</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    /**
     * <p>The network information of the cluster.</p>
     */
    @NameInMap("Items")
    public DescribeDBClusterNetInfoResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNetInfoResponseBody self = new DescribeDBClusterNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNetInfoResponseBody setClusterNetworkType(String clusterNetworkType) {
        this.clusterNetworkType = clusterNetworkType;
        return this;
    }
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    public DescribeDBClusterNetInfoResponseBody setItems(DescribeDBClusterNetInfoResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClusterNetInfoResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBClusterNetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterNetInfoResponseBodyItemsAddress extends TeaModel {
        /**
         * <p>The endpoint of the cluster.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The prefix of the cluster endpoint.</p>
         */
        @NameInMap("ConnectionStringPrefix")
        public String connectionStringPrefix;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Public**: public endpoint</p>
         * <p>*   **VPC**: Virtual Private Cloud (VPC) endpoint</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number that is used to connect to the cluster.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the VPC.</p>
         * <br>
         * <p>>  This parameter is empty when Public is returned for NetType.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch.</p>
         * <br>
         * <p>>  This parameter is empty when Public is returned for NetType.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBClusterNetInfoResponseBodyItemsAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyItemsAddress self = new DescribeDBClusterNetInfoResponseBodyItemsAddress();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyItemsAddress setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterNetInfoResponseBodyItemsAddress setConnectionStringPrefix(String connectionStringPrefix) {
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }
        public String getConnectionStringPrefix() {
            return this.connectionStringPrefix;
        }

        public DescribeDBClusterNetInfoResponseBodyItemsAddress setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterNetInfoResponseBodyItemsAddress setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterNetInfoResponseBodyItemsAddress setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterNetInfoResponseBodyItemsAddress setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterNetInfoResponseBodyItemsAddress setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBClusterNetInfoResponseBodyItems extends TeaModel {
        @NameInMap("Address")
        public java.util.List<DescribeDBClusterNetInfoResponseBodyItemsAddress> address;

        public static DescribeDBClusterNetInfoResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyItems self = new DescribeDBClusterNetInfoResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyItems setAddress(java.util.List<DescribeDBClusterNetInfoResponseBodyItemsAddress> address) {
            this.address = address;
            return this;
        }
        public java.util.List<DescribeDBClusterNetInfoResponseBodyItemsAddress> getAddress() {
            return this.address;
        }

    }

}
