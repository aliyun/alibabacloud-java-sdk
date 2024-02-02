// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchImportDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchImportDeviceResponseBody body;

    public static BatchImportDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchImportDeviceResponse self = new BatchImportDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchImportDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchImportDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchImportDeviceResponse setBody(BatchImportDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchImportDeviceResponseBody getBody() {
        return this.body;
    }

}
