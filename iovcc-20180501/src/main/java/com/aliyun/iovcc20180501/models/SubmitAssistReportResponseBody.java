// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class SubmitAssistReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAssistReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssistReportResponseBody self = new SubmitAssistReportResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAssistReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
