// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOTAFirmwareResponseBody body;

    public static CreateOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAFirmwareResponse self = new CreateOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTAFirmwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOTAFirmwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOTAFirmwareResponse setBody(CreateOTAFirmwareResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOTAFirmwareResponseBody getBody() {
        return this.body;
    }

}
