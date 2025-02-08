// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListImageTransformsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageTransformsResponseBody body;

    public static ListImageTransformsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageTransformsResponse self = new ListImageTransformsResponse();
        return TeaModel.build(map, self);
    }

    public ListImageTransformsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageTransformsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageTransformsResponse setBody(ListImageTransformsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageTransformsResponseBody getBody() {
        return this.body;
    }

}
