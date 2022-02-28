// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDiskGroupsStatusResponseBody body;

    public static ReportDiskGroupsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupsStatusResponse self = new ReportDiskGroupsStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDiskGroupsStatusResponse setBody(ReportDiskGroupsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDiskGroupsStatusResponseBody getBody() {
        return this.body;
    }

}
