// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseRegionServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHBaseRegionServerResponseBody body;

    public static GetDoctorHBaseRegionServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseRegionServerResponse self = new GetDoctorHBaseRegionServerResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseRegionServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHBaseRegionServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHBaseRegionServerResponse setBody(GetDoctorHBaseRegionServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHBaseRegionServerResponseBody getBody() {
        return this.body;
    }

}
