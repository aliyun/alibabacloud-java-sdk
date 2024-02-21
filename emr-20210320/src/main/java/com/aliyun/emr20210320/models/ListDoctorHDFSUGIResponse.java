// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHDFSUGIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorHDFSUGIResponseBody body;

    public static ListDoctorHDFSUGIResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHDFSUGIResponse self = new ListDoctorHDFSUGIResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorHDFSUGIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorHDFSUGIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorHDFSUGIResponse setBody(ListDoctorHDFSUGIResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorHDFSUGIResponseBody getBody() {
        return this.body;
    }

}
