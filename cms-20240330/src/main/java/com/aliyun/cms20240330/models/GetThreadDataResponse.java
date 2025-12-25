// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetThreadDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThreadDataResponseBody body;

    public static GetThreadDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThreadDataResponse self = new GetThreadDataResponse();
        return TeaModel.build(map, self);
    }

    public GetThreadDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThreadDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThreadDataResponse setBody(GetThreadDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThreadDataResponseBody getBody() {
        return this.body;
    }

}
