// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameRequest extends TeaModel {
    /**
     * <p>The ID of the cluster. If the ClusterType parameter is not set to <code>cloud-product-prometheus</code> or <code>cms-enterprise-prometheus</code>, you must specify the ClusterId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li>vpc-prometheus</li>
     * <li>cloud-product-prometheus</li>
     * <li>cms-enterprise-prometheus</li>
     * <li>ExternalKubernetes</li>
     * <li>Ask</li>
     * <li>Kubernetes</li>
     * <li>ManagedKubernetes</li>
     * <li>remote-write-prometheus</li>
     * <li>GlobalViewV2</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud-product-prometheus</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The name of the dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>edas-ingress-url</p>
     */
    @NameInMap("DashBoardName")
    public String dashBoardName;

    /**
     * <p>The version of the dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("DashBoardVersion")
    public String dashBoardVersion;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li>loki</li>
     * <li>prometheus</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>loki</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the dashboard group.</p>
     * 
     * <strong>example:</strong>
     * <p>EDAS</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to display the Grafana dashboard only in the Application Real-Time Monitoring Service (ARMS) console.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyQuery")
    public Boolean onlyQuery;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * 
     * <strong>example:</strong>
     * <p>edas</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
