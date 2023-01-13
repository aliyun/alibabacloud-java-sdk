// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportAttributesRequest extends TeaModel {
    /**
     * <p>The region ID of the diagnostic report. You can call the [DescribeRegions](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/regions-describeregions) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the diagnostic report.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static DescribeDiagnosticReportAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportAttributesRequest self = new DescribeDiagnosticReportAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosticReportAttributesRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
