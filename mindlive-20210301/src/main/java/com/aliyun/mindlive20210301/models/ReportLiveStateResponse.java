// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportLiveStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportLiveStateResponseBody body;

    public static ReportLiveStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportLiveStateResponse self = new ReportLiveStateResponse();
        return TeaModel.build(map, self);
    }

    public ReportLiveStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportLiveStateResponse setBody(ReportLiveStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportLiveStateResponseBody getBody() {
        return this.body;
    }

}
