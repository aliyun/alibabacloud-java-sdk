// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHBaseClusterResponseBody body;

    public static GetDoctorHBaseClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseClusterResponse self = new GetDoctorHBaseClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHBaseClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHBaseClusterResponse setBody(GetDoctorHBaseClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHBaseClusterResponseBody getBody() {
        return this.body;
    }

}
