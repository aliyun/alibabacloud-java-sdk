// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListReceivedSharesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReceivedSharesResponseBody body;

    public static ListReceivedSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReceivedSharesResponse self = new ListReceivedSharesResponse();
        return TeaModel.build(map, self);
    }

    public ListReceivedSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReceivedSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReceivedSharesResponse setBody(ListReceivedSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReceivedSharesResponseBody getBody() {
        return this.body;
    }

}
