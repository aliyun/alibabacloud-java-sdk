// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDeleteExtenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDeleteExtenResponseBody body;

    public static ClinkDeleteExtenResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDeleteExtenResponse self = new ClinkDeleteExtenResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDeleteExtenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDeleteExtenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDeleteExtenResponse setBody(ClinkDeleteExtenResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDeleteExtenResponseBody getBody() {
        return this.body;
    }

}
