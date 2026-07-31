// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportRequest extends TeaModel {
    @NameInMap("AdditionalOptions")
    public java.util.Map<String, String> additionalOptions;

    /**
     * <p>The end time. Takes effect only for diagnostic metrics that do not require Cloud Assistant commands to be run in the guest OS.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T14:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The diagnostic metric set ID. If left empty, the default diagnostic metric set dms-instancedefault for ECS instances is used.</p>
     * 
     * <strong>example:</strong>
     * <p>dms-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("MetricSetId")
    public String metricSetId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>The start time. Takes effect only for diagnostic metrics that do not require Cloud Assistant commands to be run in the guest OS.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T12:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateDiagnosticReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticReportRequest self = new CreateDiagnosticReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticReportRequest setAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        this.additionalOptions = additionalOptions;
        return this;
    }
    public java.util.Map<String, String> getAdditionalOptions() {
        return this.additionalOptions;
    }

    public CreateDiagnosticReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateDiagnosticReportRequest setMetricSetId(String metricSetId) {
        this.metricSetId = metricSetId;
        return this;
    }
    public String getMetricSetId() {
        return this.metricSetId;
    }

    public CreateDiagnosticReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiagnosticReportRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateDiagnosticReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
