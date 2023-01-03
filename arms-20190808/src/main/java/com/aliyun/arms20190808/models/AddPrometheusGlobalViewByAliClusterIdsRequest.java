// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewByAliClusterIdsRequest extends TeaModel {
    // The list of cluster IDs. You can specify multiple cluster IDs and separate them with commas (,).
    @NameInMap("ClusterIds")
    public String clusterIds;

    // The name of the aggregation instance.
    @NameInMap("GroupName")
    public String groupName;

    // The identifier to identify the service if custom dashboards are created for the specified clusters.
    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static AddPrometheusGlobalViewByAliClusterIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewByAliClusterIdsRequest self = new AddPrometheusGlobalViewByAliClusterIdsRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setClusterIds(String clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public String getClusterIds() {
        return this.clusterIds;
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
