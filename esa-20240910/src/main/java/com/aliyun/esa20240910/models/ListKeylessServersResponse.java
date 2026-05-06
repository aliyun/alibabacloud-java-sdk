// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListKeylessServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKeylessServersResponseBody body;

    public static ListKeylessServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeylessServersResponse self = new ListKeylessServersResponse();
        return TeaModel.build(map, self);
    }

    public ListKeylessServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKeylessServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKeylessServersResponse setBody(ListKeylessServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKeylessServersResponseBody getBody() {
        return this.body;
    }

}
