// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNADBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDNADBResponseBody body;

    public static ListDNADBResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDNADBResponse self = new ListDNADBResponse();
        return TeaModel.build(map, self);
    }

    public ListDNADBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDNADBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDNADBResponse setBody(ListDNADBResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDNADBResponseBody getBody() {
        return this.body;
    }

}
