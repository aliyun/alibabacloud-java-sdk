// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportFullSyncStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportFullSyncStatusResponseBody body;

    public static ReportFullSyncStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportFullSyncStatusResponse self = new ReportFullSyncStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportFullSyncStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportFullSyncStatusResponse setBody(ReportFullSyncStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportFullSyncStatusResponseBody getBody() {
        return this.body;
    }

}
