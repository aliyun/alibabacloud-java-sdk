// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventSequentialTrentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventSequentialTrentResponseBody body;

    public static GetEventSequentialTrentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventSequentialTrentResponse self = new GetEventSequentialTrentResponse();
        return TeaModel.build(map, self);
    }

    public GetEventSequentialTrentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventSequentialTrentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventSequentialTrentResponse setBody(GetEventSequentialTrentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventSequentialTrentResponseBody getBody() {
        return this.body;
    }

}
