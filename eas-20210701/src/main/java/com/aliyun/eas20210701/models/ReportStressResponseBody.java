// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReportStressResponseBody extends TeaModel {
    @NameInMap("ReportUrl")
    public String reportUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportStressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportStressResponseBody self = new ReportStressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportStressResponseBody setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }
    public String getReportUrl() {
        return this.reportUrl;
    }

    public ReportStressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
