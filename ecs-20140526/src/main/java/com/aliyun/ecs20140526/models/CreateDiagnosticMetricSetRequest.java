// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiagnosticMetricSetRequest extends TeaModel {
    /**
     * <p>The description of the diagnostic metric set.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IDs of diagnostic metrics. You can specify up to 100 diagnostic metric IDs.</p>
     */
    @NameInMap("MetricIds")
    public java.util.List<String> metricIds;

    /**
     * <p>The name of the diagnostic metric set.</p>
     */
    @NameInMap("MetricSetName")
    public String metricSetName;

    /**
     * <p>The ID of the region in which to create the diagnostic metric set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>Default value: instance.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static CreateDiagnosticMetricSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticMetricSetRequest self = new CreateDiagnosticMetricSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticMetricSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDiagnosticMetricSetRequest setMetricIds(java.util.List<String> metricIds) {
        this.metricIds = metricIds;
        return this;
    }
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
    }

    public CreateDiagnosticMetricSetRequest setMetricSetName(String metricSetName) {
        this.metricSetName = metricSetName;
        return this;
    }
    public String getMetricSetName() {
        return this.metricSetName;
    }

    public CreateDiagnosticMetricSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiagnosticMetricSetRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
