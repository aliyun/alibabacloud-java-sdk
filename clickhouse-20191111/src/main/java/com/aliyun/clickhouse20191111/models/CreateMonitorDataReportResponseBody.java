// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateMonitorDataReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94F92113-FF63-5E57-8401-6FE123AD11DD</p>
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
