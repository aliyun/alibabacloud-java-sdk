// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHDFSDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDoctorHDFSDirectoryResponseBody body;

    public static GetDoctorHDFSDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHDFSDirectoryResponse self = new GetDoctorHDFSDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHDFSDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHDFSDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHDFSDirectoryResponse setBody(GetDoctorHDFSDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHDFSDirectoryResponseBody getBody() {
        return this.body;
    }

}
