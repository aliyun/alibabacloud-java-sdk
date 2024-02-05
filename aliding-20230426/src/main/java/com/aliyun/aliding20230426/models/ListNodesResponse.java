// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodesResponseBody body;

    public static ListNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponse self = new ListNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodesResponse setBody(ListNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodesResponseBody getBody() {
        return this.body;
    }

}
