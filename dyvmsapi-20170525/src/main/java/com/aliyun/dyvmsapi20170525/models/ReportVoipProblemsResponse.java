// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ReportVoipProblemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportVoipProblemsResponseBody body;

    public static ReportVoipProblemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportVoipProblemsResponse self = new ReportVoipProblemsResponse();
        return TeaModel.build(map, self);
    }

    public ReportVoipProblemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportVoipProblemsResponse setBody(ReportVoipProblemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportVoipProblemsResponseBody getBody() {
        return this.body;
    }

}
