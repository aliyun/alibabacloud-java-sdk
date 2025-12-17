// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteDiagnoseReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-j6c7wvdzk5103xxxxx</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static DeleteDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnoseReportRequest self = new DeleteDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnoseReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDiagnoseReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
