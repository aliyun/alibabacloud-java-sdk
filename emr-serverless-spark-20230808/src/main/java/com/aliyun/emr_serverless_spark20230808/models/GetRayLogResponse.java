// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRayLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRayLogResponseBody body;

    public static GetRayLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRayLogResponse self = new GetRayLogResponse();
        return TeaModel.build(map, self);
    }

    public GetRayLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRayLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRayLogResponse setBody(GetRayLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRayLogResponseBody getBody() {
        return this.body;
    }

}
