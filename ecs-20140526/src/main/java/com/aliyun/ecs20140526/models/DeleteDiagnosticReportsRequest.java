// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticReportsRequest extends TeaModel {
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
     * <p>The IDs of the diagnostic reports. You can specify up to 100 resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportIds")
    public java.util.List<String> reportIds;

    public static DeleteDiagnosticReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticReportsRequest self = new DeleteDiagnosticReportsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticReportsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDiagnosticReportsRequest setReportIds(java.util.List<String> reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public java.util.List<String> getReportIds() {
        return this.reportIds;
    }

}
