// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupFullSyncStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDiskGroupFullSyncStatusResponseBody body;

    public static ReportDiskGroupFullSyncStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupFullSyncStatusResponse self = new ReportDiskGroupFullSyncStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupFullSyncStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDiskGroupFullSyncStatusResponse setBody(ReportDiskGroupFullSyncStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDiskGroupFullSyncStatusResponseBody getBody() {
        return this.body;
    }

}
