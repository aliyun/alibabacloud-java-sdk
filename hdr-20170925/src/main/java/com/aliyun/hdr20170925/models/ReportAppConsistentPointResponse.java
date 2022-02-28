// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportAppConsistentPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportAppConsistentPointResponseBody body;

    public static ReportAppConsistentPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportAppConsistentPointResponse self = new ReportAppConsistentPointResponse();
        return TeaModel.build(map, self);
    }

    public ReportAppConsistentPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportAppConsistentPointResponse setBody(ReportAppConsistentPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportAppConsistentPointResponseBody getBody() {
        return this.body;
    }

}
