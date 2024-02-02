// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchImportVehicleDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchImportVehicleDeviceResponseBody body;

    public static BatchImportVehicleDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchImportVehicleDeviceResponse self = new BatchImportVehicleDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchImportVehicleDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchImportVehicleDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchImportVehicleDeviceResponse setBody(BatchImportVehicleDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchImportVehicleDeviceResponseBody getBody() {
        return this.body;
    }

}
