// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListKeyPairsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKeyPairsResponseBody body;

    public static ListKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeyPairsResponse self = new ListKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public ListKeyPairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKeyPairsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKeyPairsResponse setBody(ListKeyPairsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKeyPairsResponseBody getBody() {
        return this.body;
    }

}
