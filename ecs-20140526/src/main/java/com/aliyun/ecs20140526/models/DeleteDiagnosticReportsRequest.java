// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticReportsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

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
