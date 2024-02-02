// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ModifyOTAFirmwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOTAFirmwareResponseBody body;

    public static ModifyOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOTAFirmwareResponse self = new ModifyOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOTAFirmwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOTAFirmwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOTAFirmwareResponse setBody(ModifyOTAFirmwareResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOTAFirmwareResponseBody getBody() {
        return this.body;
    }

}
