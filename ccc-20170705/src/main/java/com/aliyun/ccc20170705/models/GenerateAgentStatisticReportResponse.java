// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GenerateAgentStatisticReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateAgentStatisticReportResponseBody body;

    public static GenerateAgentStatisticReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAgentStatisticReportResponse self = new GenerateAgentStatisticReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAgentStatisticReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAgentStatisticReportResponse setBody(GenerateAgentStatisticReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAgentStatisticReportResponseBody getBody() {
        return this.body;
    }

}
