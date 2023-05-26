// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddAliClusterIdsToPrometheusGlobalViewRequest extends TeaModel {
    /**
     * <p>The IDs of clusters. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>The ID of the global aggregation instance.</p>
     */
    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    /**
     * <p>The name of the global aggregation instance.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID.</p>
     */
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
