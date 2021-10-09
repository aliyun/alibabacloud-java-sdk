// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportDevConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDevConfigResponseBody body;

    public static ReportDevConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDevConfigResponse self = new ReportDevConfigResponse();
        return TeaModel.build(map, self);
    }

    public ReportDevConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDevConfigResponse setBody(ReportDevConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDevConfigResponseBody getBody() {
        return this.body;
    }

}
