// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationComponentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFoundationComponentVersionsResponseBody body;

    public static ListFoundationComponentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationComponentVersionsResponse self = new ListFoundationComponentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFoundationComponentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoundationComponentVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFoundationComponentVersionsResponse setBody(ListFoundationComponentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoundationComponentVersionsResponseBody getBody() {
        return this.body;
    }

}
