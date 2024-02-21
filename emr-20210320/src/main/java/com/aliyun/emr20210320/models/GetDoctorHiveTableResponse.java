// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHiveTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHiveTableResponseBody body;

    public static GetDoctorHiveTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHiveTableResponse self = new GetDoctorHiveTableResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHiveTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHiveTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHiveTableResponse setBody(GetDoctorHiveTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHiveTableResponseBody getBody() {
        return this.body;
    }

}
