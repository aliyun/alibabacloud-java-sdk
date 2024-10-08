// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScheduledPreloadExecutionsResponseBody body;

    public static CreateScheduledPreloadExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadExecutionsResponse self = new CreateScheduledPreloadExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduledPreloadExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduledPreloadExecutionsResponse setBody(CreateScheduledPreloadExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduledPreloadExecutionsResponseBody getBody() {
        return this.body;
    }

}
