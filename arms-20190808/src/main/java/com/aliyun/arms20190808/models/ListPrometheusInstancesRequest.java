// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesRequest extends TeaModel {
    /**
     * <p>实例类型</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to query global aggregation instances. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ShowGlobalView")
    public Boolean showGlobalView;

    public static ListPrometheusInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesRequest self = new ListPrometheusInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListPrometheusInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPrometheusInstancesRequest setShowGlobalView(Boolean showGlobalView) {
        this.showGlobalView = showGlobalView;
        return this;
    }
    public Boolean getShowGlobalView() {
        return this.showGlobalView;
    }

}
