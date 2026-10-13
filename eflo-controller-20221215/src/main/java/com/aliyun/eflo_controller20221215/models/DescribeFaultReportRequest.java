// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeFaultReportRequest extends TeaModel {
    /**
     * <p>The report ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100184932123</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static DescribeFaultReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultReportRequest self = new DescribeFaultReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaultReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
