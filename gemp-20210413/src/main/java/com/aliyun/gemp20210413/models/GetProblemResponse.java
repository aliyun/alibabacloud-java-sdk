// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProblemResponseBody body;

    public static GetProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProblemResponse self = new GetProblemResponse();
        return TeaModel.build(map, self);
    }

    public GetProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProblemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProblemResponse setBody(GetProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProblemResponseBody getBody() {
        return this.body;
    }

}
