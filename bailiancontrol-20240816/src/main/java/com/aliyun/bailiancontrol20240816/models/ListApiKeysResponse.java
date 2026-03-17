// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailiancontrol20240816.models;

import com.aliyun.tea.*;

public class ListApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiKeysResponseBody body;

    public static ListApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysResponse self = new ListApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiKeysResponse setBody(ListApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiKeysResponseBody getBody() {
        return this.body;
    }

}
