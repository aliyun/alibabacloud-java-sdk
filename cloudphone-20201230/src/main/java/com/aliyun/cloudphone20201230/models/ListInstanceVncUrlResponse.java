// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListInstanceVncUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceVncUrlResponseBody body;

    public static ListInstanceVncUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceVncUrlResponse self = new ListInstanceVncUrlResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceVncUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceVncUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceVncUrlResponse setBody(ListInstanceVncUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceVncUrlResponseBody getBody() {
        return this.body;
    }

}
