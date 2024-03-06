// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeyVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKeyVersionsResponseBody body;

    public static ListKeyVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeyVersionsResponse self = new ListKeyVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListKeyVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKeyVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKeyVersionsResponse setBody(ListKeyVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKeyVersionsResponseBody getBody() {
        return this.body;
    }

}
