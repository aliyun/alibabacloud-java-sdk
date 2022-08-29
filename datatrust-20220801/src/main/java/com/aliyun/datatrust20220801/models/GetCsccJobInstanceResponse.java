// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccJobInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCsccJobInstanceResponseBody body;

    public static GetCsccJobInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsccJobInstanceResponse self = new GetCsccJobInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetCsccJobInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsccJobInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsccJobInstanceResponse setBody(GetCsccJobInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsccJobInstanceResponseBody getBody() {
        return this.body;
    }

}
