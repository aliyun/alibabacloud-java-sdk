// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHBaseTableResponseBody body;

    public static GetDoctorHBaseTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseTableResponse self = new GetDoctorHBaseTableResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHBaseTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHBaseTableResponse setBody(GetDoctorHBaseTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHBaseTableResponseBody getBody() {
        return this.body;
    }

}
