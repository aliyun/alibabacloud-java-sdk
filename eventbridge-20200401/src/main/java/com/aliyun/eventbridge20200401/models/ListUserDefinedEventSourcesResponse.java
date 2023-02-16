// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListUserDefinedEventSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserDefinedEventSourcesResponseBody body;

    public static ListUserDefinedEventSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDefinedEventSourcesResponse self = new ListUserDefinedEventSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDefinedEventSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDefinedEventSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserDefinedEventSourcesResponse setBody(ListUserDefinedEventSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDefinedEventSourcesResponseBody getBody() {
        return this.body;
    }

}
