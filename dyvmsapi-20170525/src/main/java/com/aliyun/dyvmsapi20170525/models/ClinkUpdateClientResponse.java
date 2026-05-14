// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkUpdateClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkUpdateClientResponseBody body;

    public static ClinkUpdateClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkUpdateClientResponse self = new ClinkUpdateClientResponse();
        return TeaModel.build(map, self);
    }

    public ClinkUpdateClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkUpdateClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkUpdateClientResponse setBody(ClinkUpdateClientResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkUpdateClientResponseBody getBody() {
        return this.body;
    }

}
