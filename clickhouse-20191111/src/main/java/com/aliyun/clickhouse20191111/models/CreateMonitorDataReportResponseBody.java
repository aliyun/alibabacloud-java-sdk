// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateMonitorDataReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMonitorDataReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorDataReportResponseBody self = new CreateMonitorDataReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMonitorDataReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
