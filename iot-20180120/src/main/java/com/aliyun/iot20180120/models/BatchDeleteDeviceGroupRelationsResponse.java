// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteDeviceGroupRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteDeviceGroupRelationsResponseBody body;

    public static BatchDeleteDeviceGroupRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDeviceGroupRelationsResponse self = new BatchDeleteDeviceGroupRelationsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDeviceGroupRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteDeviceGroupRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteDeviceGroupRelationsResponse setBody(BatchDeleteDeviceGroupRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteDeviceGroupRelationsResponseBody getBody() {
        return this.body;
    }

}
