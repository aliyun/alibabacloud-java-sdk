// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHDFSUGIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHDFSUGIResponseBody body;

    public static GetDoctorHDFSUGIResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHDFSUGIResponse self = new GetDoctorHDFSUGIResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHDFSUGIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHDFSUGIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHDFSUGIResponse setBody(GetDoctorHDFSUGIResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHDFSUGIResponseBody getBody() {
        return this.body;
    }

}
