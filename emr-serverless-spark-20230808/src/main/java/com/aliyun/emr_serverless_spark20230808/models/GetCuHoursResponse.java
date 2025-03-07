// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetCuHoursResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCuHoursResponseBody body;

    public static GetCuHoursResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCuHoursResponse self = new GetCuHoursResponse();
        return TeaModel.build(map, self);
    }

    public GetCuHoursResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCuHoursResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCuHoursResponse setBody(GetCuHoursResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCuHoursResponseBody getBody() {
        return this.body;
    }

}
