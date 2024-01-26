// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetMultipleTraceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultipleTraceResponseBody body;

    public static GetMultipleTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultipleTraceResponse self = new GetMultipleTraceResponse();
        return TeaModel.build(map, self);
    }

    public GetMultipleTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultipleTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultipleTraceResponse setBody(GetMultipleTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultipleTraceResponseBody getBody() {
        return this.body;
    }

}
