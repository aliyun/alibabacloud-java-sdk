// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddPowerStationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddPowerStationResponseBody body;

    public static AddPowerStationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPowerStationResponse self = new AddPowerStationResponse();
        return TeaModel.build(map, self);
    }

    public AddPowerStationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPowerStationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPowerStationResponse setBody(AddPowerStationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPowerStationResponseBody getBody() {
        return this.body;
    }

}
