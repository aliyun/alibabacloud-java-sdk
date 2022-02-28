// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportWorkloadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportWorkloadResponseBody body;

    public static ReportWorkloadResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportWorkloadResponse self = new ReportWorkloadResponse();
        return TeaModel.build(map, self);
    }

    public ReportWorkloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportWorkloadResponse setBody(ReportWorkloadResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportWorkloadResponseBody getBody() {
        return this.body;
    }

}
