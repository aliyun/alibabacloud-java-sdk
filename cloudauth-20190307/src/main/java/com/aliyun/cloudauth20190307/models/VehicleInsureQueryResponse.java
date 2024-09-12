// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleInsureQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VehicleInsureQueryResponseBody body;

    public static VehicleInsureQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        VehicleInsureQueryResponse self = new VehicleInsureQueryResponse();
        return TeaModel.build(map, self);
    }

    public VehicleInsureQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VehicleInsureQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VehicleInsureQueryResponse setBody(VehicleInsureQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public VehicleInsureQueryResponseBody getBody() {
        return this.body;
    }

}
