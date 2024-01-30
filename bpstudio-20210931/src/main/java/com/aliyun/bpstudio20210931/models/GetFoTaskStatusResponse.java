// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetFoTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFoTaskStatusResponseBody body;

    public static GetFoTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFoTaskStatusResponse self = new GetFoTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetFoTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFoTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFoTaskStatusResponse setBody(GetFoTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFoTaskStatusResponseBody getBody() {
        return this.body;
    }

}
