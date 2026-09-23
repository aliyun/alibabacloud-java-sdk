// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ReduceCreditSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReduceCreditSeatsResponseBody body;

    public static ReduceCreditSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReduceCreditSeatsResponse self = new ReduceCreditSeatsResponse();
        return TeaModel.build(map, self);
    }

    public ReduceCreditSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReduceCreditSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReduceCreditSeatsResponse setBody(ReduceCreditSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReduceCreditSeatsResponseBody getBody() {
        return this.body;
    }

}
