// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogstashLogResponseBody body;

    public static ListLogstashLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashLogResponse self = new ListLogstashLogResponse();
        return TeaModel.build(map, self);
    }

    public ListLogstashLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogstashLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogstashLogResponse setBody(ListLogstashLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogstashLogResponseBody getBody() {
        return this.body;
    }

}
