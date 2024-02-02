// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryVehicleDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVehicleDeviceResponseBody body;

    public static QueryVehicleDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVehicleDeviceResponse self = new QueryVehicleDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryVehicleDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVehicleDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVehicleDeviceResponse setBody(QueryVehicleDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVehicleDeviceResponseBody getBody() {
        return this.body;
    }

}
