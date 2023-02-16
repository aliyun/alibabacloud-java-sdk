// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListApiDestinationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApiDestinationsResponseBody body;

    public static ListApiDestinationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiDestinationsResponse self = new ListApiDestinationsResponse();
        return TeaModel.build(map, self);
    }

    public ListApiDestinationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiDestinationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiDestinationsResponse setBody(ListApiDestinationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiDestinationsResponseBody getBody() {
        return this.body;
    }

}
