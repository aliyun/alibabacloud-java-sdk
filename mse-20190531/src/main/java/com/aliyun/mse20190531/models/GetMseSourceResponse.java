// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetMseSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMseSourceResponseBody body;

    public static GetMseSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMseSourceResponse self = new GetMseSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetMseSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMseSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMseSourceResponse setBody(GetMseSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMseSourceResponseBody getBody() {
        return this.body;
    }

}
