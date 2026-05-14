// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateExtenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkCreateExtenResponseBody body;

    public static ClinkCreateExtenResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateExtenResponse self = new ClinkCreateExtenResponse();
        return TeaModel.build(map, self);
    }

    public ClinkCreateExtenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkCreateExtenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkCreateExtenResponse setBody(ClinkCreateExtenResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkCreateExtenResponseBody getBody() {
        return this.body;
    }

}
