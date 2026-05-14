// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkCreateClientResponseBody body;

    public static ClinkCreateClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateClientResponse self = new ClinkCreateClientResponse();
        return TeaModel.build(map, self);
    }

    public ClinkCreateClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkCreateClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkCreateClientResponse setBody(ClinkCreateClientResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkCreateClientResponseBody getBody() {
        return this.body;
    }

}
