// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRayJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRayJobResponseBody body;

    public static GetRayJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRayJobResponse self = new GetRayJobResponse();
        return TeaModel.build(map, self);
    }

    public GetRayJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRayJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRayJobResponse setBody(GetRayJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRayJobResponseBody getBody() {
        return this.body;
    }

}
