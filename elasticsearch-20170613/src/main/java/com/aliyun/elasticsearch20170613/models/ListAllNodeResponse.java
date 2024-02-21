// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAllNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllNodeResponseBody body;

    public static ListAllNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllNodeResponse self = new ListAllNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListAllNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllNodeResponse setBody(ListAllNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllNodeResponseBody getBody() {
        return this.body;
    }

}
