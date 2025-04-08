// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetDoctorApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorApplicationResponseBody body;

    public static GetDoctorApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorApplicationResponse self = new GetDoctorApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorApplicationResponse setBody(GetDoctorApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorApplicationResponseBody getBody() {
        return this.body;
    }

}
