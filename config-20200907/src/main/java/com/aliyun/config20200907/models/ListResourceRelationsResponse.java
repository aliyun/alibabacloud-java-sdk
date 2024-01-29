// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceRelationsResponseBody body;

    public static ListResourceRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationsResponse self = new ListResourceRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceRelationsResponse setBody(ListResourceRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceRelationsResponseBody getBody() {
        return this.body;
    }

}
