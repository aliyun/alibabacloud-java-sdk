// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class ListMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaResponseBody body;

    public static ListMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaResponse self = new ListMediaResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaResponse setBody(ListMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaResponseBody getBody() {
        return this.body;
    }

}
