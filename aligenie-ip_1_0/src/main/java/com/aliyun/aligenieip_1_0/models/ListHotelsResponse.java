// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelsResponseBody body;

    public static ListHotelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelsResponse self = new ListHotelsResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelsResponse setBody(ListHotelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelsResponseBody getBody() {
        return this.body;
    }

}
