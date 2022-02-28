// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportReplicationErrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportReplicationErrorResponseBody body;

    public static ReportReplicationErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportReplicationErrorResponse self = new ReportReplicationErrorResponse();
        return TeaModel.build(map, self);
    }

    public ReportReplicationErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportReplicationErrorResponse setBody(ReportReplicationErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportReplicationErrorResponseBody getBody() {
        return this.body;
    }

}
