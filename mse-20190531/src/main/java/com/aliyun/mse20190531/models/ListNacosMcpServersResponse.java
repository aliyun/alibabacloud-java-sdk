// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosMcpServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNacosMcpServersResponseBody body;

    public static ListNacosMcpServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNacosMcpServersResponse self = new ListNacosMcpServersResponse();
        return TeaModel.build(map, self);
    }

    public ListNacosMcpServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNacosMcpServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNacosMcpServersResponse setBody(ListNacosMcpServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNacosMcpServersResponseBody getBody() {
        return this.body;
    }

}
