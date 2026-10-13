// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMcpProductToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcpProductToolsResponseBody body;

    public static ListMcpProductToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcpProductToolsResponse self = new ListMcpProductToolsResponse();
        return TeaModel.build(map, self);
    }

    public ListMcpProductToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcpProductToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcpProductToolsResponse setBody(ListMcpProductToolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcpProductToolsResponseBody getBody() {
        return this.body;
    }

}
