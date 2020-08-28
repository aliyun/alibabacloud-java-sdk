// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoItemsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ClusterNetworkType")
    @Validation(required = true)
    public String clusterNetworkType;

    @NameInMap("NetInfoItems")
    @Validation(required = true)
    public DescribeDBClusterNetInfoItemsResponseNetInfoItems netInfoItems;

    public static DescribeDBClusterNetInfoItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNetInfoItemsResponse self = new DescribeDBClusterNetInfoItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNetInfoItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterNetInfoItemsResponse setClusterNetworkType(String clusterNetworkType) {
        this.clusterNetworkType = clusterNetworkType;
        return this;
    }
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    public DescribeDBClusterNetInfoItemsResponse setNetInfoItems(DescribeDBClusterNetInfoItemsResponseNetInfoItems netInfoItems) {
        this.netInfoItems = netInfoItems;
        return this;
    }
    public DescribeDBClusterNetInfoItemsResponseNetInfoItems getNetInfoItems() {
        return this.netInfoItems;
    }

    public static class DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem extends TeaModel {
        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("IPAddress")
        @Validation(required = true)
        public String IPAddress;

        @NameInMap("NetType")
        @Validation(required = true)
        public String netType;

        @NameInMap("HttpPort")
        @Validation(required = true)
        public String httpPort;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("JdbcPort")
        @Validation(required = true)
        public String jdbcPort;

        public static DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem self = new DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem setHttpPort(String httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public String getHttpPort() {
            return this.httpPort;
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem setJdbcPort(String jdbcPort) {
            this.jdbcPort = jdbcPort;
            return this;
        }
        public String getJdbcPort() {
            return this.jdbcPort;
        }

    }

    public static class DescribeDBClusterNetInfoItemsResponseNetInfoItems extends TeaModel {
        @NameInMap("NetInfoItem")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem> netInfoItem;

        public static DescribeDBClusterNetInfoItemsResponseNetInfoItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoItemsResponseNetInfoItems self = new DescribeDBClusterNetInfoItemsResponseNetInfoItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoItemsResponseNetInfoItems setNetInfoItem(java.util.List<DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem> netInfoItem) {
            this.netInfoItem = netInfoItem;
            return this;
        }
        public java.util.List<DescribeDBClusterNetInfoItemsResponseNetInfoItemsNetInfoItem> getNetInfoItem() {
            return this.netInfoItem;
        }

    }

}
