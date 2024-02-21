// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogstashResponseBody body;

    public static ListLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashResponse self = new ListLogstashResponse();
        return TeaModel.build(map, self);
    }

    public ListLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogstashResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogstashResponse setBody(ListLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogstashResponseBody getBody() {
        return this.body;
    }

}
