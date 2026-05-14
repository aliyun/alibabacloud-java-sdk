// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDeleteClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDeleteClientResponseBody body;

    public static ClinkDeleteClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDeleteClientResponse self = new ClinkDeleteClientResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDeleteClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDeleteClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDeleteClientResponse setBody(ClinkDeleteClientResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDeleteClientResponseBody getBody() {
        return this.body;
    }

}
