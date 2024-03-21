// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportEdsAgentInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReportEdsAgentInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportEdsAgentInfoResponseBody self = new ReportEdsAgentInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportEdsAgentInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
