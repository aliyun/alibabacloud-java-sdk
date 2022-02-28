// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportRepairReplicationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportRepairReplicationStatusResponseBody body;

    public static ReportRepairReplicationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportRepairReplicationStatusResponse self = new ReportRepairReplicationStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportRepairReplicationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportRepairReplicationStatusResponse setBody(ReportRepairReplicationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportRepairReplicationStatusResponseBody getBody() {
        return this.body;
    }

}
