// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportShrinkRequest extends TeaModel {
    /**
     * <p>The extension in JSON format.</p>
     */
    @NameInMap("AdditionalOptions")
    public String additionalOptionsShrink;

    /**
     * <p>The end time. The time follows the ISO 8601 standard and is displayed in UTC. This parameter takes effect only for diagnostic metrics that do not require Cloud Assistant commands to be executed in the guest OS.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T14:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The diagnostic metric set ID. If this parameter is left empty, the default diagnostic metric set dms-instancedefault for ECS instances is used.</p>
     * 
     * <strong>example:</strong>
     * <p>dms-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("MetricSetId")
    public String metricSetId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest Alibaba Cloud region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The start time. The time follows the ISO 8601 standard and is displayed in UTC. This parameter takes effect only for diagnostic metrics that do not require Cloud Assistant commands to be executed in the guest OS.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T12:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateDiagnosticReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticReportShrinkRequest self = new CreateDiagnosticReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticReportShrinkRequest setAdditionalOptionsShrink(String additionalOptionsShrink) {
        this.additionalOptionsShrink = additionalOptionsShrink;
        return this;
    }
    public String getAdditionalOptionsShrink() {
        return this.additionalOptionsShrink;
    }

    public CreateDiagnosticReportShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateDiagnosticReportShrinkRequest setMetricSetId(String metricSetId) {
        this.metricSetId = metricSetId;
        return this;
    }
    public String getMetricSetId() {
        return this.metricSetId;
    }

    public CreateDiagnosticReportShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiagnosticReportShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateDiagnosticReportShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
