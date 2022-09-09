// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticMetricSetsRequest extends TeaModel {
    @NameInMap("MetricSetIds")
    public java.util.List<String> metricSetIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDiagnosticMetricSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticMetricSetsRequest self = new DeleteDiagnosticMetricSetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticMetricSetsRequest setMetricSetIds(java.util.List<String> metricSetIds) {
        this.metricSetIds = metricSetIds;
        return this;
    }
    public java.util.List<String> getMetricSetIds() {
        return this.metricSetIds;
    }

    public DeleteDiagnosticMetricSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
