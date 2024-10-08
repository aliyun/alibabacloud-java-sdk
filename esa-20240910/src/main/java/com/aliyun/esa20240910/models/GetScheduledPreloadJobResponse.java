// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetScheduledPreloadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledPreloadJobResponseBody body;

    public static GetScheduledPreloadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledPreloadJobResponse self = new GetScheduledPreloadJobResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledPreloadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledPreloadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledPreloadJobResponse setBody(GetScheduledPreloadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledPreloadJobResponseBody getBody() {
        return this.body;
    }

}
