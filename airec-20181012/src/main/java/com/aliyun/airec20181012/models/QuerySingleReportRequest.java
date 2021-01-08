// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QuerySingleReportRequest extends TeaModel {
    @NameInMap("ReportType")
    public String reportType;

    public static QuerySingleReportRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleReportRequest self = new QuerySingleReportRequest();
        return TeaModel.build(map, self);
    }

    public QuerySingleReportRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
