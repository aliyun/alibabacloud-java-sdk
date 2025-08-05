// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListRelatedTopicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRelatedTopicsResponseBody body;

    public static ListRelatedTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRelatedTopicsResponse self = new ListRelatedTopicsResponse();
        return TeaModel.build(map, self);
    }

    public ListRelatedTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRelatedTopicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRelatedTopicsResponse setBody(ListRelatedTopicsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRelatedTopicsResponseBody getBody() {
        return this.body;
    }

}
