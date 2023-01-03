// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddAliClusterIdsToPrometheusGlobalViewRequest extends TeaModel {
    // The list of cluster IDs. You can specify multiple cluster IDs and separate them with commas (,).
    @NameInMap("ClusterIds")
    public String clusterIds;

    // The ID of the aggregation instance.
    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    // The name of the aggregation instance.
    @NameInMap("GroupName")
    public String groupName;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static AddAliClusterIdsToPrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAliClusterIdsToPrometheusGlobalViewRequest self = new AddAliClusterIdsToPrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public AddAliClusterIdsToPrometheusGlobalViewRequest setClusterIds(String clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public String getClusterIds() {
        return this.clusterIds;
    }

    public AddAliClusterIdsToPrometheusGlobalViewRequest setGlobalViewClusterId(String globalViewClusterId) {
        this.globalViewClusterId = globalViewClusterId;
        return this;
    }
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    public AddAliClusterIdsToPrometheusGlobalViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddAliClusterIdsToPrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
