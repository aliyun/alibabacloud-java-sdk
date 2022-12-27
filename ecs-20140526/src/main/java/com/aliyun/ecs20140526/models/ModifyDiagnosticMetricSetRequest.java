// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiagnosticMetricSetRequest extends TeaModel {
    // The new description of the diagnostic metric set.
    @NameInMap("Description")
    public String description;

    // The IDs of diagnostic metrics.
    @NameInMap("MetricIds")
    public java.util.List<String> metricIds;

    // The ID of the diagnostic metric set.
    @NameInMap("MetricSetId")
    public String metricSetId;

    // The new name of the diagnostic metric set.
    @NameInMap("MetricSetName")
    public String metricSetName;

    // The region ID of the diagnostic metric set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the resource.
    @NameInMap("ResourceType")
    public String resourceType;

    public static ModifyDiagnosticMetricSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiagnosticMetricSetRequest self = new ModifyDiagnosticMetricSetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiagnosticMetricSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDiagnosticMetricSetRequest setMetricIds(java.util.List<String> metricIds) {
        this.metricIds = metricIds;
        return this;
    }
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
    }

    public ModifyDiagnosticMetricSetRequest setMetricSetId(String metricSetId) {
        this.metricSetId = metricSetId;
        return this;
    }
    public String getMetricSetId() {
        return this.metricSetId;
    }

    public ModifyDiagnosticMetricSetRequest setMetricSetName(String metricSetName) {
        this.metricSetName = metricSetName;
        return this;
    }
    public String getMetricSetName() {
        return this.metricSetName;
    }

    public ModifyDiagnosticMetricSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiagnosticMetricSetRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
