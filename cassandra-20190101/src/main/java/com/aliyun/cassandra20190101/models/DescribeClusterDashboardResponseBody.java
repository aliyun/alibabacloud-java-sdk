// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterDashboardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Dashboard")
    public DescribeClusterDashboardResponseBodyDashboard dashboard;

    public static DescribeClusterDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDashboardResponseBody self = new DescribeClusterDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterDashboardResponseBody setDashboard(DescribeClusterDashboardResponseBodyDashboard dashboard) {
        this.dashboard = dashboard;
        return this;
    }
    public DescribeClusterDashboardResponseBodyDashboard getDashboard() {
        return this.dashboard;
    }

    public static class DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Address")
        public String address;

        @NameInMap("Load")
        public String load;

        public static DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode self = new DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode setLoad(String load) {
            this.load = load;
            return this;
        }
        public String getLoad() {
            return this.load;
        }

    }

    public static class DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes extends TeaModel {
        @NameInMap("Node")
        public java.util.List<DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode> node;

        public static DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes self = new DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes setNode(java.util.List<DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodesNode> getNode() {
            return this.node;
        }

    }

    public static class DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter extends TeaModel {
        @NameInMap("Nodes")
        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes nodes;

        @NameInMap("DataCenterId")
        public String dataCenterId;

        public static DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter self = new DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter setNodes(DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes nodes) {
            this.nodes = nodes;
            return this;
        }
        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenterNodes getNodes() {
            return this.nodes;
        }

        public DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

    }

    public static class DescribeClusterDashboardResponseBodyDashboardDataCenters extends TeaModel {
        @NameInMap("DataCenter")
        public java.util.List<DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter> dataCenter;

        public static DescribeClusterDashboardResponseBodyDashboardDataCenters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDashboardResponseBodyDashboardDataCenters self = new DescribeClusterDashboardResponseBodyDashboardDataCenters();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDashboardResponseBodyDashboardDataCenters setDataCenter(java.util.List<DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter> dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public java.util.List<DescribeClusterDashboardResponseBodyDashboardDataCentersDataCenter> getDataCenter() {
            return this.dataCenter;
        }

    }

    public static class DescribeClusterDashboardResponseBodyDashboard extends TeaModel {
        @NameInMap("DataCenters")
        public DescribeClusterDashboardResponseBodyDashboardDataCenters dataCenters;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClusterDashboardResponseBodyDashboard build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDashboardResponseBodyDashboard self = new DescribeClusterDashboardResponseBodyDashboard();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDashboardResponseBodyDashboard setDataCenters(DescribeClusterDashboardResponseBodyDashboardDataCenters dataCenters) {
            this.dataCenters = dataCenters;
            return this;
        }
        public DescribeClusterDashboardResponseBodyDashboardDataCenters getDataCenters() {
            return this.dataCenters;
        }

        public DescribeClusterDashboardResponseBodyDashboard setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
