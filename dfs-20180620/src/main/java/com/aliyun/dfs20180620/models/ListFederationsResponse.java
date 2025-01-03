// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFederationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFederationsResponseBody body;

    public static ListFederationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFederationsResponse self = new ListFederationsResponse();
        return TeaModel.build(map, self);
    }

    public ListFederationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFederationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFederationsResponse setBody(ListFederationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFederationsResponseBody getBody() {
        return this.body;
    }

}
