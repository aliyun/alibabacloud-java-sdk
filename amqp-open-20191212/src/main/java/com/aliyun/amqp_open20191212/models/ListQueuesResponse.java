// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQueuesResponseBody body;

    public static ListQueuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponse self = new ListQueuesResponse();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueuesResponse setBody(ListQueuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueuesResponseBody getBody() {
        return this.body;
    }

}
