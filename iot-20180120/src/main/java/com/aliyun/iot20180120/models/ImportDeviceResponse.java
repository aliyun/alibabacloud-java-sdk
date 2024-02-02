// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDeviceResponseBody body;

    public static ImportDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDeviceResponse self = new ImportDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ImportDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDeviceResponse setBody(ImportDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDeviceResponseBody getBody() {
        return this.body;
    }

}
