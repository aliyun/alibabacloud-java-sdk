// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageTestResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageTestResultsResponseBody body;

    public static ListImageTestResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageTestResultsResponse self = new ListImageTestResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListImageTestResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageTestResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageTestResultsResponse setBody(ListImageTestResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageTestResultsResponseBody getBody() {
        return this.body;
    }

}
