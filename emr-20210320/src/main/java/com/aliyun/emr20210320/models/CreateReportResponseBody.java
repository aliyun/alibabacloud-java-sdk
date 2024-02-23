// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateReportResponseBody extends TeaModel {
    @NameInMap("Data")
    public Data data;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReportResponseBody self = new CreateReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReportResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public CreateReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Data extends TeaModel {
        @NameInMap("ReportId")
        public String reportId;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

    }

}
