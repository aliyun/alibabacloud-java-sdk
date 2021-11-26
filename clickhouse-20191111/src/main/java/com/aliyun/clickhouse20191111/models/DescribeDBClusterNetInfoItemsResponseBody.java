// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoItemsResponseBody extends TeaModel {
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    @NameInMap("NetInfoItems")
    public DescribeDBClusterNetInfoItemsResponseBodyNetInfoItems netInfoItems;

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
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("HttpPort")
        public String httpPort;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("JdbcPort")
        public String jdbcPort;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
