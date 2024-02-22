// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListVirtualHostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirtualHostsResponseBody body;

    public static ListVirtualHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualHostsResponse self = new ListVirtualHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirtualHostsResponse setBody(ListVirtualHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualHostsResponseBody getBody() {
        return this.body;
    }

}
