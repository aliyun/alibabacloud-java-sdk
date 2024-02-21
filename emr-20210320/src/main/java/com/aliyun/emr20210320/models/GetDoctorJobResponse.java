// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorJobResponseBody body;

    public static GetDoctorJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorJobResponse self = new GetDoctorJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorJobResponse setBody(GetDoctorJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorJobResponseBody getBody() {
        return this.body;
    }

}
