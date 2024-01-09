// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ForcedFailoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ForcedFailoverResponseBody body;

    public static ForcedFailoverResponse build(java.util.Map<String, ?> map) throws Exception {
        ForcedFailoverResponse self = new ForcedFailoverResponse();
        return TeaModel.build(map, self);
    }

    public ForcedFailoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForcedFailoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForcedFailoverResponse setBody(ForcedFailoverResponseBody body) {
        this.body = body;
        return this;
    }
    public ForcedFailoverResponseBody getBody() {
        return this.body;
    }

}
