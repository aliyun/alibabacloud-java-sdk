// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckDeviceNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCheckDeviceNamesResponseBody body;

    public static BatchCheckDeviceNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckDeviceNamesResponse self = new BatchCheckDeviceNamesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCheckDeviceNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCheckDeviceNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCheckDeviceNamesResponse setBody(BatchCheckDeviceNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCheckDeviceNamesResponseBody getBody() {
        return this.body;
    }

}
