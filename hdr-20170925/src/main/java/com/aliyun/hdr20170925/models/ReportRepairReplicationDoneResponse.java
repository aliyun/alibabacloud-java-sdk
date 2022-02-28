// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportRepairReplicationDoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportRepairReplicationDoneResponseBody body;

    public static ReportRepairReplicationDoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportRepairReplicationDoneResponse self = new ReportRepairReplicationDoneResponse();
        return TeaModel.build(map, self);
    }

    public ReportRepairReplicationDoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportRepairReplicationDoneResponse setBody(ReportRepairReplicationDoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportRepairReplicationDoneResponseBody getBody() {
        return this.body;
    }

}
