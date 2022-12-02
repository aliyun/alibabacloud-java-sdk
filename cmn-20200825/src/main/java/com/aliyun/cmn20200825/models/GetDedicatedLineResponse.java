// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDedicatedLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDedicatedLineResponseBody body;

    public static GetDedicatedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedLineResponse self = new GetDedicatedLineResponse();
        return TeaModel.build(map, self);
    }

    public GetDedicatedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDedicatedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDedicatedLineResponse setBody(GetDedicatedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDedicatedLineResponseBody getBody() {
        return this.body;
    }

}
