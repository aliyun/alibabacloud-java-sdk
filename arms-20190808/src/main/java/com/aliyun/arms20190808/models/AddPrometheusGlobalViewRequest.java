// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewRequest extends TeaModel {
    @NameInMap("Clusters")
    public String clusters;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static AddPrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewRequest self = new AddPrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewRequest setClusters(String clusters) {
        this.clusters = clusters;
        return this;
    }
    public String getClusters() {
        return this.clusters;
    }

    public AddPrometheusGlobalViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddPrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
