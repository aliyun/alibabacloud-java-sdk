// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineUserInfoResponseBody body;

    public static GetRoutineUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineUserInfoResponse self = new GetRoutineUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineUserInfoResponse setBody(GetRoutineUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineUserInfoResponseBody getBody() {
        return this.body;
    }

}
