// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomControlDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportRoomControlDevicesResponseBody body;

    public static ImportRoomControlDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportRoomControlDevicesResponse self = new ImportRoomControlDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ImportRoomControlDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportRoomControlDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportRoomControlDevicesResponse setBody(ImportRoomControlDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportRoomControlDevicesResponseBody getBody() {
        return this.body;
    }

}
