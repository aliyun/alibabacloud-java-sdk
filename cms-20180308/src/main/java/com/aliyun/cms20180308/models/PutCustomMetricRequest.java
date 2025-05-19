// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class PutCustomMetricRequest extends TeaModel {
    @NameInMap("MetricList")
    public String metricList;

    @NameInMap("RegionId")
    public String regionId;

    public static PutCustomMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricRequest self = new PutCustomMetricRequest();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricRequest setMetricList(String metricList) {
        this.metricList = metricList;
        return this;
    }
    public String getMetricList() {
        return this.metricList;
    }

    public PutCustomMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
