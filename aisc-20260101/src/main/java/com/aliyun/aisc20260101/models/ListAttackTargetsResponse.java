// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListAttackTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAttackTargetsResponseBody body;

    public static ListAttackTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAttackTargetsResponse self = new ListAttackTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListAttackTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAttackTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAttackTargetsResponse setBody(ListAttackTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAttackTargetsResponseBody getBody() {
        return this.body;
    }

}
