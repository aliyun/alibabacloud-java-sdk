// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportShadowConsistenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportShadowConsistenceResponseBody body;

    public static ReportShadowConsistenceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportShadowConsistenceResponse self = new ReportShadowConsistenceResponse();
        return TeaModel.build(map, self);
    }

    public ReportShadowConsistenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportShadowConsistenceResponse setBody(ReportShadowConsistenceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportShadowConsistenceResponseBody getBody() {
        return this.body;
    }

}
