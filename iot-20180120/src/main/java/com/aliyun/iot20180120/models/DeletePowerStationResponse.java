// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeletePowerStationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePowerStationResponseBody body;

    public static DeletePowerStationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePowerStationResponse self = new DeletePowerStationResponse();
        return TeaModel.build(map, self);
    }

    public DeletePowerStationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePowerStationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePowerStationResponse setBody(DeletePowerStationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePowerStationResponseBody getBody() {
        return this.body;
    }

}
