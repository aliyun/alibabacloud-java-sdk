// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpApisResponseBody body;

    public static ListHttpApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApisResponse self = new ListHttpApisResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpApisResponse setBody(ListHttpApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpApisResponseBody getBody() {
        return this.body;
    }

}
