// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsRequest extends TeaModel {
    // The ID of the Container Service for Kubernetes cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The type of the cluster. Valid values: ACK, ASK, cloud-product-prometheus, and Node. You can query the dashboards of a virtual cluster by specifying the cluster type. For InfluxDB, set this parameter to `cloud-product-prometheus`.
    @NameInMap("ClusterType")
    public String clusterType;

    // The unique names of the dashboards. You can query dashboards by specifying their names. The **dashboard title** can be changed whereas the **dashboard name** cannot. You can specify multiple names and separate them with commas (,), for example, `k8s-event,k8s-overview`. A dashboard may have multiple versions. If you want to specify a version, you can add version information after the name, for example, `k8s-event:v1,k8s-overview:latest`.
    @NameInMap("DashboardName")
    public String dashboardName;

    // The language of the Grafana dashboards.
    @NameInMap("Language")
    public String language;

    // The product code. This parameter is required if you set the ClusterType parameter to `cloud-product-prometheus`. Valid values:
    // 
    // *   InfluxDB
    // *   MongoDB
    // *   DLA
    // *   SAE
    @NameInMap("Product")
    public String product;

    // Specifies whether to create or query a virtual cluster. This parameter provides backward compatibility.
    @NameInMap("RecreateSwitch")
    public Boolean recreateSwitch;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The dashboard title. The dashboard title can be changed. We recommend that you specify the **DashboardName** parameter.
    @NameInMap("Title")
    public String title;

    public static ListDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsRequest self = new ListDashboardsRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDashboardsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListDashboardsRequest setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }
    public String getDashboardName() {
        return this.dashboardName;
    }

    public ListDashboardsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListDashboardsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListDashboardsRequest setRecreateSwitch(Boolean recreateSwitch) {
        this.recreateSwitch = recreateSwitch;
        return this;
    }
    public Boolean getRecreateSwitch() {
        return this.recreateSwitch;
    }

    public ListDashboardsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDashboardsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
