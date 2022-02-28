// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportFullSyncDoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportFullSyncDoneResponseBody body;

    public static ReportFullSyncDoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportFullSyncDoneResponse self = new ReportFullSyncDoneResponse();
        return TeaModel.build(map, self);
    }

    public ReportFullSyncDoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportFullSyncDoneResponse setBody(ReportFullSyncDoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportFullSyncDoneResponseBody getBody() {
        return this.body;
    }

}
