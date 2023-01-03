// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameRequest extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The type of the cluster.
    @NameInMap("ClusterType")
    public String clusterType;

    // The name of the dashboard.
    @NameInMap("DashBoardName")
    public String dashBoardName;

    // The version of the dashboard.
    @NameInMap("DashBoardVersion")
    public String dashBoardVersion;

    // The type of the data source.
    @NameInMap("DataSourceType")
    public String dataSourceType;

    // The name of the dashboard group.
    @NameInMap("GroupName")
    public String groupName;

    // Specifies whether to display the Grafana dashboard only in the Application Real-Time Monitoring Service (ARMS) console.
    @NameInMap("OnlyQuery")
    public Boolean onlyQuery;

    // The abbreviation of the Alibaba Cloud service name.
    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ListDashboardsByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsByNameRequest self = new ListDashboardsByNameRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardsByNameRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDashboardsByNameRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListDashboardsByNameRequest setDashBoardName(String dashBoardName) {
        this.dashBoardName = dashBoardName;
        return this;
    }
    public String getDashBoardName() {
        return this.dashBoardName;
    }

    public ListDashboardsByNameRequest setDashBoardVersion(String dashBoardVersion) {
        this.dashBoardVersion = dashBoardVersion;
        return this;
    }
    public String getDashBoardVersion() {
        return this.dashBoardVersion;
    }

    public ListDashboardsByNameRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListDashboardsByNameRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListDashboardsByNameRequest setOnlyQuery(Boolean onlyQuery) {
        this.onlyQuery = onlyQuery;
        return this;
    }
    public Boolean getOnlyQuery() {
        return this.onlyQuery;
    }

    public ListDashboardsByNameRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListDashboardsByNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
