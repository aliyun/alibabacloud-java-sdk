// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListResellersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResellersResponseBody body;

    public static ListResellersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResellersResponse self = new ListResellersResponse();
        return TeaModel.build(map, self);
    }

    public ListResellersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResellersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResellersResponse setBody(ListResellersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResellersResponseBody getBody() {
        return this.body;
    }

}
