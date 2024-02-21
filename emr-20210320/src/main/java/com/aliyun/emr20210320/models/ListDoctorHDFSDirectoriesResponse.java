// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHDFSDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorHDFSDirectoriesResponseBody body;

    public static ListDoctorHDFSDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHDFSDirectoriesResponse self = new ListDoctorHDFSDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorHDFSDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorHDFSDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorHDFSDirectoriesResponse setBody(ListDoctorHDFSDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorHDFSDirectoriesResponseBody getBody() {
        return this.body;
    }

}
