// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRegionsResponseBody body;

    public static ListRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponse self = new ListRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegionsResponse setBody(ListRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegionsResponseBody getBody() {
        return this.body;
    }

}
