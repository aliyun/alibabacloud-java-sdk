// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DiscoverEventSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DiscoverEventSourceResponseBody body;

    public static DiscoverEventSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DiscoverEventSourceResponse self = new DiscoverEventSourceResponse();
        return TeaModel.build(map, self);
    }

    public DiscoverEventSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiscoverEventSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiscoverEventSourceResponse setBody(DiscoverEventSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DiscoverEventSourceResponseBody getBody() {
        return this.body;
    }

}
