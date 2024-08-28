// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskReportRequest extends TeaModel {
    /**
     * <p>The report type of the stress testing task. Valid values: RAW and Report.</p>
     * 
     * <strong>example:</strong>
     * <p>report</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    public static DescribeBenchmarkTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBenchmarkTaskReportRequest self = new DescribeBenchmarkTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBenchmarkTaskReportRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
