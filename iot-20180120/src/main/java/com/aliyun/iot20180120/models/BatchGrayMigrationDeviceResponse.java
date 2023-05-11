// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGrayMigrationDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGrayMigrationDeviceResponseBody body;

    public static BatchGrayMigrationDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGrayMigrationDeviceResponse self = new BatchGrayMigrationDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchGrayMigrationDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGrayMigrationDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGrayMigrationDeviceResponse setBody(BatchGrayMigrationDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGrayMigrationDeviceResponseBody getBody() {
        return this.body;
    }

}
