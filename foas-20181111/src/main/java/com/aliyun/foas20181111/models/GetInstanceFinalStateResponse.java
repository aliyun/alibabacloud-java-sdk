// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceFinalStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceFinalStateResponseBody body;

    public static GetInstanceFinalStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceFinalStateResponse self = new GetInstanceFinalStateResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceFinalStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceFinalStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceFinalStateResponse setBody(GetInstanceFinalStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceFinalStateResponseBody getBody() {
        return this.body;
    }

}
