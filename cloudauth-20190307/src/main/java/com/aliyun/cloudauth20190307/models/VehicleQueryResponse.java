// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VehicleQueryResponseBody body;

    public static VehicleQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        VehicleQueryResponse self = new VehicleQueryResponse();
        return TeaModel.build(map, self);
    }

    public VehicleQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VehicleQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VehicleQueryResponse setBody(VehicleQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public VehicleQueryResponseBody getBody() {
        return this.body;
    }

}
