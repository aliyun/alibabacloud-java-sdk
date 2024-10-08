// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteScheduledPreloadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScheduledPreloadJobResponseBody body;

    public static DeleteScheduledPreloadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledPreloadJobResponse self = new DeleteScheduledPreloadJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledPreloadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduledPreloadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScheduledPreloadJobResponse setBody(DeleteScheduledPreloadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduledPreloadJobResponseBody getBody() {
        return this.body;
    }

}
