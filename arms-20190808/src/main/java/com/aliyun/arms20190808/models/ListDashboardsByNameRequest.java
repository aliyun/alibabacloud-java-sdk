// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the cluster.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The name of the dashboard.</p>
     */
    @NameInMap("DashBoardName")
    public String dashBoardName;

    /**
     * <p>The version of the dashboard.</p>
     */
    @NameInMap("DashBoardVersion")
    public String dashBoardVersion;

    /**
     * <p>The type of the data source.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the dashboard group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to display the Grafana dashboard only in the Application Real-Time Monitoring Service (ARMS) console.</p>
     */
    @NameInMap("OnlyQuery")
    public Boolean onlyQuery;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the region.</p>
     */
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
