// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineCodeVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineCodeVersionResponseBody body;

    public static GetRoutineCodeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineCodeVersionResponse self = new GetRoutineCodeVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineCodeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineCodeVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineCodeVersionResponse setBody(GetRoutineCodeVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineCodeVersionResponseBody getBody() {
        return this.body;
    }

}
