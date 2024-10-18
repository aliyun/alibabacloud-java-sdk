// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineResponseBody body;

    public static GetRoutineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineResponse self = new GetRoutineResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineResponse setBody(GetRoutineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineResponseBody getBody() {
        return this.body;
    }

}
