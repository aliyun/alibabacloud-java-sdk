// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorApplicationsResponseBody body;

    public static ListDoctorApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorApplicationsResponse self = new ListDoctorApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorApplicationsResponse setBody(ListDoctorApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorApplicationsResponseBody getBody() {
        return this.body;
    }

}
