// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ResetScheduledPreloadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetScheduledPreloadJobResponseBody body;

    public static ResetScheduledPreloadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetScheduledPreloadJobResponse self = new ResetScheduledPreloadJobResponse();
        return TeaModel.build(map, self);
    }

    public ResetScheduledPreloadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetScheduledPreloadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetScheduledPreloadJobResponse setBody(ResetScheduledPreloadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetScheduledPreloadJobResponseBody getBody() {
        return this.body;
    }

}
