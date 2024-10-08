// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScheduledPreloadJobResponseBody body;

    public static CreateScheduledPreloadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadJobResponse self = new CreateScheduledPreloadJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduledPreloadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduledPreloadJobResponse setBody(CreateScheduledPreloadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduledPreloadJobResponseBody getBody() {
        return this.body;
    }

}
