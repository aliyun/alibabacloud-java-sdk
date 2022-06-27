// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("DashBoardName")
    public String dashBoardName;

    @NameInMap("DashBoardVersion")
    public String dashBoardVersion;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("OnlyQuery")
    public Boolean onlyQuery;

    @NameInMap("ProductCode")
    public String productCode;

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
