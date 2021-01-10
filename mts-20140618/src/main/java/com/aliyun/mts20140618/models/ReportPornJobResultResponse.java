// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportPornJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportPornJobResultResponseBody body;

    public static ReportPornJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportPornJobResultResponse self = new ReportPornJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportPornJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportPornJobResultResponse setBody(ReportPornJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportPornJobResultResponseBody getBody() {
        return this.body;
    }

}
