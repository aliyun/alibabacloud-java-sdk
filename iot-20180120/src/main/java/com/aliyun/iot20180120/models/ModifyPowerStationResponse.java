// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ModifyPowerStationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPowerStationResponseBody body;

    public static ModifyPowerStationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPowerStationResponse self = new ModifyPowerStationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPowerStationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPowerStationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPowerStationResponse setBody(ModifyPowerStationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPowerStationResponseBody getBody() {
        return this.body;
    }

}
