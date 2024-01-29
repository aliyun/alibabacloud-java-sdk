// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceConnectionsResponseBody body;

    public static ListServiceConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsResponse self = new ListServiceConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceConnectionsResponse setBody(ListServiceConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceConnectionsResponseBody getBody() {
        return this.body;
    }

}
