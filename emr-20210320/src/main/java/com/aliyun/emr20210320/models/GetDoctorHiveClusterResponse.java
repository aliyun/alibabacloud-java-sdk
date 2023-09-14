// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHiveClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDoctorHiveClusterResponseBody body;

    public static GetDoctorHiveClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHiveClusterResponse self = new GetDoctorHiveClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHiveClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHiveClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHiveClusterResponse setBody(GetDoctorHiveClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHiveClusterResponseBody getBody() {
        return this.body;
    }

}
