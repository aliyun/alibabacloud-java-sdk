// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportRecoveryPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportRecoveryPointResponseBody body;

    public static ReportRecoveryPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportRecoveryPointResponse self = new ReportRecoveryPointResponse();
        return TeaModel.build(map, self);
    }

    public ReportRecoveryPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportRecoveryPointResponse setBody(ReportRecoveryPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportRecoveryPointResponseBody getBody() {
        return this.body;
    }

}
