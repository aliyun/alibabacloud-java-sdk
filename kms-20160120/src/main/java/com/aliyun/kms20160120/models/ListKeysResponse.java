// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKeysResponseBody body;

    public static ListKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeysResponse self = new ListKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKeysResponse setBody(ListKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKeysResponseBody getBody() {
        return this.body;
    }

}
