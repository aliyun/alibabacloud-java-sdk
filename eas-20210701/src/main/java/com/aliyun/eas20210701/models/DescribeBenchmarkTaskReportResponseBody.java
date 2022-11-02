// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskReportResponseBody extends TeaModel {
    @NameInMap("Data")
    public Object data;

    @NameInMap("ReportUrl")
    public String reportUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBenchmarkTaskReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBenchmarkTaskReportResponseBody self = new DescribeBenchmarkTaskReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBenchmarkTaskReportResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DescribeBenchmarkTaskReportResponseBody setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }
    public String getReportUrl() {
        return this.reportUrl;
    }

    public DescribeBenchmarkTaskReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
