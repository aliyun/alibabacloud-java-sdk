// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageVersionsResponseBody body;

    public static ListImageVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageVersionsResponse self = new ListImageVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListImageVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageVersionsResponse setBody(ListImageVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageVersionsResponseBody getBody() {
        return this.body;
    }

}
