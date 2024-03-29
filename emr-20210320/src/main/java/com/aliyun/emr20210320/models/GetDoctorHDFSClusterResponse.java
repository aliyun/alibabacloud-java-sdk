// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHDFSClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHDFSClusterResponseBody body;

    public static GetDoctorHDFSClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHDFSClusterResponse self = new GetDoctorHDFSClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHDFSClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHDFSClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHDFSClusterResponse setBody(GetDoctorHDFSClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHDFSClusterResponseBody getBody() {
        return this.body;
    }

}
