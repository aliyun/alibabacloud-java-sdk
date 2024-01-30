// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcResponseBody body;

    public static ListVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcResponse self = new ListVpcResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcResponse setBody(ListVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcResponseBody getBody() {
        return this.body;
    }

}
