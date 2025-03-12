// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListLayer7CustomPortsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLayer7CustomPortsResponseBody body;

    public static ListLayer7CustomPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLayer7CustomPortsResponse self = new ListLayer7CustomPortsResponse();
        return TeaModel.build(map, self);
    }

    public ListLayer7CustomPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLayer7CustomPortsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLayer7CustomPortsResponse setBody(ListLayer7CustomPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLayer7CustomPortsResponseBody getBody() {
        return this.body;
    }

}
