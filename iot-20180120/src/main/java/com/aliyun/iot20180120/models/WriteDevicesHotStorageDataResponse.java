// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class WriteDevicesHotStorageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WriteDevicesHotStorageDataResponseBody body;

    public static WriteDevicesHotStorageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        WriteDevicesHotStorageDataResponse self = new WriteDevicesHotStorageDataResponse();
        return TeaModel.build(map, self);
    }

    public WriteDevicesHotStorageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WriteDevicesHotStorageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WriteDevicesHotStorageDataResponse setBody(WriteDevicesHotStorageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public WriteDevicesHotStorageDataResponseBody getBody() {
        return this.body;
    }

}
