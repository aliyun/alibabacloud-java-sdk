// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiagnosticMetricSetRequest extends TeaModel {
    /**
     * <p>The description of the diagnostic metric set.</p>
     * 
     * <strong>example:</strong>
     * <p>connection diagnostics</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IDs of diagnostic metrics.</p>
     */
    @NameInMap("MetricIds")
    public java.util.List<String> metricIds;

    /**
     * <p>The IDs of the diagnostic metric sets.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dms-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("MetricSetId")
    public String metricSetId;

    /**
     * <p>The name of the diagnostic metric set.</p>
     * 
     * <strong>example:</strong>
     * <p>remoteConnectError</p>
     */
    @NameInMap("MetricSetName")
    public String metricSetName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
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
