// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class DuplexDecisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DuplexDecisionResponseBody body;

    public static DuplexDecisionResponse build(java.util.Map<String, ?> map) throws Exception {
        DuplexDecisionResponse self = new DuplexDecisionResponse();
        return TeaModel.build(map, self);
    }

    public DuplexDecisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DuplexDecisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DuplexDecisionResponse setBody(DuplexDecisionResponseBody body) {
        this.body = body;
        return this;
    }
    public DuplexDecisionResponseBody getBody() {
        return this.body;
    }

}
