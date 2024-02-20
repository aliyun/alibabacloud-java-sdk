// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ErasePersonResponseBody body;

    public static ErasePersonResponse build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonResponse self = new ErasePersonResponse();
        return TeaModel.build(map, self);
    }

    public ErasePersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ErasePersonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ErasePersonResponse setBody(ErasePersonResponseBody body) {
        this.body = body;
        return this;
    }
    public ErasePersonResponseBody getBody() {
        return this.body;
    }

}
