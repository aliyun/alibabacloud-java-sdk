// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetAICenterStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICenterStateResponseBody body;

    public static GetAICenterStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICenterStateResponse self = new GetAICenterStateResponse();
        return TeaModel.build(map, self);
    }

    public GetAICenterStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICenterStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICenterStateResponse setBody(GetAICenterStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICenterStateResponseBody getBody() {
        return this.body;
    }

}
