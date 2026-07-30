// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListVirtualBridgesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirtualBridgesResponseBody body;

    public static ListVirtualBridgesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualBridgesResponse self = new ListVirtualBridgesResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualBridgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualBridgesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirtualBridgesResponse setBody(ListVirtualBridgesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualBridgesResponseBody getBody() {
        return this.body;
    }

}
