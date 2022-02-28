// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupReplicationErrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDiskGroupReplicationErrorResponseBody body;

    public static ReportDiskGroupReplicationErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupReplicationErrorResponse self = new ReportDiskGroupReplicationErrorResponse();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupReplicationErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDiskGroupReplicationErrorResponse setBody(ReportDiskGroupReplicationErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDiskGroupReplicationErrorResponseBody getBody() {
        return this.body;
    }

}
