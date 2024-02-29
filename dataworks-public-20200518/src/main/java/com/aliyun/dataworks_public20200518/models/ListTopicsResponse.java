// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTopicsResponseBody body;

    public static ListTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsResponse self = new ListTopicsResponse();
        return TeaModel.build(map, self);
    }

    public ListTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTopicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTopicsResponse setBody(ListTopicsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTopicsResponseBody getBody() {
        return this.body;
    }

}
