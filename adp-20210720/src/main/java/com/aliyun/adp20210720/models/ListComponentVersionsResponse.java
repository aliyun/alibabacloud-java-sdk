// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListComponentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComponentVersionsResponseBody body;

    public static ListComponentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComponentVersionsResponse self = new ListComponentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListComponentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComponentVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComponentVersionsResponse setBody(ListComponentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComponentVersionsResponseBody getBody() {
        return this.body;
    }

}
