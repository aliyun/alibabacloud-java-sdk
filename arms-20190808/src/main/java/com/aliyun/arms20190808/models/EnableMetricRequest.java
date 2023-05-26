// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class EnableMetricRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DropMetric")
    public String dropMetric;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRequest self = new EnableMetricRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public EnableMetricRequest setDropMetric(String dropMetric) {
        this.dropMetric = dropMetric;
        return this;
    }
    public String getDropMetric() {
        return this.dropMetric;
    }

    public EnableMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
