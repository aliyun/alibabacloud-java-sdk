// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterNetInfoResponseBody extends TeaModel {
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    @NameInMap("Items")
    public DescribeClusterNetInfoResponseBodyItems items;

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

    public static class DescribeClusterNetInfoResponseBodyItemsAddress extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("ConnectionStringPrefix")
        public String connectionStringPrefix;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public String port;

        @NameInMap("VPCId")
        public String VPCId;

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
