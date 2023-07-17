// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListDashboardsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Product")
    public String product;

    @NameInMap("RecreateSwitch")
    public Boolean recreateSwitch;

    @NameInMap("RegionId")
    public String regionId;

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
