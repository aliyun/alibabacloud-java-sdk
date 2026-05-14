// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkBindClientTelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkBindClientTelResponseBody body;

    public static ClinkBindClientTelResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkBindClientTelResponse self = new ClinkBindClientTelResponse();
        return TeaModel.build(map, self);
    }

    public ClinkBindClientTelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkBindClientTelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkBindClientTelResponse setBody(ClinkBindClientTelResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkBindClientTelResponseBody getBody() {
        return this.body;
    }

}
