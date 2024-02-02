// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckImportDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCheckImportDeviceResponseBody body;

    public static BatchCheckImportDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckImportDeviceResponse self = new BatchCheckImportDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchCheckImportDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCheckImportDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCheckImportDeviceResponse setBody(BatchCheckImportDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCheckImportDeviceResponseBody getBody() {
        return this.body;
    }

}
