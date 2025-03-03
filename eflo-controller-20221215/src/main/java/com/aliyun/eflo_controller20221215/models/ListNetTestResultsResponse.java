// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNetTestResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetTestResultsResponseBody body;

    public static ListNetTestResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetTestResultsResponse self = new ListNetTestResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListNetTestResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetTestResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetTestResultsResponse setBody(ListNetTestResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetTestResultsResponseBody getBody() {
        return this.body;
    }

}
