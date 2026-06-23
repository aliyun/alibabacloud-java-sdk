// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineCodeVersionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineCodeVersionInfoResponseBody body;

    public static GetRoutineCodeVersionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineCodeVersionInfoResponse self = new GetRoutineCodeVersionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineCodeVersionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineCodeVersionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineCodeVersionInfoResponse setBody(GetRoutineCodeVersionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineCodeVersionInfoResponseBody getBody() {
        return this.body;
    }

}
