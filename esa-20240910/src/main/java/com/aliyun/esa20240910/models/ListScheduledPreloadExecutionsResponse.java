// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduledPreloadExecutionsResponseBody body;

    public static ListScheduledPreloadExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPreloadExecutionsResponse self = new ListScheduledPreloadExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduledPreloadExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduledPreloadExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduledPreloadExecutionsResponse setBody(ListScheduledPreloadExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduledPreloadExecutionsResponseBody getBody() {
        return this.body;
    }

}
