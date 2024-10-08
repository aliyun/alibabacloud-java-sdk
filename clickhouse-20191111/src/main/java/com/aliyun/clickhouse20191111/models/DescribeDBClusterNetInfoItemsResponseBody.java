// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoItemsResponseBody extends TeaModel {
    /**
     * <p>The network type of the cluster. Only VPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    /**
     * <p>Indicates whether Server Load Balancer (SLB) is activated in the VPC. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSLB")
    public Boolean enableSLB;

    /**
     * <p>The network information about the cluster.</p>
     */
    @NameInMap("NetInfoItems")
    public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems netInfoItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterNetInfoItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNetInfoItemsResponseBody self = new DescribeDBClusterNetInfoItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNetInfoItemsResponseBody setClusterNetworkType(String clusterNetworkType) {
        this.clusterNetworkType = clusterNetworkType;
        return this;
    }
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    public DescribeDBClusterNetInfoItemsResponseBody setEnableSLB(Boolean enableSLB) {
        this.enableSLB = enableSLB;
        return this;
    }
    public Boolean getEnableSLB() {
        return this.enableSLB;
    }

    public DescribeDBClusterNetInfoItemsResponseBody setNetInfoItems(DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems netInfoItems) {
        this.netInfoItems = netInfoItems;
        return this;
    }
    public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems getNetInfoItems() {
        return this.netInfoItems;
    }

    public DescribeDBClusterNetInfoItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem extends TeaModel {
        /**
         * <p>The endpoint that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1554t789i8e****.clickhouse.ads.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The HTTP port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8123</p>
         */
        @NameInMap("HttpPort")
        public String httpPort;

        /**
         * <p>The HTTPS port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8443</p>
         */
        @NameInMap("HttpsPort")
        public String httpsPort;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.255.234.251</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The port number that is used in Java Database Connectivity (JDBC).</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("JdbcPort")
        public String jdbcPort;

        /**
         * <p>The port of the MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9004</p>
         */
        @NameInMap("MySQLPort")
        public String mySQLPort;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li>Public: public endpoint</li>
         * <li>VPC: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The vSwitch ID.</p>
         * <blockquote>
         * <p> If the value of the NetType parameter is set to Public, an empty string is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1gzt31twhlo0sa5****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * <blockquote>
         * <p> If the value of the NetType parameter is set to Public, an empty string is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp175iuvg8nxqraf2****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem self = new DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setHttpPort(String httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public String getHttpPort() {
            return this.httpPort;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setHttpsPort(String httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public String getHttpsPort() {
            return this.httpsPort;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setJdbcPort(String jdbcPort) {
            this.jdbcPort = jdbcPort;
            return this;
        }
        public String getJdbcPort() {
            return this.jdbcPort;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setMySQLPort(String mySQLPort) {
            this.mySQLPort = mySQLPort;
            return this;
        }
        public String getMySQLPort() {
            return this.mySQLPort;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems extends TeaModel {
        @NameInMap("NetInfoItem")
        public java.util.List<DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem> netInfoItem;

        public static DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems self = new DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems setNetInfoItem(java.util.List<DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem> netInfoItem) {
            this.netInfoItem = netInfoItem;
            return this;
        }
        public java.util.List<DescribeDBClusterNetInfoItemsResponseBodyNetInfoItemsNetInfoItem> getNetInfoItem() {
            return this.netInfoItem;
        }

    }

}
