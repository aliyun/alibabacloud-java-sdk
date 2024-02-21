// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorHBaseRegionResponseBody body;

    public static GetDoctorHBaseRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseRegionResponse self = new GetDoctorHBaseRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorHBaseRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorHBaseRegionResponse setBody(GetDoctorHBaseRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorHBaseRegionResponseBody getBody() {
        return this.body;
    }

}
