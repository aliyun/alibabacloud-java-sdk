// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHBaseRegionServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorHBaseRegionServersResponseBody body;

    public static ListDoctorHBaseRegionServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHBaseRegionServersResponse self = new ListDoctorHBaseRegionServersResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorHBaseRegionServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorHBaseRegionServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorHBaseRegionServersResponse setBody(ListDoctorHBaseRegionServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorHBaseRegionServersResponseBody getBody() {
        return this.body;
    }

}
