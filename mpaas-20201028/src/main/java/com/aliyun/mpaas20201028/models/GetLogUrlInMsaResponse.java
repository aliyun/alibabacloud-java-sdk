// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetLogUrlInMsaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogUrlInMsaResponseBody body;

    public static GetLogUrlInMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogUrlInMsaResponse self = new GetLogUrlInMsaResponse();
        return TeaModel.build(map, self);
    }

    public GetLogUrlInMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogUrlInMsaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogUrlInMsaResponse setBody(GetLogUrlInMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogUrlInMsaResponseBody getBody() {
        return this.body;
    }

}
