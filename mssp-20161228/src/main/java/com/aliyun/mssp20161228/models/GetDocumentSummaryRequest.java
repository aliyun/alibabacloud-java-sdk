// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    public static GetDocumentSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentSummaryRequest self = new GetDocumentSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentSummaryRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
