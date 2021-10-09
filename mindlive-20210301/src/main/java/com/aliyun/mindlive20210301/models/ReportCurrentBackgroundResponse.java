// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportCurrentBackgroundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportCurrentBackgroundResponseBody body;

    public static ReportCurrentBackgroundResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportCurrentBackgroundResponse self = new ReportCurrentBackgroundResponse();
        return TeaModel.build(map, self);
    }

    public ReportCurrentBackgroundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportCurrentBackgroundResponse setBody(ReportCurrentBackgroundResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportCurrentBackgroundResponseBody getBody() {
        return this.body;
    }

}
