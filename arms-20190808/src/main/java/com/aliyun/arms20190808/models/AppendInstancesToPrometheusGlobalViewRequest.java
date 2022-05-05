// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AppendInstancesToPrometheusGlobalViewRequest extends TeaModel {
    @NameInMap("Clusters")
    public String clusters;

    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static AppendInstancesToPrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendInstancesToPrometheusGlobalViewRequest self = new AppendInstancesToPrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public AppendInstancesToPrometheusGlobalViewRequest setClusters(String clusters) {
        this.clusters = clusters;
        return this;
    }
    public String getClusters() {
        return this.clusters;
    }

    public AppendInstancesToPrometheusGlobalViewRequest setGlobalViewClusterId(String globalViewClusterId) {
        this.globalViewClusterId = globalViewClusterId;
        return this;
    }
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    public AppendInstancesToPrometheusGlobalViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AppendInstancesToPrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
