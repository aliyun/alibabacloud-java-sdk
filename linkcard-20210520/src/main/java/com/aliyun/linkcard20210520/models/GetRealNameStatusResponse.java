// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetRealNameStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealNameStatusResponseBody body;

    public static GetRealNameStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealNameStatusResponse self = new GetRealNameStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRealNameStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealNameStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealNameStatusResponse setBody(GetRealNameStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealNameStatusResponseBody getBody() {
        return this.body;
    }

}
