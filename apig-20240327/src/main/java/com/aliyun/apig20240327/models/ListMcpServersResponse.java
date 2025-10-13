// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMcpServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcpServersResponseBody body;

    public static ListMcpServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcpServersResponse self = new ListMcpServersResponse();
        return TeaModel.build(map, self);
    }

    public ListMcpServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcpServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcpServersResponse setBody(ListMcpServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcpServersResponseBody getBody() {
        return this.body;
    }

}
