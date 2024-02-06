// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListDirectionalDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDirectionalDetailResponseBody body;

    public static ListDirectionalDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDirectionalDetailResponse self = new ListDirectionalDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListDirectionalDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDirectionalDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDirectionalDetailResponse setBody(ListDirectionalDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDirectionalDetailResponseBody getBody() {
        return this.body;
    }

}
