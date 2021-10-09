// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportUserConfigResponseBody body;

    public static ReportUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUserConfigResponse self = new ReportUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public ReportUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUserConfigResponse setBody(ReportUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUserConfigResponseBody getBody() {
        return this.body;
    }

}
