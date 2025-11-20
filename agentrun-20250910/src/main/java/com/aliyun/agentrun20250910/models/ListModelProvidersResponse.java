// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelProvidersResponseBody body;

    public static ListModelProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelProvidersResponse self = new ListModelProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListModelProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelProvidersResponse setBody(ListModelProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelProvidersResponseBody getBody() {
        return this.body;
    }

}
