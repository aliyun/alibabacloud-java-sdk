// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticMetricSetsRequest extends TeaModel {
    /**
     * <p>The IDs of diagnostic metric sets. You can specify up to 10 set IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricSetIds")
    public java.util.List<String> metricSetIds;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
